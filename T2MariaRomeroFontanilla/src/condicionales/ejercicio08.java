package condicionales;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		//Constante
		double PRECIOKILOMETRO= 2.5;
		// Declaración de variables
		//variables
		// variable double ( permite numeros decimales )
		double calculodes, descuento, calculo;
		// variable int ( numeros enteros ) discancia y dias
		int distancia, dias;
		// Creación del Scanner
		Scanner sc = new Scanner(System.in);
		// Pedir al usuario que introduzca por teclado la distancia
		System.out.println("Introduzca la distancia: ");
		// Scannear la variable distancia
		distancia = sc.nextInt();
		// Pedir al usuario que introduzca por teclado los dias
		System.out.println("Introduzca los dias");
		// Scanner de la variable dias
		dias = sc.nextInt();
		
		// If donde hacemos el calculo de que si la distancia es igual o mayor a 800y los dias sean igual o mayor a 7, que haga lo siguiente
		if (distancia >= 800 && dias >= 7) {
		// calculo de preciokilometreo por distancia
		calculodes = PRECIOKILOMETRO * distancia;
		// calculo del descuento que es calcular el resultado obtenido anteriormente por 0,30
		descuento = calculodes * 0.30;
		// calculo del descuento que simplemento se resta el descuento a lo que valen las entradas sin descuento
		calculodes -= descuento;
		// Imprime por pantalla la cantidad de dinero que tiene que pagar con el decuento ya añadido
		System.out.println("El billete de tren le sale a: " + descuento + "€");
		// de lo contrario
		} else {
		// Solo ara falta hacer el calculo de la distancia por el precio de quilometros
		calculo = PRECIOKILOMETRO * distancia;
		// Imprime por pantalla lo que le cuesta el billete
		System.out.println("El billete de tren le sale a: " + calculo + "€");
		}
		// Cierre del Scanner
		sc.close();
		}
	}
