package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaTest5{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
    }
    
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.registros[0] = reg;
        tabela.n = 1;
        int result = tabela.pesquisa(reg);
        assertEquals(0, result);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg = new MeuItem(5);
        tabela.insere(reg);
        assertEquals(1, tabela.n);
        assertEquals(reg, tabela.registros[1]);
    }
    
    @Test(timeout=1000)
    public void testInsereFullTable() throws Exception {
        Tabela tabela = new Tabela();
        for (int i = 1; i <= 10; i++) {
            Item reg = new MeuItem(i);
            tabela.insere(reg);
        }
        Item reg = new MeuItem(11);
        try {
            tabela.insere(reg);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }
    
    @Test(timeout=1000)
    public void testBinariaEmptyTable() throws Exception {
        Tabela tabela = new Tabela();
        Item chave = new MeuItem(5);
        int result = tabela.binaria(chave);
        assertEquals(0, result);
    }
    
    @Test(timeout=1000)
    public void testBinariaFound() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);
        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);
        Item chave = new MeuItem(2);
        int result = tabela.binaria(chave);
        assertEquals(2, result);
    }
    
    @Test(timeout=1000)
    public void testBinariaNotFound() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);
        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);
        Item chave = new MeuItem(5);
        int result = tabela.binaria(chave);
        assertEquals(0, result);
    }
}