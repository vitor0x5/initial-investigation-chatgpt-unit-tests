package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest1{


  @Test
  public void testMax() {
    Item[] items = new Item[5];
    items[0] = new MeuItem(10);
    items[1] = new MeuItem(20);
    items[2] = new MeuItem(15);
    items[3] = new MeuItem(5);
    items[4] = new MeuItem(25);

    Item result = Max.max(items, 5);

    assertEquals(25, ((MeuItem) result).chave);
  }

  @Test
  public void testMaxWithEmptyArray() {
    Item[] items = new Item[0];

    Item result = Max.max(items, 0);

    assertNull(result);
  }

  @Test
  public void testMaxWithSingleItem() {
    Item[] items = new Item[1];
    items[0] = new MeuItem(10);

    Item result = Max.max(items, 1);

    assertEquals(10, ((MeuItem) result).chave);
  }

  @Test
  public void testMaxWithDuplicateItems() {
    Item[] items = new Item[6];
    items[0] = new MeuItem(10);
    items[1] = new MeuItem(20);
    items[2] = new MeuItem(15);
    items[3] = new MeuItem(5);
    items[4] = new MeuItem(15);
    items[5] = new MeuItem(25);

    Item result = Max.max(items, 6);

    assertEquals(25, ((MeuItem) result).chave);
  }
}