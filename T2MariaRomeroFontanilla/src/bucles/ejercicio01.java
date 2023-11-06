package bucles;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		// Variables
		int hora;
		int minutos;
		int segundos;
		int cantSegundos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Introduzca la hora: ");
		hora = sc.nextInt();
		
		System.out.println(" Introduzca los minutos: ");
		minutos = sc.nextInt();
		
		System.out.println(" Introduzca los segundos: ");
		segundos = sc.nextInt();
		
		System.out.println(" Introduzca la cantidad de segundos que quieres que se sume a tu hora dada anteriormente: ");
		cantSegundos = sc.nextInt();
		
		if (hora <= 23 && segundos <= 59 && segundos <= 59) {
			for (int cont = 0; cont < cantSegundos; cont++) {
				segundos++;
				if (segundos >= 60) {
					segundos = 0;
					minutos = minutos + 1;
					if (minutos >= 60) {
						minutos = 0;
						hora = hora + 1;
						if (hora >= 24) {
							hora = 0;
							segundos = segundos + 1;
						}
					}
				}
			}
		} else {
			System.out.println("Error");
		}
		System.out.println("La hora actual es: " + hora + " : " + minutos + " : " + segundos);
		
	sc.close();
	}

}
