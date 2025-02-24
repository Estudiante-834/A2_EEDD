package calculadora;

import java.util.Scanner;

/**
 * Clase general Resta para las operaciones de aritmética de resta.
 * 
 * <p>La clase está formada por métodos de resta de números enteros y reales.
 * También cuenta con un método {@link #restaAcumulada(double)} donde toma un valor inicial y
 * del cual se le restara valores posteriores llmados con el método.
 * También cuenta con getter y setter para extraer el valor acumulado.</p>
 * 
 * @author Estudiante-834
 * @version 1.0
 */
public class Resta {
	/**
	 * Valor acumulado inicial a NaN. 
	 * Se actualiza con llamadas a {@link #sumaAcumulado(double)}.
	 */
	private static double acumulado = Double.NaN;

	/**
	 * Resta dos números reales, el segundo del primero.
	 * 
	 * @param num1 Minuendo número real.
	 * @param num2 Sustraendo número real.
	 * @return Diferencia número real.
	 */
	public static double resta(double num1, double num2) {
		return num1 - num2;
	}
	
	/**
	 * Resta dos números enteros, el segundo del primero.
	 * 
	 * @param num1 Minuendo entero.
	 * @param num2 Sustraendo entero.
	 * @return Diferencia número entero.
	 */
	public static long resta(long num1, long num2) {
		return num1 - num2;
	}
	
	/**
	 * Resta de tres números reales. El segundo siempre del primero y el tercero del segundo.
	 * 
	 * @param num1 Número real.
	 * @param num2 Número real.
	 * @param num3 Número real.
	 * @return Diferencia número reales.
	 */
	public static double resta(double num1, double num2, double num3) {
		return num1 - num2 - num3;
	}
	
	/**
	 * Acumula un valor inicial y cada valor posterior al inicial es restado de esta.
	 * El acumulado se inicializa a Double.NaN para no alterar el signo del valor inicial que
	 * es pasado al método. 
	 * 
	 * @param valor Número real.
	 */
	public static void restaAcumulada(double valor) {
		if (Double.isNaN(Resta.acumulado))
			Resta.acumulado = valor;
		else 
			Resta.acumulado -= valor;
	}

	/**
	 * Getter del valor acumulado.
	 * 
	 * @return acumulado Valor acumulado.
	 */
	public static double getAcumulado() {
		return acumulado;
	}

	/**
	 * Setter del valor acumulado.
	 * 
	 * @param acumulado Número real del acumulado.
	 */
	public static void setAcumulado(double acumulado) {
		Resta.acumulado = acumulado;
	}
	
	public static void menu(Scanner sc) {	
		char opcion;
		
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("Operacion Resta 2 reales (d)");
			System.out.println("Operacion Resta 2 enteros (e)");
			System.out.println("Operacion Resta 3 reales (t)");
			System.out.println("Operacion Resta Acumulador (a)");
			System.out.println("Get valor acumulado (g)");
			System.out.println("Set valor acumulado (h)");
			System.out.println("Salir (q)");
			
			opcion = sc.next().toLowerCase().charAt(0);
			
			switch (opcion) {
				case 'd':
					Resta.resta(6.5, 5.0);
					break;
				case 'e':
					Resta.resta(5, 3);
					break;
				case 't':
					Resta.resta(1.0, -2.0, 3.0);
					break;
				case 'a':
					Resta.restaAcumulada(100);
					break;
				case 'g':
					Resta.restaAcumulada(10);
					Resta.getAcumulado();
					break;
				case 'h':
					Resta.setAcumulado(0);
					break;
				case 'q':
					break;
				default:
					System.out.println("Opción no válida.");
			}
			
		} while (opcion != 'q');
		
	}	
}