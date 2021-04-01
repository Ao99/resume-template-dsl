/**
 */
package resume_template;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resume_template.Element#getElementIdx <em>Element Idx</em>}</li>
 * </ul>
 *
 * @see resume_template.Resume_templatePackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Idx</em>' attribute.
	 * @see #setElementIdx(int)
	 * @see resume_template.Resume_templatePackage#getElement_ElementIdx()
	 * @model
	 * @generated
	 */
	int getElementIdx();

	/**
	 * Sets the value of the '{@link resume_template.Element#getElementIdx <em>Element Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Idx</em>' attribute.
	 * @see #getElementIdx()
	 * @generated
	 */
	void setElementIdx(int value);

} // Element
