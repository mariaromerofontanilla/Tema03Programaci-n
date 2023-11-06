package bucles;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// variable
		int num;
		int unidad= 0, decenas= 0, centenas= 0, mil= 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		if (num >= 0) {
			do {
				if (num == num){
					System.out.println("Es capicua");
				} else if () {
					
				}
			} while (unidad != decenas || unidad != centenas || (unidad != mil && decenas != centenas));
	} else {
		System.out.println("Introduce un numero que sea igual a 0 o mayor que este");
	}
		System.out.println("No capicua");
}
}
