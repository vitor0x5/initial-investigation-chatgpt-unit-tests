package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;
import java.io.*;

public class ArvoreBinariaTest1{

  
  @Test
  public void testPesquisa() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    MeuItem chave1 = new MeuItem(1);
    MeuItem chave2 = new MeuItem(2);
    arvore.insere(chave1);
    arvore.insere(chave2);
    assertEquals(chave1, arvore.pesquisa(chave1));
    assertEquals(chave2, arvore.pesquisa(chave2));
  }
  
  @Test
  public void testInsere() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    MeuItem chave1 = new MeuItem(1);
    MeuItem chave2 = new MeuItem(2);
    arvore.insere(chave1);
    arvore.insere(chave2);
    assertNotNull(arvore.pesquisa(chave1));
    assertNotNull(arvore.pesquisa(chave2));
  }
  
  @Test
  public void testRetira() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    MeuItem chave1 = new MeuItem(1);
    MeuItem chave2 = new MeuItem(2);
    arvore.insere(chave1);
    arvore.insere(chave2);
    arvore.retira(chave1);
    arvore.retira(chave2);
    assertNull(arvore.pesquisa(chave1));
    assertNull(arvore.pesquisa(chave2));
  }
  
  @Test
  public void testTesta() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    MeuItem chave1 = new MeuItem(1);
    MeuItem chave2 = new MeuItem(2);
    arvore.insere(chave1);
    arvore.insere(chave2);
    arvore.testa();
  }
  
  @Test
  public void testMain() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    int max = 10;
    MeuItem x;
    int vetor[] = new int[max];
    for (int i = 0; i < max; i++)
      vetor[i] = i;
    PermutacaoRandomica.permut(vetor, max);
    for (int i = 0; i < max; i++) { 
      x = new MeuItem(vetor[i]);
      arvore.insere(x);
      arvore.testa();
    }
    for (int i = 0; i < max; i++) {
      Random rand = new Random();
      int k =  rand.nextInt(10);
      int n = vetor[k];
      x = new MeuItem(n);
      arvore.retira(x);
      arvore.testa();
      for (int j = 0; j < max; j++) { 
        x = new MeuItem(rand.nextInt(10));
        if (x.compara(new MeuItem(n)) != 0 ) { 
          assertNotNull(arvore.pesquisa(x));
        }
      }
      x = new MeuItem(n);
      arvore.insere(x);
      arvore.testa();
    }
    for (int i = 0; i < max; i++) { 
      x = new MeuItem(vetor[i]);
      arvore.retira(x);
      arvore.testa();
    }
  }
}