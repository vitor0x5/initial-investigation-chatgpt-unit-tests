package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
    }

    @Test(timeout=1000)
    public void testValidateIdentifier() throws Exception {
        Identifier identifier = new Identifier();

        // Test case 1: s is null
        boolean result1 = identifier.validateIdentifier(null);
        assertFalse(result1);

        // Test case 2: s length is 0
        boolean result2 = identifier.validateIdentifier("");
        assertFalse(result2);

        // Test case 3: s length is 1 and valid_s(s[0]) returns false
        boolean result3 = identifier.validateIdentifier("1");
        assertFalse(result3);

        // Test case 4: s length is 1 and valid_s(s[0]) returns true
        boolean result4 = identifier.validateIdentifier("A");
        assertTrue(result4);

        // Test case 5: s length is 2 and valid_s(s[0]) returns true, valid_f(s[1]) returns false
        boolean result5 = identifier.validateIdentifier("A#");
        assertFalse(result5);

        // Test case 6: s length is 2 and valid_s(s[0]) returns true, valid_f(s[1]) returns true
        boolean result6 = identifier.validateIdentifier("A1");
        assertTrue(result6);

        // Test case 7: s length is 3 and valid_s(s[0]) returns true, valid_f(s[1]) returns true, valid_f(s[2]) returns false
        boolean result7 = identifier.validateIdentifier("A1#");
        assertFalse(result7);

        // Test case 8: s length is 3 and valid_s(s[0]) returns true, valid_f(s[1]) returns true, valid_f(s[2]) returns true
        boolean result8 = identifier.validateIdentifier("A12");
        assertTrue(result8);

        // Test case 9: s length is 5 and valid_s(s[0]) returns true, all other characters are valid
        boolean result9 = identifier.validateIdentifier("AbCdE");
        assertTrue(result9);

        // Test case 10: s length is 6 and valid_s(s[0]) returns true, all other characters are valid
        boolean result10 = identifier.validateIdentifier("AbCdEf");
        assertTrue(result10);

        // Test case 11: s length is 6 and valid_s(s[0]) returns true, all other characters are valid, s[5] is invalid
        boolean result11 = identifier.validateIdentifier("AbCdE#");
        assertFalse(result11);
    }

    @Test(timeout=1000)
    public void testValid_s() throws Exception {
        Identifier identifier = new Identifier();

        // Test case 1: ch is 'A'
        boolean result1 = identifier.valid_s('A');
        assertTrue(result1);

        // Test case 2: ch is 'a'
        boolean result2 = identifier.valid_s('a');
        assertTrue(result2);

        // Test case 3: ch is '9'
        boolean result3 = identifier.valid_s('9');
        assertFalse(result3);

        // Test case 4: ch is '#'
        boolean result4 = identifier.valid_s('#');
        assertFalse(result4);
    }

    @Test(timeout=1000)
    public void testValid_f() throws Exception {
        Identifier identifier = new Identifier();

        // Test case 1: ch is 'A'
        boolean result1 = identifier.valid_f('A');
        assertTrue(result1);

        // Test case 2: ch is 'a'
        boolean result2 = identifier.valid_f('a');
        assertTrue(result2);

        // Test case 3: ch is '9'
        boolean result3 = identifier.valid_f('9');
        assertTrue(result3);

        // Test case 4: ch is '#'
        boolean result4 = identifier.valid_f('#');
        assertFalse(result4);
    }
}