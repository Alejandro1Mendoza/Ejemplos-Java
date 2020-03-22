package Bloque1;

import java.util.Scanner;

public class ParoImparIfinLine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Ingrese un numero: ");
		int num = scanner.nextInt();
		
		int resu = num % 2;
		
		String mssg = (resu == 0 ) ? "es par": "es Impar";
		
		System.out.print("El numero "+num+" es "+mssg);
	}
	
}
