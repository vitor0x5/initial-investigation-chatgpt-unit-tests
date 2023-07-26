package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest0{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Max max = new Max();
    }

    @Test(timeout = 1000)
    public void testMax() throws Exception {
        // Test with positive integer values
        Item v1[] = { new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8) };
        Item expected1 = new MeuItem(10);
        Item actual1 = Max.max(v1, v1.length);
        assertEquals(expected1.compara(actual1), 0);

        // Test with negative integer values
        Item v2[] = { new MeuItem(-5), new MeuItem(-10), new MeuItem(-3), new MeuItem(-8) };
        Item expected2 = new MeuItem(-3);
        Item actual2 = Max.max(v2, v2.length);
        assertEquals(expected2.compara(actual2), 0);

        // Test with positive and negative integer values
        Item v3[] = { new MeuItem(-5), new MeuItem(10), new MeuItem(-3), new MeuItem(8) };
        Item expected3 = new MeuItem(10);
        Item actual3 = Max.max(v3, v3.length);
        assertEquals(expected3.compara(actual3), 0);

        // Test with empty array
        Item v4[] = {};
        Item expected4 = null;
        Item actual4 = Max.max(v4, v4.length);
        assertEquals(expected4, actual4);
    }
}

class MeuItem implements Item {
    public int chave;

    public MeuItem(int chave) {
        this.chave = chave;
    }

    public int compara(Item it) {
        MeuItem item = (MeuItem) it;
        if (this.chave < item.chave)
            return -1;
        else if (this.chave > item.chave)
            return 1;
        return 0;
    }
}

class Max {
    public static Item max(Item v[], int n) {
        Item max = v[0];
        for (int i = 1; i < n; i++)
            if (max.compara(v[i]) < 0)
                max = v[i];
        return max;
    }
}

interface Item {
    public int compara(Item it);
}