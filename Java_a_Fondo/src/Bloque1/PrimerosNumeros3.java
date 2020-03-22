package Bloque1;

import java.util.Scanner;

public class PrimerosNumeros3 {
	public static void main(String[] args) {
		
		int i=1,num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Indica un numero: ");
		
		num = scanner.nextInt();
		
		for(i=1;i<=num;i++){
			System.out.print(i+"\n");
		}
	}
}
