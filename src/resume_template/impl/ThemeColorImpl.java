/**
 */
package resume_template.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import resume_template.Resume_templatePackage;
import resume_template.ThemeColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theme Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resume_template.impl.ThemeColorImpl#getName <em>Name</em>}</li>
 *   <li>{@link resume_template.impl.ThemeColorImpl#getColorCode <em>Color Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThemeColorImpl extends EObjectImpl implements ThemeColor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "themeColor";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorCode() <em>Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_CODE_EDEFAULT = "#FFFFFF";

	/**
	 * The cached value of the '{@link #getColorCode() <em>Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorCode()
	 * @generated
	 * @ordered
	 */
	protected String colorCode = COLOR_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThemeColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Resume_templatePackage.Literals.THEME_COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.THEME_COLOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColorCode() {
		return colorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorCode(String newColorCode) {
		String oldColorCode = colorCode;
		colorCode = newColorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.THEME_COLOR__COLOR_CODE, oldColorCode, colorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Resume_templatePackage.THEME_COLOR__NAME:
				return getName();
			case Resume_templatePackage.THEME_COLOR__COLOR_CODE:
				return getColorCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Resume_templatePackage.THEME_COLOR__NAME:
				setName((String)newValue);
				return;
			case Resume_templatePackage.THEME_COLOR__COLOR_CODE:
				setColorCode((String)newValue);
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
			case Resume_templatePackage.THEME_COLOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Resume_templatePackage.THEME_COLOR__COLOR_CODE:
				setColorCode(COLOR_CODE_EDEFAULT);
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
			case Resume_templatePackage.THEME_COLOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Resume_templatePackage.THEME_COLOR__COLOR_CODE:
				return COLOR_CODE_EDEFAULT == null ? colorCode != null : !COLOR_CODE_EDEFAULT.equals(colorCode);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", colorCode: ");
		result.append(colorCode);
		result.append(')');
		return result.toString();
	}

} //ThemeColorImpl
