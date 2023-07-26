package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class OrdenacaoTest0{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);

        Ordenacao.selecao(items, items.length);

        Item[] expected = new Item[6];
        expected[0] = new MeuItem(1);
        expected[1] = new MeuItem(2);
        expected[2] = new MeuItem(3);
        expected[3] = new MeuItem(5);
        expected[4] = new MeuItem(7);
        expected[5] = new MeuItem(9);

        assertTrue(Arrays.equals(items, expected));
    }

    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);

        Ordenacao.insercao(items, items.length);

        Item[] expected = new Item[6];
        expected[0] = new MeuItem(1);
        expected[1] = new MeuItem(2);
        expected[2] = new MeuItem(3);
        expected[3] = new MeuItem(5);
        expected[4] = new MeuItem(7);
        expected[5] = new MeuItem(9);

        assertTrue(Arrays.equals(items, expected));
    }

    @Test(timeout=1000)
    public void testShellsort() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);

        Ordenacao.shellsort(items, items.length);

        Item[] expected = new Item[6];
        expected[0] = new MeuItem(1);
        expected[1] = new MeuItem(2);
        expected[2] = new MeuItem(3);
        expected[3] = new MeuItem(5);
        expected[4] = new MeuItem(7);
        expected[5] = new MeuItem(9);

        assertTrue(Arrays.equals(items, expected));
    }

    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);

        Ordenacao.quicksort(items, items.length);

        Item[] expected = new Item[6];
        expected[0] = new MeuItem(1);
        expected[1] = new MeuItem(2);
        expected[2] = new MeuItem(3);
        expected[3] = new MeuItem(5);
        expected[4] = new MeuItem(7);
        expected[5] = new MeuItem(9);

        assertTrue(Arrays.equals(items, expected));
    }

    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        Item[] items = new Item[6];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(9);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(7);
        items[5] = new MeuItem(3);

        Ordenacao.heapsort(items, items.length);

        Item[] expected = new Item[6];
        expected[0] = new MeuItem(1);
        expected[1] = new MeuItem(2);
        expected[2] = new MeuItem(3);
        expected[3] = new MeuItem(5);
        expected[4] = new MeuItem(7);
        expected[5] = new MeuItem(9);

        assertTrue(Arrays.equals(items, expected));
    }
}