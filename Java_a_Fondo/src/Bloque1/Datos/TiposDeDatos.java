package Bloque1.Datos;

import javax.swing.JOptionPane;

public class TiposDeDatos {
	public static void main(String[] args) {
		char c=94;
		String op = JOptionPane.showInputDialog(null, "Incerte la opción: \n1: Byte\n2: Short\n3: Int\n4: Long\n5: Float\n6: Double\n7: Char\n8: Boolean", "Tipos de datos", 2);
		
		switch(op){
			case "1":
				JOptionPane.showMessageDialog(null, "Tipo de dato: byte\nRepresentación: Numérico Entero con Signo\nTamaño (Bytes): 1\nRango de Valores: -128 a 127\nValor por defecto: 0\nClase Asociada: Byte", "Caracteristicas del Byte", 1);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "Tipo de dato: short\nRepresentación: Numérico Entero con signo\nTamaño (Bytes): 2\nRango de Valores: -32 768 a 32 767\nValor por defecto: 0\nClase Asociada: Short", "Caracteristicas del Short", 1);
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "Tipo de dato: int\nRepresentación: Numérico Entero con signo\nTamaño (Bytes): 4\nRango de Valores: -2 147 483 648 a 2 147 483 647\nValor por defecto: 0\nClase Asociada: Integer", "Caracteristicas del int", 1);
				break;
			case "4":
				JOptionPane.showMessageDialog(null, "Tipo de dato: long\nRepresentación: Numérico Entero con signo\nTamaño (Bytes): 8\nRango de Valores: -9 223 372 036 854 775 808 a 9 223 372 036 854 775 807\nValor por defecto: 0\nClase Asociada: Long", "Caracteristicas del long", 1);
				break;
			case "5":
				JOptionPane.showMessageDialog(null, "Tipo de dato: float\nRepresentación: Numérico en Coma flotante de precisión simple Norma IEEE 754\nTamaño (Bytes): 4\nRango de Valores: -3.4x10"+c+"-38 a 3.4x10"+c+"38 \nValor por defecto: 0.0\nClase Asociada: Float", "Caracteristicas del float", 1);
				break;
			case "6":
				JOptionPane.showMessageDialog(null, "Tipo de dato: double\nRepresentación: Numérico en Coma flotante de precision doble Norma IEEE 745\nTamaño (Bytes): 8\nRango de Valores: -1.8x10"+c+"-308 a 1.8x10"+c+"308\nValor por defecto: 0.0\nClase Asociada: Double", "Caracteristicas del double", 1);
				break;
			case "7":
				JOptionPane.showMessageDialog(null, "Tipo de dato: char\nRepresentación: Carácter Unicode\nTamaño (Bytes): 2\nRango de Valores: \\u0000 a \\uFFFF\nValor por defecto: \\0000\nClase Asociada: Character", "Caracteristicas del char", 1);
				break;
			case "8":
				JOptionPane.showMessageDialog(null, "Tipo de dato: boolean\nRepresentación: Dato lógico\nTamaño (Bytes): -\nRango de Valores: true ó false\nValor por defecto: false\nClase Asociada: Boolean", "Caracteristicas del boolean", 1);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Dijite una opcion correccta");		
		}
	}
}