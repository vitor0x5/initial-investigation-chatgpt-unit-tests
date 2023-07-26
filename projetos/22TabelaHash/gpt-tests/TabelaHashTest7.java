package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest7{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }
    
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNull(tabela.pesquisa("chave"));
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave", 1);
        assertEquals(1, tabela.pesquisa("chave"));
    }
    
    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave", 1);
        tabela.retira("chave");
        assertNull(tabela.pesquisa("chave"));
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", 1);
        tabela.insere("chave2", 2);
        tabela.insere("chave3", 3);
        tabela.imprime();
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
        int result = tabela.h("chave", pesos);
        assertTrue(result >= 0 && result <= 6);
    }
}