package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.RandomAccessFile;
import java.io.IOException;

public class TabelaHashTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
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
        int hash = tabela.h("abc", pesos);
        assertEquals(28, hash);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 123);
        tabela.insere("def", 456);
        tabela.insere("ghi", 789);
        Object item = tabela.pesquisa("def");
        assertEquals(456, item);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 123);
        tabela.insere("def", 456);
        tabela.insere("ghi", 789);
        Object item = tabela.pesquisa("abc");
        assertEquals(123, item);
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 123);
        tabela.insere("def", 456);
        tabela.insere("ghi", 789);
        tabela.retira("def");
        Object item = tabela.pesquisa("def");
        assertNull(item);
    }

    @Test(expected=Exception.class, timeout=1000)
    public void testRetiraException() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.retira("abc");
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 123);
        tabela.insere("def", 456);
        tabela.insere("ghi", 789);
        tabela.imprime();
    }

    @Test(timeout=1000)
    public void testCelulaEquals() throws Exception {
        TabelaHash.Celula cel1 = new TabelaHash.Celula("abc", 123);
        TabelaHash.Celula cel2 = new TabelaHash.Celula("abc", 456);
        assertTrue(cel1.equals(cel2));
    }

    @Test(timeout=1000)
    public void testCelulaToString() throws Exception {
        TabelaHash.Celula cel = new TabelaHash.Celula("abc", 123);
        String str = cel.toString();
        assertEquals("  123", str);
    }

    @Test(timeout=1000)
    public void testMeuItemCompara() throws Exception {
        MeuItem item1 = new MeuItem(123);
        MeuItem item2 = new MeuItem(456);
        int result = item1.compara(item2);
        assertEquals(-1, result);
    }

    @Test(timeout=1000)
    public void testMeuItemAlteraChave() throws Exception {
        MeuItem item = new MeuItem(123);
        item.alteraChave(456);
        assertEquals(456, item.recuperaChave());
    }

    @Test(timeout=1000)
    public void testMeuItemRecuperaChave() throws Exception {
        MeuItem item = new MeuItem(123);
        Object chave = item.recuperaChave();
        assertEquals(123, chave);
    }

    @Test(timeout=1000)
    public void testMeuItemToString() throws Exception {
        MeuItem item = new MeuItem(123);
        String str = item.toString();
        assertEquals("123", str);
    }

    @Test(timeout=1000)
    public void testMeuItemGravaArq() throws Exception {
        MeuItem item = new MeuItem(123);
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        item.gravaArq(arq);
        arq.seek(0);
        int chave = arq.readInt();
        assertEquals(123, chave);
        arq.close();
    }

    @Test(timeout=1000)
    public void testMeuItemLeArq() throws Exception {
        MeuItem item = new MeuItem(123);
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        arq.writeInt(456);
        arq.seek(0);
        item.leArq(arq);
        int chave = item.recuperaChave();
        assertEquals(456, chave);
        arq.close();
    }

    @Test(timeout=1000)
    public void testMeuItemTamanho() throws Exception {
        int tamanho = MeuItem.tamanho();
        assertEquals(4, tamanho);
    }
}