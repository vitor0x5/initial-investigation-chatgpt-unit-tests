package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class TabelaTest2{

    
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
    }
    
    @Test(timeout = 1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        tabela.insere(reg1);
        tabela.insere(reg2);
        
        int result1 = tabela.pesquisa(reg1);
        int result2 = tabela.pesquisa(reg2);
        assertEquals(1, result1);
        assertEquals(2, result2);
    }
    
    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(1);
        tabela.insere(reg);
        
        assertEquals(1, tabela.n);
        assertEquals(reg, tabela.registros[1]);
    }
    
    @Test(timeout = 1000)
    public void testInsereOverflow() throws Exception {
        Tabela tabela = new Tabela();
        for (int i = 1; i <= 10; i++) {
            tabela.insere(new MeuItem(i));
        }
        
        try {
            tabela.insere(new MeuItem(11));
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }
    
    @Test(timeout = 1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        tabela.insere(reg1);
        tabela.insere(reg2);
        
        int result1 = tabela.binaria(reg1);
        int result2 = tabela.binaria(reg2);
        assertEquals(1, result1);
        assertEquals(2, result2);
    }
}