package ds;import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ds.Grafo.Aresta;
import ds.Lista;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class GrafoTest7{


    private Grafo grafo;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { new Grafo() }
        };
        return Arrays.asList(data);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Grafo g = new Grafo();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsereAresta() throws Exception {
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(2, 1, 3);
        grafo.insereAresta(2, 3, 2);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testExisteAresta() throws Exception {
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(2, 1, 3);
        grafo.insereAresta(2, 3, 2);

        assertTrue(grafo.existeAresta(1, 2));
        assertTrue(grafo.existeAresta(2, 1));
        assertTrue(grafo.existeAresta(2, 3));
        assertFalse(grafo.existeAresta(1, 3));
        assertFalse(grafo.existeAresta(3, 1));
        assertFalse(grafo.existeAresta(1, 1));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testListaAdjVazia() throws Exception {
        assertTrue(grafo.listaAdjVazia(1));

        grafo.insereAresta(1, 2, 5);
        assertFalse(grafo.listaAdjVazia(1));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPrimeiroListaAdj() throws Exception {
        grafo.insereAresta(1, 2, 5);
        Aresta primeiraAresta = grafo.primeiroListaAdj(1);
        assertEquals(1, primeiraAresta.v1());
        assertEquals(2, primeiraAresta.v2());
        assertEquals(5, primeiraAresta.peso());

        grafo.insereAresta(2, 1, 3);
        primeiraAresta = grafo.primeiroListaAdj(2);
        assertEquals(2, primeiraAresta.v1());
        assertEquals(1, primeiraAresta.v2());
        assertEquals(3, primeiraAresta.peso());

        grafo.insereAresta(2, 3, 2);
        primeiraAresta = grafo.primeiroListaAdj(2);
        assertEquals(2, primeiraAresta.v1());
        assertEquals(1, primeiraAresta.v2());
        assertEquals(3, primeiraAresta.peso());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testProxAdj() throws Exception {
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 1);
        Aresta primeiraAresta = grafo.primeiroListaAdj(1);
        Aresta proximaAresta = grafo.proxAdj(1);
        assertEquals(1, proximaAresta.v1());
        assertEquals(3, proximaAresta.v2());
        assertEquals(1, proximaAresta.peso());

        grafo.insereAresta(1, 4, 2);
        proximaAresta = grafo.proxAdj(1);
        assertEquals(1, proximaAresta.v1());
        assertEquals(3, proximaAresta.v2());
        assertEquals(1, proximaAresta.peso());

        grafo.insereAresta(1, 5, 3);
        proximaAresta = grafo.proxAdj(1);
        assertEquals(1, proximaAresta.v1());
        assertEquals(3, proximaAresta.v2());
        assertEquals(1, proximaAresta.peso());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraAresta() throws Exception {
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(1, 4, 2);
        grafo.insereAresta(2, 1, 3);

        Aresta arestaRetirada = grafo.retiraAresta(1, 2);
        assertEquals(1, arestaRetirada.v1());
        assertEquals(2, arestaRetirada.v2());
        assertEquals(5, arestaRetirada.peso());

        arestaRetirada = grafo.retiraAresta(1, 3);
        assertEquals(1, arestaRetirada.v1());
        assertEquals(3, arestaRetirada.v2());
        assertEquals(1, arestaRetirada.peso());

        arestaRetirada = grafo.retiraAresta(1, 4);
        assertEquals(1, arestaRetirada.v1());
        assertEquals(4, arestaRetirada.v2());
        assertEquals(2, arestaRetirada.peso());

        arestaRetirada = grafo.retiraAresta(2, 1);
        assertNull(arestaRetirada);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 1, 3);
        grafo.insereAresta(2, 3, 2);

        grafo.imprime();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testNumVertices() throws Exception {
        assertEquals(100, grafo.numVertices());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testGrafoTransposto() throws Exception {
        grafo.insereAresta(1, 2, 5);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 1, 3);
        grafo.insereAresta(2, 3, 2);

        Grafo grafoTransposto = grafo.grafoTransposto();
        assertNotNull(grafoTransposto);
    }
}