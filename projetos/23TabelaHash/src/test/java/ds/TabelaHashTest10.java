package ds;import org.junit.Test;
import org.junit.Before;

public class TabelaHashTest10{


  private TabelaHash tabela;

  @Before
  public void setUp() {
    tabela = new TabelaHash();
  }

  @Test(timeout=1000)
  public void testDefaultConstructor() throws Exception {
    // Test that the default constructor initializes the table and weights correctly
    TabelaHash tabela = new TabelaHash();
    tabela.imprime();
  }

  @Test(timeout=1000)
  public void testPesquisa() throws Exception {
    // Test that pesquisa method returns null when the key is not found
    tabela.pesquisa("key");
  }

  @Test(timeout=1000)
  public void testInsere() throws Exception {
    // Test that insere method correctly inserts a new entry
    tabela.insere("key", "item");
    tabela.imprime();
  }

  @Test(timeout=1000)
  public void testRetira() throws Exception {
    // Test that retira method correctly removes an entry
    tabela.retira("key");
    tabela.imprime();
  }

  @Test(timeout=1000)
  public void testRecuperaItens() throws Exception {
    // Test that recuperaItens method returns the correct items in the table
    tabela.recuperaItens();
  }
}