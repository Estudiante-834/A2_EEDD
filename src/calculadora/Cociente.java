package calculadora;

import java.util.Scanner;

public class Cociente {
	
	public static double cocienteReales(double num1, double num2) {
		if (num2 == 0)
			throw new ArithmeticException("División por 0 imposible");
		return num1 / num2;
	}
	
	public static long cocienteEnteros(long num1, long num2) {
		if (num2 == 0)
			throw new ArithmeticException("División por 0 imposible");
		return Math.floorDiv(num1, num2);
	}
	
	public static double inverso(double num) {
		if (num == 0)
			throw new ArithmeticException("Núemro 0 no tiene inverso multiplicativo");
		return 1.0/num;
	}
	
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
