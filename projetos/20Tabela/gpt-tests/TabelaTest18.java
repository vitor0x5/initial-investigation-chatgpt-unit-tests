package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class TabelaTest18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.insere(reg);
        int result = tabela.pesquisa(reg);
        assertEquals(1, result);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.insere(reg);
        assertEquals(1, tabela.n);
    }

    @Test(timeout=1000)
    public void testInsereException() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        for (int i = 0; i < 10; i++) {
            tabela.insere(reg);
        }
        try {
            tabela.insere(reg);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);
        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);
        int result = tabela.binaria(reg2);
        assertEquals(2, result);
    }
}