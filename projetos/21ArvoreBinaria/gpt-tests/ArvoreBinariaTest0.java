package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class ArvoreBinariaTest0{

  
  @Test(expected = NullPointerException.class, timeout = 1000)
  public void testDefaultConstructor() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    assertNotNull(arvore);
  }
  
  @Test(expected = NullPointerException.class, timeout = 1000)
  public void testPesquisa() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item = new MeuItem(10);
    arvore.insere(item);
    assertNotNull(arvore.pesquisa(item));
  }
  
  @Test(expected = NullPointerException.class, timeout = 1000)
  public void testInsere() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item = new MeuItem(10);
    arvore.insere(item);
    assertNotNull(arvore.pesquisa(item));
  }
  
  @Test(expected = NullPointerException.class, timeout = 1000)
  public void testRetira() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item = new MeuItem(10);
    arvore.insere(item);
    arvore.retira(item);
    assertNull(arvore.pesquisa(item));
  }
}