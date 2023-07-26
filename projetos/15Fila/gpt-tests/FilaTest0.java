package ds;import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import ds.Fila;

public class FilaTest0{

    
    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Fila fila = new Fila();
        assertNotNull(fila);
    }
    
    // Test for enfileira method with valid input
    @Test(timeout=1000)
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        
        assertEquals("Item 1", fila.item[fila.frente]);
        assertEquals(1, fila.tras);
    }
    
    // Test for enfileira method when the queue is full
    @Test(timeout=1000, expected=Exception.class)
    public void testEnfileiraFullQueue() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        // Fill the queue to its maximum size
        
        fila.enfileira("Item 3"); // Throws an exception
    }
    
    // Test for desenfileira method with valid input
    @Test(timeout=1000)
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        
        Object item = fila.desenfileira();
        
        assertEquals("Item 1", item);
        assertEquals("Item 2", fila.item[fila.frente]);
        assertEquals(2, fila.frente);
    }
    
    // Test for desenfileira method when the queue is empty
    @Test(timeout=1000, expected=Exception.class)
    public void testDesenfileiraEmptyQueue() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira(); // Throws an exception
    }
    
    // Test for vazia method when the queue is empty
    @Test(timeout=1000)
    public void testVaziaEmptyQueue() {
        Fila fila = new Fila();
        
        assertTrue(fila.vazia());
    }
    
    // Test for vazia method when the queue is not empty
    @Test(timeout=1000)
    public void testVaziaNonEmptyQueue() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        
        assertFalse(fila.vazia());
    }
    
    // Test for imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Fila fila = new Fila();
        fila.enfileira("Item 1");
        fila.enfileira("Item 2");
        
        // Redirect the output stream to capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        fila.imprime();
        
        String expectedOutput = "Item 1\nItem 2\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}