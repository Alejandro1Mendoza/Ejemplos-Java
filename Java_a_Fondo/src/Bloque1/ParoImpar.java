package Bloque1;

import java.util.Scanner;

public class ParoImpar {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int num = scanner.nextInt();
		
		int resu = num % 2;
		if(resu==0) {
			System.out.print("El numero ingresado es par");
		}
		else {
			System.out.print("El numero ingresado es impar");
		}
	}
}
