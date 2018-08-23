import fatorial.Fatorial;
import junit.framework.TestCase;

public class FatorialTeste extends TestCase {
	public void fatorialTest() {
		
		assertEquals(6, Fatorial.calcFor(3));
		assertEquals(24, Fatorial.calcFor(4));
		assertEquals(120, Fatorial.calcFor(5));
		assertEquals(720, Fatorial.calcFor(6));
		assertEquals(5040, Fatorial.calcFor(7));
		
		assertEquals(6, Fatorial.calcRec(3));
		assertEquals(24, Fatorial.calcRec(4));
		assertEquals(120, Fatorial.calcRec(5));
	}
}
