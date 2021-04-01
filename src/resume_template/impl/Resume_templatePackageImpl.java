/**
 */
package resume_template.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import resume_template.Cell;
import resume_template.Element;
import resume_template.GlyphType;
import resume_template.HAlignment;
import resume_template.HorizontalLine;
import resume_template.List;
import resume_template.Paragraph;
import resume_template.RepeatContainer;
import resume_template.ResumeTemplate;
import resume_template.Resume_templateFactory;
import resume_template.Resume_templatePackage;
import resume_template.Table;
import resume_template.TextElement;
import resume_template.ThemeColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Resume_templatePackageImpl extends EPackageImpl implements Resume_templatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resumeTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass themeColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glyphTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see resume_template.Resume_templatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Resume_templatePackageImpl() {
		super(eNS_URI, Resume_templateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Resume_templatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Resume_templatePackage init() {
		if (isInited) return (Resume_templatePackage)EPackage.Registry.INSTANCE.getEPackage(Resume_templatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResume_templatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Resume_templatePackageImpl theResume_templatePackage = registeredResume_templatePackage instanceof Resume_templatePackageImpl ? (Resume_templatePackageImpl)registeredResume_templatePackage : new Resume_templatePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theResume_templatePackage.createPackageContents();

		// Initialize created meta-data
		theResume_templatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResume_templatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Resume_templatePackage.eNS_URI, theResume_templatePackage);
		return theResume_templatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResumeTemplate() {
		return resumeTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResumeTemplate_FolderName() {
		return (EAttribute)resumeTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResumeTemplate_FileName() {
		return (EAttribute)resumeTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResumeTemplate_DefaultFont() {
		return (EAttribute)resumeTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResumeTemplate_DefaultFontSize() {
		return (EAttribute)resumeTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResumeTemplate_DefaultTablePadding() {
		return (EAttribute)resumeTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResumeTemplate_ThemeColors() {
		return (EReference)resumeTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResumeTemplate_Elements() {
		return (EReference)resumeTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThemeColor() {
		return themeColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThemeColor_Name() {
		return (EAttribute)themeColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThemeColor_ColorCode() {
		return (EAttribute)themeColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_ElementIdx() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepeatContainer() {
		return repeatContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepeatContainer_RepeatTimes() {
		return (EAttribute)repeatContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatContainer_Elements() {
		return (EReference)repeatContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextElement() {
		return textElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextElement_IsAutoGenerated() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextElement_Text() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextElement_Font() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextElement_FontSize() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextElement_IsUppercase() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextElement_IsBold() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextElement_IsItalic() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextElement_HAlignment() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextElement_Color() {
		return (EReference)textElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParagraph_Length() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_NumItems() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_MinLength() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_MaxLength() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_GlyphType() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_NumRows() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_NumCols() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_WidthPropCols() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_BorderWidth() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Padding() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_BgColor() {
		return (EReference)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Cells() {
		return (EReference)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_RowIdx() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_ColIdx() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCell_TextElements() {
		return (EReference)cellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHorizontalLine() {
		return horizontalLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHorizontalLine_FontSize() {
		return (EAttribute)horizontalLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHAlignment() {
		return hAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGlyphType() {
		return glyphTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resume_templateFactory getResume_templateFactory() {
		return (Resume_templateFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resumeTemplateEClass = createEClass(RESUME_TEMPLATE);
		createEAttribute(resumeTemplateEClass, RESUME_TEMPLATE__FOLDER_NAME);
		createEAttribute(resumeTemplateEClass, RESUME_TEMPLATE__FILE_NAME);
		createEAttribute(resumeTemplateEClass, RESUME_TEMPLATE__DEFAULT_FONT);
		createEAttribute(resumeTemplateEClass, RESUME_TEMPLATE__DEFAULT_FONT_SIZE);
		createEAttribute(resumeTemplateEClass, RESUME_TEMPLATE__DEFAULT_TABLE_PADDING);
		createEReference(resumeTemplateEClass, RESUME_TEMPLATE__THEME_COLORS);
		createEReference(resumeTemplateEClass, RESUME_TEMPLATE__ELEMENTS);

		themeColorEClass = createEClass(THEME_COLOR);
		createEAttribute(themeColorEClass, THEME_COLOR__NAME);
		createEAttribute(themeColorEClass, THEME_COLOR__COLOR_CODE);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ELEMENT_IDX);

		repeatContainerEClass = createEClass(REPEAT_CONTAINER);
		createEAttribute(repeatContainerEClass, REPEAT_CONTAINER__REPEAT_TIMES);
		createEReference(repeatContainerEClass, REPEAT_CONTAINER__ELEMENTS);

		textElementEClass = createEClass(TEXT_ELEMENT);
		createEAttribute(textElementEClass, TEXT_ELEMENT__IS_AUTO_GENERATED);
		createEAttribute(textElementEClass, TEXT_ELEMENT__TEXT);
		createEAttribute(textElementEClass, TEXT_ELEMENT__FONT);
		createEAttribute(textElementEClass, TEXT_ELEMENT__FONT_SIZE);
		createEAttribute(textElementEClass, TEXT_ELEMENT__IS_UPPERCASE);
		createEAttribute(textElementEClass, TEXT_ELEMENT__IS_BOLD);
		createEAttribute(textElementEClass, TEXT_ELEMENT__IS_ITALIC);
		createEAttribute(textElementEClass, TEXT_ELEMENT__HALIGNMENT);
		createEReference(textElementEClass, TEXT_ELEMENT__COLOR);

		paragraphEClass = createEClass(PARAGRAPH);
		createEAttribute(paragraphEClass, PARAGRAPH__LENGTH);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__NUM_ITEMS);
		createEAttribute(listEClass, LIST__MIN_LENGTH);
		createEAttribute(listEClass, LIST__MAX_LENGTH);
		createEAttribute(listEClass, LIST__GLYPH_TYPE);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__NUM_ROWS);
		createEAttribute(tableEClass, TABLE__NUM_COLS);
		createEAttribute(tableEClass, TABLE__WIDTH_PROP_COLS);
		createEAttribute(tableEClass, TABLE__BORDER_WIDTH);
		createEAttribute(tableEClass, TABLE__PADDING);
		createEReference(tableEClass, TABLE__BG_COLOR);
		createEReference(tableEClass, TABLE__CELLS);

		cellEClass = createEClass(CELL);
		createEAttribute(cellEClass, CELL__ROW_IDX);
		createEAttribute(cellEClass, CELL__COL_IDX);
		createEReference(cellEClass, CELL__TEXT_ELEMENTS);

		horizontalLineEClass = createEClass(HORIZONTAL_LINE);
		createEAttribute(horizontalLineEClass, HORIZONTAL_LINE__FONT_SIZE);

		// Create enums
		hAlignmentEEnum = createEEnum(HALIGNMENT);
		glyphTypeEEnum = createEEnum(GLYPH_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		repeatContainerEClass.getESuperTypes().add(this.getElement());
		textElementEClass.getESuperTypes().add(this.getElement());
		paragraphEClass.getESuperTypes().add(this.getTextElement());
		listEClass.getESuperTypes().add(this.getTextElement());
		tableEClass.getESuperTypes().add(this.getElement());
		horizontalLineEClass.getESuperTypes().add(this.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(resumeTemplateEClass, ResumeTemplate.class, "ResumeTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResumeTemplate_FolderName(), ecorePackage.getEString(), "folderName", "Resume Templates", 0, 1, ResumeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResumeTemplate_FileName(), ecorePackage.getEString(), "fileName", "Resume Template", 0, 1, ResumeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResumeTemplate_DefaultFont(), ecorePackage.getEString(), "defaultFont", "Arial", 0, 1, ResumeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResumeTemplate_DefaultFontSize(), ecorePackage.getEDouble(), "defaultFontSize", "11", 0, 1, ResumeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResumeTemplate_DefaultTablePadding(), ecorePackage.getEInt(), "defaultTablePadding", "0", 0, 1, ResumeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResumeTemplate_ThemeColors(), this.getThemeColor(), null, "themeColors", null, 0, -1, ResumeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResumeTemplate_Elements(), this.getElement(), null, "elements", null, 0, -1, ResumeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(themeColorEClass, ThemeColor.class, "ThemeColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThemeColor_Name(), ecorePackage.getEString(), "name", "themeColor", 0, 1, ThemeColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThemeColor_ColorCode(), ecorePackage.getEString(), "colorCode", "#FFFFFF", 0, 1, ThemeColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_ElementIdx(), ecorePackage.getEInt(), "elementIdx", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatContainerEClass, RepeatContainer.class, "RepeatContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeatContainer_RepeatTimes(), ecorePackage.getEInt(), "repeatTimes", null, 0, 1, RepeatContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatContainer_Elements(), this.getElement(), null, "elements", null, 0, -1, RepeatContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textElementEClass, TextElement.class, "TextElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextElement_IsAutoGenerated(), ecorePackage.getEInt(), "isAutoGenerated", "0", 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextElement_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextElement_Font(), ecorePackage.getEString(), "font", null, 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextElement_FontSize(), ecorePackage.getEDouble(), "fontSize", null, 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextElement_IsUppercase(), ecorePackage.getEBoolean(), "isUppercase", "false", 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextElement_IsBold(), ecorePackage.getEBoolean(), "isBold", "false", 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextElement_IsItalic(), ecorePackage.getEBoolean(), "isItalic", "false", 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextElement_HAlignment(), this.getHAlignment(), "hAlignment", null, 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextElement_Color(), this.getThemeColor(), null, "color", null, 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraph_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_NumItems(), ecorePackage.getEInt(), "numItems", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_MinLength(), ecorePackage.getEInt(), "minLength", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_GlyphType(), this.getGlyphType(), "glyphType", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_NumRows(), ecorePackage.getEInt(), "numRows", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_NumCols(), ecorePackage.getEInt(), "numCols", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_WidthPropCols(), ecorePackage.getEString(), "widthPropCols", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_BorderWidth(), ecorePackage.getEInt(), "borderWidth", "0", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Padding(), ecorePackage.getEInt(), "padding", "0", 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_BgColor(), this.getThemeColor(), null, "bgColor", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Cells(), this.getCell(), null, "cells", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCell_RowIdx(), ecorePackage.getEInt(), "rowIdx", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_ColIdx(), ecorePackage.getEInt(), "colIdx", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCell_TextElements(), this.getTextElement(), null, "textElements", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalLineEClass, HorizontalLine.class, "HorizontalLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalLine_FontSize(), ecorePackage.getEDouble(), "fontSize", "5", 0, 1, HorizontalLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(hAlignmentEEnum, HAlignment.class, "HAlignment");
		addEEnumLiteral(hAlignmentEEnum, HAlignment.LEFT);
		addEEnumLiteral(hAlignmentEEnum, HAlignment.CENTER);
		addEEnumLiteral(hAlignmentEEnum, HAlignment.RIGHT);
		addEEnumLiteral(hAlignmentEEnum, HAlignment.JUSTIFY);

		initEEnum(glyphTypeEEnum, GlyphType.class, "GlyphType");
		addEEnumLiteral(glyphTypeEEnum, GlyphType.BULLET);
		addEEnumLiteral(glyphTypeEEnum, GlyphType.HOLLOW_BULLET);
		addEEnumLiteral(glyphTypeEEnum, GlyphType.SQUARE_BULLET);
		addEEnumLiteral(glyphTypeEEnum, GlyphType.NUMBER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// exeed
		createExeedAnnotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.node
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (resumeTemplateEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (resumeTemplateEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getResumeTemplate_ThemeColors(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getResumeTemplate_Elements(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRepeatContainer_Elements(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTable_Cells(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCell_TextElements(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (themeColorEClass,
		   source,
		   new String[] {
			   "label", "colorCode",
			   "label.pattern", "Color code: {0}",
			   "figure", "ellipse",
			   "size", "150,30"
		   });
		addAnnotation
		  (repeatContainerEClass,
		   source,
		   new String[] {
			   "label", "repeatTimes",
			   "label.pattern", "Repeat times: {0}"
		   });
		addAnnotation
		  (paragraphEClass,
		   source,
		   new String[] {
			   "label", "isAutoGenerated,text,length",
			   "label.pattern", "Paragraph {0,choice,0#text: {1}|1#length: {2}}",
			   "figure", "polygon",
			   "polygon.x", "0 90 100 90 90 100 100 0",
			   "polygon.y", "0 0 10 10 0 10 40 40"
		   });
		addAnnotation
		  (listEClass,
		   source,
		   new String[] {
			   "label", "numItems",
			   "label.pattern", "List numItems: {0}",
			   "figure", "polygon",
			   "polygon.x", "0 90 100 90 90 100 100 0 0 3 6 3 0 0 3 6 3 0 0 3 6 3 0",
			   "polygon.y", "0 0 10 10 0 10 40 40 35 32 35 38 35 25 22 25 28 25 15 12 15 18 15"
		   });
		addAnnotation
		  (tableEClass,
		   source,
		   new String[] {
			   "label", "numRows,numCols",
			   "label.pattern", "Table size: {0}x{1}",
			   "figure", "rectangle"
		   });
		addAnnotation
		  (cellEClass,
		   source,
		   new String[] {
			   "label", "rowIdx,colIdx",
			   "label.pattern", "Cell idx: ({0},{1})",
			   "figure", "rectangle"
		   });
		addAnnotation
		  (horizontalLineEClass,
		   source,
		   new String[] {
			   "label", "fontSize",
			   "label.pattern", "HorizontalLine size: {0}",
			   "figure", "polygon",
			   "size", "700,5",
			   "polygon.x", "0 500",
			   "polygon.y", "0 0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getTextElement_Color(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
		addAnnotation
		  (getTable_BgColor(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash"
		   });
	}

	/**
	 * Initializes the annotations for <b>exeed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExeedAnnotations() {
		String source = "exeed";
		addAnnotation
		  (resumeTemplateEClass,
		   source,
		   new String[] {
			   "label", "return \'ResumeTemplate\';",
			   "classIcon", "resource"
		   });
		addAnnotation
		  (themeColorEClass,
		   source,
		   new String[] {
			   "label", "return \'Color code: \' + self.colorCode;",
			   "classIcon", "group"
		   });
		addAnnotation
		  (repeatContainerEClass,
		   source,
		   new String[] {
			   "label", "return \'Repeat times: \' + self.repeatTimes;",
			   "classIcon", "choice"
		   });
		addAnnotation
		  (paragraphEClass,
		   source,
		   new String[] {
			   "label", "\r\n\t\tvar label : String;\r\n\t\tlabel = \'Paragraph \';\r\n\t\tif(self.isAutoGenerated) {\r\n\t\t\tlabel = label + \'length: \' + self.length;\r\n\t\t} else {\r\n\t\t\tlabel = label + \'text: \' + self.text;\t\t\t\r\n\t\t}\r\n\t\treturn label;\r\n\t",
			   "classIcon", "text"
		   });
		addAnnotation
		  (listEClass,
		   source,
		   new String[] {
			   "label", "return \'List numItems: \' + self.numItems;",
			   "classIcon", "text"
		   });
		addAnnotation
		  (tableEClass,
		   source,
		   new String[] {
			   "label", "return \'Table size: \' + self.numRows + \'x\' + self.numCols;",
			   "classIcon", "table"
		   });
		addAnnotation
		  (cellEClass,
		   source,
		   new String[] {
			   "label", "return \'Cell idx: (\' + self.rowIdx + \',\' + self.colIdx + \')\';",
			   "classIcon", "column"
		   });
		addAnnotation
		  (horizontalLineEClass,
		   source,
		   new String[] {
			   "label", "return \'HorizontalLine size: \' + self.size;",
			   "classIcon", "transition"
		   });
	}

} //Resume_templatePackageImpl
