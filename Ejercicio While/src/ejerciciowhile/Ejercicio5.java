package ejerciciowhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//variable
		Scanner sc = new Scanner(System.in);
		int num;
		int contadornum = 1;
		int contador = 0;
		int media = 0;
		int suma = 0;
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		
		contadornum++;
		
		while (contadornum <= 10) {
			contadornum++;
			suma = suma + num;
			if (num == 0) {
				contador++;
			}
			
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
			
		}
		
		media = suma / contadornum;
		System.out.println("La media es: " + media);
		System.out.println("La cantidad de 0 que ahi son: " + contador);
		System.out.println("La suma de los numeros es: " + suma);
	
		sc.close();

	}

}
