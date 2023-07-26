package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest3{

    
    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
    }
    
    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testValidateIdentifier_NullString() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier(null);
        assertFalse(result);
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_EmptyString() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("");
        assertFalse(result);
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidSingleCharacter() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("A");
        assertTrue(result);
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidMultipleCharacters() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abc123");
        assertTrue(result);
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_InvalidFirstCharacter() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("123abc");
        assertFalse(result);
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_InvalidCharacter() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abc$");
        assertFalse(result);
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_TooShort() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abc");
        assertFalse(result);
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_TooLong() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abcdefgh");
        assertFalse(result);
    }
}