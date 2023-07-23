package ds;import ds.Identifier;
import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest1{


    @Test
    public void testValidateIdentifier_NullString_ReturnsFalse() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(null));
    }

    @Test
    public void testValidateIdentifier_EmptyString_ReturnsFalse() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
    }

    @Test
    public void testValidateIdentifier_ValidSingleCharacter_ReturnsTrue() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("a"));
    }

    @Test
    public void testValidateIdentifier_ValidMultipleCharacters_ReturnsTrue() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abcde"));
    }

    @Test
    public void testValidateIdentifier_InvalidFirstCharacter_ReturnsFalse() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("1abc"));
    }

    @Test
    public void testValidateIdentifier_InvalidMiddleCharacter_ReturnsFalse() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("ab@cd"));
    }

    @Test
    public void testValidateIdentifier_LengthLessThan1_ReturnsFalse() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
    }

    @Test
    public void testValidateIdentifier_LengthGreaterThan5_ReturnsFalse() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abcdefg"));
    }
}