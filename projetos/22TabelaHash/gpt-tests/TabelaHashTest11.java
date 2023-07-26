package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaHashTest11{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            assertNotNull(tabelaHash);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method geraPesos
    @Test(timeout=1000)
    public void testGeraPesos() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            int[] pesos = tabelaHash.geraPesos(5);
            assertNotNull(pesos);
            assertEquals(5, pesos.length);
            for (int peso : pesos) {
                assertTrue(peso >= 1);
            }
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method h
    @Test(timeout=1000)
    public void testH() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            int[] pesos = tabelaHash.geraPesos(3);
            int hash1 = tabelaHash.h("abc", pesos);
            int hash2 = tabelaHash.h("cba", pesos);
            assertEquals(hash1, hash2);
            
            int[] newPesos = tabelaHash.geraPesos(4);
            int newHash = tabelaHash.h("abcd", newPesos);
            assertNotEquals(hash1, newHash);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method pesquisa
    @Test(timeout=1000)
    public void testPesquisa() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            Object item = tabelaHash.pesquisa("abc");
            assertNull(item);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method insere
    @Test(timeout=1000)
    public void testInsere() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            tabelaHash.insere("abc", new Object());
            Object item = tabelaHash.pesquisa("abc");
            assertNotNull(item);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method retira
    @Test(timeout=1000)
    public void testRetira() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            tabelaHash.insere("abc", new Object());
            tabelaHash.retira("abc");
            Object item = tabelaHash.pesquisa("abc");
            assertNull(item);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method imprime
    @Test(timeout=1000)
    public void testImprime() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            tabelaHash.insere("abc", new Object());
            tabelaHash.insere("def" ,new Object());
            tabelaHash.insere("ghi", new Object());
            tabelaHash.imprime();
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
}