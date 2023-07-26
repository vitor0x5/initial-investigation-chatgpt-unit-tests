package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;
import ds.*;

public class ArvoreBinariaTest15{


  private ArvoreBinaria arvore;

  @Before
  public void setUp() {
    arvore = new ArvoreBinaria();
  }

  @After
  public void tearDown() {
    arvore = null;
  }

  @Test(expected = NullPointerException.class, timeout = 1000)
  public void testDefaultConstructor() {
    assertNotNull(arvore);
  }

  @Test(timeout = 1000)
  public void testInsere() {
    Item item1 = new MeuItem(10);
    Item item2 = new MeuItem(5);
    Item item3 = new MeuItem(15);

    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);

    assertNotNull(arvore.pesquisa(item1));
    assertNotNull(arvore.pesquisa(item2));
    assertNotNull(arvore.pesquisa(item3));
  }

  @Test(timeout = 1000)
  public void testRetira() {
    Item item1 = new MeuItem(10);
    Item item2 = new MeuItem(5);
    Item item3 = new MeuItem(15);

    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);

    arvore.retira(item1);

    assertNull(arvore.pesquisa(item1));
    assertNotNull(arvore.pesquisa(item2));
    assertNotNull(arvore.pesquisa(item3));
  }

  @Test(timeout = 1000)
  public void testPesquisa() {
    Item item1 = new MeuItem(10);
    Item item2 = new MeuItem(5);
    Item item3 = new MeuItem(15);

    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);

    assertNotNull(arvore.pesquisa(item1));
    assertNotNull(arvore.pesquisa(item2));
    assertNotNull(arvore.pesquisa(item3));
  }

  @Test(timeout = 1000)
  public void testCentral() {
    Item item1 = new MeuItem(10);
    Item item2 = new MeuItem(5);
    Item item3 = new MeuItem(15);

    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    arvore.central(arvore.raiz);

    String expectedOutput = "5\n10\n15\n";
    assertEquals(expectedOutput, outContent.toString());
  }

  @Test(timeout = 1000)
  public void testAntecessor() {
    ArvoreBinaria.No no1 = new ArvoreBinaria.No();
    ArvoreBinaria.No no2 = new ArvoreBinaria.No();
    ArvoreBinaria.No no3 = new ArvoreBinaria.No();

    Item item1 = new MeuItem(10);
    Item item2 = new MeuItem(5);
    Item item3 = new MeuItem(15);

    no1.reg = item1;
    no2.reg = item2;
    no3.reg = item3;

    no1.esq = no2;
    no1.dir = no3;

    ArvoreBinaria.No result = arvore.antecessor(no1, no2);

    assertNull(result);
    assertEquals(item2, no1.reg);
    assertEquals(item1, no2.reg);
  }

  @Test(timeout = 1000)
  public void testRetiraNull() {
    Item item1 = new MeuItem(10);

    arvore.retira(item1);

    assertNull(arvore.pesquisa(item1));
  }
}