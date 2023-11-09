package bucles;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		// variable
		// Crear la variable n
		int n;
		// Crear el Scanner
		Scanner sc = new Scanner(System.in);
		// Imprime por pantalla de que incgrese un numero entero
		System.out.print("Introduzca un número entero: ");
		// Scanner de la varianle n
		n = sc.nextInt();
		// for donde se crea la variable i que sera igual y de que si i es menor igual a la variable n y de i se incremente
		for (int i = 1; i <= n; i++) {
		// Imprime espacios en blanco en la parte izquierda del triángulo
		for (int j = 1; j <= n - i; j++) {
		System.out.print(" ");
		}
		// Imprime asteriscos en la parte derecha del triángulo
		for (int j = 1; j <= i; j++) {
		System.out.print("* ");
		}

		// Salto de línea para la siguiente fila del triángulo
		System.out.println();
		}
		// cierre del Scanner
		sc.close();
	}
}