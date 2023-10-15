package ejerciciowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//variable
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num;
		int num2 = r.nextInt(1,100);
		
		System.out.println("Introduce un numero del 1 al 100: ");
		num = sc.nextInt();
		
		while (num > num2 && num > 0) {
			System.out.println("menor");
			
			System.out.println("Introduce un numero del 1 al 100: ");
			num = sc.nextInt();
			
			if (num == -1) {
				System.out.println("Te has rendido");
			}
			if (num == num2) {
				System.out.println("Excelente acertaste!!!!");
			}
		}
		
		while (num < num2 && num > 0) {
			System.out.println("mayor");
			
			System.out.println("Introduce un numero del 1 al 100: ");
			num = sc.nextInt();
			
			if (num == -1) {
				System.out.println("Te has rendido");
			}
			
			if (num == num2) {
				System.out.println("Excelente acertaste!!!!");
			}
		}
		
		if (num == num2) {
			System.out.println("Excelente acertaste!!!!");
		}
		
		sc.close();
	}

}
