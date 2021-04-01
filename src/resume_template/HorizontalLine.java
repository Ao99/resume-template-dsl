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
 *   <li>{@link resume_template.HorizontalLine#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see resume_template.Resume_templatePackage#getHorizontalLine()
 * @model annotation="gmf.node label='size' label.pattern='HorizontalLine size: {0}' figure='polygon' size='700,5' polygon.x='0 500' polygon.y='0 0'"
 *        annotation="exeed label='return \'HorizontalLine size: \' + self.size;' classIcon='transition'"
 * @generated
 */
public interface HorizontalLine extends Element {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see resume_template.Resume_templatePackage#getHorizontalLine_Size()
	 * @model default="5"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link resume_template.HorizontalLine#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

} // HorizontalLine
