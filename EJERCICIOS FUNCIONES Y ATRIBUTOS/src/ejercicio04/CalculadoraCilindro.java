package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCilindro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		double radioBase, altura;

		do {
			opcion = menu();

			if (opcion >= 1 && opcion <= 2) {
				radioBase = pideRadioBase();
				altura = pideAltura();

				Cilindro cilindro = new Cilindro(radioBase, altura);

				switch (opcion) {
				case 1:
					System.out.println("Volumen: " + cilindro.volumen());
					break;
				case 2:
					System.out.println("Área: " + cilindro.area());
					break;
				}
			}

		} while (opcion != 0);

		System.out.println("¡Hasta luego!");
		sc.close();
	}

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("---- Menú ----");
		System.out.println("1. Volumen");
		System.out.println("2. Área");
		System.out.println("0. Salir");

		do {
			System.out.print("Elija una opción: ");
			try {
				opcion = sc.nextInt();
				if (opcion < 0 || opcion > 2) {
					System.out.println("Opción no válida. Inténtelo de nuevo.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduzca un número entero. Inténtelo de nuevo.");
				sc.nextLine();
				opcion = -1;
			}
		} while (opcion < 0 || opcion > 2);

		return opcion;
	}

	public static double pideRadioBase() {
		Scanner sc = new Scanner(System.in);
		double radioBase;

		do {
			System.out.print("Introduzca el radio de la base del cilindro: ");
			try {
				radioBase = sc.nextDouble();
				if (radioBase <= 0) {
					System.out.println("El radio de la base debe ser mayor que cero. Inténtelo de nuevo.");
					radioBase = Double.NaN;
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
				sc.nextLine();
				radioBase = Double.NaN;
			}
		} while (Double.isNaN(radioBase));

		return radioBase;
	}

	public static double pideAltura() {
		Scanner sc = new Scanner(System.in);
		double altura;

		do {
			System.out.print("Introduzca la altura del cilindro: ");
			try {
				altura = sc.nextDouble();
				if (altura <= 0) {
					System.out.println("La altura del cilindro debe ser mayor que cero. Inténtelo de nuevo.");
					altura = Double.NaN;
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
				sc.nextLine();
				altura = Double.NaN;
			}
		} while (Double.isNaN(altura));

		return altura;
	}
}
