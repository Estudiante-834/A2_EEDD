package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Suma;


class TestSuma {
	/**
	 * Test métodos con suma de números reales, tanto de 2 o 3 parámetros.
	 * Se prueba las combinaciones de suma de valores positivos, negativos, ceros o ambos.
	 * También se tiene en cuenta los casos limítrofes como la imprecisión de comas flotantes
	 * en los métodos con números reales.
	 */
	@Test
	void testSumaReales() {
		assertEquals(0, Suma.suma(0, 0));
		assertEquals(-11.5, Suma.suma(-1.5, -10));
		assertEquals(21.5, Suma.suma(10, 11.5));
		
		// Valor delta para la imprecisión de comas flotantes
		assertEquals(-0.1, Suma.suma(1.2, -1.3), 0.10000);
		
		assertEquals(6.0, Suma.suma(1.0, 2.0, 3));
		assertEquals(7.0, Suma.suma(1.5, 2.0, 3.5));
		assertEquals(-13.5, Suma.suma(-10, 2.0, -5.5));
		assertEquals(-12.0, Suma.suma(-3.0, -4.0, -5.0));
	}
	
	/**
	 * Test del método de suma de enteros.
	 * Se utiliza combinaciones de valores positivo, negativo y cero.
	 */
	@Test
	void testSumaEnteros() {
		assertEquals(0, Suma.suma(0, 0));
		assertEquals(0, Suma.suma(1, -1));
		assertEquals(-30, Suma.suma(-10, -20));
		assertEquals(34, Suma.suma(12, 22));
	}
	
	/**
	 * Test suma acumulador aportando valor inicial, y pruebas de getter/setter.
	 */
	@Test
	void testSumaAcumulador() {
		Suma.sumaAcumulado(10);
		assertEquals(10, Suma.getAcumulado());
		
		Suma.sumaAcumulado(5);
		assertEquals(15, Suma.getAcumulado());
		
		Suma.sumaAcumulado(-20);
		assertEquals(-5, Suma.getAcumulado());
		
		Suma.sumaAcumulado(0);
		assertEquals(-5, Suma.getAcumulado());
		
		Suma.setAcumulador(0);
		assertEquals(0, Suma.getAcumulado());
	}
	

}
