package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest0{

  
  @Test
  public void testMax() {
    // Test case 1: Empty array
    Item[] v1 = new Item[0];
    assertNull(Max.max(v1, 0));

    // Test case 2: Array with one item
    Item[] v2 = { new MeuItem(5) };
    assertEquals(v2[0], Max.max(v2, 1));

    // Test case 3: Array with multiple items
    Item[] v3 = { new MeuItem(3), new MeuItem(7), new MeuItem(1), new MeuItem(9) };
    assertEquals(v3[3], Max.max(v3, 4));

    // Test case 4: Array with duplicate highest value
    Item[] v4 = { new MeuItem(2), new MeuItem(4), new MeuItem(4), new MeuItem(1) };
    assertEquals(v4[1], Max.max(v4, 4));
  }

  @Test
  public void testCompara() {
    // Test case 1: Same value
    MeuItem item1 = new MeuItem(5);
    MeuItem item2 = new MeuItem(5);
    assertEquals(0, item1.compara(item2));

    // Test case 2: Different values
    MeuItem item3 = new MeuItem(3);
    MeuItem item4 = new MeuItem(7);
    assertEquals(-1, item3.compara(item4));
    assertEquals(1, item4.compara(item3));
  }
}