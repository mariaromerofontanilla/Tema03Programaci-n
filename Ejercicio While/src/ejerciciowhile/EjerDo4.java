package ejerciciowhile;

import java.util.Scanner;

public class EjerDo4 {

	public static void main(String[] args) {
		//variable
		Scanner sc = new Scanner(System.in);
		int num;
		int tabla=0;
		int contador=1;
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		
		do {
			
			tabla= contador * num;
			System.out.println(num + " x " + contador + " = " + tabla);
			contador++;
			
		} while (contador <= 10);
		
			sc.close();
	}

}
