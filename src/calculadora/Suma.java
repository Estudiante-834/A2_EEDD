package calculadora;

import java.util.Scanner;

/**
 * Clase general Suma para las operaciones de aritmética de suma.
 * 
 * <p>La clase está conformada por métodos de suma de números enteros y reales.
 * También cuenta con un método que sirve de suma-acumulador con getter y setter para extraer el valor acumulado.</p>
 * 
 * @author Estudiante-834
 * @version 1.0
 */
public class Suma {
	/**
	 * Valor acumulado que se actualiza con llamadas a {@link #sumaAcumulado(double)}.
	 */
	private static double acumulado;

	/**
	 * Suma dos números reales.
	 * 
	 * @param num1 Primer sumando real.
	 * @param num2 Segundo sumando real.
	 * @return Suma real.
	 */
	public static double suma(double num1, double num2) {
		return num1 + num2;
	}
	

	/**
	 * 
	 * Suma dos números enteros.
	 * 
	 * @param num1 Primer sumando tipo entero.
	 * @param num2 Segundo sumando tipo entero.
	 * @return Suma tipo entero.
	 */
	public static long suma(long num1, long num2) {
		return num1 + num2;
	}
	
	/**
	 * Suma tres números reales.
	 * 
	 * @param num1 Primer sumando real.
	 * @param num2 Segundo sumando real.
	 * @param num3 Tercer sumando real.
	 * @return Suma real.
	 */
	public static double suma(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	
	/**
	 * Acumula y suma valores pasados como argumento al método.
	 * 
	 * @param valor Número a acumular.
	 */
	public static void sumaAcumulado(double valor) {
		acumulado += valor;
	}

	/**
	 * Getter del valor acumulado.
	 * 
	 * @return acumulado Número acumulado tipo real
	 */
	public static double getAcumulado() {
		return acumulado;
	}

	/**
	 * Setter para establecer valor acumulado directamente.
	 * 
	 * @param acumulado Número real a acumular.
	 */
	public static void setAcumulador(double acumulado) {
		Suma.acumulado = acumulado;
	}
	
	public static void menu(Scanner sc) {
		char opcion;
		
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("Operacion Suma 2 reales (d)");
			System.out.println("Operacion Suma 2 enteros (e)");
			System.out.println("Operacion Suma 3 reales (t)");
			System.out.println("Operacion Suma Acumulador (a)");
			System.out.println("Get valor acumulado (g)");
			System.out.println("Set valor acumulado (h)");
			System.out.println("Salir (q)");
			
			opcion = sc.next().toLowerCase().charAt(0);
			
			switch (opcion) {
				case 'd':
					Suma.suma(1.5, 2.0);
					break;
				case 'e':
					Suma.suma(2, 3);
					break;
				case 't':
					Suma.suma(1.0, 2.0, 3.0);
					break;
				case 'a':
					Suma.sumaAcumulado(10);
					break;
				case 'g':
					Suma.sumaAcumulado(0);
					Suma.getAcumulado();
					break;
				case 'h':
					Suma.setAcumulador(1);
					break;
				case 'q':
					break;
				default:
					System.out.println("Opción no válida.");
			}
			
		} while (opcion != 'q');
		
	}
	
}
