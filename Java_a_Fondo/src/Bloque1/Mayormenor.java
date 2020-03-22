package Bloque1;

import java.util.Scanner;

public class Mayormenor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese su edad: ");
		int edad = scanner.nextInt();
		
		if(edad>17){
			System.out.print("Es mayor de edad");
		}
		else{
			System.out.print("Es menor de edad");
		}
	}
}
