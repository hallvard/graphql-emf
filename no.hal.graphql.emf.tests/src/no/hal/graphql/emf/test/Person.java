/**
 */
package no.hal.graphql.emf.test;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.graphql.emf.test.Person#getIds <em>Ids</em>}</li>
 *   <li>{@link no.hal.graphql.emf.test.Person#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.graphql.emf.test.Person#getBirthday <em>Birthday</em>}</li>
 * </ul>
 *
 * @see no.hal.graphql.emf.test.TestPackage#getPerson()
 * @model kind="class"
 * @generated
 */
public class Person extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getIds() <em>Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ids;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTHDAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
	protected Date birthday = BIRTHDAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Person() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.PERSON;
	}

	/**
	 * Returns the value of the '<em><b>Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' attribute list.
	 * @see no.hal.graphql.emf.test.TestPackage#getPerson_Ids()
	 * @model
	 * @generated
	 */
	public EList<String> getIds() {
		if (ids == null) {
			ids = new EDataTypeUniqueEList<String>(String.class, this, TestPackage.PERSON__IDS);
		}
		return ids;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.hal.graphql.emf.test.TestPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link no.hal.graphql.emf.test.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday</em>' attribute.
	 * @see #setBirthday(Date)
	 * @see no.hal.graphql.emf.test.TestPackage#getPerson_Birthday()
	 * @model
	 * @generated
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * Sets the value of the '{@link no.hal.graphql.emf.test.Person#getBirthday <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday</em>' attribute.
	 * @see #getBirthday()
	 * @generated
	 */
	public void setBirthday(Date newBirthday) {
		Date oldBirthday = birthday;
		birthday = newBirthday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.PERSON__BIRTHDAY, oldBirthday, birthday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.PERSON__IDS:
				return getIds();
			case TestPackage.PERSON__NAME:
				return getName();
			case TestPackage.PERSON__BIRTHDAY:
				return getBirthday();
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
			case TestPackage.PERSON__IDS:
				getIds().clear();
				getIds().addAll((Collection<? extends String>)newValue);
				return;
			case TestPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case TestPackage.PERSON__BIRTHDAY:
				setBirthday((Date)newValue);
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
			case TestPackage.PERSON__IDS:
				getIds().clear();
				return;
			case TestPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.PERSON__BIRTHDAY:
				setBirthday(BIRTHDAY_EDEFAULT);
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
			case TestPackage.PERSON__IDS:
				return ids != null && !ids.isEmpty();
			case TestPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.PERSON__BIRTHDAY:
				return BIRTHDAY_EDEFAULT == null ? birthday != null : !BIRTHDAY_EDEFAULT.equals(birthday);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ids: ");
		result.append(ids);
		result.append(", name: ");
		result.append(name);
		result.append(", birthday: ");
		result.append(birthday);
		result.append(')');
		return result.toString();
	}

} // Person
