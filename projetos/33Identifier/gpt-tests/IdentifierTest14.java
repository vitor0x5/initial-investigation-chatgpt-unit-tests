package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class IdentifierTest14{


    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testValidateIdentifier_NullString() throws Exception {
        Identifier identifier = new Identifier();
        identifier.validateIdentifier(null);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_EmptyString() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_Length1_Valid() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("a");
        assertTrue(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_Length1_Invalid() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("1");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_Length5_Valid() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abcde");
        assertTrue(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_Length5_Invalid() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("12345");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_Length6_Valid() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abcdef");
        assertTrue(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_Length6_Invalid() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("123456");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_InvalidStartChar() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("1abcd");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_InvalidChar() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("ab!cd");
        assertFalse(result);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidChars() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("AbCdEf");
        assertTrue(result);
    }
}