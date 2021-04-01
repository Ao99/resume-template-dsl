/**
 */
package resume_template.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resume_template.Element;
import resume_template.ResumeTemplate;
import resume_template.Resume_templatePackage;
import resume_template.ThemeColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resume Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resume_template.impl.ResumeTemplateImpl#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link resume_template.impl.ResumeTemplateImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link resume_template.impl.ResumeTemplateImpl#getDefaultFont <em>Default Font</em>}</li>
 *   <li>{@link resume_template.impl.ResumeTemplateImpl#getDefaultFontSize <em>Default Font Size</em>}</li>
 *   <li>{@link resume_template.impl.ResumeTemplateImpl#getDefaultTablePadding <em>Default Table Padding</em>}</li>
 *   <li>{@link resume_template.impl.ResumeTemplateImpl#getThemeColors <em>Theme Colors</em>}</li>
 *   <li>{@link resume_template.impl.ResumeTemplateImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResumeTemplateImpl extends EObjectImpl implements ResumeTemplate {
	/**
	 * The default value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLDER_NAME_EDEFAULT = "Resume Templates";

	/**
	 * The cached value of the '{@link #getFolderName() <em>Folder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected String folderName = FOLDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = "Resume Template";

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFont() <em>Default Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFont()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FONT_EDEFAULT = "Arial";

	/**
	 * The cached value of the '{@link #getDefaultFont() <em>Default Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFont()
	 * @generated
	 * @ordered
	 */
	protected String defaultFont = DEFAULT_FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFontSize() <em>Default Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final double DEFAULT_FONT_SIZE_EDEFAULT = 11.0;

	/**
	 * The cached value of the '{@link #getDefaultFontSize() <em>Default Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFontSize()
	 * @generated
	 * @ordered
	 */
	protected double defaultFontSize = DEFAULT_FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTablePadding() <em>Default Table Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTablePadding()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_TABLE_PADDING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultTablePadding() <em>Default Table Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTablePadding()
	 * @generated
	 * @ordered
	 */
	protected int defaultTablePadding = DEFAULT_TABLE_PADDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThemeColors() <em>Theme Colors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThemeColors()
	 * @generated
	 * @ordered
	 */
	protected EList<ThemeColor> themeColors;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResumeTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Resume_templatePackage.Literals.RESUME_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFolderName() {
		return folderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFolderName(String newFolderName) {
		String oldFolderName = folderName;
		folderName = newFolderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.RESUME_TEMPLATE__FOLDER_NAME, oldFolderName, folderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.RESUME_TEMPLATE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultFont() {
		return defaultFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFont(String newDefaultFont) {
		String oldDefaultFont = defaultFont;
		defaultFont = newDefaultFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT, oldDefaultFont, defaultFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDefaultFontSize() {
		return defaultFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFontSize(double newDefaultFontSize) {
		double oldDefaultFontSize = defaultFontSize;
		defaultFontSize = newDefaultFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT_SIZE, oldDefaultFontSize, defaultFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDefaultTablePadding() {
		return defaultTablePadding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTablePadding(int newDefaultTablePadding) {
		int oldDefaultTablePadding = defaultTablePadding;
		defaultTablePadding = newDefaultTablePadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_TABLE_PADDING, oldDefaultTablePadding, defaultTablePadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThemeColor> getThemeColors() {
		if (themeColors == null) {
			themeColors = new EObjectContainmentEList<ThemeColor>(ThemeColor.class, this, Resume_templatePackage.RESUME_TEMPLATE__THEME_COLORS);
		}
		return themeColors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, Resume_templatePackage.RESUME_TEMPLATE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Resume_templatePackage.RESUME_TEMPLATE__THEME_COLORS:
				return ((InternalEList<?>)getThemeColors()).basicRemove(otherEnd, msgs);
			case Resume_templatePackage.RESUME_TEMPLATE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Resume_templatePackage.RESUME_TEMPLATE__FOLDER_NAME:
				return getFolderName();
			case Resume_templatePackage.RESUME_TEMPLATE__FILE_NAME:
				return getFileName();
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT:
				return getDefaultFont();
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT_SIZE:
				return getDefaultFontSize();
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_TABLE_PADDING:
				return getDefaultTablePadding();
			case Resume_templatePackage.RESUME_TEMPLATE__THEME_COLORS:
				return getThemeColors();
			case Resume_templatePackage.RESUME_TEMPLATE__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Resume_templatePackage.RESUME_TEMPLATE__FOLDER_NAME:
				setFolderName((String)newValue);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT:
				setDefaultFont((String)newValue);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT_SIZE:
				setDefaultFontSize((Double)newValue);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_TABLE_PADDING:
				setDefaultTablePadding((Integer)newValue);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__THEME_COLORS:
				getThemeColors().clear();
				getThemeColors().addAll((Collection<? extends ThemeColor>)newValue);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Resume_templatePackage.RESUME_TEMPLATE__FOLDER_NAME:
				setFolderName(FOLDER_NAME_EDEFAULT);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT:
				setDefaultFont(DEFAULT_FONT_EDEFAULT);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT_SIZE:
				setDefaultFontSize(DEFAULT_FONT_SIZE_EDEFAULT);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_TABLE_PADDING:
				setDefaultTablePadding(DEFAULT_TABLE_PADDING_EDEFAULT);
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__THEME_COLORS:
				getThemeColors().clear();
				return;
			case Resume_templatePackage.RESUME_TEMPLATE__ELEMENTS:
				getElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Resume_templatePackage.RESUME_TEMPLATE__FOLDER_NAME:
				return FOLDER_NAME_EDEFAULT == null ? folderName != null : !FOLDER_NAME_EDEFAULT.equals(folderName);
			case Resume_templatePackage.RESUME_TEMPLATE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT:
				return DEFAULT_FONT_EDEFAULT == null ? defaultFont != null : !DEFAULT_FONT_EDEFAULT.equals(defaultFont);
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_FONT_SIZE:
				return defaultFontSize != DEFAULT_FONT_SIZE_EDEFAULT;
			case Resume_templatePackage.RESUME_TEMPLATE__DEFAULT_TABLE_PADDING:
				return defaultTablePadding != DEFAULT_TABLE_PADDING_EDEFAULT;
			case Resume_templatePackage.RESUME_TEMPLATE__THEME_COLORS:
				return themeColors != null && !themeColors.isEmpty();
			case Resume_templatePackage.RESUME_TEMPLATE__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (folderName: ");
		result.append(folderName);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", defaultFont: ");
		result.append(defaultFont);
		result.append(", defaultFontSize: ");
		result.append(defaultFontSize);
		result.append(", defaultTablePadding: ");
		result.append(defaultTablePadding);
		result.append(')');
		return result.toString();
	}

} //ResumeTemplateImpl
