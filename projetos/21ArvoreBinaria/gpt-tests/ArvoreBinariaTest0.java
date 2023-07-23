package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class ArvoreBinariaTest0{


  @Test
  public void testPesquisa() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    assertNull(arvore.pesquisa(new MeuItem(5)));
    
    arvore.insere(new MeuItem(5));
    assertNotNull(arvore.pesquisa(new MeuItem(5)));
  }

  @Test
  public void testInsere() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    arvore.insere(new MeuItem(3));
    arvore.insere(new MeuItem(5));
    arvore.insere(new MeuItem(2));
    arvore.insere(new MeuItem(4));
    
    assertNotNull(arvore.pesquisa(new MeuItem(3)));
    assertNotNull(arvore.pesquisa(new MeuItem(5)));
    assertNotNull(arvore.pesquisa(new MeuItem(2)));
    assertNotNull(arvore.pesquisa(new MeuItem(4)));
  }

  @Test
  public void testRetira() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    arvore.insere(new MeuItem(3));
    arvore.insere(new MeuItem(5));
    arvore.insere(new MeuItem(2));
    arvore.insere(new MeuItem(4));
    
    arvore.retira(new MeuItem(3));
    assertNull(arvore.pesquisa(new MeuItem(3)));
    
    arvore.retira(new MeuItem(5));
    assertNull(arvore.pesquisa(new MeuItem(5)));
    
    arvore.retira(new MeuItem(2));
    assertNull(arvore.pesquisa(new MeuItem(2)));
    
    arvore.retira(new MeuItem(4));
    assertNull(arvore.pesquisa(new MeuItem(4)));
  }
  
  @Test
  public void testa() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    arvore.insere(new MeuItem(3));
    arvore.insere(new MeuItem(5));
    arvore.insere(new MeuItem(2));
    arvore.insere(new MeuItem(4));
    
    arvore.testa();
  }
}