package bucles;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Por favor, ingresa un número entero n: ");
		n = sc.nextInt();
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
		sc.close();
	}
}