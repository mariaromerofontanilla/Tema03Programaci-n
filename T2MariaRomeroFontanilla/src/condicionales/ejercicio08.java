package condicionales;

import java.util.Scanner;
/*
 * Este ejercicio trata de un bille de tren donde se le pide los kilometros realizados y los dias de estancias eso lo dira el usuario por teclado
 * y el billete de tren por cada kilometro vale 2,5
 * CASO 1: Usuario introduce 200 Kilometros e introduce 2 dias || Resultado: El billete de tren le sale a: 500.0€
 * CASO 2: Usuario introduce 900 Kilometros e introduce 8 dias || Resultado: El billete de tren le sale a: 675.0€ (Ya que se le hace el 30%)
 * CASO 3: Usuario introduce 0 Kilometros e introduce 0 dias || Resultado: El billete de tren le sale a: 0€
 * CASO 4: Usuario introduce 20 Kilometros e introduce 0 dias || Resultado: El billete de tren le sale a: 50.0€
 */

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
		// Creación del escáner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// Pedir al usuario que introduzca por teclado la distancia
		System.out.println("Introduzca la distancia: ");
		// Escaneo y guardado del valor del número
		distancia = sc.nextInt();
		// Pedir al usuario que introduzca por teclado los dias
		System.out.println("Introduzca los dias");
		// Escaneo y guardado del valor del número
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
