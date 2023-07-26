package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest2{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
        assertNotNull(identifier);
    }

    // Test for valid_s(char ch) method
    @Test(timeout=1000)
    public void testValid_s() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_s('A'));
        assertTrue(identifier.valid_s('z'));
        assertFalse(identifier.valid_s('!'));
        assertFalse(identifier.valid_s('5'));
    }

    // Test for valid_f(char ch) method
    @Test(timeout=1000)
    public void testValid_f() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_f('A'));
        assertTrue(identifier.valid_f('z'));
        assertTrue(identifier.valid_f('5'));
        assertFalse(identifier.valid_f('!'));
    }

    // Test for validateIdentifier(String s) method
    @Test(timeout=1000)
    public void testValidateIdentifier() throws Exception {
        Identifier identifier = new Identifier();

        // Test with valid identifier
        assertTrue(identifier.validateIdentifier("abc"));
        assertTrue(identifier.validateIdentifier("aBc4"));

        // Test with invalid identifier
        assertFalse(identifier.validateIdentifier("!abc"));
        assertFalse(identifier.validateIdentifier("abc$"));
        assertFalse(identifier.validateIdentifier("abcde"));

        // Test with null input
        assertFalse(identifier.validateIdentifier(null));
    }
}