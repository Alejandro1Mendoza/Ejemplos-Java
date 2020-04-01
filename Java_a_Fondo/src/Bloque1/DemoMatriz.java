package Bloque1;

import java.util.Scanner;

public class DemoMatriz{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad de filas: ");
		int x=scanner.nextInt();
		
		System.out.print("Ingrese cantidad de columnas: ");
		int y=scanner.nextInt();
		
		// creo una matriz de n fi las x m columnas
		int mat[][]=new int[x][y];
		int nro = 0,i=0,j=0;
		
		for(i=0; i<x; i++ ){
			for(j=0; j<y; j++){
				// genero un numero aleatorio entre 0 y 1000
				nro=(int)(Math.random()*1000);
				// asigno el numero en la matriz
				mat[i][j]=nro;
			}
		}
		
		//
		
		for(i=0; i<x; i++ ){
			for(j=0; j<y; j++){
				// imprimo la celda de la matriz
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
