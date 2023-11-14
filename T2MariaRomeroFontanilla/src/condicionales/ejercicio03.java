package condicionales;

import java.util.Scanner;
/*
 * Este ejercicio trata de una granja, en la cual te piden la cantidad de comida comprada
 * los kilos de comida que comen cada animal y el numero de animales que tiene
 * CASO 1: Usuario pone 12 de comida comprada, 3 animales y kilos que comen 3 || Resultado ahi comida suficiente
 * CASO 2: Usuario pone 5 de comida comprada, 12 animales y 2 kilos que comen || Resultado: La cantidad para cada uso es de : 0.8333333333333334
 */

public class ejercicio03 {

	public static void main(String[] args) {
		//variable
		// Variable para almacenar la cantidad de comida comprada, kilos de comida y racion
		double cant= 0, klC= 0, racion;
		// Variable de numero de animales
		int numA= 0;
		// Creación del escáner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que ingrese la cantidad de comida comprada
		System.out.println("Introduce la cantidad de comida que has comprado: ");
		// Escaneo y guardado del valor del número
		cant = sc.nextDouble();
		// Solicitar al usuario que ingrese cuántos animales tiene
		System.out.println("Introduce cuantos animales tienes: ");
		// Escaneo y guardado del valor del número
		numA = sc.nextInt();
		// Solicitar al usuario que ingrese los kilos de comida que come cada animal
		System.out.println("Introduce el kilo de comida que come cada animal: ");
		// Escaneo y guardado del valor del número
		klC = sc.nextDouble();
		// if de que si el numero de animales es mayor a 0 que haga lo siguiente
		if (numA > 0) {
			// If de que si la cantidad de comidad es mayor o igual al numero de animales que haga lo siguiente
			if (cant >= numA) {
				// Imprime por pantalla de que si ahi comida sificiente
				System.out.println("Si ahi comida suficiente");
			// de lo contrario
			} else {
				// caclulo de la variable racion que es iguial al kilo de comida que comen, cantidad de comida y numero de animales se divide y luego se multiplica por kilos que come
				racion= klC * (cant/numA);
				// Imprime por pantalla lo que come cada uno
				System.out.println("La cantidad para cada uso es de : " + racion);
			}
		// de lo contrario
		} else {
			// Imprime por pantalla de que debes de introducir algun animal
			System.out.println("Debes de introducir algun animal");
		}
		// Cierre del Scaner
		sc.close();
	}
}