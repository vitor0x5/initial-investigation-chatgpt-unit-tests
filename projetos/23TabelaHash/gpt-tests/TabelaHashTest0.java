package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaHashTest0{

  
  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    TabelaHash tabela = new TabelaHash();
    assertNotNull(tabela);
  }
  
  @Test(timeout=1000)
  public void testPesquisa() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    
    Object item = tabela.pesquisa("chave1");
    assertNotNull(item);
    assertEquals("item1", item);
    
    item = tabela.pesquisa("chave2");
    assertNull(item);
  }
  
  @Test(timeout=1000)
  public void testInsere() throws Exception {
    TabelaHash tabela = new TabelaHash();
    
    tabela.insere("chave1", "item1");
    Object item = tabela.pesquisa("chave1");
    assertNotNull(item);
    assertEquals("item1", item);
    
    tabela.insere("chave2", "item2");
    item = tabela.pesquisa("chave2");
    assertNotNull(item);
    assertEquals("item2", item);
    
    tabela.insere("chave1", "item3");
    item = tabela.pesquisa("chave1");
    assertNotNull(item);
    assertEquals("item1", item);
  }
  
  @Test(timeout=1000)
  public void testRetira() throws Exception {
    TabelaHash tabela = new TabelaHash();
    
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    
    tabela.retira("chave1");
    Object item = tabela.pesquisa("chave1");
    assertNull(item);
    
    tabela.retira("chave2");
    item = tabela.pesquisa("chave2");
    assertNull(item);
  }
  
  @Test(timeout=1000)
  public void testRecuperaItens() throws Exception {
    TabelaHash tabela = new TabelaHash();
    
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    
    Object[] itens = tabela.recuperaItens();
    assertNotNull(itens);
    assertEquals(3, itens.length);
    assertArrayEquals(new Object[]{"item1", "item2", "item3"}, itens);
    
    tabela.retira("chave2");
    itens = tabela.recuperaItens();
    assertNotNull(itens);
    assertEquals(2, itens.length);
    assertArrayEquals(new Object[]{"item1", "item3"}, itens);
  }
  
  @Test(timeout=1000)
  public void testImprime() throws Exception {
    TabelaHash tabela = new TabelaHash();
    
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    
    tabela.imprime();
  }
}