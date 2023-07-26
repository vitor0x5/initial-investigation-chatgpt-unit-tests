package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class TabelaHashTest9{

  
  // Test the default constructor
  @Test(expected = Exception.class, timeout = 1000)
  public void testDefaultConstructor() throws Exception {
    TabelaHash tabela = new TabelaHash();
    assertEquals(7, tabela.M);
    assertNull(tabela.tabela[0]);
    assertEquals(11, tabela.pesos.length);
  }

  // Test the pesquisa method with a valid key
  @Test(expected = Exception.class, timeout = 1000)
  public void testPesquisaValidKey() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.tabela[1] = tabela.new Celula("chave1", "item1");
    Object expected = "item1";
    Object result = tabela.pesquisa("chave1");
    assertEquals(expected, result);
  }

  // Test the pesquisa method with an invalid key
  @Test(expected = Exception.class, timeout = 1000)
  public void testPesquisaInvalidKey() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.tabela[1] = tabela.new Celula("chave1", "item1");
    assertNull(tabela.pesquisa("chave2"));
  }

  // Test the insere method with a new key
  @Test(expected = Exception.class, timeout = 1000)
  public void testInsereNewKey() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    Object expected = "item1";
    Object result = tabela.tabela[1].item;
    assertEquals(expected, result);
  }

  // Test the insere method with an existing key
  @Test(expected = Exception.class, timeout = 1000)
  public void testInsereExistingKey() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.tabela[1] = tabela.new Celula("chave1", "item1");
    tabela.insere("chave1", "item2");
    Object expected = "item1";
    Object result = tabela.tabela[1].item;
    assertEquals(expected, result);
  }

  // Test the insere method with a full table
  @Test(expected = Exception.class, timeout = 1000)
  public void testInsereFullTable() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.tabela[0] = tabela.new Celula("chave1", "item1");
    tabela.tabela[1] = tabela.new Celula("chave2", "item2");
    tabela.tabela[2] = tabela.new Celula("chave3", "item3");
    tabela.tabela[3] = tabela.new Celula("chave4", "item4");
    tabela.tabela[4] = tabela.new Celula("chave5", "item5");
    tabela.tabela[5] = tabela.new Celula("chave6", "item6");
    tabela.tabela[6] = tabela.new Celula("chave7", "item7");
    tabela.insere("chave8", "item8");
    assertNull(tabela.tabela[6]);
    Object expected = "item8";
    Object result = tabela.tabela[0].item;
    assertEquals(expected, result);
  }

  // Test the retira method with a valid key
  @Test(expected = Exception.class, timeout = 1000)
  public void testRetiraValidKey() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.tabela[1] = tabela.new Celula("chave1", "item1");
    tabela.retira("chave1");
    assertTrue(tabela.tabela[1].retirado);
    assertNull(tabela.tabela[1].chave);
  }

  // Test the retira method with an invalid key
  @Test(expected = Exception.class, timeout = 1000)
  public void testRetiraInvalidKey() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.tabela[1] = tabela.new Celula("chave1", "item1");
    tabela.retira("chave2");
    assertFalse(tabela.tabela[1].retirado);
    assertNotNull(tabela.tabela[1].chave);
  }

  // Test the recuperaItens method with no items in the table
  @Test(expected = Exception.class, timeout = 1000)
  public void testRecuperaItensNoItems() throws Exception {
    TabelaHash tabela = new TabelaHash();
    Object[] expected = new Object[0];
    Object[] result = tabela.recuperaItens();
    assertArrayEquals(expected, result);
  }

  // Test the recuperaItens method with some items in the table
  @Test(expected = Exception.class, timeout = 1000)
  public void testRecuperaItensSomeItems() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.tabela[0] = tabela.new Celula("chave1", "item1");
    tabela.tabela[1] = tabela.new Celula("chave2", "item2");
    Object[] expected = new Object[2];
    expected[0] = "item1";
    expected[1] = "item2";
    Object[] result = tabela.recuperaItens();
    assertArrayEquals(expected, result);
  }

  // Test the imprime method
  @Test(expected = Exception.class, timeout = 1000)
  public void testImprime() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.tabela[0] = tabela.new Celula("chave1", "item1");
    tabela.imprime();
  }
}