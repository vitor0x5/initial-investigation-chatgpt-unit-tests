package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaTest15{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Tabela tabela = new Tabela();
        assertNotNull(tabela);
    }
    
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        Item reg2 = new MeuItem(20);
        tabela.registros[1] = reg1;
        tabela.registros[2] = reg2;
        
        int result = tabela.pesquisa(reg1);
        
        assertEquals(1, result);
    }
    
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        Item reg2 = new MeuItem(20);
        
        tabela.insere(reg1);
        tabela.insere(reg2);
        
        assertEquals(2, tabela.n);
        assertEquals(reg1, tabela.registros[1]);
        assertEquals(reg2, tabela.registros[2]);
    }
    
    @Test(timeout=1000)
    public void testBinaria() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(10);
        Item reg2 = new MeuItem(20);
        tabela.registros[1] = reg1;
        tabela.registros[2] = reg2;
        
        int result = tabela.binaria(reg1);
        
        assertEquals(1, result);
    }
}