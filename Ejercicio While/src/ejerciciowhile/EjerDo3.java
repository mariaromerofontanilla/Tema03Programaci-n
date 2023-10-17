package ejerciciowhile;

import java.util.Scanner;

public class EjerDo3 {

	public static void main(String[] args) {
		//Variable
		Scanner sc = new Scanner(System.in);
		int contador=1;
		int num;
		int suma = 0;
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		
		do {
			suma = suma + contador;
			contador++;
			
		}while (contador <= num);
		
		System.out.println("El resultado de la suma es: " + suma);
		
		sc.close();
	}

}
