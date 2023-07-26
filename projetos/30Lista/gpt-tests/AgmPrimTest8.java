package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest8{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        AgmPrim agmPrim = new AgmPrim();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(2, 3, 4);
        grafo.insereAresta(3, 4, 5);
        grafo.insereAresta(4, 0, 6);

        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testAntecessor() throws Exception {
        AgmPrim agmPrim = new AgmPrim();
        agmPrim.antecessor(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPeso() throws Exception {
        AgmPrim agmPrim = new AgmPrim();
        agmPrim.peso(0);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        AgmPrim agmPrim = new AgmPrim();
        agmPrim.imprime();
    }
 
}