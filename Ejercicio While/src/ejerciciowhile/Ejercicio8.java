package ejerciciowhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//variable
		Scanner sc = new Scanner(System.in);
		int num;
		int grande=0;
		
		System.out.println("Introduce la altura de un arbol: ");
		num = sc.nextInt();
		
		while (num > 0) {
			if (num > grande) {
				grande = num;
			}
			System.out.println("Introduce la altura de un arbol: ");
			num = sc.nextInt();
		}
		
		System.out.println("El arbol más grande mide: " + grande + " centimetros");
		sc.close();
	}

}
