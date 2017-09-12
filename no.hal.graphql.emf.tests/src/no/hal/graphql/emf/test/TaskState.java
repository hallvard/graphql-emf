/**
 */
package no.hal.graphql.emf.test;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.graphql.emf.test.TaskState#getEntered <em>Entered</em>}</li>
 *   <li>{@link no.hal.graphql.emf.test.TaskState#getExited <em>Exited</em>}</li>
 * </ul>
 *
 * @see no.hal.graphql.emf.test.TestPackage#getTaskState()
 * @model kind="class"
 * @generated
 */
public class TaskState extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getEntered() <em>Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntered()
	 * @generated
	 * @ordered
	 */
	protected static final Long ENTERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntered() <em>Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntered()
	 * @generated
	 * @ordered
	 */
	protected Long entered = ENTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExited() <em>Exited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExited()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXITED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExited() <em>Exited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExited()
	 * @generated
	 * @ordered
	 */
	protected Long exited = EXITED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskState() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TASK_STATE;
	}

	/**
	 * Returns the value of the '<em><b>Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entered</em>' attribute.
	 * @see #setEntered(Long)
	 * @see no.hal.graphql.emf.test.TestPackage#getTaskState_Entered()
	 * @model dataType="no.hal.graphql.emf.test.Timestamp"
	 * @generated
	 */
	public Long getEntered() {
		return entered;
	}

	/**
	 * Sets the value of the '{@link no.hal.graphql.emf.test.TaskState#getEntered <em>Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entered</em>' attribute.
	 * @see #getEntered()
	 * @generated
	 */
	public void setEntered(Long newEntered) {
		Long oldEntered = entered;
		entered = newEntered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TASK_STATE__ENTERED, oldEntered, entered));
	}

	/**
	 * Returns the value of the '<em><b>Exited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exited</em>' attribute.
	 * @see #setExited(Long)
	 * @see no.hal.graphql.emf.test.TestPackage#getTaskState_Exited()
	 * @model dataType="no.hal.graphql.emf.test.Timestamp"
	 * @generated
	 */
	public Long getExited() {
		return exited;
	}

	/**
	 * Sets the value of the '{@link no.hal.graphql.emf.test.TaskState#getExited <em>Exited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exited</em>' attribute.
	 * @see #getExited()
	 * @generated
	 */
	public void setExited(Long newExited) {
		Long oldExited = exited;
		exited = newExited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TASK_STATE__EXITED, oldExited, exited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TASK_STATE__ENTERED:
				return getEntered();
			case TestPackage.TASK_STATE__EXITED:
				return getExited();
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
			case TestPackage.TASK_STATE__ENTERED:
				setEntered((Long)newValue);
				return;
			case TestPackage.TASK_STATE__EXITED:
				setExited((Long)newValue);
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
			case TestPackage.TASK_STATE__ENTERED:
				setEntered(ENTERED_EDEFAULT);
				return;
			case TestPackage.TASK_STATE__EXITED:
				setExited(EXITED_EDEFAULT);
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
			case TestPackage.TASK_STATE__ENTERED:
				return ENTERED_EDEFAULT == null ? entered != null : !ENTERED_EDEFAULT.equals(entered);
			case TestPackage.TASK_STATE__EXITED:
				return EXITED_EDEFAULT == null ? exited != null : !EXITED_EDEFAULT.equals(exited);
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
		result.append(" (entered: ");
		result.append(entered);
		result.append(", exited: ");
		result.append(exited);
		result.append(')');
		return result.toString();
	}

} // TaskState
