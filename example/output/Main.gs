const folderName = 'Resume Templates';
const fileName = 'Resume Template';
const defaultFont = 'Arial';
const defaultSize = 11.0;
const defaultTablePadding = 0;
const themeColor1 = '#4a99d5';
const themeColor2 = '#FFFFFF';

function main() {
  var doc = createFolderAndFile();
  var body = doc.getBody();

  // paragraph
  createParagraph(body, {
    'isItalic': false,
    'isUppercase': true,
    'fontSize': ,
    'text': 'my name',
    'hAlignment': hAlignment.CENTER,
    'isBold': true,
    'font': '',

  });

  // paragraph
  createParagraph(body, {

  });

  // paragraph
  createParagraph(body, {
    'fontSize': ,

  });

  // paragraph
  createParagraph(body, {
    'isItalic': false,
    'isUppercase': true,
    'fontSize': ,
    'text': 'highlights',
    'hAlignment': hAlignment.LEFT,
    'isBold': true,
    'font': '',

  });

  // paragraph
  createParagraph(body, {
    'isItalic': false,
    'isUppercase': false,
    'fontSize': ,
    'text': '',
    'hAlignment': hAlignment.LEFT,
    'isBold': false,
    'font': '',

  });

  // paragraph
  createParagraph(body, {
    'fontSize': ,

  });

  // paragraph
  createParagraph(body, {
    'isItalic': false,
    'isUppercase': true,
    'fontSize': ,
    'text': 'education',
    'hAlignment': hAlignment.LEFT,
    'isBold': true,
    'font': '',

  });

  // paragraph
  createParagraph(body, {
    'text': 'my name',
    'isUppercase': true,
    'size': 23,
    'isBold': true,
    'color': themeColor1,
    'hAlignment': HAlignment.CENTER
  });

  // table
  var table = createTable(body, {
    'numRows': 1,
    'numCols': 3,
    'widthPropCols': [1/3, 1/3, 1/3],
    'borderWidth': 0,
    'bgColor': themeColor1,
    'padding': 5
  });

  // table cell (0,0)
  createParagraph(table.getRow(0).getCell(0), {
    'text': 'www.my-web-site.com',
    'font': 'Georgia',
    'color': themeColor2
  });

  // table cell (0,1)
  createParagraph(table.getRow(0).getCell(1), {
    'text': 'myname@mail.com',
    'font': 'Georgia',
    'color': themeColor2
  });

  // table cell (0,2)
  createParagraph(table.getRow(0).getCell(2), {
    'text': '123-456-7890',
    'font': 'Georgia',
    'color': themeColor2
  });
  Logger.log(table.getRow(0).getCell(2).getAttributes());

  createHorizontalLine(body, {
    'size': 5
  });

  // paragraph
  createParagraph(body, {
    'text': 'highlights',
    'isUppercase': true,
    'size': 12.5,
    'isBold': true,
    'color': themeColor1
  });

  // list
  createList(body, {
    'numItems': 4,
    'minLength': 5,
    'maxLength': 12,
    'glyphType': GlyphType.SQUARE_BULLET
  });

  createHorizontalLine(body, {
    'size': 5
  });

  // paragraph
  var para = createParagraph(body, {
    'text': 'education',
    'isUppercase': true,
    'size': 12.5,
    'isBold': true,
    'color': themeColor1
  });
  Logger.log(para.getAttributes());

  for(var i=0; i<3; i++) {
    // table
    var table = createTable(body, {
      'numRows': 1,
      'numCols': 3,
      'widthPropCols': [1/3, 1/3, 1/3],
      'borderWidth': 0
    });

    // table cell (0,0)
    createParagraph(table.getRow(0).getCell(0), {
      'text': 'some major',
      'isUppercase': true,
      'isItalic': true
    });

    // table cell (0,1)
    createParagraph(table.getRow(0).getCell(1), {
      'text': 'some school',
      'isUppercase': true,
      'isItalic': true
    });

    // table cell (0,2)
    createParagraph(table.getRow(0).getCell(2), {
      'text': 'xx/xxxx - xx/xxxx',
      'isUppercase': true,
      'isItalic': true
    });

    // paragraph
    createParagraph(body, {
      'length': 12
    });
  }

  createHorizontalLine(body, {
    'size': 5
  });

  // paragraph
  createParagraph(body, {
    'text': 'experience',
    'isUppercase': true,
    'size': 12.5,
    'isBold': true,
    'color': themeColor1
  });

  for(var i=0; i<3; i++) {
    // table
    var table = createTable(body, {
      'numRows': 1,
      'numCols': 3,
      'widthPropCols': [1/3, 1/3, 1/3],
      'borderWidth': 0
    });

    // table cell (0,0)
    createParagraph(table.getRow(0).getCell(0), {
      'text': 'some position',
      'isUppercase': true,
      'isItalic': true
    });

    // table cell (0,1)
    createParagraph(table.getRow(0).getCell(1), {
      'text': 'some company',
      'isUppercase': true,
      'isItalic': true
    });

    // table cell (0,2)
    createParagraph(table.getRow(0).getCell(2), {
      'text': 'xx/xxxx - xx/xxxx',
      'isUppercase': true,
      'isItalic': true
    });

    // list
    createList(body, {
      'numItems': 4,
      'minLength': 5,
      'maxLength': 15,
      'glyphType': GlyphType.BULLET
    });
  }

  createHorizontalLine(body, {
    'size': 5
  });

  // paragraph
  createParagraph(body, {
    'text': 'skills & tools',
    'isUppercase': true,
    'size': 12.5,
    'isBold': true,
    'color': themeColor1
  });

  // table
  var table = createTable(body, {
    'numRows': 2,
    'numCols': 2,
    'widthPropCols': [2/3, 1/3],
    'borderWidth': 0
  });

  // table cell (0,0)
  createParagraph(table.getRow(0).getCell(0), {
    'text': 'skills',
    'isUppercase': true
  });

  // table cell (0,1)
  createParagraph(table.getRow(0).getCell(1), {
    'text': 'tools',
    'isUppercase': true
  });

  // table cell (1,0)
  createList(table.getRow(1).getCell(0), {
    'numItems': 3,
    'minLength': 3,
    'maxLength': 5,
    'glyphType': GlyphType.HOLLOW_BULLET
  });

  // table cell (1,1)
  createList(table.getRow(1).getCell(1), {
    'numItems': 3,
    'minLength': 1,
    'maxLength': 3,
    'glyphType': GlyphType.HOLLOW_BULLET
  });

  clearEmptyLines(body);
}