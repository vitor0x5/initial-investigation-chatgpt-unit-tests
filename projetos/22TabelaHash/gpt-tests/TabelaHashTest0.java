package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest0{

    
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
        
        assertEquals("item1", tabela.pesquisa("key1"));
        assertEquals("item2", tabela.pesquisa("key2"));
        assertNull(tabela.pesquisa("key3"));
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        
        assertEquals("item1", tabela.pesquisa("key1"));
        assertEquals("item2", tabela.pesquisa("key2"));
    }
    
    @Test(timeout=1000)
    public void testInsereDuplicate() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        
        tabela.insere("key1", "newItem");
        
        assertEquals("item1", tabela.pesquisa("key1"));
    }
    
    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        
        tabela.retira("key1");
        
        assertNull(tabela.pesquisa("key1"));
        assertEquals("item2", tabela.pesquisa("key2"));
    }
    
    @Test(timeout=1000)
    public void testRetiraNonExisting() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        
        tabela.retira("key3");
        
        assertNotNull(tabela.pesquisa("key1"));
        assertNotNull(tabela.pesquisa("key2"));
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "item1");
        tabela.insere("key2", "item2");
        
        tabela.imprime();
    }
    
    @Test(timeout=1000)
    public void testCelulaEquals() throws Exception {
        TabelaHash.Celula cel1 = new TabelaHash.Celula("key1", "item1");
        TabelaHash.Celula cel2 = new TabelaHash.Celula("key1", "item2");
        TabelaHash.Celula cel3 = new TabelaHash.Celula("key2", "item1");
        
        assertTrue(cel1.equals(cel2));
        assertFalse(cel1.equals(cel3));
    }
    
    @Test(timeout=1000)
    public void testCelulaToString() throws Exception {
        TabelaHash.Celula cel = new TabelaHash.Celula("key1", "item1");
        String expected = "  item1";
        
        assertEquals(expected, cel.toString());
    }
    
    @Test(timeout=1000)
    public void testGeraPesos() throws Exception {
        TabelaHash tabela = new TabelaHash();
        int[] pesos = tabela.geraPesos(7);
        
        assertEquals(7, pesos.length);
    }
    
    @Test(timeout=1000)
    public void testH() throws Exception {
        TabelaHash tabela = new TabelaHash();
        int[] pesos = {1, 2, 3, 4, 5, 6, 7};
        tabela.M = 7;
        
        assertEquals(0, tabela.h("key1", pesos));
        assertEquals(1, tabela.h("key2", pesos));
        assertEquals(2, tabela.h("key3", pesos));
        assertEquals(3, tabela.h("key4", pesos));
        assertEquals(4, tabela.h("key5", pesos));
        assertEquals(5, tabela.h("key6", pesos));
        assertEquals(6, tabela.h("key7", pesos));
    }
}