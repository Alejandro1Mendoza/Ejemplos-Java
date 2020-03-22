package Bloque1;

import java.util.Scanner;

public class array {
		public static void main(String[] args) {
			String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Indique el numero (del 1 al 7) del dia: ");
			
			int valor = scanner.nextInt();
			
			if(0<valor && valor<8) {
				System.out.print(dias[valor]);
			}
			else {
				System.out.print("Indique un valor valido");
			}
		}
	}

