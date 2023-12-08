package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		double num1, num2;

		do {
			opcion = menu();

			if (opcion >= 1 && opcion <= 6) {
				num1 = pideNumero();
				num2 = pideNumero();
				Operaciones operaciones = new Operaciones(num1, num2);

				switch (opcion) {
				case 1:
					System.out.println("Suma: " + operaciones.suma());
					break;
				case 2:
					System.out.println("Resta: " + operaciones.resta());
					break;
				case 3:
					System.out.println("Multiplicación: " + operaciones.multiplicacion());
					break;
				case 4:
					System.out.println("División: " + operaciones.division());
					break;
				case 5:
					System.out.println("Máximo: " + operaciones.max());
					break;
				case 6:
					System.out.println("Mínimo: " + operaciones.min());
					break;
				}
			}

		} while (opcion != 0);

		System.out.println("¡Hasta luego!");
		scanner.close();
	}

	public static int menu() {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		System.out.println("---- Menú ----");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");

		do {
			System.out.print("Elija una opción: ");
			try {
				opcion = scanner.nextInt();
				if (opcion < 0 || opcion > 6) {
					System.out.println("Opción no válida. Inténtelo de nuevo.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduzca un número entero. Inténtelo de nuevo.");
				scanner.next(); // Limpia el buffer del scanner
				opcion = -1;
			}
		} while (opcion < 0 || opcion > 6);

		return opcion;
	}

	public static double pideNumero() {
		Scanner scanner = new Scanner(System.in);
		double numero;

		do {
			System.out.print("Introduzca un número: ");
			try {
				numero = scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
				scanner.next(); // Limpia el buffer del scanner
				numero = Double.NaN;
			}
		} while (Double.isNaN(numero));

		return numero;
	}
}