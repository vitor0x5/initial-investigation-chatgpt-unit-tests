package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest17{


    @Test( timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Lista lista = new Lista();
    }

    @Test( timeout = 1000)
    public void testInsere() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        lista.insere("Item 4");
        lista.insere("Item 5");
        lista.insere("Item 6");
        lista.insere("Item 7");
        lista.insere("Item 8");
        lista.insere("Item 9");
        lista.insere("Item 10");
        lista.insere("Item 11");
        lista.insere("Item 12");
        lista.insere("Item 13");
        lista.insere("Item 14");
        lista.insere("Item 15");
        lista.insere("Item 16");
        lista.insere("Item 17");
        lista.insere("Item 18");
        lista.insere("Item 19");
        lista.insere("Item 20");
        lista.insere("Item 21");
        lista.insere("Item 22");
        lista.insere("Item 23");
        lista.insere("Item 24");
        lista.insere("Item 25");
        lista.insere("Item 26");
        lista.insere("Item 27");
        lista.insere("Item 28");
        lista.insere("Item 29");
        lista.insere("Item 30");
        lista.insere("Item 31");
        lista.insere("Item 32");
        lista.insere("Item 33");
        lista.insere("Item 34");
        lista.insere("Item 35");
        lista.insere("Item 36");
        lista.insere("Item 37");
        lista.insere("Item 38");
        lista.insere("Item 39");
        lista.insere("Item 40");
        lista.insere("Item 41");
        lista.insere("Item 42");
        lista.insere("Item 43");
        lista.insere("Item 44");
        lista.insere("Item 45");
        lista.insere("Item 46");
        lista.insere("Item 47");
        lista.insere("Item 48");
        lista.insere("Item 49");
        lista.insere("Item 50");
        lista.insere("Item 51");
        lista.insere("Item 52");
        lista.insere("Item 53");
        lista.insere("Item 54");
        lista.insere("Item 55");
        lista.insere("Item 56");
        lista.insere("Item 57");
        lista.insere("Item 58");
        lista.insere("Item 59");
        lista.insere("Item 60");
        lista.insere("Item 61");
        lista.insere("Item 62");
        lista.insere("Item 63");
        lista.insere("Item 64");
        lista.insere("Item 65");
        lista.insere("Item 66");
        lista.insere("Item 67");
        lista.insere("Item 68");
        lista.insere("Item 69");
        lista.insere("Item 70");
        lista.insere("Item 71");
        lista.insere("Item 72");
        lista.insere("Item 73");
        lista.insere("Item 74");
        lista.insere("Item 75");
        lista.insere("Item 76");
        lista.insere("Item 77");
        lista.insere("Item 78");
        lista.insere("Item 79");
        lista.insere("Item 80");
        lista.insere("Item 81");
        lista.insere("Item 82");
        lista.insere("Item 83");
        lista.insere("Item 84");
        lista.insere("Item 85");
        lista.insere("Item 86");
        lista.insere("Item 87");
        lista.insere("Item 88");
        lista.insere("Item 89");
        lista.insere("Item 90");
        lista.insere("Item 91");
        lista.insere("Item 92");
        lista.insere("Item 93");
        lista.insere("Item 94");
        lista.insere("Item 95");
        lista.insere("Item 96");
        lista.insere("Item 97");
        lista.insere("Item 98");
        lista.insere("Item 99");
        lista.insere("Item 100");
        lista.insere("Item 101");
    }

    @Test(timeout = 1000)
    public void testVazia() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());
        lista.insere("Item 1");
        assertFalse(lista.vazia());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Lista lista = new Lista();
        lista.insere("Item 1");
        lista.insere("Item 2");
        lista.insere("Item 3");
        lista.imprime();
    }
}