package everis.eclipse.prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		System.out.println("¡Hola mundo!");
		System.out.println("¡Hola mundo!");
		System.out.println("¡Hola mundo!");
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Hola Jesús, ¿te gusta GIT?");
		boolean gustar = scanner.nextBoolean();

		scanner.close();

	}

}