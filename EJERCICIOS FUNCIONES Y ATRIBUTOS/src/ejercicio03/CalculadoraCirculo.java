package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		double radio;

		do {
			opcion = menu();

			if (opcion >= 1 && opcion <= 2) {
				radio = pideRadio();

				Circulo circulo = new Circulo(radio);

				switch (opcion) {
				case 1:
					System.out.println("Circunferencia: " + circulo.circunferencia());
					break;
				case 2:
					System.out.println("Área: " + circulo.area());
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
		System.out.println("1. Circunferencia");
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

	public static double pideRadio() {
		Scanner sc = new Scanner(System.in);
		double radio;

		do {
			System.out.print("Introduzca el radio del círculo: ");
			try {
				radio = sc.nextDouble();
				if (radio <= 0) {
					System.out.println("El radio debe ser mayor que cero. Inténtelo de nuevo.");
					radio = Double.NaN;
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
				sc.nextLine();
				radio = Double.NaN;
			}
		} while (Double.isNaN(radio));

		return radio;
	}
}