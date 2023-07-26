package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest20{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
        assertNull(tabela.pesquisa("chave4"));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        tabela.retira("chave2");
        assertNull(tabela.pesquisa("chave2"));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        
        tabela.imprime();
        // Verify the output in the console manually
    }
    
    @Test(timeout=1000)
    public void testMeuItemConstructor() throws Exception {
        MeuItem item = new MeuItem(10);
        assertNotNull(item);
    }
    
    @Test(timeout=1000)
    public void testMeuItemCompara() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(20);
        
        assertEquals(-1, item1.compara(item2));
        assertEquals(1, item2.compara(item1));
        assertEquals(0, item1.compara(item1));
    }
    
    @Test(timeout=1000)
    public void testMeuItemAlteraChave() throws Exception {
        MeuItem item = new MeuItem(10);
        item.alteraChave(20);
        
        assertEquals(20, item.recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testMeuItemRecuperaChave() throws Exception {
        MeuItem item = new MeuItem(10);
        
        assertEquals(10, item.recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testMeuItemToString() throws Exception {
        MeuItem item = new MeuItem(10);
        
        assertEquals("10", item.toString());
    }
    
    @Test(timeout=1000)
    public void testMeuItemGravaArq() throws Exception {
        MeuItem item = new MeuItem(10);
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        item.gravaArq(arq);
        arq.close();
        
        RandomAccessFile arq2 = new RandomAccessFile("test.txt", "rw");
        MeuItem item2 = new MeuItem(0);
        item2.leArq(arq2);
        arq2.close();
        
        assertEquals(10, item2.recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testListaConstructor() throws Exception {
        Lista lista = new Lista();
        assertNotNull(lista);
    }
    
    @Test(timeout=1000)
    public void testListaPesquisa() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        
        assertEquals("item1", lista.pesquisa("item1"));
        assertEquals("item2", lista.pesquisa("item2"));
        assertEquals("item3", lista.pesquisa("item3"));
        assertNull(lista.pesquisa("item4"));
    }
    
    @Test(timeout=1000)
    public void testListaInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        
        assertEquals("item1", lista.pesquisa("item1"));
        assertEquals("item2", lista.pesquisa("item2"));
        assertEquals("item3", lista.pesquisa("item3"));
    }
    
    @Test(timeout=1000)
    public void testListaInserePrimeiro() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.inserePrimeiro("item3");
        
        assertEquals("item3", lista.pesquisa("item3"));
        assertEquals("item1", lista.pesquisa("item1"));
        assertEquals("item2", lista.pesquisa("item2"));
    }
    
    @Test(timeout=1000)
    public void testListaRetira() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        
        lista.retira("item2");
        assertNull(lista.pesquisa("item2"));
    }
    
    @Test(timeout=1000)
    public void testListaRetiraPrimeiro() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        
        lista.retiraPrimeiro();
        assertNull(lista.pesquisa("item1"));
    }
    
    @Test(timeout=1000)
    public void testListaVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        
        lista.insere("item1");
        assertFalse(lista.vazia());
    }
    
    @Test(timeout=1000)
    public void testListaEstaNaLista() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        
        assertTrue(lista.estaNaLista("item1"));
        assertTrue(lista.estaNaLista("item2"));
        assertTrue(lista.estaNaLista("item3"));
        assertFalse(lista.estaNaLista("item4"));
    }
    
    @Test(timeout=1000)
    public void testListaPrimeiro() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        
        assertEquals("item1", lista.primeiro());
    }
    
    @Test(timeout=1000)
    public void testListaProximo() throws Exception {
        Lista lista = new Lista();
        lista.insere("item1");
        lista.insere("item2");
        lista.insere("item3");
        
        assertEquals("item2", lista.proximo());
    }
}