package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.io.*;

public class ArvoreBinariaTest23{

    
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);
    
    private ArvoreBinaria arvore;
    
    @Before
    public void setUp() throws Exception {
        arvore = new ArvoreBinaria();
    }
    
    @Test
    public void testDefaultConstructor() {
        assertNotNull(arvore);
    }
    
    @Test
    public void testPesquisa() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        Item result1 = arvore.pesquisa(item1);
        Item result2 = arvore.pesquisa(item2);
        Item result3 = arvore.pesquisa(item3);
        
        assertEquals(item1, result1);
        assertEquals(item2, result2);
        assertEquals(item3, result3);
    }
    
    @Test
    public void testInsere() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        Item result1 = arvore.pesquisa(item1);
        Item result2 = arvore.pesquisa(item2);
        Item result3 = arvore.pesquisa(item3);
        
        assertEquals(item1, result1);
        assertEquals(item2, result2);
        assertEquals(item3, result3);
    }
    
    @Test
    public void testRetira() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        arvore.retira(item2);
        
        Item result1 = arvore.pesquisa(item1);
        Item result2 = arvore.pesquisa(item2);
        Item result3 = arvore.pesquisa(item3);
        
        assertEquals(item1, result1);
        assertNull(result2);
        assertEquals(item3, result3);
    }
    
    @Test
    public void testTesta() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        arvore.testa();
    }
}