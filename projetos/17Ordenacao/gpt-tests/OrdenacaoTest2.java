package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class OrdenacaoTest2{


    @Test
    public void testSelecao() {
        int n = 5;
        Item[] v = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.selecao(v, n);
        for (int i = 1; i <= n; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }

    @Test
    public void testInsercao() {
        int n = 5;
        Item[] v = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.insercao(v, n);
        for (int i = 1; i <= n; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }

    @Test
    public void testShellsort() {
        int n = 5;
        Item[] v = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.shellsort(v, n);
        for (int i = 1; i <= n; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }

    @Test
    public void testQuicksort() {
        int n = 5;
        Item[] v = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.quicksort(v, n);
        for (int i = 1; i <= n; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }

    @Test
    public void testHeapsort() {
        int n = 5;
        Item[] v = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.heapsort(v, n);
        for (int i = 1; i <= n; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }
}