package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest18{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testValidateIdentifier() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("A"));
        assertTrue(identifier.validateIdentifier("a"));
        assertTrue(identifier.validateIdentifier("A1"));
        assertTrue(identifier.validateIdentifier("a1"));
        assertTrue(identifier.validateIdentifier("Aa1"));
        assertFalse(identifier.validateIdentifier(null));
        assertFalse(identifier.validateIdentifier(""));
        assertFalse(identifier.validateIdentifier("Aa1b"));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testValid_s() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_s('A'));
        assertTrue(identifier.valid_s('a'));
        assertFalse(identifier.valid_s('1'));
        assertFalse(identifier.valid_s(' '));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testValid_f() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_f('A'));
        assertTrue(identifier.valid_f('a'));
        assertTrue(identifier.valid_f('1'));
        assertFalse(identifier.valid_f(' '));
    }
}