package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		// variable
		// crear la variable n
		int n = -1;
		// Creación del escáner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// do del try catch que hace lo siguiente
		do {
			// try que hace lo siguiente
			try {
				// Imprime por pantalla de que introduzcas un numero
				System.out.print("Introduce un numero: ");
				// Escaneo y guardado del valor del número
				n = sc.nextInt();
			// catch de exepciones
			} catch (InputMismatchException e) {
				// Imprime por pantalla cuando introduces algo que no esta bien por ejemplo una cadena te dira: Tipo de valor incorecto
				System.out.println("Tipo de valor incorrecto");
				// Scanner de cadena
				sc.nextLine();
			}
		// while de que si numero es menor o igual a 0 se salga del bucle
		} while (n <= 0);
		
			// for donde se crea la variabe i y se dice de que si i nes menor o igual a n, i se invcrementa
			for (int i = 1; i <= n; i++) {
				// for donde se crea j donde se iguala a 1 y se dice de que si j es menor o igual a i j se incrementa
				for (int j = 1; j <= i; j++) {
				// Imprime por pantalla el resultado de la variable j	
				System.out.print(j);
				}
				// For donde se crea la varibe a donde se iguala a i y se le resta 1 ademas a debera se mayor o igual a 1 y a se ira restando
				for (int a = i-1; a >= 1; a--) {
					// Imprime resultado de la variable a
					System.out.print(a);
				}
				// salto de línea
				System.out.println();
			}
		// Cierre del Scanner	
		sc.close();
	}

}
