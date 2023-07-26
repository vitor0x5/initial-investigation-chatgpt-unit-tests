package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class AgmPrimTest4{


    @Test
    public void testDefaultConstructor() {
        try {
            AgmPrim agmPrim = new AgmPrim(null);
            assertNotNull(agmPrim);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testObterAgm() {
        try {
            int[][] edges = {{0, 1, 5}, {0, 3, 1}, {1, 2, 3}, {1, 3, 2}, {2, 3, 4}};
            Grafo grafo = createGraph(edges);
            AgmPrim agmPrim = new AgmPrim(grafo);
            agmPrim.obterAgm(0);
            assertTrue(agmPrim.antecessor(0) == -1);
            assertTrue(agmPrim.antecessor(1) == 3);
            assertTrue(agmPrim.antecessor(2) == 1);
            assertTrue(agmPrim.antecessor(3) == 0);
            assertTrue(agmPrim.peso(1) == 5);
            assertTrue(agmPrim.peso(2) == 3);
            assertTrue(agmPrim.peso(3) == 1);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    private Grafo createGraph(int[][] edges) {
        int numVertices = Arrays.stream(edges).mapToInt(e -> Math.max(e[0], e[1])).max().getAsInt() + 1;
        Grafo grafo = new Grafo(numVertices);
        for (int[] edge : edges) {
            int v1 = edge[0];
            int v2 = edge[1];
            int peso = edge[2];
            grafo.insereAresta(v1, v2, peso);
            grafo.insereAresta(v2, v1, peso);
        }
        return grafo;
    }

}