/**
 */
package resume_template;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resume_template.Table#getNumRows <em>Num Rows</em>}</li>
 *   <li>{@link resume_template.Table#getNumCols <em>Num Cols</em>}</li>
 *   <li>{@link resume_template.Table#getWidthPropCols <em>Width Prop Cols</em>}</li>
 *   <li>{@link resume_template.Table#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link resume_template.Table#getPadding <em>Padding</em>}</li>
 *   <li>{@link resume_template.Table#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link resume_template.Table#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see resume_template.Resume_templatePackage#getTable()
 * @model annotation="gmf.node label='numRows,numCols' label.pattern='Table size: {0}x{1}' figure='rectangle'"
 *        annotation="exeed label='return \'Table size: \' + self.numRows + \'x\' + self.numCols;' classIcon='table'"
 * @generated
 */
public interface Table extends Element {
	/**
	 * Returns the value of the '<em><b>Num Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Rows</em>' attribute.
	 * @see #setNumRows(int)
	 * @see resume_template.Resume_templatePackage#getTable_NumRows()
	 * @model
	 * @generated
	 */
	int getNumRows();

	/**
	 * Sets the value of the '{@link resume_template.Table#getNumRows <em>Num Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Rows</em>' attribute.
	 * @see #getNumRows()
	 * @generated
	 */
	void setNumRows(int value);

	/**
	 * Returns the value of the '<em><b>Num Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cols</em>' attribute.
	 * @see #setNumCols(int)
	 * @see resume_template.Resume_templatePackage#getTable_NumCols()
	 * @model
	 * @generated
	 */
	int getNumCols();

	/**
	 * Sets the value of the '{@link resume_template.Table#getNumCols <em>Num Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cols</em>' attribute.
	 * @see #getNumCols()
	 * @generated
	 */
	void setNumCols(int value);

	/**
	 * Returns the value of the '<em><b>Width Prop Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Prop Cols</em>' attribute.
	 * @see #setWidthPropCols(String)
	 * @see resume_template.Resume_templatePackage#getTable_WidthPropCols()
	 * @model
	 * @generated
	 */
	String getWidthPropCols();

	/**
	 * Sets the value of the '{@link resume_template.Table#getWidthPropCols <em>Width Prop Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Prop Cols</em>' attribute.
	 * @see #getWidthPropCols()
	 * @generated
	 */
	void setWidthPropCols(String value);

	/**
	 * Returns the value of the '<em><b>Border Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Width</em>' attribute.
	 * @see #setBorderWidth(int)
	 * @see resume_template.Resume_templatePackage#getTable_BorderWidth()
	 * @model default="0"
	 * @generated
	 */
	int getBorderWidth();

	/**
	 * Sets the value of the '{@link resume_template.Table#getBorderWidth <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Width</em>' attribute.
	 * @see #getBorderWidth()
	 * @generated
	 */
	void setBorderWidth(int value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' attribute.
	 * @see #setPadding(int)
	 * @see resume_template.Resume_templatePackage#getTable_Padding()
	 * @model default="0"
	 * @generated
	 */
	int getPadding();

	/**
	 * Sets the value of the '{@link resume_template.Table#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' attribute.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(int value);

	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' reference.
	 * @see #setBgColor(ThemeColor)
	 * @see resume_template.Resume_templatePackage#getTable_BgColor()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	ThemeColor getBgColor();

	/**
	 * Sets the value of the '{@link resume_template.Table#getBgColor <em>Bg Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' reference.
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(ThemeColor value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link resume_template.Cell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see resume_template.Resume_templatePackage#getTable_Cells()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Cell> getCells();

} // Table
