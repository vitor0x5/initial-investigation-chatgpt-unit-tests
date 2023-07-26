package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest12{

  
  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    Identifier identifier = new Identifier();
    assertNotNull(identifier);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_validIdLength1_true() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("a");
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_validIdLength5_true() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("abcde");
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_invalidIdLength0_false() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("");
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_invalidIdLength6_false() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("abcdef");
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_nullId_false() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier(null);
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_validIdFirstCharUpperCase_true() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("Abcde");
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_validIdFirstCharLowerCase_true() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("abcde");
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_invalidIdFirstCharNumber_false() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("1bcde");
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_invalidIdFirstCharSpecialChar_false() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("#bcde");
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_validIdSecondCharUpperCase_true() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("A1bcde");
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_validIdSecondCharLowerCase_true() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("a1bcde");
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_invalidIdSecondCharNumber_false() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("ab1cde");
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_invalidIdSecondCharSpecialChar_false() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("ab#cde");
    assertFalse(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_validIdWithValidChars_true() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("aBcDe");
    assertTrue(result);
  }
  
  @Test(timeout=1000)
  public void testValidateIdentifier_validIdWithInvalidChars_false() throws Exception {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("aBcDe@");
    assertFalse(result);
  }
}