package bucles;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		// variable
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		n = sc.nextInt();
		
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
				System.out.print(j);
				}
				for (int a = i-1; a >= 1; a--) {
					System.out.print(a);
				}

				System.out.println();
			}
			
		sc.close();
	}

}
