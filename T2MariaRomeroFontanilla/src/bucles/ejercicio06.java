package bucles;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		// variable
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		n = sc.nextInt();
		
		if (n >= 0 && n <= 20) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
				System.out.print(i);
				}

				System.out.println();
			}
		} else {
			System.out.println("Debes introducir un numero del 0 al 20");
		}
		sc.close();
	}

}
