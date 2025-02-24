package calculadora;

import java.lang.Math;

public class Producto {
	
	public static double producto(double num1, double num2) {
		return num1 * num2;
	}
	
	public static long producto(long num1, long num2) {
		return num1 * num2;
	}
	
	public static double producto(double num1, double num2, double num3) {
		return num1 * num2 *num3;
	}
	
	public static double potencia(double base, double exp) {
		return Math.pow(base, exp);
	} 
}
