package ds;import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TabelaHashTest0{

  
  @Test
  public void testPesquisa() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "valor1");
    tabela.insere("chave2", "valor2");
    tabela.insere("chave3", "valor3");
    
    assertEquals("valor1", tabela.pesquisa("chave1"));
    assertEquals("valor2", tabela.pesquisa("chave2"));
    assertEquals("valor3", tabela.pesquisa("chave3"));
    assertNull(tabela.pesquisa("chave4"));
  }
  
  @Test
  public void testInsere() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "valor1");
    
    assertEquals("valor1", tabela.pesquisa("chave1"));
    
    tabela.insere("chave1", "valor2");
    
    assertEquals("valor1", tabela.pesquisa("chave1"));
  }
  
  @Test
  public void testRetira() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "valor1");
    tabela.insere("chave2", "valor2");
    tabela.insere("chave3", "valor3");
    
    tabela.retira("chave2");
    
    assertNull(tabela.pesquisa("chave2"));
  }
  
  @Test
  public void testImprime() {
    TabelaHash tabela = new TabelaHash();
    tabela.insere("chave1", "valor1");
    tabela.insere("chave2", "valor2");
    tabela.insere("chave3", "valor3");
    
    tabela.imprime();
  }
}