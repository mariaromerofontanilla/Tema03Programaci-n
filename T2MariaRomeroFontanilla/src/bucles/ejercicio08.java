package bucles;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		// variables
		// Crear la variable num
		int num;
		// Crear la variable contador y se iguala a cero
		int contC=0;
		// Crear la variable contador final y se iguala a cero
		int contF=0;
		// Crear la variabele auxiliar
		int aux;
		// Crear Scanner
		Scanner sc = new Scanner(System.in);
		// Imprime por pantalla de que introduzca un numero inicial
		System.out.println("Introduce un numero inicial: ");
		// Scanner de la variable num
		num = sc.nextInt();
		// do donde se hara un calculo de lo siguiente
		do {
			contC++; // Incremento de la variable contador
			aux = num; // igualar la variable auxiliar a la variable numero
			// Imprime por pantalla de que diga un numero
			System.out.println("Dime un numero: ");
			// Scanner de la variable num
			num = sc.nextInt();
			// if de que si numero es menor a la variable auxiliar y de que si numero es mayor a sero o menor que cero que haga lo siguiente
			if (num < aux && (num > 0 || num < 0)) {
				// Imprime por pantalla de que fallo es menor
				System.out.println("Fallo es menor.");
				// Incremento de la variable final
				contF++;
			}
		/// while donde dice si numero es mayor a 0 o menor a cero se salga del bucle
		} while (num > 0 || num < 0);
		// Imprime por pantalla el totala de numero introducidos
		System.out.println("Total de numeros introducidos: " + contC);
		// Imprime por pantalla el total de numeros fallados
		System.out.println("Total numeros fallados: " + contF);
		// Cierre del Scanner
		sc.close();
	}

}
