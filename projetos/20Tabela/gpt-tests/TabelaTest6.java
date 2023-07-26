package ds;import ds.Item;
import ds.Tabela;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaTest6{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(5);
        tabela.registros[1] = reg1;
        tabela.n = 1;

        int result = tabela.pesquisa(reg1);
        assertEquals(1, result);

        Item reg2 = new MeuItem(10);
        tabela.registros[2] = reg2;
        tabela.n = 2;

        int result2 = tabela.pesquisa(reg2);
        assertEquals(2, result2);

        Item reg3 = new MeuItem(7);
        tabela.registros[3] = reg3;
        tabela.n = 3;

        int result3 = tabela.pesquisa(reg3);
        assertEquals(3, result3);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(5);
        tabela.insere(reg1);

        assertEquals(1, tabela.n);
        assertEquals(reg1, tabela.registros[1]);

        Item reg2 = new MeuItem(10);
        tabela.insere(reg2);

        assertEquals(2, tabela.n);
        assertEquals(reg2, tabela.registros[2]);

        Item reg3 = new MeuItem(7);
        tabela.insere(reg3);

        assertEquals(3, tabela.n);
        assertEquals(reg3, tabela.registros[3]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(5);
        tabela.registros[1] = reg1;
        tabela.n = 1;

        int result1 = tabela.binaria(reg1);
        assertEquals(1, result1);

        Item reg2 = new MeuItem(10);
        tabela.registros[2] = reg2;
        tabela.n = 2;

        int result2 = tabela.binaria(reg2);
        assertEquals(2, result2);

        Item reg3 = new MeuItem(7);
        tabela.registros[3] = reg3;
        tabela.n = 3;

        int result3 = tabela.binaria(reg3);
        assertEquals(3, result3);
    }

    private class MeuItem implements Item {
        private int chave;

        public MeuItem(int chave) {
            this.chave = chave;
        }

        public int compara(Item it) {
            MeuItem item = (MeuItem) it;
            if (this.chave < item.chave) return -1;
            else if (this.chave > item.chave) return 1;
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

        public int tamanho() {
            return 4;
        }
    }
}