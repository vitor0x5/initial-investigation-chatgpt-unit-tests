package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaTest4{

    
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
    
    @Test(timeout=1000, expected=Exception.class)
    public void testInsereThrowsException() throws Exception {
        Tabela tabela = new Tabela();
        tabela.n = 10;
        Item reg = new MeuItem(5);
        
        tabela.insere(reg);
    }
    
    @Test(timeout=1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        tabela.n = 5;
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(2);
        tabela.registros[3] = new MeuItem(3);
        tabela.registros[4] = new MeuItem(4);
        tabela.registros[5] = new MeuItem(5);
        Item chave = new MeuItem(4);
        
        int result = tabela.binaria(chave);
        
        assertEquals(4, result);
    }
    
    @Test(timeout=1000)
    public void testMeuItemConstructor() throws Exception {
        MeuItem item = new MeuItem(5);
        assertNotNull(item);
    }
    
    @Test(timeout=1000)
    public void testMeuItemCompara() throws Exception {
        MeuItem item1 = new MeuItem(5);
        MeuItem item2 = new MeuItem(3);
        
        int result1 = item1.compara(item2);
        int result2 = item2.compara(item1);
        int result3 = item1.compara(item1);
        
        assertEquals(1, result1);
        assertEquals(-1, result2);
        assertEquals(0, result3);
    }
    
    @Test(timeout=1000)
    public void testMeuItemAlteraChave() throws Exception {
        MeuItem item = new MeuItem(5);
        Object chave = 10;
        
        item.alteraChave(chave);
        
        assertEquals(10, item.chave);
    }
    
    @Test(timeout=1000)
    public void testMeuItemRecuperaChave() throws Exception {
        MeuItem item = new MeuItem(5);
        
        Object result = item.recuperaChave();
        
        assertEquals(5, result);
    }
    
    @Test(timeout=1000)
    public void testMeuItemToString() throws Exception {
        MeuItem item = new MeuItem(5);
        
        String result = item.toString();
        
        assertEquals("5", result);
    }
    
    @Test(timeout=1000)
    public void testMeuItemGravaArq() throws Exception {
        MeuItem item = new MeuItem(5);
        RandomAccessFile arq = new RandomAccessFile("test.dat", "rw");
        
        item.gravaArq(arq);
        
        arq.seek(0);
        int result = arq.readInt();
        
        assertEquals(5, result);
    }
    
    @Test(timeout=1000)
    public void testMeuItemLeArq() throws Exception {
        MeuItem item = new MeuItem(5);
        RandomAccessFile arq = new RandomAccessFile("test.dat", "rw");
        arq.writeInt(10);
        
        item.leArq(arq);
        
        assertEquals(10, item.chave);
    }
    
    @Test(timeout=1000)
    public void testMeuItemTamanho() throws Exception {
        int result = MeuItem.tamanho();
        
        assertEquals(4, result);
    }
    
}