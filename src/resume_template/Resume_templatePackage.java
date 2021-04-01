/**
 */
package resume_template;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see resume_template.Resume_templateFactory
 * @model kind="package"
 * @generated
 */
public interface Resume_templatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resume_template";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "resume_template";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resume_template";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Resume_templatePackage eINSTANCE = resume_template.impl.Resume_templatePackageImpl.init();

	/**
	 * The meta object id for the '{@link resume_template.impl.ResumeTemplateImpl <em>Resume Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.ResumeTemplateImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getResumeTemplate()
	 * @generated
	 */
	int RESUME_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Folder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_TEMPLATE__FOLDER_NAME = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_TEMPLATE__FILE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Default Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_TEMPLATE__DEFAULT_FONT = 2;

	/**
	 * The feature id for the '<em><b>Default Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_TEMPLATE__DEFAULT_FONT_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Default Table Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_TEMPLATE__DEFAULT_TABLE_PADDING = 4;

	/**
	 * The feature id for the '<em><b>Theme Colors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_TEMPLATE__THEME_COLORS = 5;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_TEMPLATE__ELEMENTS = 6;

	/**
	 * The number of structural features of the '<em>Resume Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_TEMPLATE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link resume_template.impl.ThemeColorImpl <em>Theme Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.ThemeColorImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getThemeColor()
	 * @generated
	 */
	int THEME_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_COLOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_COLOR__COLOR_CODE = 1;

	/**
	 * The number of structural features of the '<em>Theme Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_COLOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link resume_template.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.ElementImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Element Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ELEMENT_IDX = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link resume_template.impl.RepeatContainerImpl <em>Repeat Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.RepeatContainerImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getRepeatContainer()
	 * @generated
	 */
	int REPEAT_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Element Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_CONTAINER__ELEMENT_IDX = ELEMENT__ELEMENT_IDX;

	/**
	 * The feature id for the '<em><b>Repeat Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_CONTAINER__REPEAT_TIMES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_CONTAINER__ELEMENTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_CONTAINER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link resume_template.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.TextElementImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Element Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__ELEMENT_IDX = ELEMENT__ELEMENT_IDX;

	/**
	 * The feature id for the '<em><b>Is Auto Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__IS_AUTO_GENERATED = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__TEXT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__FONT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__FONT_SIZE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Uppercase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__IS_UPPERCASE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__IS_BOLD = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__IS_ITALIC = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__HALIGNMENT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__COLOR = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link resume_template.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.ParagraphImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 5;

	/**
	 * The feature id for the '<em><b>Element Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ELEMENT_IDX = TEXT_ELEMENT__ELEMENT_IDX;

	/**
	 * The feature id for the '<em><b>Is Auto Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__IS_AUTO_GENERATED = TEXT_ELEMENT__IS_AUTO_GENERATED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = TEXT_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__FONT = TEXT_ELEMENT__FONT;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__FONT_SIZE = TEXT_ELEMENT__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Is Uppercase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__IS_UPPERCASE = TEXT_ELEMENT__IS_UPPERCASE;

	/**
	 * The feature id for the '<em><b>Is Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__IS_BOLD = TEXT_ELEMENT__IS_BOLD;

	/**
	 * The feature id for the '<em><b>Is Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__IS_ITALIC = TEXT_ELEMENT__IS_ITALIC;

	/**
	 * The feature id for the '<em><b>HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__HALIGNMENT = TEXT_ELEMENT__HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__COLOR = TEXT_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__LENGTH = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link resume_template.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.ListImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getList()
	 * @generated
	 */
	int LIST = 6;

	/**
	 * The feature id for the '<em><b>Element Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENT_IDX = TEXT_ELEMENT__ELEMENT_IDX;

	/**
	 * The feature id for the '<em><b>Is Auto Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IS_AUTO_GENERATED = TEXT_ELEMENT__IS_AUTO_GENERATED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TEXT = TEXT_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__FONT = TEXT_ELEMENT__FONT;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__FONT_SIZE = TEXT_ELEMENT__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Is Uppercase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IS_UPPERCASE = TEXT_ELEMENT__IS_UPPERCASE;

	/**
	 * The feature id for the '<em><b>Is Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IS_BOLD = TEXT_ELEMENT__IS_BOLD;

	/**
	 * The feature id for the '<em><b>Is Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IS_ITALIC = TEXT_ELEMENT__IS_ITALIC;

	/**
	 * The feature id for the '<em><b>HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__HALIGNMENT = TEXT_ELEMENT__HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__COLOR = TEXT_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Num Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NUM_ITEMS = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MIN_LENGTH = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MAX_LENGTH = TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Glyph Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__GLYPH_TYPE = TEXT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link resume_template.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.TableImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 7;

	/**
	 * The feature id for the '<em><b>Element Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ELEMENT_IDX = ELEMENT__ELEMENT_IDX;

	/**
	 * The feature id for the '<em><b>Num Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NUM_ROWS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NUM_COLS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width Prop Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WIDTH_PROP_COLS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDER_WIDTH = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PADDING = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BG_COLOR = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CELLS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link resume_template.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.CellImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getCell()
	 * @generated
	 */
	int CELL = 8;

	/**
	 * The feature id for the '<em><b>Row Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ROW_IDX = 0;

	/**
	 * The feature id for the '<em><b>Col Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COL_IDX = 1;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__TEXT_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link resume_template.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.impl.HorizontalLineImpl
	 * @see resume_template.impl.Resume_templatePackageImpl#getHorizontalLine()
	 * @generated
	 */
	int HORIZONTAL_LINE = 9;

	/**
	 * The feature id for the '<em><b>Element Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE__ELEMENT_IDX = ELEMENT__ELEMENT_IDX;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE__FONT_SIZE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link resume_template.HAlignment <em>HAlignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.HAlignment
	 * @see resume_template.impl.Resume_templatePackageImpl#getHAlignment()
	 * @generated
	 */
	int HALIGNMENT = 10;

	/**
	 * The meta object id for the '{@link resume_template.GlyphType <em>Glyph Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resume_template.GlyphType
	 * @see resume_template.impl.Resume_templatePackageImpl#getGlyphType()
	 * @generated
	 */
	int GLYPH_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link resume_template.ResumeTemplate <em>Resume Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resume Template</em>'.
	 * @see resume_template.ResumeTemplate
	 * @generated
	 */
	EClass getResumeTemplate();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.ResumeTemplate#getFolderName <em>Folder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder Name</em>'.
	 * @see resume_template.ResumeTemplate#getFolderName()
	 * @see #getResumeTemplate()
	 * @generated
	 */
	EAttribute getResumeTemplate_FolderName();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.ResumeTemplate#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see resume_template.ResumeTemplate#getFileName()
	 * @see #getResumeTemplate()
	 * @generated
	 */
	EAttribute getResumeTemplate_FileName();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.ResumeTemplate#getDefaultFont <em>Default Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Font</em>'.
	 * @see resume_template.ResumeTemplate#getDefaultFont()
	 * @see #getResumeTemplate()
	 * @generated
	 */
	EAttribute getResumeTemplate_DefaultFont();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.ResumeTemplate#getDefaultFontSize <em>Default Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Font Size</em>'.
	 * @see resume_template.ResumeTemplate#getDefaultFontSize()
	 * @see #getResumeTemplate()
	 * @generated
	 */
	EAttribute getResumeTemplate_DefaultFontSize();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.ResumeTemplate#getDefaultTablePadding <em>Default Table Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Table Padding</em>'.
	 * @see resume_template.ResumeTemplate#getDefaultTablePadding()
	 * @see #getResumeTemplate()
	 * @generated
	 */
	EAttribute getResumeTemplate_DefaultTablePadding();

	/**
	 * Returns the meta object for the containment reference list '{@link resume_template.ResumeTemplate#getThemeColors <em>Theme Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theme Colors</em>'.
	 * @see resume_template.ResumeTemplate#getThemeColors()
	 * @see #getResumeTemplate()
	 * @generated
	 */
	EReference getResumeTemplate_ThemeColors();

	/**
	 * Returns the meta object for the containment reference list '{@link resume_template.ResumeTemplate#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see resume_template.ResumeTemplate#getElements()
	 * @see #getResumeTemplate()
	 * @generated
	 */
	EReference getResumeTemplate_Elements();

	/**
	 * Returns the meta object for class '{@link resume_template.ThemeColor <em>Theme Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theme Color</em>'.
	 * @see resume_template.ThemeColor
	 * @generated
	 */
	EClass getThemeColor();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.ThemeColor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see resume_template.ThemeColor#getName()
	 * @see #getThemeColor()
	 * @generated
	 */
	EAttribute getThemeColor_Name();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.ThemeColor#getColorCode <em>Color Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Code</em>'.
	 * @see resume_template.ThemeColor#getColorCode()
	 * @see #getThemeColor()
	 * @generated
	 */
	EAttribute getThemeColor_ColorCode();

	/**
	 * Returns the meta object for class '{@link resume_template.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see resume_template.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.Element#getElementIdx <em>Element Idx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Idx</em>'.
	 * @see resume_template.Element#getElementIdx()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ElementIdx();

	/**
	 * Returns the meta object for class '{@link resume_template.RepeatContainer <em>Repeat Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Container</em>'.
	 * @see resume_template.RepeatContainer
	 * @generated
	 */
	EClass getRepeatContainer();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.RepeatContainer#getRepeatTimes <em>Repeat Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Times</em>'.
	 * @see resume_template.RepeatContainer#getRepeatTimes()
	 * @see #getRepeatContainer()
	 * @generated
	 */
	EAttribute getRepeatContainer_RepeatTimes();

	/**
	 * Returns the meta object for the containment reference list '{@link resume_template.RepeatContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see resume_template.RepeatContainer#getElements()
	 * @see #getRepeatContainer()
	 * @generated
	 */
	EReference getRepeatContainer_Elements();

	/**
	 * Returns the meta object for class '{@link resume_template.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see resume_template.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.TextElement#getIsAutoGenerated <em>Is Auto Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto Generated</em>'.
	 * @see resume_template.TextElement#getIsAutoGenerated()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_IsAutoGenerated();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.TextElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see resume_template.TextElement#getText()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Text();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.TextElement#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see resume_template.TextElement#getFont()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Font();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.TextElement#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see resume_template.TextElement#getFontSize()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.TextElement#isIsUppercase <em>Is Uppercase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Uppercase</em>'.
	 * @see resume_template.TextElement#isIsUppercase()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_IsUppercase();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.TextElement#isIsBold <em>Is Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bold</em>'.
	 * @see resume_template.TextElement#isIsBold()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_IsBold();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.TextElement#isIsItalic <em>Is Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Italic</em>'.
	 * @see resume_template.TextElement#isIsItalic()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_IsItalic();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.TextElement#getHAlignment <em>HAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HAlignment</em>'.
	 * @see resume_template.TextElement#getHAlignment()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_HAlignment();

	/**
	 * Returns the meta object for the reference '{@link resume_template.TextElement#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Color</em>'.
	 * @see resume_template.TextElement#getColor()
	 * @see #getTextElement()
	 * @generated
	 */
	EReference getTextElement_Color();

	/**
	 * Returns the meta object for class '{@link resume_template.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see resume_template.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.Paragraph#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see resume_template.Paragraph#getLength()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Length();

	/**
	 * Returns the meta object for class '{@link resume_template.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see resume_template.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.List#getNumItems <em>Num Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Items</em>'.
	 * @see resume_template.List#getNumItems()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_NumItems();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.List#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see resume_template.List#getMinLength()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.List#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see resume_template.List#getMaxLength()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.List#getGlyphType <em>Glyph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glyph Type</em>'.
	 * @see resume_template.List#getGlyphType()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_GlyphType();

	/**
	 * Returns the meta object for class '{@link resume_template.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see resume_template.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.Table#getNumRows <em>Num Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Rows</em>'.
	 * @see resume_template.Table#getNumRows()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_NumRows();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.Table#getNumCols <em>Num Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cols</em>'.
	 * @see resume_template.Table#getNumCols()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_NumCols();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.Table#getWidthPropCols <em>Width Prop Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Prop Cols</em>'.
	 * @see resume_template.Table#getWidthPropCols()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_WidthPropCols();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.Table#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see resume_template.Table#getBorderWidth()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_BorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.Table#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding</em>'.
	 * @see resume_template.Table#getPadding()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Padding();

	/**
	 * Returns the meta object for the reference '{@link resume_template.Table#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bg Color</em>'.
	 * @see resume_template.Table#getBgColor()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_BgColor();

	/**
	 * Returns the meta object for the containment reference list '{@link resume_template.Table#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see resume_template.Table#getCells()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Cells();

	/**
	 * Returns the meta object for class '{@link resume_template.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see resume_template.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.Cell#getRowIdx <em>Row Idx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Idx</em>'.
	 * @see resume_template.Cell#getRowIdx()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_RowIdx();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.Cell#getColIdx <em>Col Idx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Idx</em>'.
	 * @see resume_template.Cell#getColIdx()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_ColIdx();

	/**
	 * Returns the meta object for the containment reference list '{@link resume_template.Cell#getTextElements <em>Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Elements</em>'.
	 * @see resume_template.Cell#getTextElements()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_TextElements();

	/**
	 * Returns the meta object for class '{@link resume_template.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Line</em>'.
	 * @see resume_template.HorizontalLine
	 * @generated
	 */
	EClass getHorizontalLine();

	/**
	 * Returns the meta object for the attribute '{@link resume_template.HorizontalLine#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see resume_template.HorizontalLine#getFontSize()
	 * @see #getHorizontalLine()
	 * @generated
	 */
	EAttribute getHorizontalLine_FontSize();

	/**
	 * Returns the meta object for enum '{@link resume_template.HAlignment <em>HAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HAlignment</em>'.
	 * @see resume_template.HAlignment
	 * @generated
	 */
	EEnum getHAlignment();

	/**
	 * Returns the meta object for enum '{@link resume_template.GlyphType <em>Glyph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Glyph Type</em>'.
	 * @see resume_template.GlyphType
	 * @generated
	 */
	EEnum getGlyphType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Resume_templateFactory getResume_templateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link resume_template.impl.ResumeTemplateImpl <em>Resume Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.ResumeTemplateImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getResumeTemplate()
		 * @generated
		 */
		EClass RESUME_TEMPLATE = eINSTANCE.getResumeTemplate();

		/**
		 * The meta object literal for the '<em><b>Folder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESUME_TEMPLATE__FOLDER_NAME = eINSTANCE.getResumeTemplate_FolderName();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESUME_TEMPLATE__FILE_NAME = eINSTANCE.getResumeTemplate_FileName();

		/**
		 * The meta object literal for the '<em><b>Default Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESUME_TEMPLATE__DEFAULT_FONT = eINSTANCE.getResumeTemplate_DefaultFont();

		/**
		 * The meta object literal for the '<em><b>Default Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESUME_TEMPLATE__DEFAULT_FONT_SIZE = eINSTANCE.getResumeTemplate_DefaultFontSize();

		/**
		 * The meta object literal for the '<em><b>Default Table Padding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESUME_TEMPLATE__DEFAULT_TABLE_PADDING = eINSTANCE.getResumeTemplate_DefaultTablePadding();

		/**
		 * The meta object literal for the '<em><b>Theme Colors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME_TEMPLATE__THEME_COLORS = eINSTANCE.getResumeTemplate_ThemeColors();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME_TEMPLATE__ELEMENTS = eINSTANCE.getResumeTemplate_Elements();

		/**
		 * The meta object literal for the '{@link resume_template.impl.ThemeColorImpl <em>Theme Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.ThemeColorImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getThemeColor()
		 * @generated
		 */
		EClass THEME_COLOR = eINSTANCE.getThemeColor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME_COLOR__NAME = eINSTANCE.getThemeColor_Name();

		/**
		 * The meta object literal for the '<em><b>Color Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEME_COLOR__COLOR_CODE = eINSTANCE.getThemeColor_ColorCode();

		/**
		 * The meta object literal for the '{@link resume_template.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.ElementImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Element Idx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ELEMENT_IDX = eINSTANCE.getElement_ElementIdx();

		/**
		 * The meta object literal for the '{@link resume_template.impl.RepeatContainerImpl <em>Repeat Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.RepeatContainerImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getRepeatContainer()
		 * @generated
		 */
		EClass REPEAT_CONTAINER = eINSTANCE.getRepeatContainer();

		/**
		 * The meta object literal for the '<em><b>Repeat Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_CONTAINER__REPEAT_TIMES = eINSTANCE.getRepeatContainer_RepeatTimes();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_CONTAINER__ELEMENTS = eINSTANCE.getRepeatContainer_Elements();

		/**
		 * The meta object literal for the '{@link resume_template.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.TextElementImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '<em><b>Is Auto Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__IS_AUTO_GENERATED = eINSTANCE.getTextElement_IsAutoGenerated();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__TEXT = eINSTANCE.getTextElement_Text();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__FONT = eINSTANCE.getTextElement_Font();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__FONT_SIZE = eINSTANCE.getTextElement_FontSize();

		/**
		 * The meta object literal for the '<em><b>Is Uppercase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__IS_UPPERCASE = eINSTANCE.getTextElement_IsUppercase();

		/**
		 * The meta object literal for the '<em><b>Is Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__IS_BOLD = eINSTANCE.getTextElement_IsBold();

		/**
		 * The meta object literal for the '<em><b>Is Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__IS_ITALIC = eINSTANCE.getTextElement_IsItalic();

		/**
		 * The meta object literal for the '<em><b>HAlignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__HALIGNMENT = eINSTANCE.getTextElement_HAlignment();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_ELEMENT__COLOR = eINSTANCE.getTextElement_Color();

		/**
		 * The meta object literal for the '{@link resume_template.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.ParagraphImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__LENGTH = eINSTANCE.getParagraph_Length();

		/**
		 * The meta object literal for the '{@link resume_template.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.ListImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Num Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__NUM_ITEMS = eINSTANCE.getList_NumItems();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__MIN_LENGTH = eINSTANCE.getList_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__MAX_LENGTH = eINSTANCE.getList_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Glyph Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__GLYPH_TYPE = eINSTANCE.getList_GlyphType();

		/**
		 * The meta object literal for the '{@link resume_template.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.TableImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Num Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NUM_ROWS = eINSTANCE.getTable_NumRows();

		/**
		 * The meta object literal for the '<em><b>Num Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NUM_COLS = eINSTANCE.getTable_NumCols();

		/**
		 * The meta object literal for the '<em><b>Width Prop Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WIDTH_PROP_COLS = eINSTANCE.getTable_WidthPropCols();

		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__BORDER_WIDTH = eINSTANCE.getTable_BorderWidth();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__PADDING = eINSTANCE.getTable_Padding();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__BG_COLOR = eINSTANCE.getTable_BgColor();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CELLS = eINSTANCE.getTable_Cells();

		/**
		 * The meta object literal for the '{@link resume_template.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.CellImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Row Idx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ROW_IDX = eINSTANCE.getCell_RowIdx();

		/**
		 * The meta object literal for the '<em><b>Col Idx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__COL_IDX = eINSTANCE.getCell_ColIdx();

		/**
		 * The meta object literal for the '<em><b>Text Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__TEXT_ELEMENTS = eINSTANCE.getCell_TextElements();

		/**
		 * The meta object literal for the '{@link resume_template.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.impl.HorizontalLineImpl
		 * @see resume_template.impl.Resume_templatePackageImpl#getHorizontalLine()
		 * @generated
		 */
		EClass HORIZONTAL_LINE = eINSTANCE.getHorizontalLine();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_LINE__FONT_SIZE = eINSTANCE.getHorizontalLine_FontSize();

		/**
		 * The meta object literal for the '{@link resume_template.HAlignment <em>HAlignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.HAlignment
		 * @see resume_template.impl.Resume_templatePackageImpl#getHAlignment()
		 * @generated
		 */
		EEnum HALIGNMENT = eINSTANCE.getHAlignment();

		/**
		 * The meta object literal for the '{@link resume_template.GlyphType <em>Glyph Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resume_template.GlyphType
		 * @see resume_template.impl.Resume_templatePackageImpl#getGlyphType()
		 * @generated
		 */
		EEnum GLYPH_TYPE = eINSTANCE.getGlyphType();

	}

} //Resume_templatePackage
