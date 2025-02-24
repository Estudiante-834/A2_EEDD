package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Producto;

class TestProducto {

	@Test
	void testProductoReales() {
		assertEquals(5.5, Producto.producto(1.0, 5.5));
		assertEquals(0, Producto.producto(0, 10.1));
		assertEquals(-5.0, Producto.producto(-2.5, 2));
		
		// Delta para testear imprecisión de comas flotantes, a más precisión mayor el delta necesario.
		assertEquals(-10.164, Producto.producto(-2.2, -1.1, -4.2), 0.00001);
		
		assertEquals(0, Producto.producto(0, 10.1, 34.2));
		assertEquals(15.0, Producto.producto(1.5, 2.0, 5.0));
		assertEquals(-20.7, Producto.producto(-2.3, -4.5, -2.0));
		assertEquals(-9.0, Producto.producto(1.5, -2.0, 3.0));
	}
	
	@Test
	void testProductoEnteros() {
		assertEquals(0, Producto.producto(0, 1));
		assertEquals(20, Producto.producto(2, 10));
		assertEquals(230, Producto.producto(-10, -23));
		assertEquals(10, Producto.producto(5, 2));
	}

	@Test
	void testPotencia() {
		assertEquals(1, Producto.potencia(1.0, 0));
		assertEquals(16.0, Producto.potencia(2.0, 4.0));
		assertEquals(0.5, Producto.potencia(2.0, -1.0));
	
		// Valor delta en assertEquals necesario para imprecisión de comas flotantes
		assertEquals(0.11111, Producto.potencia(3.0, -2), 0.00001);
		assertEquals(0.064, Producto.potencia(2.5, -3), 0.0001);
		
		// Caso limítrofe de Math.pow()
		assertEquals(1, Producto.potencia(0, 0));
	}

}
