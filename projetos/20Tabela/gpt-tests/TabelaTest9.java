package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaTest9{

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
        assertEquals(0, tabela.n);
    }

    @Test(timeout=1000)
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(2);
        tabela.n = 2;

        assertEquals(1, tabela.pesquisa(new MeuItem(1)));
        assertEquals(2, tabela.pesquisa(new MeuItem(2)));
        assertEquals(0, tabela.pesquisa(new MeuItem(3)));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(1);
        tabela.n = 1;

        tabela.insere(new MeuItem(2));

        assertEquals(2, tabela.registros[2].recuperaChave());
        assertEquals(2, tabela.n);
    }

    @Test(timeout=1000)
    public void testInsereException() throws Exception {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(1);
        tabela.n = 10;

        boolean exceptionThrown = false;
        try {
            tabela.insere(new MeuItem(2));
        } catch (Exception e) {
            exceptionThrown = true;
            assertEquals("Erro: A tabela esta cheia", e.getMessage());
        }

        assertTrue(exceptionThrown);
        assertEquals(10, tabela.n);
    }

    @Test(timeout=1000)
    public void testBinaria() {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(2);
        tabela.n = 2;

        assertEquals(1, tabela.binaria(new MeuItem(1)));
        assertEquals(2, tabela.binaria(new MeuItem(2)));
        assertEquals(0, tabela.binaria(new MeuItem(3)));
    }
}