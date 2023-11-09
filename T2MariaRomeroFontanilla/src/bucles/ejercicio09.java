package bucles;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		// variable
		// Crear la variable num
		int num;
		// Crear la variable contador e igualarlo a 0
		int cont=0;
		// Crear la variable auxiliar
		int aux;
		// Crear Scanner
		Scanner sc = new Scanner(System.in);
		// Imprime por pantalla de que introduzcas un numero
		System.out.println("Introduce un numero: ");
		// Scanner de la variable numero
		num = sc.nextInt();
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
