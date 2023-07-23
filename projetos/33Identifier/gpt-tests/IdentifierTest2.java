package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest2{

    private Identifier identifier = new Identifier();

    @Test
    public void testValid_s_validInput_returnsTrue() {
        assertTrue(identifier.valid_s('a'));
    }

    @Test
    public void testValid_s_invalidInput_returnsFalse() {
        assertFalse(identifier.valid_s('1'));
    }

    @Test
    public void testValid_f_validInput_returnsTrue() {
        assertTrue(identifier.valid_f('A'));
    }

    @Test
    public void testValid_f_invalidInput_returnsFalse() {
        assertFalse(identifier.valid_f('@'));
    }

    @Test
    public void testValidateIdentifier_validIdentifierWithLengthOne_returnsTrue() {
        assertTrue(identifier.validateIdentifier("A"));
    }

    @Test
    public void testValidateIdentifier_validIdentifierWithLengthFive_returnsTrue() {
        assertTrue(identifier.validateIdentifier("aBcDe"));
    }

    @Test
    public void testValidateIdentifier_validIdentifierWithLengthSix_returnsFalse() {
        assertFalse(identifier.validateIdentifier("abc123"));
    }

    @Test
    public void testValidateIdentifier_invalidIdentifier_returnsFalse() {
        assertFalse(identifier.validateIdentifier("abc@"));
    }

    @Test
    public void testValidateIdentifier_nullInput_returnsFalse() {
        assertFalse(identifier.validateIdentifier(null));
    }
}