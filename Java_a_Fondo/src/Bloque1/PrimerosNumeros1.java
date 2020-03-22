package Bloque1;

import java.util.Scanner;

public class PrimerosNumeros1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa un numero: ");
		
		int num = scanner.nextInt();
		int i=0;
		while(i<=num) {
			
			System.out.print("\n"+i);
			
			i++;
		}
	}
}
