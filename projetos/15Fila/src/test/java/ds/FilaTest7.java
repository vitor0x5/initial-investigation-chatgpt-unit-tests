package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FilaTest7{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Fila fila = new Fila();
        assertNotNull(fila);
    }
    
    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        
        fila.enfileira("A");
        fila.enfileira("B");
        
        assertEquals("A", fila.item[0]);
        assertEquals("B", fila.item[1]);
    }
    
    @Test(timeout=1000)
    public void testEnfileira_Exception() {
        Fila fila = new Fila();
        
        try {
            for (int i = 0; i < 1000; i++) {
                fila.enfileira(i);
            }
            
            fila.enfileira(1000); // This should throw an exception
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta cheia", e.getMessage());
        }
    }
    
    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        
        fila.enfileira("A");
        fila.enfileira("B");
        
        Object item = fila.desenfileira();
        
        assertEquals("A", item);
        assertEquals("B", fila.item[1]);
    }
    
    @Test(timeout=1000)
    public void testDesenfileira_Exception() {
        Fila fila = new Fila();
        
        try {
            fila.desenfileira(); // This should throw an exception
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
        }
    }
    
    @Test(timeout=1000)
    public void testVazia_True() {
        Fila fila = new Fila();
        
        assertTrue(fila.vazia());
    }
    
    @Test(timeout=1000)
    public void testVazia_False() throws Exception {
        Fila fila = new Fila();
        
        fila.enfileira("A");
        
        assertFalse(fila.vazia());
    }
}