package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Este porgrama dice cuántos dígitos tiene un número introducido por teclado.
 * CASO 1: Usuario pone: 20 || Resultado: El numero 20 tiene: 2 digitos
 * CASO 2: Usuario pone: -9 || Resultado: Tienes que introducir un numero que sea mayor que 0
 * CASO 3: Usuario pone: 2000 || Resultado: Tienes que introducir un numero que sea mayor que 0
 * CASO 4: Usuario pone: 023 || Resultado: El numero 23 tiene: 2 digitos
 */

public class ejercicio09 {

	public static void main(String[] args) {
		// variable
		// Crear la variable num
		int num = 0;
		// Crear la variable contador e igualarlo a 0
		int cont=0;
		// Crear la variable auxiliar
		int aux;
		// Creación del escáner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// do de creacion del try catch que hace lo siguiente
		do {
			// try que hace lo siguiente
			try {
				// Imprime por pantalla de que introduzcas un numero
				System.out.println("Introduce un numero: ");
				// Escaneo y guardado del valor del número
				num = sc.nextInt();
			// catch de excepciones
			} catch (InputMismatchException e) {
				// Imprime por pantalla cuando introduces algo que no esta bien por ejemplo una cadena te dira: Tipo de valor incorecto
				System.out.println("Tipo de valor incorrecto");
				// Scanner de cadena
				sc.nextLine();
			}
		// While que si el numero es menor a 0 se sale del bucle
		} while (num < 0);
		
		// igualar la variable auxiliar a numero
		aux=num;
		// if donde dice si numero es mayor a cero que haga lo siguiente
		if (num > 0) {
		// do donde dice lo siguiente
		do {
			aux= aux/10;// calculo de la variable auxiliar donde se divide el auxiliar entre 10
			cont++; // Incremento del contador
		// while que dice si la variable auxiliar es mayor a cero se salga del bucle
		} while(aux > 0);
		// de lo contrario que diga
		} else {
			// Imprime por pantalla de que tienes que introducir un numero que sea mayor que 0
			System.out.println("Tienes que introducir un numero que sea mayor que 0");
		}
		// Imprime por pantalla el numero introducido y cuantos digitos tiene
		System.out.println("El numero " + num + " tiene: " + cont + " digitos");
		// Cierre del Scanner
		sc.close();
	}

}
