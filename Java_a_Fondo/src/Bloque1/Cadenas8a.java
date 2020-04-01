package Bloque1;

import java.util.Scanner;

public class Cadenas8a {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese una cadena: ");
		String s1 = scanner.next();
		System.out.print("Ingrese otra cadena: ");
		String s2 = scanner.next();
		
		// muestro las cadenas para verifi car lo que contienen
		System.out.println("s1 = [" + s1 + "]");
		System.out.println("s2 = [" + s2 + "]");
		
		// esto esta mal !!!
		if( s1.equals(s2) ){
			System.out.println("Son iguales");
		}else{
			System.out.println("Son distintas");
		}
	}
}