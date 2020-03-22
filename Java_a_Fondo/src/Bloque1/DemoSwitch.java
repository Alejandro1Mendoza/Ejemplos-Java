package Bloque1;

import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el del 1 al 7 el dia que quiere saber: ");
		
		int dia = scanner.nextInt();
		
		switch(dia){
			case 1:{
				System.out.print("Lunes");
				break;
			}
			case 2:{
				System.out.print("Martes");
				break;
			}
			case 3:{
				System.out.print("Miercoles");
				break;
			}
			case 4:{
				System.out.print("Jueves");
				break;
			}
			case 5:{
				System.out.print("Viernes");
				break;
			}
			case 6:{
				System.out.print("Sabado");
				break;
			}
			case 7:{
				System.out.print("Domingo");
				break;
			}
			default:{
				System.out.print("Indique un valor valido: entre 1 a 7");
				break;
			}
		}
	}
}
