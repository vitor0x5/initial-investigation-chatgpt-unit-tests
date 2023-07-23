package ds;@Test
public void testShiftAndAproximado() {
  String T = "This is a test string";
  String P = "test";
  int k = 1;
  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  System.setOut(new PrintStream(outContent));
  CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
  assertEquals("Casamento na posicao: 10\n", outContent.toString());
}

@Test
public void testShiftAndAproximadoNoMatch() {
  String T = "This is a test string";
  String P = "notfound";
  int k = 1;
  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  System.setOut(new PrintStream(outContent));
  CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
  assertEquals("", outContent.toString());
}