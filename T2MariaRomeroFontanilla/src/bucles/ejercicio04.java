package bucles;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// variable
		// crear la variable a, b menor y por ultimo la variable i todas numeros enteros
		int a, b, menor, i;
		// Crear Scanner
		Scanner sc = new Scanner(System.in);
		// Imprime por pantalla de que introduzcas un numero
		System.out.println("Introduce un numero: ");
		// Scanner de la variable a
		a = sc.nextInt();
		// Imprime por pantalla de que introduzcas un numero
		System.out.println("Introduce un numeros: ");
		// Scanner de la variable b
		b = sc.nextInt();
		// if de que si a es menor que b que haga lo siguiente
		if (a<b) {
			// la variable menor sea igual a la variable a
			menor = a;
		// de lo contrario
		} else {
			// la variable menor sera la variable b
			menor = b;
		}
		// for de que si la variable i es igual a menor y de que i sea mayor o igual a dos i se ira restando
		for(i = menor; i >= 2;i--) {
			// if de que si el modulo de la variable a%i es igual a 0 y de que si el moduelo de b%i es igual a 0 haga lo siguiente
			if (a%i==0 && b%i==0){
				// break para que se salga del tiron del bucle
				break;
			}
		}
		// Imprime el resultado el cual es la variable i que te dira cual es menor de los dos numero introducidos
		System.out.println(i);
		// Cierre del Scanner
		sc.close();
	}
}
