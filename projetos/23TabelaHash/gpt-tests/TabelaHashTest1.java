package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TabelaHashTest1{


  @Test
  public void testPesquisaIndice() {
    TabelaHash tabela = new TabelaHash();
    assertEquals(0, tabela.pesquisaIndice("a"));
    tabela.insere("a", 1);
    tabela.insere("b", 2);
    tabela.insere("c", 3);
    assertEquals(2, tabela.pesquisaIndice("b"));
    assertEquals(3, tabela.pesquisaIndice("c"));
    assertEquals(7, tabela.pesquisaIndice("d"));
  }

  @Test
  public void testPesquisa() {
    TabelaHash tabela = new TabelaHash();
    assertNull(tabela.pesquisa("a"));
    tabela.insere("a", 1);
    tabela.insere("b", 2);
    tabela.insere("c", 3);
    assertEquals(1, tabela.pesquisa("a"));
    assertEquals(2, tabela.pesquisa("b"));
    assertEquals(3, tabela.pesquisa("c"));
    assertNull(tabela.pesquisa("d"));
  }

  @Test
  public void testInsere() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("a", 1);
    tabela.insere("b", 2);
    tabela.insere("c", 3);
    assertEquals(1, tabela.pesquisa("a"));
    assertEquals(2, tabela.pesquisa("b"));
    assertEquals(3, tabela.pesquisa("c"));
  }

  @Test
  public void testRetira() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("a", 1);
    tabela.insere("b", 2);
    tabela.insere("c", 3);
    tabela.retira("b");
    assertNull(tabela.pesquisa("b"));
  }

  @Test
  public void testRecuperaItens() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("a", 1);
    tabela.insere("b", 2);
    tabela.insere("c", 3);
    Object[] expected = {1, 2, 3};
    assertArrayEquals(expected, tabela.recuperaItens());
  }

  @Test
  public void testImprime() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("a", 1);
    tabela.insere("b", 2);
    tabela.insere("c", 3);
    tabela.imprime();
    // Manually verify the output
  }
}