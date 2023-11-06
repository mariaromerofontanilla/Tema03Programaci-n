package condicionales;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		//variable
		// Variable de numero y variable de calculo
		int num, calculo;
		// Crear Scanner
		Scanner sc = new Scanner(System.in);
		// Imprime por pantalla diciendo que el usuario ingrese un numero
		System.out.println("Introduce un numero: ");
		// Scanner del numero
		num = sc.nextInt();
		// Calculo de la variable calculo diciendo que si es numero es mayor o igual a 0 que diga numero de lo contrario que lo multiplique por -1
		calculo = num >= 0 ? num : num * -1;
		//Imprime por pantalla el resultado de calculo
		System.out.println(calculo);
		// Cierre del Scanner
		sc.close();
		}
	}