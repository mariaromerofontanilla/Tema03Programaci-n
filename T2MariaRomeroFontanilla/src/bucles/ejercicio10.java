package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// variable
		// Crear la variable n, num cal e igualarla a 0 y calculo
		int n = -1, num = -1, cal=0,calculo;
		// Creación del escáner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// do del comienzo del try catch
		do {
			// comienzo try que hace lo siguiente
			try {
				// Imprime por pantalla de que introduzcas un numero
				System.out.println("Introduzca un numero: ");
				// Escaneo y guardado del valor del número
				n = sc.nextInt();
				// Escaneo y guardado del valor del número
				num = n;
			// catch de exepciones
			} catch (InputMismatchException e) {
				// Imprime por pantalla cuando introduces algo que no esta bien por ejemplo una cadena te dira: Tipo de valor incorecto
				System.out.println("Tipo de valor incorrecto");
				// Scanner de cadena
				sc.nextLine();
			}
		// while de que si el numero es menor que 0 se salga del bucle
		} while (num < 0);
		
		// while de que si el numero es mayor a cero que haga llo siguiente
		while (num > 0) {
			// calculo de la variable calculo donde dice que tiene que hacer el modulo de la variable numero modulo 10
			calculo = num % 10;
			// calculo de la variable cal donde dice que se multiplica por 10 la variable 10 y seguidamente se suma por el resultado del calculo anterior
			cal = cal * 10 + calculo;
			// calculo de la variable num donde dice que se divide num entre 10
			num = num /10;
		}
		// if de que si la variable cal es igual igual a la variable n que diga lo sguiente
		if (cal == n) {
			// Imprime por pantalla de que el numero es capicua
			System.out.println("Es capicua");
		// De lo contrario que diga lo siguiente
		} else {
			// Imprime por pantalla de que el numero no es capicua
			System.out.println("No es capicua");
		}
		// Cierre del Scanner
		sc.close();
}
}