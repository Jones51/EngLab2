package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Test;

class testRodadas {

	@Test
	void nãoPodeTerMaisDe3Resultados() {
		TestingJava test = new TestingJava();
		int output = test.rodadas(3);
		assertEquals(3, output);
	}
	
	@After
	public void finaliza() {
		System.out.print("Fim");
	}
}
