package Bloque1;

import java.util.Scanner;

public class DemoArray {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un valor (0 a 10): ");
		
		int v = scanner.nextInt();
		
		int i=0;
		
		while(v!=0 && i<10) {
			
			arr[i++] = v;
			
			System.out.print("Ingrese el siguiente valor (0=>fin): ");
			v = scanner.nextInt();
		}
		
		for(int j=0; j<i; j++) {
			System.out.print(arr[j]);
		}
	}
}
