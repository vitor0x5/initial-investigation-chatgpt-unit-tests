package ds;import static org.junit.Assert.*;

import org.junit.Test;

public class AgmPrimTest5{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        AgmPrim agmPrim = new AgmPrim(null);
    }

    @Test(timeout=1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 2);
        grafo.insereAresta(2, 3, 6);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
    }

    @Test(timeout=1000)
    public void testAntecessor() {
        AgmPrim agmPrim = new AgmPrim(null);
        agmPrim.antecessor(0);
    }

    @Test(timeout=1000)
    public void testPeso() {
        AgmPrim agmPrim = new AgmPrim(null);
        agmPrim.peso(0);
    }

    @Test(timeout=1000)
    public void testImprime() {
        AgmPrim agmPrim = new AgmPrim(null);
        agmPrim.imprime();
    }

}