package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TabelaHashTest0{

  
  @Test
  public void testInsere() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    assertEquals("item1", tabela.pesquisa("chave1"));
  }
  
  @Test
  public void testInsereDuplicatedKey() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave1", "item2");
    assertEquals("item1", tabela.pesquisa("chave1"));
  }
  
  @Test
  public void testRetira() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.retira("chave1");
    assertNull(tabela.pesquisa("chave1"));
  }
  
  @Test(expected = Exception.class)
  public void testRetiraNonexistentKey() throws Exception {
    TabelaHash tabela = new TabelaHash();
    tabela.retira("chave1");
  }
  
  @Test
  public void testRecuperaItens() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "item1");
    tabela.insere("chave2", "item2");
    tabela.insere("chave3", "item3");
    Object[] expected = {"item1", "item2", "item3"};
    assertArrayEquals(expected, tabela.recuperaItens());
  }
}