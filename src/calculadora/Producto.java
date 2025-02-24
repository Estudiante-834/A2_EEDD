package calculadora;

import java.lang.Math;

/**
 * Clase general Producto para las operaciones básicas de producto y potencia.
 * 
 * <p>La clase tiene métodos de producto tanto para números reales y enteros que han sido implementado 
 * utilizando una única firma para la sobrecarga de métodos. Para los reales, {@link {{@link #producto(double, double)}
 * acepta 2 números mientras que {@link #producto(doble, doble, doble)} acepta 3.
 * El método {@link #potencia(double, double)} utiliza el método Math.pow. </p>
 * 
 * @author Estudiante-834
 * @version 1.0
 */
public class Producto {
	/**
	 * Producto de dos números reales.
	 * 
	 * @param num1 Factor real uno.
	 * @param num2 Factor reak dos.
	 * @return Producto de los dos factores
	 */
	public static double producto(double num1, double num2) {
		return num1 * num2;
	}
	
	/**
	 * Producto de dos números entero.
	 * 
	 * @param num1 Factor número entero.
	 * @param num2 Factor número entero.
	 * @return Producto de números entero.
	 */
	public static long producto(long num1, long num2) {
		return num1 * num2;
	}
	
	/**
	 * Producto de tres números reales.
	 * 
	 * @param num1 Factor real uno.
	 * @param num2 Factor real dos.
	 * @param num3 Factor real tres.
	 * @return Producto de los tres factores.
	 */
	public static double producto(double num1, double num2, double num3) {
		return num1 * num2 *num3;
	}
	
	/**
	 * Potencia de un número base. 
	 * 
	 * <p>La función se implementa a través de {@code Math.pow} de
	 * java.lang en donde se acepta dos números reales como argumento. Uno siendo la base y
	 * la otra el exponente de dicha base. Los valores de retorno en casos limítrofes son
	 * los mismos que la de la función original.</p>
	 * 
	 * @param base Base real a tomar la potencia.
	 * @param exp Exponente de la base real.
	 * @return Potencia de la base real.
	 */
	public static double potencia(double base, double exp) {
		return Math.pow(base, exp);
	} 
}
