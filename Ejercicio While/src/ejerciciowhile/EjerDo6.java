package ejerciciowhile;

import java.util.Scanner;

public class EjerDo6 {

	public static void main(String[] args) {
		//variable
		Scanner sc = new Scanner(System.in);
		final String piedra = "PIEDRA", papel = "PAPEL", tijera = "TIJERA";
		String j1, j2;
		int s=0;
		
		do {
			System.out.println("Jugador1 introduzca piedra, papel o tijera");
			j1 = sc.next();
			
			System.out.println("Jugador2 introduzca piedra, papel o tijera");
			j2 = sc.next();
			
			if (j1.equalsIgnoreCase(piedra) && j2.equalsIgnoreCase(piedra) || j1.equalsIgnoreCase(papel) && j2.equalsIgnoreCase(papel) || j1.equalsIgnoreCase(tijera) && j2.equalsIgnoreCase(tijera)) {
				System.out.println("Empate");
			} else if (j1.equalsIgnoreCase(piedra) && j2.equalsIgnoreCase(tijera) || j1.equalsIgnoreCase(papel) && j2.equalsIgnoreCase(piedra) || j1.equalsIgnoreCase(tijera) && j2.equalsIgnoreCase(papel)) {
				System.out.println("Gana el jugador1");
			} else if (j1.equalsIgnoreCase(piedra) && j2.equalsIgnoreCase(papel) || j1.equalsIgnoreCase(papel) && j2.equalsIgnoreCase(tijera) || j1.equalsIgnoreCase(tijera) && j2.equalsIgnoreCase(piedra)) {
				System.out.println("Gana el jugador2");
			} else {
				System.out.println("Error no has introducido ni piedra ni papel ni tijera");
			}
		} while (s != -1);
		do {

            System.out.println("¿Quieres seguir jugando? (S/N): ");
        } while (sc.next().equalsIgnoreCase("S"));

        System.out.println("¡Gracias por jugar! Hasta luego.");
        sc.close();
	}
		
		
		
	}

