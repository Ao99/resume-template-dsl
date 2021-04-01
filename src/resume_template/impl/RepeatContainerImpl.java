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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resume_template.Element;
import resume_template.RepeatContainer;
import resume_template.Resume_templatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resume_template.impl.RepeatContainerImpl#getRepeatTimes <em>Repeat Times</em>}</li>
 *   <li>{@link resume_template.impl.RepeatContainerImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatContainerImpl extends ElementImpl implements RepeatContainer {
	/**
	 * The default value of the '{@link #getRepeatTimes() <em>Repeat Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatTimes()
	 * @generated
	 * @ordered
	 */
	protected static final int REPEAT_TIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRepeatTimes() <em>Repeat Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatTimes()
	 * @generated
	 * @ordered
	 */
	protected int repeatTimes = REPEAT_TIMES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Resume_templatePackage.Literals.REPEAT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRepeatTimes() {
		return repeatTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatTimes(int newRepeatTimes) {
		int oldRepeatTimes = repeatTimes;
		repeatTimes = newRepeatTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Resume_templatePackage.REPEAT_CONTAINER__REPEAT_TIMES, oldRepeatTimes, repeatTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, Resume_templatePackage.REPEAT_CONTAINER__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Resume_templatePackage.REPEAT_CONTAINER__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case Resume_templatePackage.REPEAT_CONTAINER__REPEAT_TIMES:
				return getRepeatTimes();
			case Resume_templatePackage.REPEAT_CONTAINER__ELEMENTS:
				return getElements();
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
			case Resume_templatePackage.REPEAT_CONTAINER__REPEAT_TIMES:
				setRepeatTimes((Integer)newValue);
				return;
			case Resume_templatePackage.REPEAT_CONTAINER__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
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
			case Resume_templatePackage.REPEAT_CONTAINER__REPEAT_TIMES:
				setRepeatTimes(REPEAT_TIMES_EDEFAULT);
				return;
			case Resume_templatePackage.REPEAT_CONTAINER__ELEMENTS:
				getElements().clear();
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
			case Resume_templatePackage.REPEAT_CONTAINER__REPEAT_TIMES:
				return repeatTimes != REPEAT_TIMES_EDEFAULT;
			case Resume_templatePackage.REPEAT_CONTAINER__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
		result.append(" (repeatTimes: ");
		result.append(repeatTimes);
		result.append(')');
		return result.toString();
	}

} //RepeatContainerImpl
