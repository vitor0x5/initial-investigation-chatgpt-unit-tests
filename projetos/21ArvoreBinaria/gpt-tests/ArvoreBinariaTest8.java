package ds;import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class ArvoreBinariaTest8{


  @Test(expected = NullPointerException.class, timeout = 1000)
  public void testDefaultConstructor() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    assertNotNull(arvore);
  }

  @Test(timeout = 1000)
  public void testInsere() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    arvore.insere(new MeuItem(10));
    arvore.insere(new MeuItem(5));
    arvore.insere(new MeuItem(15));
    arvore.insere(new MeuItem(3));
    arvore.insere(new MeuItem(7));
    arvore.insere(new MeuItem(13));
    arvore.insere(new MeuItem(17));
  }

  @Test(expected = NullPointerException.class, timeout = 1000)
  public void testPesquisa() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    arvore.insere(new MeuItem(10));
    arvore.insere(new MeuItem(5));
    arvore.insere(new MeuItem(15));
    arvore.insere(new MeuItem(3));
    arvore.insere(new MeuItem(7));
    arvore.insere(new MeuItem(13));
    arvore.insere(new MeuItem(17));

    assertNotNull(arvore.pesquisa(new MeuItem(10)));
    assertNull(arvore.pesquisa(new MeuItem(20)));
  }

  @Test(expected = NullPointerException.class, timeout = 1000)
  public void testRetira() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    arvore.insere(new MeuItem(10));
    arvore.insere(new MeuItem(5));
    arvore.insere(new MeuItem(15));
    arvore.insere(new MeuItem(3));
    arvore.insere(new MeuItem(7));
    arvore.insere(new MeuItem(13));
    arvore.insere(new MeuItem(17));

    arvore.retira(new MeuItem(3));
    assertNull(arvore.pesquisa(new MeuItem(3)));

    arvore.retira(new MeuItem(7));
    assertNull(arvore.pesquisa(new MeuItem(7)));

    arvore.retira(new MeuItem(15));
    assertNull(arvore.pesquisa(new MeuItem(15)));
  }

  @Test(expected = NullPointerException.class, timeout = 1000)
  public void testTesta() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    arvore.insere(new MeuItem(10));
    arvore.insere(new MeuItem(5));
    arvore.insere(new MeuItem(15));
    arvore.insere(new MeuItem(3));
    arvore.insere(new MeuItem(7));
    arvore.insere(new MeuItem(13));
    arvore.insere(new MeuItem(17));

    arvore.testa();
  }
}