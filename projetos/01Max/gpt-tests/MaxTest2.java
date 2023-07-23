package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest2{

  
  @Test
  public void testMax() {
    MeuItem item1 = new MeuItem(10);
    MeuItem item2 = new MeuItem(20);
    MeuItem item3 = new MeuItem(30);
    MeuItem item4 = new MeuItem(40);
    MeuItem[] items = {item1, item2, item3, item4};
    Item maxItem = Max.max(items, 4);
    assertEquals(item4, maxItem);
  }
  
  @Test
  public void testMaxWithNegativeValues() {
    MeuItem item1 = new MeuItem(-20);
    MeuItem item2 = new MeuItem(-5);
    MeuItem item3 = new MeuItem(-10);
    MeuItem item4 = new MeuItem(-30);
    MeuItem[] items = {item1, item2, item3, item4};
    Item maxItem = Max.max(items, 4);
    assertEquals(item2, maxItem);
  }
  
  @Test
  public void testMaxWithSameValues() {
    MeuItem item1 = new MeuItem(10);
    MeuItem item2 = new MeuItem(10);
    MeuItem item3 = new MeuItem(10);
    MeuItem item4 = new MeuItem(10);
    MeuItem[] items = {item1, item2, item3, item4};
    Item maxItem = Max.max(items, 4);
    assertEquals(item1, maxItem);
  }
  
  @Test
  public void testMaxWithEmptyArray() {
    MeuItem[] items = {};
    Item maxItem = Max.max(items, 0);
    assertNull(maxItem);
  }
  
  @Test
  public void testMaxWithSingleElementArray() {
    MeuItem item1 = new MeuItem(5);
    MeuItem[] items = {item1};
    Item maxItem = Max.max(items, 1);
    assertEquals(item1, maxItem);
  }
}