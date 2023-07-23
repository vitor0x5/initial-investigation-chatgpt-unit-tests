package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TabelaHashTest2{

  
  @Test
  public void testPesquisaIndice() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", 1);
    tabela.insere("def", 2);
    tabela.insere("ghi", 3);
    
    assertEquals(0, tabela.pesquisaIndice("abc"));
    assertEquals(1, tabela.pesquisaIndice("def"));
    assertEquals(2, tabela.pesquisaIndice("ghi"));
    assertEquals(7, tabela.pesquisaIndice("xyz"));
  }
  
  @Test
  public void testPesquisa() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", 1);
    tabela.insere("def", 2);
    tabela.insere("ghi", 3);
    
    assertEquals(1, tabela.pesquisa("abc"));
    assertEquals(2, tabela.pesquisa("def"));
    assertEquals(3, tabela.pesquisa("ghi"));
    assertNull(tabela.pesquisa("xyz"));
  }
  
  @Test
  public void testInsere() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", 1);
    tabela.insere("def", 2);
    tabela.insere("ghi", 3);
    
    assertEquals(1, tabela.pesquisa("abc"));
    assertEquals(2, tabela.pesquisa("def"));
    assertEquals(3, tabela.pesquisa("ghi"));
  }
  
  @Test
  public void testRetira() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", 1);
    tabela.insere("def", 2);
    tabela.insere("ghi", 3);
    
    tabela.retira("def");
    assertNull(tabela.pesquisa("def"));
  }
  
  @Test
  public void testRecuperaItens() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", 1);
    tabela.insere("def", 2);
    tabela.insere("ghi", 3);
    
    Object[] expected = {1, 2, 3};
    assertArrayEquals(expected, tabela.recuperaItens());
  }
  
  @Test
  public void testImprime() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("abc", 1);
    tabela.insere("def", 2);
    tabela.insere("ghi", 3);
    
    tabela.imprime();
  }
}