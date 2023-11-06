package bucles;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// variable
		int a, b, calculo = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		a = sc.nextInt();
		
		System.out.println("Introduce un numeros: ");
		b = sc.nextInt();
		
		while (a != b) {
			if (a > b) {
				calculo = a - b;
			} else {
				calculo = b- a;
			}
		}
		System.out.println(calculo);

	}

}
