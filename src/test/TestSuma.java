package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Suma;


class TestSuma {
	/**
	 * Test métodos con suma de números reales, tanto de 2 o 3 parámetros.
	 * Se prueba las combinaciones de suma de valores positivos, negativos, ceros o ambos.
	 * También se tiene en cuenta los casos limítrofes como la imprecisión de punteros flotantes
	 * en los métodos con números reales.
	 */
	@Test
	void testSumaReales() {
		assertEquals(Suma.suma(0, 0), 0);
		assertEquals(Suma.suma(-1.5, -10), -11.5);
		assertEquals(Suma.suma(10, 11.5), 21.5);
		
		// Valor delta para la imprecisión de puntos flotantes
		assertEquals(Suma.suma(1.2, -1.3), -0.1, 0.10000);
		
		assertEquals(Suma.suma(1.0, 2.0, 3), 6.0);
		assertEquals(Suma.suma(1.5, 2.0, 3.5), 7.0);
		assertEquals(Suma.suma(-10, 2.0, -5.5), -13.5);
		assertEquals(Suma.suma(-3.0, -4.0, -5.0), -12.0);
	}
	
	/**
	 * Test del método de suma de enteros.
	 * Se utiliza combinaciones de valores positivo, negativo y cero.
	 */
	@Test
	void testSumaEnteros() {
		assertEquals(Suma.suma(0, 0), 0);
		assertEquals(Suma.suma(1, -1), 0);
		assertEquals(Suma.suma(-10, -20), -30);
		assertEquals(Suma.suma(12, 22), 34);
	}
	
	/**
	 * Test suma acumulador aportando valor inicial, y pruebas de getter/setter.
	 */
	@Test
	void testSumaAcumulador() {
		Suma.sumaAcumulado(10);
		assertEquals(Suma.getAcumulado(), 10);
		
		Suma.sumaAcumulado(5);
		assertEquals(Suma.getAcumulado(), 15);
		
		Suma.sumaAcumulado(-20);
		assertEquals(Suma.getAcumulado(), -5);
		
		Suma.sumaAcumulado(0);
		assertEquals(Suma.getAcumulado(), -5);
		
		Suma.setAcumulador(0);
		assertEquals(Suma.getAcumulado(), 0);
	}
	

}
