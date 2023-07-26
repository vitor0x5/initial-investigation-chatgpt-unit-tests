package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

class ArvoreBinariaTest {

    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arv = new ArvoreBinaria();
        assertNotNull(arv);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        ArvoreBinaria arv = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arv.insere(reg);
        assertSame(reg, arv.pesquisa(reg));
    }

    @Test(timeout=1000, expected=NullPointerException.class)
    public void testPesquisaNotFound() throws Exception {
        ArvoreBinaria arv = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arv.insere(reg);
        assertNull(arv.pesquisa(new MeuItem(10)));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria arv = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arv.insere(reg);
        assertNotNull(arv.pesquisa(reg));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        ArvoreBinaria arv = new ArvoreBinaria();
        Item reg = new MeuItem(5);
        arv.insere(reg);
        arv.retira(reg);
        assertNull(arv.pesquisa(reg));
    }

    @Test(timeout=1000, expected=NullPointerException.class)
    public void testRetiraNotFound() throws Exception {
        ArvoreBinaria arv = new ArvoreBinaria();
        Item reg1 = new MeuItem(5);
        Item reg2 = new MeuItem(10);
        arv.insere(reg1);
        arv.retira(reg2);
    }

    @Test(timeout=1000)
    public void testCentral() throws Exception {
        ArvoreBinaria arv = new ArvoreBinaria();
        Item reg1 = new MeuItem(5);
        Item reg2 = new MeuItem(10);
        Item reg3 = new MeuItem(15);
        arv.insere(reg2);
        arv.insere(reg1);
        arv.insere(reg3);
        arv.central(arv.raiz);
    }

    @Test(timeout=1000)
    public void testAntecessor() throws Exception {
        ArvoreBinaria arv = new ArvoreBinaria();
        Item reg1 = new MeuItem(5);
        Item reg2 = new MeuItem(10);
        Item reg3 = new MeuItem(15);
        arv.insere(reg2);
        arv.insere(reg1);
        arv.insere(reg3);
        assertNull(arv.antecessor(arv.raiz, arv.raiz));
    }

    @Test(timeout=1000)
    public void testTesta() throws Exception {
        ArvoreBinaria arv = new ArvoreBinaria();
        arv.testa(arv.raiz);
    }
    
    @Test(timeout=1000)
    public void testGravaArq() throws Exception {
        Item reg = new MeuItem(5);
        RandomAccessFile arq = new RandomAccessFile("teste.dat", "rw");
        reg.gravaArq(arq);
        arq.seek(0);
        MeuItem item = new MeuItem(0);
        item.leArq(arq);
        assertEquals(reg.recuperaChave(), item.recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testLeArq() throws Exception {
        Item reg = new MeuItem(5);
        RandomAccessFile arq = new RandomAccessFile("teste.dat", "rw");
        reg.gravaArq(arq);
        arq.seek(0);
        MeuItem item = new MeuItem(0);
        item.leArq(arq);
        assertEquals(reg.recuperaChave(), item.recuperaChave());
    }
}