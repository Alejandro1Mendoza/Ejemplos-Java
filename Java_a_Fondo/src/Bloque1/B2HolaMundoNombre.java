package Bloque1;

import java.util.Scanner;

public class B2HolaMundoNombre {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Indique su nombre: ");
		
		String nom = scanner.nextLine();
		
		System.out.print("Hola mundo: "+nom);
	}
}