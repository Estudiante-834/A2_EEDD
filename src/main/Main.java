package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char opcion;
		
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("Operaciones Suma (s)");
			System.out.println("Salir (q)");
			
			opcion = sc.next().toLowerCase().charAt(0);
			
			switch (opcion) {
			case 's':
				Suma.menu(sc);
				break;
			case 'r':
				
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
