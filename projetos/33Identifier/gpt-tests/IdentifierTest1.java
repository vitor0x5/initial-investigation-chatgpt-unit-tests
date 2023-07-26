package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class IdentifierTest1{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testValidateIdentifier() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier(null);
        assertFalse(result);

        result = identifier.validateIdentifier("");
        assertFalse(result);

        result = identifier.validateIdentifier("A");
        assertTrue(result);

        result = identifier.validateIdentifier("abc");
        assertTrue(result);

        result = identifier.validateIdentifier("abc12");
        assertTrue(result);

        result = identifier.validateIdentifier("abcdefgh");
        assertTrue(result);

        result = identifier.validateIdentifier("abcdefg");
        assertFalse(result);

        result = identifier.validateIdentifier("abcdefghi");
        assertFalse(result);

        result = identifier.validateIdentifier("ABC");
        assertTrue(result);

        result = identifier.validateIdentifier("ABC12");
        assertTrue(result);

        result = identifier.validateIdentifier("ABCDEFGHI");
        assertTrue(result);

        result = identifier.validateIdentifier("ABCDEFGH");
        assertFalse(result);

        result = identifier.validateIdentifier("ABCDEFGHIJ");
        assertFalse(result);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testValid_s() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_s('A');
        assertTrue(result);

        result = identifier.valid_s('a');
        assertTrue(result);

        result = identifier.valid_s('1');
        assertFalse(result);

        result = identifier.valid_s(' ');
        assertFalse(result);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testValid_f() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_f('A');
        assertTrue(result);

        result = identifier.valid_f('a');
        assertTrue(result);

        result = identifier.valid_f('1');
        assertTrue(result);

        result = identifier.valid_f(' ');
        assertFalse(result);
    }
}