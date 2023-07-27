package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;
import ds.ArvoreBinaria;
import ds.Item;

public class ArvoreBinariaTest32{


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
    public void testTesta() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);
        arvore.testa();
        // Verify that no error messages are printed
    }
}