package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class TabelaTest10{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
    }
    
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item item = new MeuItem(5);
        tabela.insere(item);
        
        int result = tabela.pesquisa(item);
        
        assertEquals(1, result);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item item = new MeuItem(5);
        
        tabela.insere(item);
        
        assertEquals(1, tabela.n);
        assertEquals(item, tabela.registros[1]);
    }
    
    @Test(timeout=1000)
    public void testInsereFullTable() throws Exception {
        Tabela tabela = new Tabela();
        
        for (int i = 0; i < 10; i++) {
            Item item = new MeuItem(i);
            tabela.insere(item);
        }
        
        Item item = new MeuItem(10);
        
        try {
            tabela.insere(item);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }
    
    @Test(timeout=1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        
        for (int i = 0; i < 10; i++) {
            Item item = new MeuItem(i);
            tabela.insere(item);
        }
        
        Item item = new MeuItem(5);
        
        int result = tabela.binaria(item);
        
        assertEquals(5, result);
    }
}