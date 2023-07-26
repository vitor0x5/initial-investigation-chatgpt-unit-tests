package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaTest8{


    @Test(timeout=1000, expected=Exception.class)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela.registros);
        assertEquals(0, tabela.n);
        tabela.insere(new MeuItem(1));
        assertEquals(1, tabela.n);
        tabela.insere(new MeuItem(2));
        assertEquals(2, tabela.n);
        tabela.insere(new MeuItem(3));
        assertEquals(3, tabela.n);
        tabela.insere(new MeuItem(4));
        assertEquals(4, tabela.n);
        tabela.insere(new MeuItem(5));
        assertEquals(5, tabela.n);
        tabela.insere(new MeuItem(6));
        assertEquals(6, tabela.n);
        tabela.insere(new MeuItem(7));
        assertEquals(7, tabela.n);
        tabela.insere(new MeuItem(8));
        assertEquals(8, tabela.n);
        tabela.insere(new MeuItem(9));
        assertEquals(9, tabela.n);
        tabela.insere(new MeuItem(10));
        assertEquals(10, tabela.n);
        tabela.insere(new MeuItem(11));
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        tabela.insere(new MeuItem(1));
        tabela.insere(new MeuItem(2));
        tabela.insere(new MeuItem(3));
        tabela.insere(new MeuItem(4));
        tabela.insere(new MeuItem(5));

        assertEquals(0, tabela.pesquisa(new MeuItem(1)));
        assertEquals(1, tabela.pesquisa(new MeuItem(2)));
        assertEquals(2, tabela.pesquisa(new MeuItem(3)));
        assertEquals(3, tabela.pesquisa(new MeuItem(4)));
        assertEquals(4, tabela.pesquisa(new MeuItem(5)));
        assertEquals(-1, tabela.pesquisa(new MeuItem(6)));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();

        tabela.insere(new MeuItem(1));
        assertEquals(1, tabela.n);

        tabela.insere(new MeuItem(2));
        assertEquals(2, tabela.n);

        tabela.insere(new MeuItem(3));
        assertEquals(3, tabela.n);

        tabela.insere(new MeuItem(4));
        assertEquals(4, tabela.n);

        tabela.insere(new MeuItem(5));
        assertEquals(5, tabela.n);

        tabela.insere(new MeuItem(6));
        assertEquals(6, tabela.n);

        tabela.insere(new MeuItem(7));
        assertEquals(7, tabela.n);

        tabela.insere(new MeuItem(8));
        assertEquals(8, tabela.n);

        tabela.insere(new MeuItem(9));
        assertEquals(9, tabela.n);

        tabela.insere(new MeuItem(10));
        assertEquals(10, tabela.n);

        tabela.insere(new MeuItem(11));
    }

    @Test(timeout=1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        tabela.insere(new MeuItem(1));
        tabela.insere(new MeuItem(3));
        tabela.insere(new MeuItem(5));
        tabela.insere(new MeuItem(7));
        tabela.insere(new MeuItem(9));

        assertEquals(0, tabela.binaria(new MeuItem(1)));
        assertEquals(1, tabela.binaria(new MeuItem(3)));
        assertEquals(2, tabela.binaria(new MeuItem(5)));
        assertEquals(3, tabela.binaria(new MeuItem(7)));
        assertEquals(4, tabela.binaria(new MeuItem(9)));
        assertEquals(0, tabela.binaria(new MeuItem(2)));
        assertEquals(0, tabela.binaria(new MeuItem(4)));
        assertEquals(0, tabela.binaria(new MeuItem(6)));
        assertEquals(0, tabela.binaria(new MeuItem(8)));
        assertEquals(0, tabela.binaria(new MeuItem(10)));
    }
}