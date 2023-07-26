package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;

import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;

public class ArvoreBinariaTest26{

    
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
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(3);
        
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
    }
    
    @Test
    public void testRetira() {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(3);
        
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        arvore.retira(item2);
        
        assertNull(arvore.pesquisa(item2));
    }
    
    @Test
    public void testPesquisa() {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(3);
        
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
    }
    
    @Test(expected = NullPointerException.class)
    public void testPesquisaNull() {
        arvore.pesquisa(null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testInsereNull() {
        arvore.insere(null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testRetiraNull() {
        arvore.retira(null);
    }
}