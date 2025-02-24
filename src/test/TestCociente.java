package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Cociente;

class TestCociente {

	@Test
	void testCocienteReales() {
		assertEquals(0.5, Cociente.cocienteReales(1.0, 2.0));
		assertEquals(5.0, Cociente.cocienteReales(10.0, 2.0));
		assertEquals(-0.625, Cociente.cocienteReales(-2.5, 4.0), 0.0001);
		
		assertThrows(ArithmeticException.class, () -> Cociente.cocienteReales(1, 0));
		assertDoesNotThrow(() -> Cociente.cocienteReales(0, 1.0));
	}
	
	@Test
	void testCocienteEnteros() {
		assertEquals(5, Cociente.cocienteEnteros(10, 2));
		assertEquals(0, Cociente.cocienteEnteros(1, 2));
		assertEquals(50, Cociente.cocienteEnteros(100, 2));
		assertEquals(-2, Cociente.cocienteEnteros(-3, 2));
		assertEquals(-1, Cociente.cocienteEnteros(10, -20));

		assertThrows(ArithmeticException.class, () -> Cociente.cocienteEnteros(13, 0));
		assertDoesNotThrow(() -> Cociente.cocienteEnteros(0, 3));
	}

	@Test
	void testInverso() {
		assertEquals(1, Cociente.inverso(1));
		assertEquals(0.5, Cociente.inverso(2));
		assertEquals(0.01, Cociente.inverso(100));
		assertEquals(-0.2, Cociente.inverso(-5));
		assertEquals(2.0, Cociente.inverso(0.5));
		assertEquals(-10.0, Cociente.inverso(-0.1));
		
		assertThrows(ArithmeticException.class, () -> Cociente.inverso(0));
	}
	
	@Test
	void testRaiz() {
		assertEquals(0, Cociente.raiz(0));
		assertEquals(1, Cociente.raiz(1));
		assertEquals(2, Cociente.raiz(4));
		assertEquals(Math.sqrt(3.0), Cociente.raiz(3.0), 0.001);
		assertEquals(Math.sqrt(5.5), Cociente.raiz(5.5), 0.001);
		
		assertThrows(ArithmeticException.class, () -> Cociente.raiz(-1));
	}
}
