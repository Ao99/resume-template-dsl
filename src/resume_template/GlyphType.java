/**
 */
package resume_template;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Glyph Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see resume_template.Resume_templatePackage#getGlyphType()
 * @model
 * @generated
 */
public enum GlyphType implements Enumerator {
	/**
	 * The '<em><b>BULLET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BULLET_VALUE
	 * @generated
	 * @ordered
	 */
	BULLET(0, "BULLET", "BULLET"),

	/**
	 * The '<em><b>HOLLOW BULLET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLLOW_BULLET_VALUE
	 * @generated
	 * @ordered
	 */
	HOLLOW_BULLET(1, "HOLLOW_BULLET", "HOLLOW_BULLET"),

	/**
	 * The '<em><b>SQUARE BULLET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_BULLET_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARE_BULLET(2, "SQUARE_BULLET", "SQUARE_BULLET"),

	/**
	 * The '<em><b>NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(3, "NUMBER", "NUMBER");

	/**
	 * The '<em><b>BULLET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BULLET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BULLET_VALUE = 0;

	/**
	 * The '<em><b>HOLLOW BULLET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLLOW_BULLET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOLLOW_BULLET_VALUE = 1;

	/**
	 * The '<em><b>SQUARE BULLET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_BULLET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_BULLET_VALUE = 2;

	/**
	 * The '<em><b>NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Glyph Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GlyphType[] VALUES_ARRAY =
		new GlyphType[] {
			BULLET,
			HOLLOW_BULLET,
			SQUARE_BULLET,
			NUMBER,
		};

	/**
	 * A public read-only list of all the '<em><b>Glyph Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GlyphType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Glyph Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlyphType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlyphType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Glyph Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlyphType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlyphType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Glyph Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlyphType get(int value) {
		switch (value) {
			case BULLET_VALUE: return BULLET;
			case HOLLOW_BULLET_VALUE: return HOLLOW_BULLET;
			case SQUARE_BULLET_VALUE: return SQUARE_BULLET;
			case NUMBER_VALUE: return NUMBER;
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
	private GlyphType(int value, String name, String literal) {
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
	
} //GlyphType
