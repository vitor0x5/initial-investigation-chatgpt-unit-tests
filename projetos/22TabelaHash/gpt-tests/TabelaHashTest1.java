package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest1{


  @Test
  public void testPesquisaWithEmptyTable() {
    TabelaHash tabela = new TabelaHash();
    assertNull(tabela.pesquisa("chave"));
  }

  @Test
  public void testPesquisaWithNonEmptyTable() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave", "item");
    assertEquals("item", tabela.pesquisa("chave"));
  }

  @Test
  public void testInsereWithNonExistingKey() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave", "item");
    assertEquals("item", tabela.pesquisa("chave"));
  }

  @Test
  public void testInsereWithExistingKey() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave", "item1");
    tabela.insere("chave", "item2");
    assertEquals("item1", tabela.pesquisa("chave"));
  }

  @Test
  public void testRetiraWithNonExistingKey() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave", "item");
    try {
      tabela.retira("chave2");
      fail("Exception expected");
    } catch (Exception e) {
      assertEquals("Registro nao esta presente", e.getMessage());
    }
  }

  @Test
  public void testRetiraWithExistingKey() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave", "item");
    try {
      tabela.retira("chave");
      assertNull(tabela.pesquisa("chave"));
    } catch (Exception e) {
      fail("Unexpected exception");
    }
  }
}