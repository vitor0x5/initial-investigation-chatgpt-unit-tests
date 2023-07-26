package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaTest22{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        Item reg2 = new MeuItem(20);
        Item reg3 = new MeuItem(30);
        tabela.registros[1] = reg1;
        tabela.registros[2] = reg2;
        tabela.registros[3] = reg3;
        tabela.n = 3;

        assertEquals(1, tabela.pesquisa(reg1));
        assertEquals(2, tabela.pesquisa(reg2));
        assertEquals(3, tabela.pesquisa(reg3));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        Item reg2 = new MeuItem(20);
        Item reg3 = new MeuItem(30);
        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);

        assertEquals(1, tabela.n);
        assertEquals(reg1, tabela.registros[1]);
        assertEquals(reg2, tabela.registros[2]);
        assertEquals(reg3, tabela.registros[3]);
    }

    @Test(timeout=1000)
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        Item reg2 = new MeuItem(20);
        Item reg3 = new MeuItem(30);
        tabela.registros[1] = reg1;
        tabela.registros[2] = reg2;
        tabela.registros[3] = reg3;
        tabela.n = 3;

        assertEquals(1, tabela.binaria(reg1));
        assertEquals(2, tabela.binaria(reg2));
        assertEquals(3, tabela.binaria(reg3));
    }

    @Test(timeout=1000)
    public void testMeuItemCompara() {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(20);
        MeuItem item3 = new MeuItem(30);

        assertEquals(-1, item1.compara(item2));
        assertEquals(1, item2.compara(item1));
        assertEquals(0, item1.compara(item1));
        assertEquals(-1, item2.compara(item3));
        assertEquals(1, item3.compara(item2));
    }

    @Test(timeout=1000)
    public void testMeuItemAlteraChave() {
        MeuItem item = new MeuItem(10);
        item.alteraChave(20);
        assertEquals(20, item.recuperaChave());
    }

    @Test(timeout=1000)
    public void testMeuItemRecuperaChave() {
        MeuItem item = new MeuItem(10);
        assertEquals(10, item.recuperaChave());
    }

    @Test(timeout=1000)
    public void testMeuItemToString() {
        MeuItem item = new MeuItem(10);
        assertEquals("10", item.toString());
    }

    @Test(timeout=1000)
    public void testMeuItemGravaArq() throws IOException {
        MeuItem item = new MeuItem(10);
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        item.gravaArq(arq);
        arq.seek(0);
        assertEquals(10, arq.readInt());
        arq.close();
    }

    @Test(timeout=1000)
    public void testMeuItemLeArq() throws IOException {
        MeuItem item = new MeuItem(10);
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        arq.writeInt(20);
        arq.seek(0);
        item.leArq(arq);
        assertEquals(20, item.recuperaChave());
        arq.close();
    }

    @Test(timeout=1000)
    public void testMeuItemTamanho() {
        assertEquals(4, MeuItem.tamanho());
    }
}