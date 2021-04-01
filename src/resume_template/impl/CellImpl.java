/**
 */
package resume_template.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resume_template.Cell;
import resume_template.Resume_templatePackage;
import resume_template.TextElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resume_template.impl.CellImpl#getRowIdx <em>Row Idx</em>}</li>
 *   <li>{@link resume_template.impl.CellImpl#getColIdx <em>Col Idx</em>}</li>
 *   <li>{@link resume_template.impl.CellImpl#getTextElements <em>Text Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends EObjectImpl implements Cell {
	/**
	 * The default value of the '{@link #getRowIdx() <em>Row Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIdx()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_IDX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowIdx() <em>Row Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIdx()
	 * @generated
	 * @ordered
	 */
	protected int rowIdx = ROW_IDX_EDEFAULT;

	/**
	 * The default value of the '{@link #getColIdx() <em>Col Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColIdx()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_IDX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColIdx() <em>Col Idx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColIdx()
	 * @generated
	 * @ordered
	 */
	protected int colIdx = COL_IDX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextElements() <em>Text Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TextElement> textElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Resume_templatePackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRowIdx() {
		return rowIdx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowIdx(int newRowIdx) {
		int oldRowIdx = rowIdx;
		rowIdx = newRowIdx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.CELL__ROW_IDX, oldRowIdx, rowIdx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColIdx() {
		return colIdx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColIdx(int newColIdx) {
		int oldColIdx = colIdx;
		colIdx = newColIdx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.CELL__COL_IDX, oldColIdx, colIdx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextElement> getTextElements() {
		if (textElements == null) {
			textElements = new EObjectContainmentEList<TextElement>(TextElement.class, this, Resume_templatePackage.CELL__TEXT_ELEMENTS);
		}
		return textElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Resume_templatePackage.CELL__TEXT_ELEMENTS:
				return ((InternalEList<?>)getTextElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Resume_templatePackage.CELL__ROW_IDX:
				return getRowIdx();
			case Resume_templatePackage.CELL__COL_IDX:
				return getColIdx();
			case Resume_templatePackage.CELL__TEXT_ELEMENTS:
				return getTextElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Resume_templatePackage.CELL__ROW_IDX:
				setRowIdx((Integer)newValue);
				return;
			case Resume_templatePackage.CELL__COL_IDX:
				setColIdx((Integer)newValue);
				return;
			case Resume_templatePackage.CELL__TEXT_ELEMENTS:
				getTextElements().clear();
				getTextElements().addAll((Collection<? extends TextElement>)newValue);
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
			case Resume_templatePackage.CELL__ROW_IDX:
				setRowIdx(ROW_IDX_EDEFAULT);
				return;
			case Resume_templatePackage.CELL__COL_IDX:
				setColIdx(COL_IDX_EDEFAULT);
				return;
			case Resume_templatePackage.CELL__TEXT_ELEMENTS:
				getTextElements().clear();
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
			case Resume_templatePackage.CELL__ROW_IDX:
				return rowIdx != ROW_IDX_EDEFAULT;
			case Resume_templatePackage.CELL__COL_IDX:
				return colIdx != COL_IDX_EDEFAULT;
			case Resume_templatePackage.CELL__TEXT_ELEMENTS:
				return textElements != null && !textElements.isEmpty();
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
		result.append(" (rowIdx: ");
		result.append(rowIdx);
		result.append(", colIdx: ");
		result.append(colIdx);
		result.append(')');
		return result.toString();
	}

} //CellImpl
