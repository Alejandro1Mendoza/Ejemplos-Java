package Bloque1;

import java.util.Scanner;

public class PrimerosNumeros2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		
		int num = scanner.nextInt();
		
		int i=1;
		
		do {
			
			System.out.print(i+"\n");
			i++;
		}while(i<=num);
	}
}
