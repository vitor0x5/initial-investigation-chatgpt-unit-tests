package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TabelaTest0{


    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        tabela.insere(item1);
        tabela.insere(item2);

        int index = tabela.pesquisa(item2);

        assertEquals(2, index);
    }

    @Test
    public void testInsere() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);

        try {
            tabela.insere(item1);
        } catch (Exception e) {
            fail("Exception thrown");
        }

        assertEquals(1, tabela.n);
    }

    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);
        Item item4 = new MeuItem(4);
        tabela.insere(item1);
        tabela.insere(item2);
        tabela.insere(item3);
        tabela.insere(item4);

        int index = tabela.binaria(item3);

        assertEquals(3, index);
    }
}