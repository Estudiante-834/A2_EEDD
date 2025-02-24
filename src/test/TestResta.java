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
		assertEquals(Resta.resta(0, 0), 0);
		assertEquals(Resta.resta(1.5, 2.0), -0.5);
		assertEquals(Resta.resta(0.1, 0.2), -0.1);
		assertEquals(Resta.resta(15.5, 10.5), 5.0);

		// Valor delta en assertEquals para comprobar imprecision de puntos flotantes.
		assertEquals(Resta.resta(0.3, 0.1), 0.2, 0.00001);

		assertEquals(Resta.resta(1.0, 2.0, 3.0), -4.0);
		assertEquals(Resta.resta(1.0, -2.5, 3.0), 0.5);
		assertEquals(Resta.resta(-1.0, -20.0, -4.0), 23.0);
		
	}
	
	/**
	 * Test método resta con números enteros, con diferentes combinaciones de signos.
	 */
	@Test
	void testRestaEnteros() {
		assertEquals(Resta.resta(0, 0), 0);
		assertEquals(Resta.resta(10, 5), 5);
		assertEquals(Resta.resta(-10, 5), -15);
		assertEquals(Resta.resta(10, 50), -40);
		assertEquals(Resta.resta(0, -5), 5);
	}
	
	/**
	 * Test método resta con acumulación, verificando valor inicial asignado no altera signo y
	 * valores posteriores a esta restan o suman dependiendo del signo al valor acumulado inicial.
	 * También se comprueba el funcionamiento correcto del getter y setter.
	 */
	@Test
	void testRestaAcumulador() {
		Resta.restaAcumulada(10);
		assertEquals(Resta.getAcumulado(), 10);
		Resta.restaAcumulada(10);
		assertEquals(Resta.getAcumulado(), 0);
		Resta.restaAcumulada(10);
		assertEquals(Resta.getAcumulado(), -10);
		Resta.restaAcumulada(-110);
		assertEquals(Resta.getAcumulado(), 100);
		
		Resta.setAcumulado(0);
		assertEquals(Resta.getAcumulado(), 0);
		
		Resta.restaAcumulada(-10);
		assertEquals(Resta.getAcumulado(), 10);	
	}

}
