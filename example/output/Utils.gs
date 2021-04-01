const hAlignment = {
  'LEFT': DocumentApp.HorizontalAlignment.LEFT,
  'CENTER': DocumentApp.HorizontalAlignment.CENTER,
  'RIGHT': DocumentApp.HorizontalAlignment.RIGHT,
  'JUSTIFY': DocumentApp.HorizontalAlignment.JUSTIFY
}

const glyphType = {
  'BULLET': DocumentApp.GlyphType.BULLET,
  'HOLLOW_BULLET': DocumentApp.GlyphType.HOLLOW_BULLET,
  'SQUARE_BULLET': DocumentApp.GlyphType.SQUARE_BULLET,
  'NUMBER': DocumentApp.GlyphType.NUMBER
}

function createFolderAndFile() {
  Logger.log('Creating folder "%s" if not exist', folderName);
  var folders = DriveApp.getFoldersByName(folderName);
  var folder = null
  
  // find the folder with 'folderName' at the root directory
  while(folders.hasNext()) {
    var currentFolder = folders.next();
    var parents = currentFolder.getParents();
    if(parents.hasNext() && parents.next().getName() == 'My Drive') {
      folder = currentFolder;
    }
  }

  if(folder != null) { // if the folder exists
    Logger.log('Deleting existing files with name "%s" in the folder', fileName);
    var files = folder.getFilesByName(fileName);
    while(files.hasNext()) {
      files.next().setTrashed(true);
    }
  } else { // if the folder doesn't exist
    folder = DriveApp.createFolder(folderName);
  }

  Logger.log('Creating doc file "%s"', fileName);
  var doc = DocumentApp.create(fileName);

  Logger.log('Moving doc file "%s" to folder "%s"', fileName, folderName);
  var file = DriveApp.getFileById(doc.getId());
  file.moveTo(folder);

  return doc;
}

function createHorizontalLine(parent, style) {
  Logger.log('Creating horizontal line...');

  // horizontal line must be in a paragraph
  var paragraph = parent.appendParagraph('');
  var line = paragraph.appendHorizontalRule();
  var attributes = getAttributes(style);
  paragraph.setAttributes(attributes);

  return line;
}

function createTable(body, style) {
  var numRows = style.numRows;
  var numCols = style.numCols;
  Logger.log('Creating table with %s rows and %s columns...', numRows, numCols);

  var cells = Array(numRows).fill(Array(numCols).fill(''));
  var attributes = getAttributes(style);
  var table = body.appendTable(cells).setAttributes(attributes);

  for(var i=0; i<numRows; i++) {
    for(var j=0; j<numCols; j++) {
      table.getRow(i).getCell(j).setAttributes(attributes);
    }
  }

  // get total width of the contents
  var totalWidth = body.getPageWidth() - body.getMarginLeft() - body.getMarginRight();
  // set column widths
  for(var i=0; i<numCols; i++) {
    var widthProp = style.widthPropCols[i];
    if(widthProp) table.setColumnWidth(i, totalWidth * widthProp);
  }

  return table;
}

function createParagraph(parent, style) {
  Logger.log('Creating paragraph %s...', style.length ? style.length + ' random words' : '');

  var text = getText(style);
  if(style.isUppercase)  text = text.toUpperCase();
  
  var attributes = getAttributes(style);
  return parent.appendParagraph(text).setAttributes(attributes);
}

function createList(parent, style) {
  var numItems = style.numItems;
  Logger.log('Creating list with %s items...', numItems);
  
  var attributes = getAttributes(style);
  for(var i=0; i<numItems; i++) {
    var text = getText(style);
    if(style.isUppercase)  text = text.toUpperCase();
    var listItem = parent.appendListItem(text).setAttributes(attributes).setGlyphType(style.glyphType);
  }
}

function getText(style) {
  var text = '';

  if(style.text) { // use the specified text
    text = style.text;
  } else { // use random Lorem text
    var length = 0;
    if(style.length) { // paragraph with 'length'
      length = style.length;
    } else if(style.minLength && style.maxLength) { // list with 'minLength' and 'maxLength', each listItem has a random length between them
      var minLength = style.minLength;
      var maxLength = style.maxLength;
      length = minLength + Math.random() * (maxLength - minLength);
    }

    var loremLen = lorem.length;
    var t = Math.floor(length / loremLen);
    var r = length % loremLen;
    for(var i=0; i<t; i++) {
      for(var i in lorem) {
      text += (lorem[i] + ' ');
    }
    }
    for(var i=0; i<r; i++) {
      text += (lorem[i] + ' ');
    }
  }

  return text;
}

function getAttributes(style) {
  // transfer my attributes to Google App Script attributes
  const Attribute = {
    'font': DocumentApp.Attribute.FONT_FAMILY,
    'fontSize': DocumentApp.Attribute.FONT_SIZE,
    'isBold': DocumentApp.Attribute.BOLD,
    'isItalic': DocumentApp.Attribute.ITALIC,
    'hAlignment': DocumentApp.Attribute.HORIZONTAL_ALIGNMENT,
    'color': DocumentApp.Attribute.FOREGROUND_COLOR,
    'bgColor': DocumentApp.Attribute.BACKGROUND_COLOR,
    'borderWidth': DocumentApp.Attribute.BORDER_WIDTH,
    // set paddings of 4 directions together
    'padding': [DocumentApp.Attribute.PADDING_LEFT,
                  DocumentApp.Attribute.PADDING_RIGHT,
                  DocumentApp.Attribute.PADDING_TOP,
                  DocumentApp.Attribute.PADDING_BOTTOM]
  }

  var attributes = {};
  // set default values
  attributes[Attribute.font] = defaultFont;
  attributes[Attribute.fontSize] = defaultFontSize;
  attributes[Attribute.isBold] = null;
  attributes[Attribute.isItalic] = null;
  attributes[Attribute.hAlignment] = hAlignment.left;
  attributes[Attribute.color] = null;
  attributes[Attribute.bgColor] = null;
  attributes[Attribute.borderWidth] = null;
  for(var i in Attribute.padding) attributes[Attribute.padding[i]] = defaultTablePadding;
  
  // set custom values
  for(var key in style) {
    if (!style.hasOwnProperty(key)) continue;
    if(key in Attribute) {
      if(key == 'padding') {
        for(var i in Attribute[key]) attributes[Attribute[key][i]] = style[key];
      } else {
        attributes[Attribute[key]] = style[key];
      }
    }
  }
  
  return attributes;
}

function clearEmptyLines(body) {
  // clear 1st empty line
  body.getChild(0).removeFromParent();

  var tables = body.getTables();
  for(var i in tables) {
    var table = tables[i];

    // clear empty lines in every table cell
    for(var j=0; j<table.getNumRows(); j++) {
      var row = table.getRow(j);
      for(var k=0; k<row.getNumCells(); k++) {
        var cell = row.getCell(k);
        cell.getChild(0).removeFromParent();
      }
    }

    // clear empty lines after tables
    var idx = body.getChildIndex(table);
    if(idx < body.getNumChildren() - 2) {
      body.getChild(idx+1).removeFromParent();
    }
  }
}