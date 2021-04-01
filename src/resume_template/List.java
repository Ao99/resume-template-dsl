/**
 */
package resume_template;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resume_template.List#getNumItems <em>Num Items</em>}</li>
 *   <li>{@link resume_template.List#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link resume_template.List#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link resume_template.List#getGlyphType <em>Glyph Type</em>}</li>
 * </ul>
 *
 * @see resume_template.Resume_templatePackage#getList()
 * @model annotation="gmf.node label='numItems' label.pattern='List numItems: {0}' figure='polygon' polygon.x='0 90 100 90 90 100 100 0 0 3 6 3 0 0 3 6 3 0 0 3 6 3 0' polygon.y='0 0 10 10 0 10 40 40 35 32 35 38 35 25 22 25 28 25 15 12 15 18 15'"
 *        annotation="exeed label='return \'List numItems: \' + self.numItems;' classIcon='text'"
 * @generated
 */
public interface List extends TextElement {
	/**
	 * Returns the value of the '<em><b>Num Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Items</em>' attribute.
	 * @see #setNumItems(int)
	 * @see resume_template.Resume_templatePackage#getList_NumItems()
	 * @model
	 * @generated
	 */
	int getNumItems();

	/**
	 * Sets the value of the '{@link resume_template.List#getNumItems <em>Num Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Items</em>' attribute.
	 * @see #getNumItems()
	 * @generated
	 */
	void setNumItems(int value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see resume_template.Resume_templatePackage#getList_MinLength()
	 * @model
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link resume_template.List#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see resume_template.Resume_templatePackage#getList_MaxLength()
	 * @model
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link resume_template.List#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Glyph Type</b></em>' attribute.
	 * The literals are from the enumeration {@link resume_template.GlyphType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glyph Type</em>' attribute.
	 * @see resume_template.GlyphType
	 * @see #setGlyphType(GlyphType)
	 * @see resume_template.Resume_templatePackage#getList_GlyphType()
	 * @model
	 * @generated
	 */
	GlyphType getGlyphType();

	/**
	 * Sets the value of the '{@link resume_template.List#getGlyphType <em>Glyph Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glyph Type</em>' attribute.
	 * @see resume_template.GlyphType
	 * @see #getGlyphType()
	 * @generated
	 */
	void setGlyphType(GlyphType value);

} // List
