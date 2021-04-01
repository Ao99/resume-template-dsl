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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resume_template.Cell;
import resume_template.Resume_templatePackage;
import resume_template.Table;
import resume_template.ThemeColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resume_template.impl.TableImpl#getNumRows <em>Num Rows</em>}</li>
 *   <li>{@link resume_template.impl.TableImpl#getNumCols <em>Num Cols</em>}</li>
 *   <li>{@link resume_template.impl.TableImpl#getWidthPropCols <em>Width Prop Cols</em>}</li>
 *   <li>{@link resume_template.impl.TableImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link resume_template.impl.TableImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link resume_template.impl.TableImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link resume_template.impl.TableImpl#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends ElementImpl implements Table {
	/**
	 * The default value of the '{@link #getNumRows() <em>Num Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRows()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumRows() <em>Num Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRows()
	 * @generated
	 * @ordered
	 */
	protected int numRows = NUM_ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumCols() <em>Num Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCols()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_COLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumCols() <em>Num Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCols()
	 * @generated
	 * @ordered
	 */
	protected int numCols = NUM_COLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidthPropCols() <em>Width Prop Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthPropCols()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_PROP_COLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidthPropCols() <em>Width Prop Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthPropCols()
	 * @generated
	 * @ordered
	 */
	protected String widthPropCols = WIDTH_PROP_COLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected int borderWidth = BORDER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final int PADDING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected int padding = PADDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBgColor() <em>Bg Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected ThemeColor bgColor;

	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Resume_templatePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumRows() {
		return numRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumRows(int newNumRows) {
		int oldNumRows = numRows;
		numRows = newNumRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.TABLE__NUM_ROWS, oldNumRows, numRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumCols() {
		return numCols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumCols(int newNumCols) {
		int oldNumCols = numCols;
		numCols = newNumCols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.TABLE__NUM_COLS, oldNumCols, numCols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWidthPropCols() {
		return widthPropCols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidthPropCols(String newWidthPropCols) {
		String oldWidthPropCols = widthPropCols;
		widthPropCols = newWidthPropCols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.TABLE__WIDTH_PROP_COLS, oldWidthPropCols, widthPropCols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBorderWidth() {
		return borderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderWidth(int newBorderWidth) {
		int oldBorderWidth = borderWidth;
		borderWidth = newBorderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.TABLE__BORDER_WIDTH, oldBorderWidth, borderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPadding(int newPadding) {
		int oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.TABLE__PADDING, oldPadding, padding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThemeColor getBgColor() {
		if (bgColor != null && bgColor.eIsProxy()) {
			InternalEObject oldBgColor = (InternalEObject)bgColor;
			bgColor = (ThemeColor)eResolveProxy(oldBgColor);
			if (bgColor != oldBgColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Resume_templatePackage.TABLE__BG_COLOR, oldBgColor, bgColor));
			}
		}
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThemeColor basicGetBgColor() {
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBgColor(ThemeColor newBgColor) {
		ThemeColor oldBgColor = bgColor;
		bgColor = newBgColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.TABLE__BG_COLOR, oldBgColor, bgColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cell> getCells() {
		if (cells == null) {
			cells = new EObjectContainmentEList<Cell>(Cell.class, this, Resume_templatePackage.TABLE__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Resume_templatePackage.TABLE__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
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
			case Resume_templatePackage.TABLE__NUM_ROWS:
				return getNumRows();
			case Resume_templatePackage.TABLE__NUM_COLS:
				return getNumCols();
			case Resume_templatePackage.TABLE__WIDTH_PROP_COLS:
				return getWidthPropCols();
			case Resume_templatePackage.TABLE__BORDER_WIDTH:
				return getBorderWidth();
			case Resume_templatePackage.TABLE__PADDING:
				return getPadding();
			case Resume_templatePackage.TABLE__BG_COLOR:
				if (resolve) return getBgColor();
				return basicGetBgColor();
			case Resume_templatePackage.TABLE__CELLS:
				return getCells();
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
			case Resume_templatePackage.TABLE__NUM_ROWS:
				setNumRows((Integer)newValue);
				return;
			case Resume_templatePackage.TABLE__NUM_COLS:
				setNumCols((Integer)newValue);
				return;
			case Resume_templatePackage.TABLE__WIDTH_PROP_COLS:
				setWidthPropCols((String)newValue);
				return;
			case Resume_templatePackage.TABLE__BORDER_WIDTH:
				setBorderWidth((Integer)newValue);
				return;
			case Resume_templatePackage.TABLE__PADDING:
				setPadding((Integer)newValue);
				return;
			case Resume_templatePackage.TABLE__BG_COLOR:
				setBgColor((ThemeColor)newValue);
				return;
			case Resume_templatePackage.TABLE__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends Cell>)newValue);
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
			case Resume_templatePackage.TABLE__NUM_ROWS:
				setNumRows(NUM_ROWS_EDEFAULT);
				return;
			case Resume_templatePackage.TABLE__NUM_COLS:
				setNumCols(NUM_COLS_EDEFAULT);
				return;
			case Resume_templatePackage.TABLE__WIDTH_PROP_COLS:
				setWidthPropCols(WIDTH_PROP_COLS_EDEFAULT);
				return;
			case Resume_templatePackage.TABLE__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case Resume_templatePackage.TABLE__PADDING:
				setPadding(PADDING_EDEFAULT);
				return;
			case Resume_templatePackage.TABLE__BG_COLOR:
				setBgColor((ThemeColor)null);
				return;
			case Resume_templatePackage.TABLE__CELLS:
				getCells().clear();
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
			case Resume_templatePackage.TABLE__NUM_ROWS:
				return numRows != NUM_ROWS_EDEFAULT;
			case Resume_templatePackage.TABLE__NUM_COLS:
				return numCols != NUM_COLS_EDEFAULT;
			case Resume_templatePackage.TABLE__WIDTH_PROP_COLS:
				return WIDTH_PROP_COLS_EDEFAULT == null ? widthPropCols != null : !WIDTH_PROP_COLS_EDEFAULT.equals(widthPropCols);
			case Resume_templatePackage.TABLE__BORDER_WIDTH:
				return borderWidth != BORDER_WIDTH_EDEFAULT;
			case Resume_templatePackage.TABLE__PADDING:
				return padding != PADDING_EDEFAULT;
			case Resume_templatePackage.TABLE__BG_COLOR:
				return bgColor != null;
			case Resume_templatePackage.TABLE__CELLS:
				return cells != null && !cells.isEmpty();
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
		result.append(" (numRows: ");
		result.append(numRows);
		result.append(", numCols: ");
		result.append(numCols);
		result.append(", widthPropCols: ");
		result.append(widthPropCols);
		result.append(", borderWidth: ");
		result.append(borderWidth);
		result.append(", padding: ");
		result.append(padding);
		result.append(')');
		return result.toString();
	}

} //TableImpl
