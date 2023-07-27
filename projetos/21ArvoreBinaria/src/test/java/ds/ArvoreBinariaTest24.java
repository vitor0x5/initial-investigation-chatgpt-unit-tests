package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;
import ds.*;

public class ArvoreBinariaTest24{

  
  private ArvoreBinaria arvore;
  
  @Before
  public void setUp() throws Exception {
    arvore = new ArvoreBinaria();
  }
  
  @After
  public void tearDown() throws Exception {
    arvore = null;
  }
  
  @Test(timeout=1000)
  public void testDefaultConstructor() {
    assertNotNull(arvore);
  }
  
  @Test(timeout=1000)
  public void testPesquisa() {
    Item item1 = new MeuItem(10);
    Item item2 = new MeuItem(20);
    Item item3 = new MeuItem(30);
    
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    
    Item result = arvore.pesquisa(item2);
    
    assertEquals(item2, result);
  }
  
  @Test(timeout=1000)
  public void testInsere() {
    Item item1 = new MeuItem(10);
    Item item2 = new MeuItem(20);
    Item item3 = new MeuItem(30);
    
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    
    Item result = arvore.pesquisa(item2);
    
    assertEquals(item2, result);
  }
  
  @Test(timeout=1000)
  public void testRetira() {
    Item item1 = new MeuItem(10);
    Item item2 = new MeuItem(20);
    Item item3 = new MeuItem(30);
    
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    
    arvore.retira(item2);
    
    Item result = arvore.pesquisa(item2);
    
    assertNull(result);
  }
  
  @Test(timeout=1000)
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