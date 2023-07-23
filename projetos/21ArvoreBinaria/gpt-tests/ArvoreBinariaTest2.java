package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import ds.PermutacaoRandomica;

public class ArvoreBinariaTest2{

    
    private ArvoreBinaria arvore;
    
    @Before
    public void setUp() {
        arvore = new ArvoreBinaria();
    }
    
    @Test
    public void testPesquisaItemInexistent() {
        Item item = new MeuItem(10);
        assertNull(arvore.pesquisa(item));
    }
    
    @Test
    public void testPesquisaItemExists() {
        Item item = new MeuItem(10);
        arvore.insere(item);
        assertEquals(item, arvore.pesquisa(item));
    }
    
    @Test
    public void testInsereItem() {
        Item item = new MeuItem(10);
        arvore.insere(item);
        assertEquals(item, arvore.pesquisa(item));
    }
    
    @Test
    public void testRetiraItem() {
        Item item = new MeuItem(10);
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }
    
    @Test
    public void testRetiraItemInexistent() {
        Item item = new MeuItem(10);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }
    
    @Test
    public void testRetiraRoot() {
        Item item = new MeuItem(10);
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }
    
    @Test
    public void testRetiraMultipleItems() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.retira(item2);
        assertNull(arvore.pesquisa(item2));
    }
    
    @Test
    public void testRetiraItemWithChildren() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));
    }
    
    @Test
    public void testRetiraItemWithChildrenAndSuccessor() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        Item item4 = new MeuItem(25);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.insere(item4);
        arvore.retira(item2);
        assertNull(arvore.pesquisa(item2));
    }
    
    @Test
    public void testRetiraItemWithChildrenAndAntecessor() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        Item item4 = new MeuItem(15);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.insere(item4);
        arvore.retira(item2);
        assertNull(arvore.pesquisa(item2));
    }
    
    @Test
    public void testRetiraItemWithChildrenAndAntecessorAndSuccessor() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        Item item4 = new MeuItem(15);
        Item item5 = new MeuItem(25);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.insere(item4);
        arvore.insere(item5);
        arvore.retira(item2);
        assertNull(arvore.pesquisa(item2));
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
    
    @Test
    public void testPermutMethod() {
        int tam = 20, n =20;
        MeuItem v[] = new MeuItem[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = new MeuItem (i);
        PermutacaoRandomica.permut(v, n);
    }
    
    @Test
    public void testPermutIntArrayMethod() {
        int tam = 20, n =20;
        int v[] = new int[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = i;
        PermutacaoRandomica.permut(v, n);
    }
    
    @Test
    public void testPermutCharArrayMethod() {
        int tam = 20, n =20;
        char v[] = new char[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = (char)('a' + i);
        PermutacaoRandomica.permut(v, n);
    }
}