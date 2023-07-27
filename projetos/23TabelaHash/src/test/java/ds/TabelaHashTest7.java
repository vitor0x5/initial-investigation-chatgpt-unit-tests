package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.TabelaHash;

public class TabelaHashTest7{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        assertNotNull(tabela);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("chave1", 1);
        
        assertNotNull(tabela.pesquisa("chave1"));
    }
    
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("chave1", 1);
        
        assertEquals(1, tabela.pesquisa("chave1"));
    }
    
    @Test(timeout=1000)
    public void testPesquisaNotFound() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("chave1", 1);
        
        assertNull(tabela.pesquisa("chave2"));
    }
    
    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("chave1", 1);
        tabela.retira("chave1");
        
        assertNull(tabela.pesquisa("chave1"));
    }
    
    @Test( timeout=1000)
    public void testRetiraNotFound() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.retira("chave1");
    }
    
    @Test(timeout=1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("chave1", 1);
        tabela.insere("chave2", 2);
        
        Object[] itens = tabela.recuperaItens();
        
        assertNotNull(itens);
        assertEquals(2, itens.length);
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        
        tabela.insere("chave1", 1);
        tabela.insere("chave2", 2);
        
        tabela.imprime();
    }
}