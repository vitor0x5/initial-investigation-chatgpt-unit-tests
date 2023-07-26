package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest26{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));
        assertNull(tabela.pesquisa("key4"));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        tabela.retira("key1");
        assertNull(tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));

        tabela.retira("key2");
        assertNull(tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));

        tabela.retira("key3");
        assertNull(tabela.pesquisa("key3"));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        tabela.imprime();
    }
}

class MeuItem implements Item {
    private int chave;

    public MeuItem (int chave) { this.chave = chave; }

    public int compara (Item it) {
        MeuItem item = (MeuItem) it;
        if (this.chave < item.chave) return -1;
        else if (this.chave > item.chave) return 1;
        return 0;
    }

    public void alteraChave (Object chave) {
        Integer ch = (Integer) chave; this.chave = ch.intValue ();
    }

    public Object recuperaChave () { return new Integer (this.chave); }

    public String toString () { return "" + this.chave; }

    public void gravaArq (RandomAccessFile arq) throws IOException {
        arq.writeInt (this.chave);
    }

    public void leArq (RandomAccessFile arq) throws IOException {
        this.chave = arq.readInt ();
    }

    public static int tamanho () { return 4; }
}

class Lista {
    private static class Celula { Object item; Celula prox; }
    private Celula primeiro, ultimo, pos;

    public Lista () {
        this.primeiro = new Celula ();
        this.pos = this.primeiro;
        this.ultimo = this.primeiro;
        this.primeiro.prox = null;
    }

    public Object pesquisa (Object chave) {
        if (this.vazia () || chave == null) return null;
        Celula aux = this.primeiro;
        while (aux.prox != null) {
            if (aux.prox.item.equals (chave)) return aux.prox.item;
            aux = aux.prox;
        }
        return null;
    }

    public void insere (Object x) {
        this.ultimo.prox = new Celula ();
        this.ultimo = this.ultimo.prox;
        this.ultimo.item = x;
        this.ultimo.prox = null;
    }

    public void inserePrimeiro (Object item) {
        Celula aux =  this.primeiro.prox;
        this.primeiro.prox = new Celula ();
        this.primeiro.prox.item = item;
        this.primeiro.prox.prox = aux;
    }

    public Object retira (Object chave) throws Exception {
        if (this.vazia () || (chave == null))
            throw new Exception ("Erro: Lista vazia ou chave invalida");
        Celula aux = this.primeiro;
        while (aux.prox != null && !aux.prox.item.equals (chave))
            aux = aux.prox;
        if (aux.prox == null) return null;
        Celula q = aux.prox;
        Object item = q.item;
        aux.prox = q.prox;
        if (aux.prox == null) this.ultimo = aux;
        return item;
    }

    public Object retiraPrimeiro () throws Exception {
        if (this.vazia ()) throw new Exception ("Erro: Lista vazia");
        Celula aux = this.primeiro;
        Celula q = aux.prox;
        Object item = q.item;
        aux.prox = q.prox;
        if (aux.prox == null) this.ultimo = aux;
        return item;
    }

    public boolean vazia () { return (this.primeiro == this.ultimo); }

    public void imprime () {
        Celula aux = this.primeiro.prox;
        while (aux != null) {
            System.out.println (aux.item.toString ());
            aux = aux.prox;
        }
    }

    public boolean estaNaLista (Object chave) {
        Object obj = this.pesquisa (chave);
        return (obj != null);
    }

    public Object primeiro () {
        this.pos = this.primeiro;
        return this.proximo ();
    }

    public Object proximo () {
        this.pos = this.pos.prox;
        if (this.pos == null) return null;
        else return this.pos.item;
    }
}

interface Item {
    public int compara (Item it);
    public void alteraChave (Object chave);
    public Object recuperaChave ();
}

class TabelaHash {
    private static class Celula {
        String chave;
        Object item;

        public Celula (String chave, Object item) {
            this.chave = chave;
            this.item = item;
        }

        public boolean equals (Object obj) {
            Celula cel = (Celula)obj;
            return chave.equals (cel.chave);
        }

        public String toString () {
            return "  " + item.toString ();
        }
    }

    private int M;
    private Lista tabela[];
    private int pesos[];

    private int[] geraPesos (int n) {
        int p[] = new int[n];
        java.util.Random rand = new java.util.Random ();
        for (int i = 0; i < n; i++) p[i] = rand.nextInt(M) + 1;
        return p;
    }

    private int h (String chave, int[] pesos) {
        int soma = 0;
        for (int i = 0; i < chave.length(); i++)
            soma = soma + ((int)chave.charAt (i)) * pesos[i];
        return soma % this.M;
    }

    public TabelaHash () {
        int m = 7;
        int maxTamChave = 7;
        this.M = m;
        this.tabela = new Lista[this.M];
        for (int i = 0; i < this.M; i++) this.tabela[i] = new Lista ();
        this.pesos = this.geraPesos (maxTamChave);
    }

    public Object pesquisa (String chave) {
        int i = this.h (chave, this.pesos);
        if (this.tabela[i].vazia()) return null;
        else {
            Celula cel=(Celula)this.tabela[i].pesquisa(new Celula(chave,null));
            if (cel == null) return null;
            else return cel.item;
        }
    }

    public void insere (String chave, Object item) {
        if (this.pesquisa (chave) == null) {
            int i = this.h (chave, this.pesos);
            this.tabela[i].insere (new Celula (chave, item));
        }
        else System.out.println ("Registro ja esta presente");
    }

    public void retira (String chave) throws Exception {
        int i = this.h