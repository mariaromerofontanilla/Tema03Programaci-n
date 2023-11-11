package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Este ejercicio va de calcular el mínimo común multiplo de dos numero
 * CASO 1: Usuario introduce 15 y 9 || Resultado: 45
 * CASO 2: Usuario introduce 3 y 22 || Resultado: 66
 * CASO 3: Usuario introduce -15 y -9 || Resultado: Error debes introducir un numero positivo
 * CASO 4: Usuario introduce 0 y 0 || Resultado: 0
 */

public class ejercicio05 {

	public static void main(String[] args) {
		// variable
		// crear las variables a , b y mayor
		int a = 0,b = 0, mayor=0;
		// Creación del escáner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// do del try catch que hace lo siguiente
		do {
			// try que hace lo siguiente
			try {
				// Imprime por pantalla de que introduzca un numero
				System.out.println("Introduce un numero: ");
				// Escaneo y guardado del valor del número
				a = sc.nextInt();
				// Imprime por pantalla de que introduzcas un numero
				System.out.println("Introduce un numero: ");
				// Escaneo y guardado del valor del número
				b = sc.nextInt();
			// catch de exepciones
			} catch (InputMismatchException e) {
				// Imprime por pantalla cuando introduces algo que no esta bien por ejemplo una cadena te dira: Tipo de valor incorecto
				System.out.println("Tipo de valor incorrecto");
				// Scanner de cadena
				sc.nextLine();
			}
		// while de que si la variable a es menor a 0 y de que si la variable b es menor a 0 se salga del bucle
		} while (a<0 && b<0);
		
		// if de que si a es mayor que b que haga lo siguiente
		if (a>b) {
			// la variable mayor sea igual para la variable a
			mayor = a;
		// de lo contrario hara lo siguiente
		} else {
			// la variable mayor sera igual que la variable b
			mayor = b;
		}
		// while de que si el moduelo de mayor%a es lo contrario a 0 o de que moduelo de mayor%b es lo contrario a 0 haga lo siguiente
		while (mayor%a!=0 || mayor%b!=0) {
			// incremento de la variable mayor
			mayor++;
		}
		// Imprime por pantalla cual de los dos numeros introducidos es mayor
		System.out.println(mayor);
		// cierre del Scanner
		sc.close();
}
}
