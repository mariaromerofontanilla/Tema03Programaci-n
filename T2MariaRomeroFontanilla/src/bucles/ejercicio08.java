package bucles;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		// variables
		int num;
		int contC=0;
		int contF=0;
		int aux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero inicial: ");
		num = sc.nextInt();
		
		do {
			contC++;
			aux = num;
			System.out.println("Dime un numero: ");
			num = sc.nextInt();
			
			if (num < aux && (num > 0 || num < 0)) {
				System.out.println("Fallo es menor.");
				contF++;
			}
			
		} while (num > 0 || num < 0);
		System.out.println("Total de numeros introducidos: " + contC);
		System.out.println("Total numeros fallados: " + contF);
	
		sc.close();
	}

}
