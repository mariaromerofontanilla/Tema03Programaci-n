package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraRectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		double ancho, alto;

		do {
			opcion = menu();

			if (opcion >= 1 && opcion <= 2) {
				ancho = pideAncho();
				alto = pideAlto();

				Rectangulo rectangulo = new Rectangulo(alto, ancho);

				switch (opcion) {
				case 1:
					System.out.println("Perímetro: " + rectangulo.perimetro());
					break;
				case 2:
					System.out.println("Área: " + rectangulo.area());
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
		System.out.println("1. Perímetro");
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

	public static double pideAncho() {
		Scanner sc = new Scanner(System.in);
		double ancho;

		do {
			System.out.print("Introduzca el ancho del rectángulo: ");
			try {
				ancho = sc.nextDouble();
				if (ancho <= 0) {
					System.out.println("El ancho debe ser mayor que cero. Inténtelo de nuevo.");
					ancho = Double.NaN;
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
				sc.nextLine();
				ancho = Double.NaN;
			}
		} while (Double.isNaN(ancho));

		return ancho;
	}

	public static double pideAlto() {
		Scanner sc = new Scanner(System.in);
		double alto;

		do {
			System.out.print("Introduzca el alto del rectángulo: ");
			try {
				alto = sc.nextDouble();
				if (alto <= 0) {
					System.out.println("El alto debe ser mayor que cero. Inténtelo de nuevo.");
					alto = Double.NaN;
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
				sc.nextLine();
				alto = Double.NaN;
			}
		} while (Double.isNaN(alto));

		return alto;
	}
}