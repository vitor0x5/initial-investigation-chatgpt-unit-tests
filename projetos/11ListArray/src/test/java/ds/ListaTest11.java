package ds;import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class ListaTest11{

    
    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Lista lista = new Lista();
        assertNotNull(lista);
    }
    
    // Test for insere method
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere(10);
        assertEquals(1, lista.ultimo);
        assertEquals(10, lista.item[0]);
    }
    
    // Test for vazia method when the list is empty
    @Test(timeout=1000)
    public void testVaziaWhenEmpty() {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
    }
    
    // Test for vazia method when the list is not empty
    @Test(timeout=1000)
    public void testVaziaWhenNotEmpty() throws Exception {
        Lista lista = new Lista();
        lista.insere(10);
        assertFalse(lista.vazia());
    }
    
    // Test for imprime method when the list is empty
    @Test(timeout=1000)
    public void testImprimeWhenEmpty() {
        Lista lista = new Lista();
        lista.imprime();
        // Since the list is empty, nothing should be printed
        // This test will pass even if imprime method does not throw an exception
    }
    
    // Test for imprime method when the list is not empty
    @Test(timeout=1000)
    public void testImprimeWhenNotEmpty() throws Exception {
        Lista lista = new Lista();
        lista.insere(10);
        lista.insere(20);
        // Since imprime method prints the items in the list,
        // we can check the output by redirecting System.out to a ByteArrayOutputStream
        // and comparing it to the expected output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        lista.imprime();
        
        assertEquals("10\n20\n", output.toString());
    }
}