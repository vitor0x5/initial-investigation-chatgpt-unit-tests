package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class GrafoTest11{


    // Test for the default constructor
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception{
        Grafo grafo = new Grafo(0);
        assertNotNull(grafo);
    }
    
    // Test for the insereAresta method
    @Test(timeout = 1000)
    public void testInsereAresta() throws Exception{
        Grafo grafo = new Grafo(3);
        
        // Test for inserting an edge between existing vertices
        grafo.insereAresta(0, 1, 1);
        assertTrue(grafo.existeAresta(0, 1));
        
        // Test for inserting an edge with a negative weight
        grafo.insereAresta(1, 2, -2);
        assertTrue(grafo.existeAresta(1, 2));
        
        // Test for inserting an edge between non-existing vertices
        grafo.insereAresta(3, 4, 5);
        assertFalse(grafo.existeAresta(3, 4));
    }
    
    // Test for the existeAresta method
    @Test(timeout = 1000)
    public void testExisteAresta() throws Exception{
        Grafo grafo = new Grafo(3);
        
        // Test for existing edge
        grafo.insereAresta(0, 1, 1);
        assertTrue(grafo.existeAresta(0, 1));
        
        // Test for non-existing edge
        assertFalse(grafo.existeAresta(1, 2));
    }
    
    // Test for the listaAdjVazia method
    @Test(timeout = 1000)
    public void testListaAdjVazia() throws Exception{
        Grafo grafo = new Grafo(3);
        
        // Test for empty adjacency list
        assertTrue(grafo.listaAdjVazia(0));
        
        // Test for non-empty adjacency list
        grafo.insereAresta(0, 1, 1);
        assertFalse(grafo.listaAdjVazia(0));
    }
    
    // Test for the primeiroListaAdj method
    @Test(timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception{
        Grafo grafo = new Grafo(3);
        
        // Test for empty adjacency list
        assertNull(grafo.primeiroListaAdj(0));
        
        // Test for non-empty adjacency list
        grafo.insereAresta(0, 1, 1);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(1, aresta.peso());
    }
    
    // Test for the proxAdj method
    @Test(timeout = 1000)
    public void testProxAdj() throws Exception{
        Grafo grafo = new Grafo(3);
        
        // Test for empty adjacency list
        assertNull(grafo.proxAdj(0));
        
        // Test for non-empty adjacency list
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Grafo.Aresta aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(2, aresta.peso());
    }
    
    // Test for the retiraAresta method
    @Test(timeout = 1000)
    public void testRetiraAresta() throws Exception{
        Grafo grafo = new Grafo(3);
        
        // Test for removing an existing edge
        grafo.insereAresta(0, 1, 1);
        assertNotNull(grafo.retiraAresta(0, 1));
        assertFalse(grafo.existeAresta(0, 1));
        
        // Test for removing a non-existing edge
        assertNull(grafo.retiraAresta(0, 1));
    }
    
    // Test for the imprime method
    @Test(timeout = 1000)
    public void testImprime() throws Exception{
        Grafo grafo = new Grafo(3);

        // Output is printed to the console so no assert statement can be made
        grafo.imprime();
    }
    
    // Test for the numVertices method
    @Test(timeout = 1000)
    public void testNumVertices() throws Exception{
        Grafo grafo = new Grafo(3);
        assertEquals(3, grafo.numVertices());
    }
    
    // Test for the grafoTransposto method
    @Test(timeout = 1000)
    public void testGrafoTransposto() throws Exception{
        Grafo grafo = new Grafo(3);
        
        // Test for an empty graph
        Grafo grafoT = grafo.grafoTransposto();
        assertNotNull(grafoT);
        assertEquals(0, grafoT.numVertices());
        
        // Test for a non-empty graph
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(1, 2, 2);
        grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
    }
}