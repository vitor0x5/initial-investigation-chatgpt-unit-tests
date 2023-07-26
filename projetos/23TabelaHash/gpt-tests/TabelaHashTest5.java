package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }
    
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        
        Object result1 = tabela.pesquisa("key1");
        assertEquals("item1", result1);
        
        Object result2 = tabela.pesquisa("key3");
        assertNull(result2);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("key1", "item1");
        assertEquals("item1", tabela.pesquisa("key1"));
        
        tabela.insere("key2", "item2");
        assertEquals("item2", tabela.pesquisa("key2"));
        
        tabela.insere("key3", "item3");
        assertEquals("item3", tabela.pesquisa("key3"));
    }
    
    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        
        tabela.retira("key1");
        assertNull(tabela.pesquisa("key1"));
        
        tabela.retira("key3");
        assertNull(tabela.pesquisa("key3"));
    }
    
    @Test(timeout=1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        
        Object[] itens = tabela.recuperaItens();
        
        assertEquals(2, itens.length);
        assertEquals("item1", itens[0]);
        assertEquals("item2", itens[1]);
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        
        tabela.imprime();
    }
}