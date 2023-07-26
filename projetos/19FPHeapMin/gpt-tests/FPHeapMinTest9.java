package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FPHeapMinTest9{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMin heap = new FPHeapMin(10);
        assertNotNull(heap);
    }

    @Test(timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] items = new Item[5];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(4);
        items[3] = new MeuItem(3);
        items[4] = new MeuItem(2);
        FPHeapMin heap = new FPHeapMin(items);

        heap.refaz(1, 4);

        assertEquals(2, heap.min().recuperaChave());
    }

    @Test(timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] items = new Item[6];
        items[1] = new MeuItem(9);
        items[2] = new MeuItem(5);
        items[3] = new MeuItem(8);
        items[4] = new MeuItem(3);
        items[5] = new MeuItem(6);
        FPHeapMin heap = new FPHeapMin(items);
        heap.constroi();

        assertEquals(3, heap.min().recuperaChave());
    }

    @Test(timeout = 1000)
    public void testRetiraMin() throws Exception {
        Item[] items = new Item[5];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(4);
        items[3] = new MeuItem(3);
        items[4] = new MeuItem(2);
        FPHeapMin heap = new FPHeapMin(items);

        Item min = heap.retiraMin();

        assertEquals(2, min.recuperaChave());
        assertEquals(3, heap.min().recuperaChave());
    }

    @Test(timeout = 1000)
    public void testDiminuiChave() throws Exception {
        Item[] items = new Item[5];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(4);
        items[3] = new MeuItem(3);
        items[4] = new MeuItem(2);
        FPHeapMin heap = new FPHeapMin(items);

        heap.diminuiChave(3, 1);
        assertEquals(1, heap.min().recuperaChave());
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        Item[] items = new Item[5];
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(4);
        items[3] = new MeuItem(3);
        items[4] = new MeuItem(2);
        FPHeapMin heap = new FPHeapMin(items);

        heap.insere(new MeuItem(1));

        assertEquals(1, heap.min().recuperaChave());
    }

    public static class MeuItem implements Item {
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

        public static int tamanho() {
            return 4;
        }
    }

    public static class FPHeapMin {
        private Item v[];
        private int n;

        public FPHeapMin(int maxTam) {
            this.v = new Item[maxTam + 1];
            this.n = 0;
        }

        public FPHeapMin(Item v[]) {
            this.v = v;
            this.n = this.v.length - 1;
        }

        public void refaz(int esq, int dir) {
            int j = esq * 2;
            Item x = this.v[esq];
            while (j <= dir) {
                if ((j < dir) && (this.v[j].compara(this.v[j + 1]) > 0)) j++;
                if (x.compara(this.v[j]) <= 0) break;
                this.v[esq] = this.v[j];
                esq = j;
                j = esq * 2;
            }
            this.v[esq] = x;
        }

        public void constroi() {
            int esq = n / 2 + 1;
            while (esq > 1) {
                esq--;
                this.refaz(esq, this.n);
            }
        }

        public Item min() {
            return this.v[1];
        }

        public Item retiraMin() throws Exception {
            Item minimo;
            if (this.n < 1) throw new Exception("Erro: heap vazio");
            else {
                minimo = this.v[1];
                this.v[1] = this.v[this.n--];
                refaz(1, this.n);
            }
            return minimo;
        }

        public void diminuiChave(int i, Object chaveNova) throws Exception {
            Item x = this.v[i];
            if (chaveNova == null) throw new Exception("Erro: chaveNova com valor null");
            x.alteraChave(chaveNova);
            while ((i > 1) && (x.compara(this.v[i / 2]) <= 0)) {
                this.v[i] = this.v[i / 2];
                i /= 2;
            }
            this.v[i] = x;
        }

        public void insere(Item x) throws Exception {
            this.n++;
            if (this.n == this.v.length) throw new Exception("Erro: heap cheio");
            Object chaveNova = x.recuperaChave();
            this.v[this.n] = x;
            this.v[this.n].alteraChave(new Integer(Integer.MAX_VALUE));
            this.diminuiChave(this.n, chaveNova);
        }

        public void imprime() {
            for (int i = 1; i <= this.n; i++) {
                System.out.print(this.v[i].toString() + " ");
            }
            System.out.println();
        }

        public void copia(Item v[]) {
            for (int i = 1; i < v.length; i++) {
                this.v[++this.n] = v[i];
            }
        }
    }

    public interface Item {
        public int compara(Item it);

        public void alteraChave(Object chave);

        public Object recuperaChave();
    }

}