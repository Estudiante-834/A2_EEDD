package main;

import java.util.Scanner;
import calculadora.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char opcion;
		
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("Operaciones Suma (s)");
			System.out.println("Operaciones Resta (r)");
			System.out.println("Operaciones Producto (p)");
			System.out.println("Salir (q)");
			
			opcion = sc.next().toLowerCase().charAt(0);
			
			switch (opcion) {
			case 's':
				Suma.menu(sc);
				break;
			case 'r':
				Resta.menu(sc);
				break;
			case 'p':
//				Producto.menu(sc);
				break;
			case 'q':
				break;
			default:
				System.out.println("Opción inválida.");
			}
			
		} while (opcion != 'q');
		
		sc.close();
		
	}

}