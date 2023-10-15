package ejerciciowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//variable
		Scanner sc = new Scanner(System.in);
		int edad;
		int contadormayor = 0;
		int media = 0;
		int suma = 0;
		int contadoralum = 0;
		
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		
		contadoralum++;
		
		while (edad >= 0) {
			contadoralum++;
			suma = suma + edad;
			
			if (edad >= 18) {
				contadormayor++;
			}
			System.out.println("Introduzca su edad: ");
			edad = sc.nextInt();
		}
		media = suma / contadoralum;
		System.out.println("La media es: " + media);
		System.out.println("La cantidad de alumnos mayores de edad son: " + contadormayor);
		System.out.println("La suma es: " + suma);
		System.out.println("La cantidad de alumnos son: " + contadoralum);
		
		
		sc.close();
	}

}
