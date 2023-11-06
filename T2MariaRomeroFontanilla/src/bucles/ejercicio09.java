package bucles;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		// variable
		int num;
		int cont=0;
		int aux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		aux=num;
		
		if (num > 0) {
		do {
			aux= aux/10;
			cont++;
			
		} while(aux > 0);
		
		} else {
			System.out.println("Tienes que introducir un numero que sea mayor que 0");
		}
		System.out.println("El numero " + num + " tiene: " + cont + " digitos");
		
		sc.close();
	}

}
