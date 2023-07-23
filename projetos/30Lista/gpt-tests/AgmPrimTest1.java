package ds;import org.junit.Test;

import static org.junit.Assert.*;

public class AgmPrimTest1{


    @Test
    public void obterAgm() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 3, 5);
        grafo.insereAresta(1, 2, 4);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(1, 4, 6);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 2);

        AgmPrim agmPrim = new AgmPrim(grafo);

        agmPrim.obterAgm(0);

        assertEquals(0, agmPrim.antecessor(0));
        assertEquals(1, agmPrim.antecessor(1));
        assertEquals(1, agmPrim.antecessor(2));
        assertEquals(0, agmPrim.antecessor(3));
        assertEquals(2, agmPrim.antecessor(4));
    }

    @Test
    public void peso() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 3, 5);
        grafo.insereAresta(1, 2, 4);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(1, 4, 6);
        grafo.insereAresta(2, 4, 1);
        grafo.insereAresta(3, 4, 2);

        AgmPrim agmPrim = new AgmPrim(grafo);

        agmPrim.obterAgm(0);

        assertEquals(0, agmPrim.peso(0), 0.001);
        assertEquals(2, agmPrim.peso(1), 0.001);
        assertEquals(4, agmPrim.peso(2), 0.001);
        assertEquals(5, agmPrim.peso(3), 0.001);
        assertEquals(1, agmPrim.peso(4), 0.001);
    }
}