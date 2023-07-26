package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest7{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        Identifier identifier = new Identifier();
        assertNotNull(identifier);
    }

    @Test(timeout = 1000)
    public void testValidateIdentifierWithValidFirstCharacter() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("a"));
        assertTrue(identifier.validateIdentifier("A"));
    }

    @Test(timeout = 1000)
    public void testValidateIdentifierWithInvalidFirstCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("1"));
        assertFalse(identifier.validateIdentifier("_"));
    }

    @Test(timeout = 1000)
    public void testValidateIdentifierWithValidFirstAndSecondCharacter() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("ab"));
        assertTrue(identifier.validateIdentifier("AB"));
    }

    @Test(timeout = 1000)
    public void testValidateIdentifierWithInvalidSecondCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("a_"));
        assertFalse(identifier.validateIdentifier("A1"));
    }

    @Test(timeout = 1000)
    public void testValidateIdentifierWithInvalidCharacters() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("123"));
        assertFalse(identifier.validateIdentifier("_abc"));
    }

    @Test(timeout = 1000)
    public void testValidateIdentifierWithValidLength() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abcde"));
    }

    @Test(timeout = 1000)
    public void testValidateIdentifierWithInvalidLength() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abcdef"));
    }
}