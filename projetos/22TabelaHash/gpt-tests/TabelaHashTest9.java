package ds;import org.junit.Test;
import org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest9{


    // Define test cases for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    // Define test cases for the method pesquisa()
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 10);
      
        assertEquals(10, tabela.pesquisa("abc"));
        assertNull(tabela.pesquisa("def"));
    }

    // Define test cases for the method insere()
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 10);

        assertEquals(10, tabela.pesquisa("abc"));
    }

    // Define test cases for the method retira()
    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 10);

        tabela.retira("abc");
        assertNull(tabela.pesquisa("abc"));
    }

    // Define test cases for the method imprime()
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("abc", 10);
        tabela.insere("def", 20);
        tabela.insere("ghi", 30);

        tabela.imprime();
        // TODO: Add assertion for output
    }

    // Define test cases for the exceptions thrown by the methods
    // ...

}