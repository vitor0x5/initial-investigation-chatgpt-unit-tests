package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMaxTest6{


	@Test(timeout=1000)
	public void testDefaultConstructor() throws Exception {
		FPHeapMax heap = new FPHeapMax(10);
		
		assertNotNull(heap);
	}
	
	@Test(timeout=1000)
	public void testRefaz() throws Exception {
		FPHeapMax heap = new FPHeapMax(10);
		heap.copia(new Item[11]);
		
		heap.refaz(2, 5);
		// Add assertions here
		
		heap.refaz(1, 7);
		// Add assertions here
	}

	@Test(timeout=1000)
	public void testConstroi() throws Exception {
		FPHeapMax heap = new FPHeapMax(10);
		heap.copia(new Item[11]);
		
		heap.constroi();
		// Add assertions here
	}

	@Test(timeout=1000)
	public void testMax() throws Exception {
		FPHeapMax heap = new FPHeapMax(10);
		heap.copia(new Item[11]);
		
		Item max = heap.max();
		// Add assertions here
	}

	@Test(timeout=1000)
	public void testRetiraMax() throws Exception {
		FPHeapMax heap = new FPHeapMax(10);
		heap.copia(new Item[11]);
		
		Item max = heap.retiraMax();
		// Add assertions here
	}

	@Test(timeout=1000)
	public void testAumentaChave() throws Exception {
		FPHeapMax heap = new FPHeapMax(10);
		heap.copia(new Item[11]);
		
		heap.aumentaChave(2, 10);
		// Add assertions here
		
		heap.aumentaChave(5, -5);
		// Add assertions here
	}

	@Test(timeout=1000)
	public void testInsere() throws Exception {
		FPHeapMax heap = new FPHeapMax(10);
		heap.copia(new Item[11]);
		
		Item item = new MeuItem(15);
		// Add assertions here
		
		item = new MeuItem(-3);
		// Add assertions here
	}

	@Test(timeout=1000)
	public void testImprime() throws Exception {
		FPHeapMax heap = new FPHeapMax(10);
		heap.copia(new Item[11]);
		
		heap.imprime();
		// Add assertions here
	}

}