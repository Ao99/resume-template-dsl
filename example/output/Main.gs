const folderName = 'Resume Templates';
const fileName = 'example';
const defaultFont = 'Arial';
const defaultFontSize = 11.0;
const defaultTablePadding = 0;
const themeColor1 = '#4a99d5';
const themeColor2 = '#FFFFFF';

function main() {
  var doc = createFolderAndFile();
  var body = doc.getBody();

  // paragraph
  createParagraph(body, {
    'color': themeColor1,
    'isUppercase': true,
    'isBold': true,
    'fontSize': 23.0,
    'text': 'my name',
    'hAlignment': hAlignment.CENTER,
  });

  // table
  var table = createTable(body, {
    'numRows': 1,
    'numCols': 3,
    'bgColor': themeColor1,
    'borderWidth': 0,
    'widthPropCols': [3,1,1,1],
  });

  // table cell (0,0)
  // paragraph
  createParagraph(table.getRow(0).getCell(0), {
    'color': themeColor2,
    'text': 'www.my-web-site.com',
    'hAlignment': hAlignment.LEFT,
    'font': 'Georgia',
  });

  // table cell (0,1)
  // paragraph
  createParagraph(table.getRow(0).getCell(1), {
    'color': themeColor2,
    'text': 'myname@mail.com',
    'hAlignment': hAlignment.LEFT,
    'font': 'Georgia',
  });

  // table cell (0,2)
  // paragraph
  createParagraph(table.getRow(0).getCell(2), {
    'color': themeColor2,
    'text': '123-456-7890',
    'hAlignment': hAlignment.LEFT,
    'font': 'Georgia',
  });

  // horizontalLine
  createHorizontalLine(body, {
    'fontSize': 5.0,
  });

  // paragraph
  createParagraph(body, {
    'color': themeColor1,
    'isUppercase': true,
    'isBold': true,
    'fontSize': 12.5,
    'text': 'highlights',
    'hAlignment': hAlignment.LEFT,
  });

  // list
  createList(body, {
    'minLength': 5,
    'isAutoGenerated': 1,
    'numItems': 4,
    'hAlignment': hAlignment.LEFT,
    'maxLength': 12,
    'glyphType': glyphType.SQUARE_BULLET,
  });

  // horizontalLine
  createHorizontalLine(body, {
    'fontSize': 5.0,
  });

  // paragraph
  createParagraph(body, {
    'color': themeColor1,
    'isUppercase': true,
    'isBold': true,
    'fontSize': 12.5,
    'text': 'education',
    'hAlignment': hAlignment.LEFT,
  });

  for(var i1=0; i1<3; i1++) {
    // table
    var table = createTable(body, {
      'numRows': 1,
      'numCols': 3,
      'borderWidth': 0,
      'widthPropCols': [3,1,1,1],
    });

    // table cell (0,0)
    // paragraph
    createParagraph(table.getRow(0).getCell(0), {
      'isUppercase': true,
      'isItalic': true,
      'text': 'some major',
      'hAlignment': hAlignment.LEFT,
    });

    // table cell (0,1)
    // paragraph
    createParagraph(table.getRow(0).getCell(1), {
      'isUppercase': true,
      'isItalic': true,
      'text': 'some school',
      'hAlignment': hAlignment.LEFT,
    });

    // table cell (0,2)
    // paragraph
    createParagraph(table.getRow(0).getCell(2), {
      'isUppercase': true,
      'isItalic': true,
      'text': 'xx/xxxx - xx/xxxx',
      'hAlignment': hAlignment.LEFT,
    });

    // paragraph
    createParagraph(body, {
      'length': 12,
      'isAutoGenerated': 1,
      'hAlignment': hAlignment.LEFT,
    });

  }

  // horizontalLine
  createHorizontalLine(body, {
    'fontSize': 5.0,
  });

  // paragraph
  createParagraph(body, {
    'color': themeColor1,
    'isUppercase': true,
    'isBold': true,
    'fontSize': 12.5,
    'text': 'experience',
    'hAlignment': hAlignment.LEFT,
  });

  for(var i1=0; i1<3; i1++) {
    // table
    var table = createTable(body, {
      'numRows': 1,
      'numCols': 3,
      'borderWidth': 0,
      'widthPropCols': [3,1,1,1],
    });

    // table cell (0,0)
    // paragraph
    createParagraph(table.getRow(0).getCell(0), {
      'isUppercase': true,
      'isItalic': true,
      'text': 'some position',
      'hAlignment': hAlignment.LEFT,
    });

    // table cell (0,1)
    // paragraph
    createParagraph(table.getRow(0).getCell(1), {
      'isUppercase': true,
      'isItalic': true,
      'text': 'some company',
      'hAlignment': hAlignment.LEFT,
    });

    // table cell (0,2)
    // paragraph
    createParagraph(table.getRow(0).getCell(2), {
      'isUppercase': true,
      'isItalic': true,
      'text': 'xx/xxxx - xx/xxxx',
      'hAlignment': hAlignment.LEFT,
    });

    // list
    createList(body, {
      'minLength': 5,
      'isAutoGenerated': 1,
      'numItems': 4,
      'hAlignment': hAlignment.LEFT,
      'maxLength': 15,
      'glyphType': glyphType.BULLET,
    });

  }

  // horizontalLine
  createHorizontalLine(body, {
    'fontSize': 5.0,
  });

  // paragraph
  createParagraph(body, {
    'color': themeColor1,
    'isUppercase': true,
    'isBold': true,
    'fontSize': 12.5,
    'text': 'skills & tools',
    'hAlignment': hAlignment.LEFT,
  });

  // table
  var table = createTable(body, {
    'numRows': 2,
    'numCols': 2,
    'borderWidth': 0,
    'widthPropCols': [3,2,1],
  });

  // table cell (0,0)
  // paragraph
  createParagraph(table.getRow(0).getCell(0), {
    'isUppercase': true,
    'text': 'skills',
    'hAlignment': hAlignment.LEFT,
  });

  // table cell (0,1)
  // paragraph
  createParagraph(table.getRow(0).getCell(1), {
    'isUppercase': true,
    'text': 'tools',
    'hAlignment': hAlignment.LEFT,
  });

  // table cell (1,0)
  // list
  createList(table.getRow(1).getCell(0), {
    'minLength': 3,
    'isAutoGenerated': 1,
    'numItems': 3,
    'hAlignment': hAlignment.LEFT,
    'maxLength': 5,
    'glyphType': glyphType.HOLLOW_BULLET,
  });

  // table cell (1,1)
  // list
  createList(table.getRow(1).getCell(1), {
    'minLength': 1,
    'isAutoGenerated': 1,
    'numItems': 3,
    'hAlignment': hAlignment.LEFT,
    'maxLength': 3,
    'glyphType': glyphType.HOLLOW_BULLET,
  });

  clearEmptyLines(body);
}
