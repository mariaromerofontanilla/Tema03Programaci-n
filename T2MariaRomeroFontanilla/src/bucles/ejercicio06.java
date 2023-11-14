package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Este programa trata de pedir al usuario un numero entre 0 y 20 y luego se repetira tantas veces como el valor que marca el numero
 * CASO 1: Usuario pone: 5 || Resultado: 
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * CASO 2: Usuario pone: -3 || Resultado: Debes introducir un numero del 0 al 20
 * CASO 3: Usuario pone: 0 || Resultado: 0
 */

public class ejercicio06 {

	public static void main(String[] args) {
		// variable
		// Crear la variable n
		int n = 0;
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
		// while de que si numero es menor o igual a 0 y de que si numero es menor o igual a 20 se salga del bucle
		} while (n <= 0 && n >= 20);
		
		// if de que si la variable n es mayor o igual a 0 u ademas es menor o igual a 20 que haga lo siguiente
		if (n >= 0 && n <= 20) {
			// for donde crea la variable i donde la pondra que es igual a i ademas de que i sea menor o igual a la variable n y un incremento de la variabe i
			for (int i = 1; i <= n; i++) {
				// for donde se crea la varible j que se igualara a uno ademas diremos de que j es menor o igual a la variable i j se incrementara
				for (int j = 1; j <= i; j++) {
				// Imprime por pantalla el resultado
				System.out.print(i);
				}
				// salto de línea
				System.out.println();
			}
		// de lo contrario dira lo siguiente
		} else {
			// Imprime por pantalla una informacion dicioendop de que el numero que introduzca debe ser mayor o igual a que 0 y menor o igual a 20
			System.out.println("Debes introducir un numero del 0 al 20");
		}
		// cierre del Scanner
		sc.close();
	}

}
