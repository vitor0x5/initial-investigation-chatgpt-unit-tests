package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaTest7{

    
    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
        assertEquals(0, tabela.n);
        assertNull(tabela.registros[0]);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(10);
        tabela.registros[2] = new MeuItem(20);
        tabela.registros[3] = new MeuItem(30);
        tabela.n = 3;
        
        assertEquals(1, tabela.pesquisa(new MeuItem(10)));
        assertEquals(2, tabela.pesquisa(new MeuItem(20)));
        assertEquals(3, tabela.pesquisa(new MeuItem(30)));
        assertEquals(0, tabela.pesquisa(new MeuItem(40)));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        tabela.insere(new MeuItem(10));
        assertEquals(1, tabela.n);
        tabela.insere(new MeuItem(20));
        assertEquals(2, tabela.n);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereFull() throws Exception {
        Tabela tabela = new Tabela();
        for (int i = 0; i < 10; i++) {
            tabela.insere(new MeuItem(i));
        }
        assertEquals(10, tabela.n);
        
        try {
            tabela.insere(new MeuItem(10));
            fail("Expected Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(10);
        tabela.registros[2] = new MeuItem(20);
        tabela.registros[3] = new MeuItem(30);
        tabela.n = 3;
        
        assertEquals(1, tabela.binaria(new MeuItem(10)));
        assertEquals(2, tabela.binaria(new MeuItem(20)));
        assertEquals(3, tabela.binaria(new MeuItem(30)));
        assertEquals(0, tabela.binaria(new MeuItem(40)));
    }
    
    @Test(expected = IOException.class, timeout = 1000)
    public void testGravaArq() throws Exception {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(10);
        
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        tabela.registros[1].gravaArq(arq);
        
        arq.seek(0);
        assertEquals(10, arq.readInt());
        
        arq.close();
    }
    
    @Test(expected = IOException.class, timeout = 1000)
    public void testLeArq() throws Exception {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(0);
        
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        arq.writeInt(10);
        
        arq.seek(0);
        tabela.registros[1].leArq(arq);
        
        assertEquals(10, ((MeuItem) tabela.registros[1]).chave);
        
        arq.close();
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testTamanho() throws Exception {
        assertEquals(4, MeuItem.tamanho());
    }
}