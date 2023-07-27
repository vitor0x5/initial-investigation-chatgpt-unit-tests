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

    // Test retira method when the key does not exist
    @Test
    public void testRetiraInvalidKey() {
        String chave = "key";
        try {
            tabelaHash.retira(chave);
        } catch (Exception e) {
            assertEquals("Erro: Lista vazia ou chave invalida", e.getMessage());
        }
    }
}