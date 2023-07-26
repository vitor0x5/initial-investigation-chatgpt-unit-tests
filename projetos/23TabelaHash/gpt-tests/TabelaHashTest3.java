package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaHashTest3{


   @Test
   public void testDefaultConstructor() throws Exception {
      TabelaHash tabela = new TabelaHash();
      assertNotNull(tabela);
   }

   @Test(timeout=1000)
   public void testPesquisa() throws Exception {
      TabelaHash tabela = new TabelaHash();
      Object item = tabela.pesquisa("chave");
      assertNull(item);
   }

   @Test(timeout=1000)
   public void testInsere() throws Exception {
      TabelaHash tabela = new TabelaHash();
      tabela.insere("chave", "item");
      assertEquals("item", tabela.pesquisa("chave"));
   }

   @Test(timeout=1000)
   public void testRetira() throws Exception {
      TabelaHash tabela = new TabelaHash();
      tabela.insere("chave", "item");
      tabela.retira("chave");
      assertNull(tabela.pesquisa("chave"));
   }

   @Test(timeout=1000)
   public void testRecuperaItens() throws Exception {
      TabelaHash tabela = new TabelaHash();
      tabela.insere("chave1", "item1");
      tabela.insere("chave2", "item2");
      tabela.insere("chave3", "item3");
      
      Object[] itens = tabela.recuperaItens();
      
      assertEquals(3, itens.length);
      assertArrayEquals(new Object[]{"item1", "item2", "item3"}, itens);
   }
   
   @Test(timeout=1000)
   public void testImprime() throws Exception {
      TabelaHash tabela = new TabelaHash();
      tabela.insere("chave1", "item1");
      tabela.insere("chave2", "item2");
      tabela.insere("chave3", "item3");
      
      tabela.imprime();
   }

}