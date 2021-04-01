/**
 */
package resume_template;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theme Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resume_template.ThemeColor#getName <em>Name</em>}</li>
 *   <li>{@link resume_template.ThemeColor#getColorCode <em>Color Code</em>}</li>
 * </ul>
 *
 * @see resume_template.Resume_templatePackage#getThemeColor()
 * @model annotation="gmf.node label='colorCode' label.pattern='Color code: {0}' figure='ellipse' size='150,30'"
 *        annotation="exeed label='return \'Color code: \' + self.colorCode;' classIcon='group'"
 * @generated
 */
public interface ThemeColor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"themeColor"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see resume_template.Resume_templatePackage#getThemeColor_Name()
	 * @model default="themeColor"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resume_template.ThemeColor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Color Code</b></em>' attribute.
	 * The default value is <code>"#FFFFFF"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Code</em>' attribute.
	 * @see #setColorCode(String)
	 * @see resume_template.Resume_templatePackage#getThemeColor_ColorCode()
	 * @model default="#FFFFFF"
	 * @generated
	 */
	String getColorCode();

	/**
	 * Sets the value of the '{@link resume_template.ThemeColor#getColorCode <em>Color Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Code</em>' attribute.
	 * @see #getColorCode()
	 * @generated
	 */
	void setColorCode(String value);

} // ThemeColor
