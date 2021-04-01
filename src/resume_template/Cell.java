/**
 */
package resume_template;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resume_template.Cell#getRowIdx <em>Row Idx</em>}</li>
 *   <li>{@link resume_template.Cell#getColIdx <em>Col Idx</em>}</li>
 *   <li>{@link resume_template.Cell#getTextElements <em>Text Elements</em>}</li>
 * </ul>
 *
 * @see resume_template.Resume_templatePackage#getCell()
 * @model annotation="gmf.node label='rowIdx,colIdx' label.pattern='Cell idx: ({0},{1})' figure='rectangle'"
 *        annotation="exeed label='return \'Cell idx: (\' + self.rowIdx + \',\' + self.colIdx + \')\';' classIcon='column'"
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Row Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Idx</em>' attribute.
	 * @see #setRowIdx(int)
	 * @see resume_template.Resume_templatePackage#getCell_RowIdx()
	 * @model
	 * @generated
	 */
	int getRowIdx();

	/**
	 * Sets the value of the '{@link resume_template.Cell#getRowIdx <em>Row Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Idx</em>' attribute.
	 * @see #getRowIdx()
	 * @generated
	 */
	void setRowIdx(int value);

	/**
	 * Returns the value of the '<em><b>Col Idx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Idx</em>' attribute.
	 * @see #setColIdx(int)
	 * @see resume_template.Resume_templatePackage#getCell_ColIdx()
	 * @model
	 * @generated
	 */
	int getColIdx();

	/**
	 * Sets the value of the '{@link resume_template.Cell#getColIdx <em>Col Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Idx</em>' attribute.
	 * @see #getColIdx()
	 * @generated
	 */
	void setColIdx(int value);

	/**
	 * Returns the value of the '<em><b>Text Elements</b></em>' containment reference list.
	 * The list contents are of type {@link resume_template.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Elements</em>' containment reference list.
	 * @see resume_template.Resume_templatePackage#getCell_TextElements()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<TextElement> getTextElements();

} // Cell
