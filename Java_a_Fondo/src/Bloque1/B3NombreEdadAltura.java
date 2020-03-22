package Bloque1;

import java.util.Scanner;

public class B3NombreEdadAltura {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Indique su nombre: ");
		
		String nom = scanner.nextLine();
		
		System.out.print("Indique su edad: ");
		
		int edad = scanner.nextInt();
		
		System.out.print("Indique su altura: ");
		
		float altura = scanner.nextFloat();
		
		System.out.print("\nHola: "+nom+"\n\tTu edad es: "+edad+"\n\tY tu altura es: "+altura+" cm");
	}
}
