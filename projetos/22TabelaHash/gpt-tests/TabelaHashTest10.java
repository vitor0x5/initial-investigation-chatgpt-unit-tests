package ds;import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import ds.TabelaHash;
import ds.Item;

public class TabelaHashTest10{


    @Rule
    public Timeout globalTimeout = new Timeout(1000);

    TabelaHash tabelaHash;

    @Before
    public void setUp() {
        tabelaHash = new TabelaHash();
    }

    // Test the default constructor
    @Test
    public void testDefaultConstructor() {
        assertNotNull(tabelaHash);
    }

    // Test geraPesos method
    @Test
    public void testGeraPesos() {
        int[] pesos = tabelaHash.geraPesos(5);
        assertNotNull(pesos);
        assertEquals(5, pesos.length);   
    }

    // Test h method
    @Test
    public void testH() {
        int[] pesos = new int[]{1, 2, 3, 4, 5, 6, 7};
        int result = tabelaHash.h("abcdefg", pesos);
        assertEquals(28, result);
    }

    // Test pesquisa method when tabela[i] is empty
    @Test
    public void testPesquisaEmptyTabela() {
        String chave = "key";
        Object result = tabelaHash.pesquisa(chave);
        assertNull(result);
    }

    // Test insere and pesquisa method
    @Test
    public void testInsereAndPesquisa() {
        String chave = "key";
        Object item = new MeuItem(1);
        tabelaHash.insere(chave, item);
        Object result = tabelaHash.pesquisa(chave);
        assertNotNull(result);
        assertEquals(item, result);
    }

    // Test insere method when the key already exists
    @Test
    public void testInsereExistingKey() {
        String chave = "key";
        Object item = new MeuItem(1);
        tabelaHash.insere(chave, item);
        tabelaHash.insere(chave, item);
        assertEquals(1, tabelaHash.tamanho());
    }

    // Test retira method when the key does not exist
    @Test
    public void testRetiraInvalidKey() {
        String chave = "key";
        try {
            tabelaHash.retira(chave);
        } catch (Exception e) {
            assertEquals("Registro nao esta presente", e.getMessage());
        }
    }
}