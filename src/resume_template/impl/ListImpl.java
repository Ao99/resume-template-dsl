/**
 */
package resume_template.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import resume_template.GlyphType;
import resume_template.List;
import resume_template.Resume_templatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resume_template.impl.ListImpl#getNumItems <em>Num Items</em>}</li>
 *   <li>{@link resume_template.impl.ListImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link resume_template.impl.ListImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link resume_template.impl.ListImpl#getGlyphType <em>Glyph Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends TextElementImpl implements List {
	/**
	 * The default value of the '{@link #getNumItems() <em>Num Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumItems()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumItems() <em>Num Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumItems()
	 * @generated
	 * @ordered
	 */
	protected int numItems = NUM_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected int minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlyphType() <em>Glyph Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyphType()
	 * @generated
	 * @ordered
	 */
	protected static final GlyphType GLYPH_TYPE_EDEFAULT = GlyphType.BULLET;

	/**
	 * The cached value of the '{@link #getGlyphType() <em>Glyph Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyphType()
	 * @generated
	 * @ordered
	 */
	protected GlyphType glyphType = GLYPH_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Resume_templatePackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumItems() {
		return numItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumItems(int newNumItems) {
		int oldNumItems = numItems;
		numItems = newNumItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.LIST__NUM_ITEMS, oldNumItems, numItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLength(int newMinLength) {
		int oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.LIST__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.LIST__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlyphType getGlyphType() {
		return glyphType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlyphType(GlyphType newGlyphType) {
		GlyphType oldGlyphType = glyphType;
		glyphType = newGlyphType == null ? GLYPH_TYPE_EDEFAULT : newGlyphType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.LIST__GLYPH_TYPE, oldGlyphType, glyphType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Resume_templatePackage.LIST__NUM_ITEMS:
				return getNumItems();
			case Resume_templatePackage.LIST__MIN_LENGTH:
				return getMinLength();
			case Resume_templatePackage.LIST__MAX_LENGTH:
				return getMaxLength();
			case Resume_templatePackage.LIST__GLYPH_TYPE:
				return getGlyphType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Resume_templatePackage.LIST__NUM_ITEMS:
				setNumItems((Integer)newValue);
				return;
			case Resume_templatePackage.LIST__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case Resume_templatePackage.LIST__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case Resume_templatePackage.LIST__GLYPH_TYPE:
				setGlyphType((GlyphType)newValue);
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
			case Resume_templatePackage.LIST__NUM_ITEMS:
				setNumItems(NUM_ITEMS_EDEFAULT);
				return;
			case Resume_templatePackage.LIST__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case Resume_templatePackage.LIST__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case Resume_templatePackage.LIST__GLYPH_TYPE:
				setGlyphType(GLYPH_TYPE_EDEFAULT);
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
			case Resume_templatePackage.LIST__NUM_ITEMS:
				return numItems != NUM_ITEMS_EDEFAULT;
			case Resume_templatePackage.LIST__MIN_LENGTH:
				return minLength != MIN_LENGTH_EDEFAULT;
			case Resume_templatePackage.LIST__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case Resume_templatePackage.LIST__GLYPH_TYPE:
				return glyphType != GLYPH_TYPE_EDEFAULT;
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
		result.append(" (numItems: ");
		result.append(numItems);
		result.append(", minLength: ");
		result.append(minLength);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", glyphType: ");
		result.append(glyphType);
		result.append(')');
		return result.toString();
	}

} //ListImpl
