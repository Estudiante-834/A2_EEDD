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
		
		// Delta para testear imprecisión de puntos flotantes, a más precisión mayor el delta necesario.
		assertEquals(-10.164, Producto.producto(-2.2, -1.1, -4.2), 0.00001);
		
		assertEquals(0, Producto.producto(0, 10.1, 34.2));
		assertEquals(15.0, Producto.producto(1.5, 2.0, 5.0), 15.0);
		
	}
	
	@Test
	void testProductoEnteros() {
		assertEquals(0, Producto.producto(0, 1));
		assertEquals(20, Producto.producto(2, 10));
		assertEquals(230, Producto.producto(-10, -23));
		assertEquals(10, Producto.producto(5, 2));
	}

	
}
