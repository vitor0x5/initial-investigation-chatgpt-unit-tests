package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest25{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
        assertNotNull(identifier);
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_ValidInput_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abc123");
        assertTrue(result);
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_NullInput_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier(null);
        assertFalse(result);
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_InvalidFirstCharacter_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("123abc");
        assertFalse(result);
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_InvalidCharacterInMiddle_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abc#123");
        assertFalse(result);
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_LengthLessThan1_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("");
        assertFalse(result);
    }

    @Test(timeout=1000)
    public void testValidateIdentifier_LengthGreaterThan5_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abcdefg");
        assertFalse(result);
    }

    @Test(timeout=1000)
    public void testValid_s_ValidCharacter_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_s('a');
        assertTrue(result);
    }

    @Test(timeout=1000)
    public void testValid_s_InvalidCharacter_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_s('1');
        assertFalse(result);
    }

    @Test(timeout=1000)
    public void testValid_f_ValidCharacter_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_f('a');
        assertTrue(result);
    }

    @Test(timeout=1000)
    public void testValid_f_InvalidCharacter_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_f('#');
        assertFalse(result);
    }
}