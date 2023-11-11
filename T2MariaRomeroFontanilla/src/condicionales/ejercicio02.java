package condicionales;

import java.util.Scanner;

/*
* Este ejercicio le pide al usuario que introduzca su DNI, en el siguiente formato:
* Los 8 numero del DNI y y la letra se correspode al modulo de 23 del numero del DNI que el usuario
introduzca
* Por ejemplo:
* El usuario introduce: 12345678 | Resultado: su DNI pertenece a la letra Z
* El usuario introduce: 87456123 | Resultado: su DNI pertenece a la letra A
* El usuario introduce: 25825825 | Resultado: su DNI pertenece a la letra E
* El usuario introduce: 00000000 | Resultado: Error
*/

public class ejercicio02 {

	public static void main(String[] args) {
		//variable
		int numeroDni, valor;
		String letra = null;
		// Creación del escáner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		//Imprime por pantalla y le pide al usuario que introduzca su numero del DNI

		System.out.println("Introduce tu DNI: ");
		// Escaneo y guardado del valor del número
		numeroDni = sc.nextInt();
		//calculo del valor que devuelve el modulo de 23 de la variable numeroDni
		valor = numeroDni % 23;
		//Comienzo del if donde te dice que si la variable de numeroDni es menor o igual 99999999 y ademas es mayor a 0, entonces haga lo siguiente

		if (numeroDni <= 99999999 && numeroDni > 0) {
		//crear un switch donde ponemos la variable valor
		switch (valor) {
		//Donde te dicen que en el caso de 0 la letra sera la T, en caso de 1 la letra sera R y asi consecutivamente hasta 22
		case 0:

		letra = "T";
		break;
		case 1:
		letra = "R";
		break;
		case 2:
		letra = "W";
		break;
		case 3:
		letra = "A";
		break;
		case 4:
		letra = "G";
		break;
		case 5:
		letra = "M";
		break;
		case 6:
		letra = "Y";
		break;
		case 7:
		letra = "F";
		break;
		case 8:
		letra = "P";
		break;
		case 9:
		letra = "D";
		break;
		case 10:
		letra = "X";
		break;
		case 11:
		letra = "B";
		break;
		case 12:
		letra = "N";
		break;
		case 13:
		letra = "J";
		break;
		case 14:
		letra = "Z";
		break;
		case 15:
		letra = "S";
		break;
		case 16:
		letra = "Q";
		break;
		case 17:
		letra = "V";
		break;
		case 18:
		letra = "H";
		break;
		case 19:

		letra = "L";
		break;
		case 20:
		letra = "C";
		break;
		case 21:
		letra = "K";
		break;
		case 22:
		letra = "E";
		break;
		}
		//Imprime por pantalla de que tu numero del DNI pertenece a la letra: la variable letra

		System.out.println("Tu numero de DNI pertenece a la letra: " +

		letra);

		//de lo contrario else te dira lo siguiente
		} else {
		//Devuleve por pantalla un error
		System.out.println("Error");
		}
		//cierre del Scanner
		sc.close();
		}
	}