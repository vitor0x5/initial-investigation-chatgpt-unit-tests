package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class IdentifierTest10{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
        assertNotNull(identifier);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidIdentifier_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc"));
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidIdentifier_LengthGreaterThanOne_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("a1b2c"));
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_ValidIdentifier_LengthGreaterThanOne_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("a1b2c3"));
    }
    
    @Test(timeout = 1000)
    public void testValidateIdentifier_InvalidIdentifier_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("123"));
    }
    
    @Test(timeout = 1000, expected = StringIndexOutOfBoundsException.class)
    public void testValidateIdentifier_EmptyString_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
    }
    
    @Test(timeout = 1000)
    public void testValid_s_ValidCharacter_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_s('A'));
    }
    
    @Test(timeout = 1000)
    public void testValid_s_InvalidCharacter_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.valid_s('1'));
    }
    
    @Test(timeout = 1000)
    public void testValid_f_ValidCharacter_ReturnsTrue() throws Exception {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_f('1'));
    }
    
    @Test(timeout = 1000)
    public void testValid_f_InvalidCharacter_ReturnsFalse() throws Exception {
        Identifier identifier = new Identifier();
        assertFalse(identifier.valid_f('%'));
    }
}