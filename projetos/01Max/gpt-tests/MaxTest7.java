package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest7{

    
    public static class MeuItem implements Item {
        public int chave;

        public MeuItem (int chave) { 
            this.chave = chave; 
        } 

        public int compara (Item it) {
            MeuItem item = (MeuItem) it;
            if (this.chave < item.chave) return -1;
            else if (this.chave > item.chave) return 1;
            return 0;
        }
    }
    
    public static class Max {
        public static Item max (Item v[], int n) {
            Item max = v[0];
            for (int i = 1; i < n; i++) if (max.compara (v[i]) < 0) max = v[i];
            return max;
        }
    }
    
    public static interface Item {
        public int compara (Item it);
    }
    
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        MeuItem item = new MeuItem(0);
        assertNotNull(item);
    }
    
    @Test(timeout=1000)
    public void testMax() throws Exception {
        MeuItem[] items = new MeuItem[5];
        items[0] = new MeuItem(4);
        items[1] = new MeuItem(2);
        items[2] = new MeuItem(6);
        items[3] = new MeuItem(1);
        items[4] = new MeuItem(3);
        
        Item maxItem = Max.max(items, 5);
        assertEquals(6, ((MeuItem)maxItem).chave);
    }
}