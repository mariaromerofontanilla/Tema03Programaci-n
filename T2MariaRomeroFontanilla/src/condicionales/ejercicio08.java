package condicionales;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		//Constante
		double precioKilometro= 2.5;
		//variables
		double calculodes, descuento, calculo;
		int distancia, dias;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la distancia: ");
		distancia = sc.nextInt();
		System.out.println("Introduzca los dias");
		dias = sc.nextInt();

		if (distancia >= 800 && dias >= 7) {
		calculodes = precioKilometro * distancia;
		descuento = calculodes * 0.30;
		calculodes -= descuento;
		System.out.println("El billete de tren le sale a: " + descuento + "€");
		} else {
		calculo = precioKilometro * distancia;
		System.out.println("El billete de tren le sale a: " + calculo + "€");
		}
		}
	}