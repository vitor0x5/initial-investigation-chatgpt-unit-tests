package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaTest19{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
        assertEquals(0, tabela.n);
    }
    
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);
        tabela.registros[1] = reg1;
        tabela.registros[2] = reg2;
        tabela.registros[3] = reg3;
        
        assertEquals(0, tabela.pesquisa(reg1));
        assertEquals(0, tabela.pesquisa(reg2));
        assertEquals(0, tabela.pesquisa(reg3));
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);
        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);
        
        assertEquals(1, tabela.registros[1].recuperaChave());
        assertEquals(2, tabela.registros[2].recuperaChave());
        assertEquals(3, tabela.registros[3].recuperaChave());
        assertEquals(3, tabela.n);
    }
}