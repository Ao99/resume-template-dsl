/**
 */
package resume_template;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HAlignment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see resume_template.Resume_templatePackage#getHAlignment()
 * @model
 * @generated
 */
public enum HAlignment implements Enumerator {
	/**
	 * The '<em><b>LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(0, "LEFT", "LEFT"),

	/**
	 * The '<em><b>CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER(1, "CENTER", "CENTER"),

	/**
	 * The '<em><b>RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(2, "RIGHT", "RIGHT"),

	/**
	 * The '<em><b>JUSTIFY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUSTIFY_VALUE
	 * @generated
	 * @ordered
	 */
	JUSTIFY(3, "JUSTIFY", "JUSTIFY");

	/**
	 * The '<em><b>LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 0;

	/**
	 * The '<em><b>CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_VALUE = 1;

	/**
	 * The '<em><b>RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 2;

	/**
	 * The '<em><b>JUSTIFY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUSTIFY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JUSTIFY_VALUE = 3;

	/**
	 * An array of all the '<em><b>HAlignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HAlignment[] VALUES_ARRAY =
		new HAlignment[] {
			LEFT,
			CENTER,
			RIGHT,
			JUSTIFY,
		};

	/**
	 * A public read-only list of all the '<em><b>HAlignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HAlignment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HAlignment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HAlignment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HAlignment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HAlignment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HAlignment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HAlignment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HAlignment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HAlignment get(int value) {
		switch (value) {
			case LEFT_VALUE: return LEFT;
			case CENTER_VALUE: return CENTER;
			case RIGHT_VALUE: return RIGHT;
			case JUSTIFY_VALUE: return JUSTIFY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HAlignment(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HAlignment
