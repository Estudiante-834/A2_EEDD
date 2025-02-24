package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import calculadora.Resta;

class TestResta {
	/**
	 * Tests de métodos de resta con números reales. Se hace pruebas con combinaciones de 
	 * números positivos, negativos o ambos. También se verifica la imprecisión causado por los números reales.
	 */
	@Test
	void testRestaReales() {
		assertEquals(0, Resta.resta(0, 0));
		assertEquals(-0.5, Resta.resta(1.5, 2.0));
		assertEquals(-0.1, Resta.resta(0.1, 0.2));
		assertEquals(5.0, Resta.resta(15.5, 10.5));

		// Valor delta en assertEquals para comprobar imprecision de puntos flotantes.
		assertEquals(0.2, Resta.resta(0.3, 0.1), 0.00001);

		assertEquals(-4.0, Resta.resta(1.0, 2.0, 3.0));
		assertEquals(0.5, Resta.resta(1.0, -2.5, 3.0));
		assertEquals(23.0, Resta.resta(-1.0, -20.0, -4.0));
		
	}
	
	/**
	 * Test método resta con números enteros, con diferentes combinaciones de signos.
	 */
	@Test
	void testRestaEnteros() {
		assertEquals(0, Resta.resta(0, 0));
		assertEquals(5, Resta.resta(10, 5));
		assertEquals(-15, Resta.resta(-10, 5));
		assertEquals(-40, Resta.resta(10, 50));
		assertEquals(5, Resta.resta(0, -5));
	}
	
	/**
	 * Test método resta con acumulación, verificando valor inicial asignado no altera signo y
	 * valores posteriores a esta restan o suman dependiendo del signo al valor acumulado inicial.
	 * También se comprueba el funcionamiento correcto del getter y setter.
	 */
	@Test
	void testRestaAcumulador() {
		Resta.restaAcumulada(10);
		assertEquals(10, Resta.getAcumulado());
		Resta.restaAcumulada(10);
		assertEquals(0, Resta.getAcumulado());
		Resta.restaAcumulada(10);
		assertEquals(-10, Resta.getAcumulado());
		Resta.restaAcumulada(-110);
		assertEquals(100, Resta.getAcumulado());
		
		Resta.setAcumulado(0);
		assertEquals(0, Resta.getAcumulado());
		
		Resta.restaAcumulada(-10);
		assertEquals(10, Resta.getAcumulado());	
	}

}
