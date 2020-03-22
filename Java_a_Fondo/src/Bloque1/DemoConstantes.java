package Bloque1;

import java.util.Scanner;

public class DemoConstantes {
	
	public static final int Lunes = 1;
	public static final int Martes = 2;
	public static final int Miercoles = 3;
	public static final int Jueves = 4;
	public static final int Viernes = 5;
	public static final int Sabado = 6;
	public static final int Domingo = 7;
	
	
	public static void main(String[] args) {
		String dia;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Indica el valor del dia: ");
		
		int num = scanner.nextInt();
		
		switch(num){
			case Lunes: dia = "Lunes"; break;
			case Martes: dia = "Martes"; break;
			case Miercoles: dia = "Miercoles"; break;
			case Jueves: dia = "Jueves"; break;
			case Viernes: dia = "Viernes"; break;
			case Sabado: dia = "Sabado"; break;
			case Domingo: dia = "Domingo"; break;
			default: dia = "Numero Invalido, favor de poner un valor entre 1 a 7"; break;
		}
		System.out.print(dia);
	}
}
