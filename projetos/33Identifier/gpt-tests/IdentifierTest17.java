package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest17{


    @Test
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
        assertNotNull(identifier);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidInput() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abc12");
        assertTrue(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_NullInput() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier(null);
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_InvalidFirstCharacter() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("1abc");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_InvalidCharacterInMiddle() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("ab@c");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_LengthLessThanOne() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_LengthGreaterThanFive() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abcdefg");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValid_s_ValidInput() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_s('a');
        assertTrue(result);
    }

    @Test(timeout = 1000)
    public void testValid_s_InvalidInput() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_s('1');
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValid_f_ValidInput() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_f('1');
        assertTrue(result);
    }

    @Test(timeout = 1000)
    public void testValid_f_InvalidInput() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_f('@');
        assertFalse(result);
    }
}