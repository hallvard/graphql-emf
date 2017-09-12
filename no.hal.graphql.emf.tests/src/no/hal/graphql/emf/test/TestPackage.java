/**
 */
package no.hal.graphql.emf.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.graphql.emf.test.TestFactory
 * @model kind="package"
 * @generated
 */
public class TestPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "platform:/plugin/no.hal.graphql.emf.tests/src/no/hal/graphql/emf/test/test.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestPackage eINSTANCE = no.hal.graphql.emf.test.TestPackage.init();

	/**
	 * The meta object id for the '{@link no.hal.graphql.emf.test.Person <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.graphql.emf.test.Person
	 * @see no.hal.graphql.emf.test.TestPackage#getPerson()
	 * @generated
	 */
	public static final int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSON__IDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSON__BIRTHDAY = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.graphql.emf.test.Game <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.graphql.emf.test.Game
	 * @see no.hal.graphql.emf.test.TestPackage#getGame()
	 * @generated
	 */
	public static final int GAME = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GAME__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GAME__PLAYERS = 1;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.graphql.emf.test.Player <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.graphql.emf.test.Player
	 * @see no.hal.graphql.emf.test.TestPackage#getPlayer()
	 * @generated
	 */
	public static final int PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER__PERSON = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER__GAME = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER__KIND = 2;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER___GET_ID__INT = 1;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.graphql.emf.test.Task <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.graphql.emf.test.Task
	 * @see no.hal.graphql.emf.test.TestPackage#getTask()
	 * @generated
	 */
	public static final int TASK = 3;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__PLAYERS = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__GAME = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__STATES = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.graphql.emf.test.TaskState <em>Task State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.graphql.emf.test.TaskState
	 * @see no.hal.graphql.emf.test.TestPackage#getTaskState()
	 * @generated
	 */
	public static final int TASK_STATE = 4;

	/**
	 * The feature id for the '<em><b>Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_STATE__ENTERED = 0;

	/**
	 * The feature id for the '<em><b>Exited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_STATE__EXITED = 1;

	/**
	 * The number of structural features of the '<em>Task State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.graphql.emf.test.Model <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.graphql.emf.test.Model
	 * @see no.hal.graphql.emf.test.TestPackage#getModel()
	 * @generated
	 */
	public static final int MODEL = 5;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__PERSONS = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__GAME = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.graphql.emf.test.PlayerKind <em>Player Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.graphql.emf.test.PlayerKind
	 * @see no.hal.graphql.emf.test.TestPackage#getPlayerKind()
	 * @generated
	 */
	public static final int PLAYER_KIND = 6;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see no.hal.graphql.emf.test.TestPackage#getTimestamp()
	 * @generated
	 */
	public static final int TIMESTAMP = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum playerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timestampEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.graphql.emf.test.TestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackage() {
		super(eNS_URI, TestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackage init() {
		if (isInited) return (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

		// Obtain or create and register package
		TestPackage theTestPackage = (TestPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestPackage());

		isInited = true;

		// Create package meta-data objects
		theTestPackage.createPackageContents();

		// Initialize created meta-data
		theTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackage.eNS_URI, theTestPackage);
		return theTestPackage;
	}


	/**
	 * Returns the meta object for class '{@link no.hal.graphql.emf.test.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see no.hal.graphql.emf.test.Person
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.graphql.emf.test.Person#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see no.hal.graphql.emf.test.Person#getIds()
	 * @see #getPerson()
	 * @generated
	 */
	public EAttribute getPerson_Ids() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link no.hal.graphql.emf.test.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.graphql.emf.test.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link no.hal.graphql.emf.test.Person#getBirthday <em>Birthday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthday</em>'.
	 * @see no.hal.graphql.emf.test.Person#getBirthday()
	 * @see #getPerson()
	 * @generated
	 */
	public EAttribute getPerson_Birthday() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link no.hal.graphql.emf.test.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see no.hal.graphql.emf.test.Game
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.graphql.emf.test.Game#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see no.hal.graphql.emf.test.Game#getTasks()
	 * @see #getGame()
	 * @generated
	 */
	public EReference getGame_Tasks() {
		return (EReference)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.graphql.emf.test.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.hal.graphql.emf.test.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	public EReference getGame_Players() {
		return (EReference)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link no.hal.graphql.emf.test.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.hal.graphql.emf.test.Player
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link no.hal.graphql.emf.test.Player#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see no.hal.graphql.emf.test.Player#getPerson()
	 * @see #getPlayer()
	 * @generated
	 */
	public EReference getPlayer_Person() {
		return (EReference)playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link no.hal.graphql.emf.test.Player#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see no.hal.graphql.emf.test.Player#getGame()
	 * @see #getPlayer()
	 * @generated
	 */
	public EReference getPlayer_Game() {
		return (EReference)playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link no.hal.graphql.emf.test.Player#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see no.hal.graphql.emf.test.Player#getKind()
	 * @see #getPlayer()
	 * @generated
	 */
	public EAttribute getPlayer_Kind() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the '{@link no.hal.graphql.emf.test.Player#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see no.hal.graphql.emf.test.Player#getName()
	 * @generated
	 */
	public EOperation getPlayer__GetName() {
		return playerEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for the '{@link no.hal.graphql.emf.test.Player#getId(int) <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see no.hal.graphql.emf.test.Player#getId(int)
	 * @generated
	 */
	public EOperation getPlayer__GetId__int() {
		return playerEClass.getEOperations().get(1);
	}


	/**
	 * Returns the meta object for class '{@link no.hal.graphql.emf.test.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see no.hal.graphql.emf.test.Task
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link no.hal.graphql.emf.test.Task#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see no.hal.graphql.emf.test.Task#getPlayers()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Players() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the container reference '{@link no.hal.graphql.emf.test.Task#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see no.hal.graphql.emf.test.Task#getGame()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Game() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.graphql.emf.test.Task#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>States</em>'.
	 * @see no.hal.graphql.emf.test.Task#getStates()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_States() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link no.hal.graphql.emf.test.TaskState <em>Task State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task State</em>'.
	 * @see no.hal.graphql.emf.test.TaskState
	 * @generated
	 */
	public EClass getTaskState() {
		return taskStateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link no.hal.graphql.emf.test.TaskState#getEntered <em>Entered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entered</em>'.
	 * @see no.hal.graphql.emf.test.TaskState#getEntered()
	 * @see #getTaskState()
	 * @generated
	 */
	public EAttribute getTaskState_Entered() {
		return (EAttribute)taskStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link no.hal.graphql.emf.test.TaskState#getExited <em>Exited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exited</em>'.
	 * @see no.hal.graphql.emf.test.TaskState#getExited()
	 * @see #getTaskState()
	 * @generated
	 */
	public EAttribute getTaskState_Exited() {
		return (EAttribute)taskStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link no.hal.graphql.emf.test.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see no.hal.graphql.emf.test.Model
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.graphql.emf.test.Model#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see no.hal.graphql.emf.test.Model#getPersons()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_Persons() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link no.hal.graphql.emf.test.Model#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Game</em>'.
	 * @see no.hal.graphql.emf.test.Model#getGame()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_Game() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for enum '{@link no.hal.graphql.emf.test.PlayerKind <em>Player Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Player Kind</em>'.
	 * @see no.hal.graphql.emf.test.PlayerKind
	 * @generated
	 */
	public EEnum getPlayerKind() {
		return playerKindEEnum;
	}


	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	public EDataType getTimestamp() {
		return timestampEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestFactory getTestFactory() {
		return (TestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__IDS);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__BIRTHDAY);

		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__TASKS);
		createEReference(gameEClass, GAME__PLAYERS);

		playerEClass = createEClass(PLAYER);
		createEReference(playerEClass, PLAYER__PERSON);
		createEReference(playerEClass, PLAYER__GAME);
		createEAttribute(playerEClass, PLAYER__KIND);
		createEOperation(playerEClass, PLAYER___GET_NAME);
		createEOperation(playerEClass, PLAYER___GET_ID__INT);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__PLAYERS);
		createEReference(taskEClass, TASK__GAME);
		createEReference(taskEClass, TASK__STATES);

		taskStateEClass = createEClass(TASK_STATE);
		createEAttribute(taskStateEClass, TASK_STATE__ENTERED);
		createEAttribute(taskStateEClass, TASK_STATE__EXITED);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__PERSONS);
		createEReference(modelEClass, MODEL__GAME);

		// Create enums
		playerKindEEnum = createEEnum(PLAYER_KIND);

		// Create data types
		timestampEDataType = createEDataType(TIMESTAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Ids(), ecorePackage.getEString(), "ids", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Birthday(), ecorePackage.getEDate(), "birthday", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_Tasks(), this.getTask(), this.getTask_Game(), "tasks", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGame_Players(), this.getPlayer(), this.getPlayer_Game(), "players", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayer_Person(), this.getPerson(), null, "person", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_Game(), this.getGame(), this.getGame_Players(), "game", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Kind(), this.getPlayerKind(), "kind", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlayer__GetName(), ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPlayer__GetId__int(), ecorePackage.getEString(), "getId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "num", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Players(), this.getPlayer(), null, "players", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Game(), this.getGame(), this.getGame_Tasks(), "game", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_States(), this.getTaskState(), null, "states", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskStateEClass, TaskState.class, "TaskState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskState_Entered(), this.getTimestamp(), "entered", null, 0, 1, TaskState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskState_Exited(), this.getTimestamp(), "exited", null, 0, 1, TaskState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Persons(), this.getPerson(), null, "persons", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Game(), this.getGame(), null, "Game", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(playerKindEEnum, PlayerKind.class, "PlayerKind");
		addEEnumLiteral(playerKindEEnum, PlayerKind.NOVICE);
		addEEnumLiteral(playerKindEEnum, PlayerKind.EXPERT);

		// Initialize data types
		initEDataType(timestampEDataType, Long.class, "Timestamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.graphql.emf.test.Person <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.graphql.emf.test.Person
		 * @see no.hal.graphql.emf.test.TestPackage#getPerson()
		 * @generated
		 */
		public static final EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERSON__IDS = eINSTANCE.getPerson_Ids();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Birthday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERSON__BIRTHDAY = eINSTANCE.getPerson_Birthday();

		/**
		 * The meta object literal for the '{@link no.hal.graphql.emf.test.Game <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.graphql.emf.test.Game
		 * @see no.hal.graphql.emf.test.TestPackage#getGame()
		 * @generated
		 */
		public static final EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GAME__TASKS = eINSTANCE.getGame_Tasks();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '{@link no.hal.graphql.emf.test.Player <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.graphql.emf.test.Player
		 * @see no.hal.graphql.emf.test.TestPackage#getPlayer()
		 * @generated
		 */
		public static final EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLAYER__PERSON = eINSTANCE.getPlayer_Person();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLAYER__GAME = eINSTANCE.getPlayer_Game();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLAYER__KIND = eINSTANCE.getPlayer_Kind();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation PLAYER___GET_NAME = eINSTANCE.getPlayer__GetName();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation PLAYER___GET_ID__INT = eINSTANCE.getPlayer__GetId__int();

		/**
		 * The meta object literal for the '{@link no.hal.graphql.emf.test.Task <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.graphql.emf.test.Task
		 * @see no.hal.graphql.emf.test.TestPackage#getTask()
		 * @generated
		 */
		public static final EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__PLAYERS = eINSTANCE.getTask_Players();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__GAME = eINSTANCE.getTask_Game();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__STATES = eINSTANCE.getTask_States();

		/**
		 * The meta object literal for the '{@link no.hal.graphql.emf.test.TaskState <em>Task State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.graphql.emf.test.TaskState
		 * @see no.hal.graphql.emf.test.TestPackage#getTaskState()
		 * @generated
		 */
		public static final EClass TASK_STATE = eINSTANCE.getTaskState();

		/**
		 * The meta object literal for the '<em><b>Entered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_STATE__ENTERED = eINSTANCE.getTaskState_Entered();

		/**
		 * The meta object literal for the '<em><b>Exited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_STATE__EXITED = eINSTANCE.getTaskState_Exited();

		/**
		 * The meta object literal for the '{@link no.hal.graphql.emf.test.Model <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.graphql.emf.test.Model
		 * @see no.hal.graphql.emf.test.TestPackage#getModel()
		 * @generated
		 */
		public static final EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MODEL__PERSONS = eINSTANCE.getModel_Persons();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MODEL__GAME = eINSTANCE.getModel_Game();

		/**
		 * The meta object literal for the '{@link no.hal.graphql.emf.test.PlayerKind <em>Player Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.graphql.emf.test.PlayerKind
		 * @see no.hal.graphql.emf.test.TestPackage#getPlayerKind()
		 * @generated
		 */
		public static final EEnum PLAYER_KIND = eINSTANCE.getPlayerKind();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see no.hal.graphql.emf.test.TestPackage#getTimestamp()
		 * @generated
		 */
		public static final EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //TestPackage
