package Bloque1.Datos;

import java.text.ParseException;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class CodigoImprimibleASCII {
		public static void main(String args[]) throws ParseException {
	        
	        // converting character to ASCII value in Java Pero solo imprime la version normal, no la extendida
	        char A = 32;
	        int ascii = 32;
	        JOptionPane.showMessageDialog(null, "ASCII valor de Espacio is  : " + ascii);

	        for(int i=33; i<256; i++) {
	        	char a = (char) i;
	        	System.out.print(i+" ---> "+a+"\n");
	        }
	        
		}
}
