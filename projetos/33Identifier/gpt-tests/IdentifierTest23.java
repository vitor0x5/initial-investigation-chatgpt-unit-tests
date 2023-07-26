package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
        assertNotNull(identifier);
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_ValidInput_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abcde"));
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_NullInput_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(null));
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_InvalidFirstCharacter_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("1abcde"));
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_InvalidCharacter_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abcde@"));
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_LengthLessThan1_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_LengthGreaterThan5_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abcdef"));
    }

    @Test(timeout=1000)
    public void testValid_s_ValidCharacter_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_s('a'));
    }

    @Test(timeout=1000)
    public void testValid_s_InvalidCharacter_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.valid_s('1'));
    }

    @Test(timeout=1000)
    public void testValid_f_ValidCharacter_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_f('a'));
    }

    @Test(timeout=1000)
    public void testValid_f_InvalidCharacter_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.valid_f('@'));
    }
}