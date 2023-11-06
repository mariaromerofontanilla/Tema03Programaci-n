package condicionales;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas;
		int minutos;
		int segundos;
		System.out.println("Introduzca la hora: ");

		horas = sc.nextInt();
		System.out.println("Introduzca los minutos: ");
		minutos = sc.nextInt();
		System.out.println("Introduzca los segundos: ");
		segundos = sc.nextInt();
		segundos++; // Incrementar un segundo
		if (segundos < 60 && minutos < 60 && horas < 24) {
		if (segundos >= 60) {
		segundos = 0;
		minutos++;
		if (minutos >= 60) {
		minutos = 0;
		horas++;
		if (horas >= 24) {
		horas = 0;
		}
		}
		}
		System.out.println("Hora después de incrementar un segundo: " + horas + " : " + minutos + ": " + segundos);
		} else {
		System.out.println("No existe");
		}

		sc.close();
		}
	}
