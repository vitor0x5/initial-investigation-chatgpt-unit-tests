package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest17{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fila fila = new Fila();
        assertNotNull(fila);
    }
    
    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        assertEquals(1, fila.item[fila.frente]);
    }
    
    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertEquals(1, fila.desenfileira());
    }
    
    @Test(timeout=1000)
    public void testVazia() throws Exception {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }
    
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.imprime();
    }
}