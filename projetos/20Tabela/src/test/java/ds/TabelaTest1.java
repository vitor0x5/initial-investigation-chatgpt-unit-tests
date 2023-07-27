package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class TabelaTest1{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela.registros);
        assertEquals(0, tabela.n);
    }
    
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(20);
        tabela.registros[1] = item1;
        tabela.registros[2] = item2;
        
        assertEquals(0, tabela.pesquisa(item1));
        assertEquals(0, tabela.pesquisa(item2));
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        MeuItem item = new MeuItem(10);
        tabela.insere(item);
        
        assertEquals(1, tabela.n);
        assertEquals(item, tabela.registros[1]);
    }
    
    @Test(timeout=1000)
    public void testInsereWithFullTable() throws Exception {
        Tabela tabela = new Tabela();
        for (int i = 1; i <= 10; i++) {
            MeuItem item = new MeuItem(i);
            tabela.insere(item);
        }
        
        MeuItem newItem = new MeuItem(11);
        try {
            tabela.insere(newItem);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }
    
    @Test(timeout=1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(20);
        tabela.registros[1] = item1;
        tabela.registros[2] = item2;
        
        assertEquals(0, tabela.binaria(item1));
        assertEquals(0, tabela.binaria(item2));
    }
    
    @Test(timeout=1000)
    public void testBinariaWithEmptyTable() throws Exception {
        Tabela tabela = new Tabela();
        MeuItem item = new MeuItem(10);
        
        assertEquals(0, tabela.binaria(item));
    }
}