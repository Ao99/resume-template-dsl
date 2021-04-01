/**
 */
package resume_template;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resume Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resume_template.ResumeTemplate#getFolderName <em>Folder Name</em>}</li>
 *   <li>{@link resume_template.ResumeTemplate#getFileName <em>File Name</em>}</li>
 *   <li>{@link resume_template.ResumeTemplate#getDefaultFont <em>Default Font</em>}</li>
 *   <li>{@link resume_template.ResumeTemplate#getDefaultSize <em>Default Size</em>}</li>
 *   <li>{@link resume_template.ResumeTemplate#getDefaultTablePadding <em>Default Table Padding</em>}</li>
 *   <li>{@link resume_template.ResumeTemplate#getThemeColors <em>Theme Colors</em>}</li>
 *   <li>{@link resume_template.ResumeTemplate#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see resume_template.Resume_templatePackage#getResumeTemplate()
 * @model annotation="gmf"
 *        annotation="gmf.diagram"
 *        annotation="exeed label='return \'ResumeTemplate\';' classIcon='resource'"
 * @generated
 */
public interface ResumeTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Folder Name</b></em>' attribute.
	 * The default value is <code>"Resume Templates"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Name</em>' attribute.
	 * @see #setFolderName(String)
	 * @see resume_template.Resume_templatePackage#getResumeTemplate_FolderName()
	 * @model default="Resume Templates"
	 * @generated
	 */
	String getFolderName();

	/**
	 * Sets the value of the '{@link resume_template.ResumeTemplate#getFolderName <em>Folder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Name</em>' attribute.
	 * @see #getFolderName()
	 * @generated
	 */
	void setFolderName(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * The default value is <code>"Resume Template"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see resume_template.Resume_templatePackage#getResumeTemplate_FileName()
	 * @model default="Resume Template"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link resume_template.ResumeTemplate#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Default Font</b></em>' attribute.
	 * The default value is <code>"Arial"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Font</em>' attribute.
	 * @see #setDefaultFont(String)
	 * @see resume_template.Resume_templatePackage#getResumeTemplate_DefaultFont()
	 * @model default="Arial"
	 * @generated
	 */
	String getDefaultFont();

	/**
	 * Sets the value of the '{@link resume_template.ResumeTemplate#getDefaultFont <em>Default Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Font</em>' attribute.
	 * @see #getDefaultFont()
	 * @generated
	 */
	void setDefaultFont(String value);

	/**
	 * Returns the value of the '<em><b>Default Size</b></em>' attribute.
	 * The default value is <code>"11"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Size</em>' attribute.
	 * @see #setDefaultSize(double)
	 * @see resume_template.Resume_templatePackage#getResumeTemplate_DefaultSize()
	 * @model default="11"
	 * @generated
	 */
	double getDefaultSize();

	/**
	 * Sets the value of the '{@link resume_template.ResumeTemplate#getDefaultSize <em>Default Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Size</em>' attribute.
	 * @see #getDefaultSize()
	 * @generated
	 */
	void setDefaultSize(double value);

	/**
	 * Returns the value of the '<em><b>Default Table Padding</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Table Padding</em>' attribute.
	 * @see #setDefaultTablePadding(int)
	 * @see resume_template.Resume_templatePackage#getResumeTemplate_DefaultTablePadding()
	 * @model default="0"
	 * @generated
	 */
	int getDefaultTablePadding();

	/**
	 * Sets the value of the '{@link resume_template.ResumeTemplate#getDefaultTablePadding <em>Default Table Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Table Padding</em>' attribute.
	 * @see #getDefaultTablePadding()
	 * @generated
	 */
	void setDefaultTablePadding(int value);

	/**
	 * Returns the value of the '<em><b>Theme Colors</b></em>' containment reference list.
	 * The list contents are of type {@link resume_template.ThemeColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme Colors</em>' containment reference list.
	 * @see resume_template.Resume_templatePackage#getResumeTemplate_ThemeColors()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<ThemeColor> getThemeColors();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link resume_template.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see resume_template.Resume_templatePackage#getResumeTemplate_Elements()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Element> getElements();

} // ResumeTemplate
