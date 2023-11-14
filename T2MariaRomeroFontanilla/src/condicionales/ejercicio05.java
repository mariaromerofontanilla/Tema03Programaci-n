package condicionales;

import java.util.Scanner;
/*
 * Este ejercicio te pide que introduzcas un numero el usuario y te dira cual es su valor absoluto
 * CASO 1: Usuario pone 0 || Resultado 0
 * CASO 2: Usuario pone 9 || Resultado: 9
 * CASO 3: Usuario pone 20 || Resultado: 20
 * Todos los numeros positivos su valor absoluto sera el mismo
 * CASO 4: Usuario pone -1 || Resultado: 1
 * CASO 5: Usuario pone -60 || Resultado: 60
 * CASO 6: Usuario pone -43 || Resultado: 43
 * Todos los numeros negativos su valor absoluto sera el mismo pero en positivo
 */

public class ejercicio05 {

	public static void main(String[] args) {
		//variable
		// Variable de numero y variable de calculo
		int num, calculo;
		// Creación del escáner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// Imprime por pantalla diciendo que el usuario ingrese un numero
		System.out.println("Introduce un numero: ");
		// Escaneo y guardado del valor del número
		num = sc.nextInt();
		// Calculo de la variable calculo diciendo que si es numero es mayor o igual a 0 que diga numero de lo contrario que lo multiplique por -1
		calculo = num >= 0 ? num : num * -1;
		//Imprime por pantalla el resultado de calculo
		System.out.println("Valor absoluto del numero: " + num + " es: " +calculo);
		// Cierre del Scanner
		sc.close();
		}
	}