package ds;import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilhaTest0{

    private Pilha pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
    }

    @Test
    public void testEmpilha() {
        pilha.empilha("Test");
        Assert.assertFalse(pilha.vazia());
        Assert.assertEquals(1, pilha.tamanho());
    }

    @Test(expected = Exception.class)
    public void testDesempilhaEmptyStack() throws Exception {
        pilha.desempilha();
    }

    @Test
    public void testDesempilha() throws Exception {
        pilha.empilha("Test");
        Object item = pilha.desempilha();
        Assert.assertTrue(pilha.vazia());
        Assert.assertEquals(0, pilha.tamanho());
        Assert.assertEquals("Test", item);
    }

    @Test
    public void testVazia() {
        Assert.assertTrue(pilha.vazia());
    }

    @Test
    public void testTamanho() {
        Assert.assertEquals(0, pilha.tamanho());
        pilha.empilha("Test1");
        pilha.empilha("Test2");
        Assert.assertEquals(2, pilha.tamanho());
    }
}