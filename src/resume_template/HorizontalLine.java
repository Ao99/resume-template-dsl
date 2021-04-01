/**
 */
package resume_template;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horizontal Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resume_template.HorizontalLine#getFontSize <em>Font Size</em>}</li>
 * </ul>
 *
 * @see resume_template.Resume_templatePackage#getHorizontalLine()
 * @model annotation="gmf.node label='fontSize' label.pattern='HorizontalLine size: {0}' figure='polygon' size='700,5' polygon.x='0 500' polygon.y='0 0'"
 *        annotation="exeed label='return \'HorizontalLine size: \' + self.size;' classIcon='transition'"
 * @generated
 */
public interface HorizontalLine extends Element {
	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(double)
	 * @see resume_template.Resume_templatePackage#getHorizontalLine_FontSize()
	 * @model default="5"
	 * @generated
	 */
	double getFontSize();

	/**
	 * Sets the value of the '{@link resume_template.HorizontalLine#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(double value);

} // HorizontalLine
