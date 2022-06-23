package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculadoraTeste {
	public calculadora calculadora;

	@BeforeEach
	void setUp() throws Exception {
		calculadora = new calculadora();
	}

	@Test
	void testSoma() {
		double valorEsperado = 2;
		double valorObtido = calculadora.soma(-3, 5);
		assertEquals(valorEsperado, valorObtido);
	}
		
	@Test
	void testSoma1() {
		double valorEsperado = 3;
		double valorObtido = calculadora.soma(2.8, 0.3);
		assertEquals(valorEsperado, valorObtido);
	}

	@Test
	void testSubtrai() {
		double valorEsperado = 3;
		double valorObtido = calculadora.subtrai(7, 4);
		assertEquals(valorEsperado, valorObtido);
	}
	
	@Test 
	void testSubtrai1() {
		double valorEsperado = 6;
		double valorObtido = calculadora.subtrai(13, 6.8);
		assertEquals(valorEsperado, valorObtido);
	}

	@Test
	void testDivid() {
		double valorEsperado = 0;
		double valorObtido = calculadora.divid(0, 2);
		assertEquals(valorEsperado, valorObtido);
	}
	
	@Test
	void testDivid1() {
		double valorEsperado = 0;
		double valorObtido = calculadora.divid(2, 0);
		assertEquals(valorEsperado, valorObtido);
	}

	@Test
	void testMult() {
		double valorEsperado = 30;
		double valorObtido = calculadora.mult(6, 5);
		assertEquals(valorEsperado, valorObtido);
	}
	
	@Test
	void testMult1( ) {
		double valorEsperado = 10;
		double valorObtido = calculadora.mult(5, 2.1);
		assertEquals(valorEsperado, valorObtido);		
	}

}
