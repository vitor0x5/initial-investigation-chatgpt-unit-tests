package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Random;

public class OrdenacaoTest0{


    @Test
    public void testPermutItem() {
        int n = 5;
        Item v[] = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.permut(v, n);
        for (int i = 1; i <= n; i++) {
            assertNotNull(v[i]);
        }
    }

    @Test
    public void testPermutInt() {
        int n = 5;
        int v[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = i;
        }
        Ordenacao.permut(v, n);
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] >= 1 && v[i] <= n);
        }
    }

    @Test
    public void testPermutChar() {
        int n = 5;
        char v[] = new char[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = (char) (i + 96);
        }
        Ordenacao.permut(v, n);
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] >= 'a' && v[i] <= (char) (n + 96));
        }
    }

    @Test
    public void testSelecao() {
        int n = 5;
        Item v[] = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.selecao(v, n);
        for (int i = 1; i <= n - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testInsercao() {
        int n = 5;
        Item v[] = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.insercao(v, n);
        for (int i = 1; i <= n - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testShellsort() {
        int n = 5;
        Item v[] = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.shellsort(v, n);
        for (int i = 1; i <= n - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testQuicksort() {
        int n = 5;
        Item v[] = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.quicksort(v, n);
        for (int i = 1; i <= n - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testHeapsort() {
        int n = 5;
        Item v[] = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.heapsort(v, n);
        for (int i = 1; i <= n - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }
}