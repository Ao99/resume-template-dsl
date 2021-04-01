/**
 */
package resume_template;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resume_template.RepeatContainer#getRepeatTimes <em>Repeat Times</em>}</li>
 *   <li>{@link resume_template.RepeatContainer#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see resume_template.Resume_templatePackage#getRepeatContainer()
 * @model annotation="gmf.node label='repeatTimes' label.pattern='Repeat times: {0}'"
 *        annotation="exeed label='return \'Repeat times: \' + self.repeatTimes;' classIcon='choice'"
 * @generated
 */
public interface RepeatContainer extends Element {
	/**
	 * Returns the value of the '<em><b>Repeat Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Times</em>' attribute.
	 * @see #setRepeatTimes(int)
	 * @see resume_template.Resume_templatePackage#getRepeatContainer_RepeatTimes()
	 * @model
	 * @generated
	 */
	int getRepeatTimes();

	/**
	 * Sets the value of the '{@link resume_template.RepeatContainer#getRepeatTimes <em>Repeat Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Times</em>' attribute.
	 * @see #getRepeatTimes()
	 * @generated
	 */
	void setRepeatTimes(int value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link resume_template.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see resume_template.Resume_templatePackage#getRepeatContainer_Elements()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Element> getElements();

} // RepeatContainer
