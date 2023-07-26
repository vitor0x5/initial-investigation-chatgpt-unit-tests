package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class IdentifierTest0{

  
  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Identifier identifier = new Identifier();
    assertNotNull(identifier);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifierWithValidInput() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("Abc123");
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifierWithInvalidFirstCharacter() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("123abc");
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifierWithInvalidCharacter() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("Abc@123");
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifierWithInvalidLength() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("Abcdefg");
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValid_sWithValidCharacter() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.valid_s('A');
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValid_sWithInvalidCharacter() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.valid_s('%');
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValid_fWithValidCharacter() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.valid_f('a');
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValid_fWithInvalidCharacter() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.valid_f('#');
    assertFalse(result);
  }
}