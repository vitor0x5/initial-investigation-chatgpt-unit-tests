package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;
import ds.ArvoreBinaria;
import ds.Item;

public class ArvoreBinariaTest22{


    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    private ArvoreBinaria arvore;

    @Before
    public void setUp() {
        arvore = new ArvoreBinaria();
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(arvore);
    }

    @Test
    public void testInsere() {
        Item item = new MeuItem(10);
        arvore.insere(item);
        assertNotNull(arvore.pesquisa(item));
    }

    @Test
    public void testRetira() {
        Item item = new MeuItem(10);
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }

    @Test
    public void testPesquisa() {
        Item item = new MeuItem(10);
        arvore.insere(item);
        assertNotNull(arvore.pesquisa(item));
    }

    @Test
    public void testPesquisaNotFound() {
        Item item = new MeuItem(10);
        assertNull(arvore.pesquisa(item));
    }
}