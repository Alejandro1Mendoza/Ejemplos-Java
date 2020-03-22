package Bloque1;

import java.util.Scanner;

public class DemoSwitch0 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String Dia;
		
		System.out.print("Ingrese el dia de la semana del 1 al 7: ");
		
		int dia = scanner.nextInt();
		
		
		switch(dia) {
			case 1: Dia = "Lunes"; break;
			case 2: Dia = "Martes"; break;
			case 3: Dia = "Miercoles"; break;
			case 4: Dia = "Jueves"; break;
			case 5: Dia = "Viernes"; break;
			case 6: Dia = "Sabado"; break;
			case 7: Dia = "Domingo"; break;
			default: Dia = "Ingrese un valor valido: entre 1 a 7"; break;
		}
		System.out.print(Dia);
	}
}
