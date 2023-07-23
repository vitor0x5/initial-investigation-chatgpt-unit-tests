package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class IdentifierTest0{


    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc"));
    }

    @Test
    public void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abc123"));
    }

    @Test
    public void testEmptyString() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
    }

    @Test
    public void testNullString() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(null));
    }

    @Test
    public void testSingleCharacterIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("a"));
    }

    @Test
    public void testMaxSizeIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abcdef"));
    }

    @Test
    public void testOverMaxSizeIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abcdefg"));
    }

    @Test
    public void testValidFirstCharacter() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_s('a'));
    }

    @Test
    public void testValidFirstCharacterUpperBound() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_s('z'));
    }

    @Test
    public void testInvalidFirstCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.valid_s('1'));
    }

    @Test
    public void testValidFollowingCharacter() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_f('a'));
    }

    @Test
    public void testValidFollowingCharacterUpperBound() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_f('9'));
    }

    @Test
    public void testInvalidFollowingCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.valid_f('*'));
    }
}