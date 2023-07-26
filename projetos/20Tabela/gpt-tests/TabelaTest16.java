package ds;import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Before;
import org.junit.Test;

public class TabelaTest16{


    private Tabela tabela;
    private Item item;

    @Before
    public void setUp() {
        tabela = new Tabela();
        item = new MeuItem(5);
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        assertEquals(0, tabela.n);
    }

    @Test(timeout = 1000)
    public void testPesquisa() {
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(2);
        tabela.registros[3] = new MeuItem(3);
        tabela.registros[4] = new MeuItem(4);
        tabela.registros[5] = new MeuItem(5);
        tabela.n = 5;

        assertEquals(5, tabela.pesquisa(item));
    }

    @Test(timeout = 1000)
    public void testPesquisaNotFound() {
        tabela.n = 0;

        assertEquals(0, tabela.pesquisa(item));
    }

    @Test(timeout = 1000)
    public void testInsere() {
        try {
            tabela.insere(item);
            assertEquals(1, tabela.n);
            assertEquals(item, tabela.registros[1]);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }

    @Test(timeout = 1000)
    public void testInsereFullTable() {
        tabela.n = 10;

        try {
            tabela.insere(item);
            fail("Exception should be thrown");
        } catch (Exception e) {
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }
    }

    @Test(timeout = 1000)
    public void testBinaria() {
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(2);
        tabela.registros[3] = new MeuItem(3);
        tabela.registros[4] = new MeuItem(4);
        tabela.registros[5] = new MeuItem(5);
        tabela.n = 5;

        assertEquals(5, tabela.binaria(item));
    }

    @Test(timeout = 1000)
    public void testBinariaNotFound() {
        tabela.n = 0;

        assertEquals(0, tabela.binaria(item));
    }
}

class MeuItem implements Item {
    private int chave;

    public MeuItem(int chave) {
        this.chave = chave;
    }

    public int compara(Item it) {
        MeuItem item = (MeuItem) it;
        if (this.chave < item.chave)
            return -1;
        else if (this.chave > item.chave)
            return 1;
        return 0;
    }

    public void alteraChave(Object chave) {
        Integer ch = (Integer) chave;
        this.chave = ch.intValue();
    }

    public Object recuperaChave() {
        return new Integer(this.chave);
    }

    public String toString() {
        return "" + this.chave;
    }

    public void gravaArq(RandomAccessFile arq) throws IOException {
        arq.writeInt(this.chave);
    }

    public void leArq(RandomAccessFile arq) throws IOException {
        this.chave = arq.readInt();
    }

    public static int tamanho() {
        return 4;
    }
}

interface Item {
    public int compara(Item it);

    public void alteraChave(Object chave);

    public Object recuperaChave();
}

class Tabela {
    public Item registros[];
    public int n;

    public Tabela() {
        final int maxN = 10;
        this.registros = new Item[maxN + 1];
        this.n = 0;
    }

    public int pesquisa(Item reg) {
        this.registros[0] = reg;
        int i = this.n;
        while (this.registros[i].compara(reg) != 0)
            i--;
        return i;
    }

    public void insere(Item reg) throws Exception {
        if (this.n == (this.registros.length - 1))
            throw new Exception("Erro: A tabela esta cheia");
        this.registros[++this.n] = reg;
    }

    public int binaria(Item chave) {
        if (this.n == 0)
            return 0;
        int esq = 1, dir = this.n, i;
        do {
            i = (esq + dir) / 2;
            if (chave.compara(this.registros[i]) > 0)
                esq = i + 1;
            else
                dir = i - 1;
        } while ((chave.compara(this.registros[i]) != 0) && (esq <= dir));
        if (chave.compara(this.registros[i]) == 0)
            return i;
        else
            return 0;
    }
}