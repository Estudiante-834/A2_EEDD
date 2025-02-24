package calculadora;

import java.util.Scanner;

/**
 * Clase general Cociente para operaciones básicas de división, raíz cuadrada e inverso.
 * 
 * <p>La clase tiene un método de {@link #cocienteReales(double, double)} que divide dos 
 * números reales retornando un cociente real, y otro método 
 * {@link #cocienteEnteros(long, long)} que divide dos números enteros 
 * retornando un entero de la función piso. 
 * Tambíen contiene métodos para el inverso multiplicativo y raíz cuadrada 
 * de númerós reales.</p>
 * 
 * @author Estudiante-834 
 * @version 1.0
 */
public class Cociente {
	/**
	 * Cociente entre dos números reales. El primer número el dividendo 
	 * y el segundo el divisor.
	 * División por 0 lanza una excepción.
	 * 
	 * @param num1 Dividendo Real
	 * @param num2 Divisor Real
	 * @return Cociente
	 */
	public static double cocienteReales(double num1, double num2) {
		if (num2 == 0)
			throw new ArithmeticException("División por 0 imposible");
		return num1 / num2;
	}
	
	/**
	 * División entre números enteros implementado utilizando función piso 
	 * {@code Math.floorDiv}. El primer número es el dividendo y el segundo el divisor.
	 * Siempre retorna un número entero redondeado hacia abajo.
	 * División por 0 o es posible.
	 * 
	 * @param num1 Dividendo Entero
	 * @param num2 Divisor Entero
	 * @return Número Entero redondeado abajo.
	 */
	public static long cocienteEnteros(long num1, long num2) {
		if (num2 == 0)
			throw new ArithmeticException("División por 0 imposible");
		return Math.floorDiv(num1, num2);
	}
	
	/**
	 * Devuelve el inverso multiplicativo del número real pasado como argumento.
	 * Inverso de 0 resulta en una excepción.
	 * 
	 * @param num Número Real
	 * @return Inverso Multiplicativo del argumento.
	 */
	public static double inverso(double num) {
		if (num == 0)
			throw new ArithmeticException("Núemro 0 no tiene inverso multiplicativo");
		return 1.0/num;
	}
	
	/**
	 * Toma la raiz cuadrada del argument siendo este un número real.
	 * Valores negativo resulta en una excepción.
	 * 
	 * @param num Número Real.
	 * @return Número Real
	 */
	public static double raiz(double num) {
		if (num < 0)
			throw new ArithmeticException("Raíz número negativo imposible");
		return Math.sqrt(num);
	}
	
	public static void menu(Scanner sc) {	
		char opcion;
		
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("Operacion Cociente 2 reales (c)");
			System.out.println("Operacion Cociente 2 enteros (e)");
			System.out.println("Operacion Inverso Multiplicativo (i)");
			System.out.println("Operacion Raiz Cuadrada (r)");
			System.out.println("Salir (q)");
			
			opcion = sc.next().toLowerCase().charAt(0);
			
			switch (opcion) {
				case 'c':
					Cociente.cocienteReales(7.5, 5.0);
					break;
				case 'e':
					Cociente.cocienteEnteros(4, 2);
					break;
				case 'i':
					Cociente.inverso(100);
					break;
				case 'r':
					Cociente.raiz(100.0);
					break;
				case 'q':
					break;
				default:
					System.out.println("Opción no válida.");
			}
		
		} while (opcion != 'q');
	}
}
