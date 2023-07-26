package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class IdentifierTest21{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Identifier identifier = new Identifier();
        assertNotNull(identifier);
    }
    
    @Test(timeout=1000)
    public void testValidateIdentifier_ValidInput() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abc");
        assertTrue(result);
    }
    
    @Test(timeout=1000)
    public void testValidateIdentifier_NullInput() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier(null);
        assertFalse(result);
    }
    
    @Test(timeout=1000)
    public void testValidateIdentifier_InvalidFirstChar() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("1abc");
        assertFalse(result);
    }
    
    @Test(timeout=1000)
    public void testValidateIdentifier_InvalidChar() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("a@bc");
        assertFalse(result);
    }
    
    @Test(timeout=1000)
    public void testValidateIdentifier_LengthLessThan1() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("");
        assertFalse(result);
    }
    
    @Test(timeout=1000)
    public void testValidateIdentifier_LengthGreaterThan5() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abcdef");
        assertFalse(result);
    }
    
    @Test(timeout=1000)
    public void testValid_s_ValidChar() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_s('a');
        assertTrue(result);
    }
    
    @Test(timeout=1000)
    public void testValid_s_InvalidChar() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_s('1');
        assertFalse(result);
    }
    
    @Test(timeout=1000)
    public void testValid_f_ValidChar() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_f('a');
        assertTrue(result);
    }
    
    @Test(timeout=1000)
    public void testValid_f_InvalidChar() throws Exception {
        Identifier identifier = new Identifier();
        boolean result = identifier.valid_f('@');
        assertFalse(result);
    }
}