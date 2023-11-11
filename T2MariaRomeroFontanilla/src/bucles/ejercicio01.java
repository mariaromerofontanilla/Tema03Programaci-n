package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ejercicio01 {

	public static void main(String[] args) {
		// Variable de las horas
				int hora =-1;
				// variable de los minutos
				int minutos = -1;
				// variable de los segundos
				int segundos = -1;
				// Variable de cuantos segundos quiere añadir
				int cantSegundos = -1;
				// Creación del escáner para leer la entrada del usuario
				Scanner sc = new Scanner(System.in);
				// do del try catch que hace lo siguiente
				do {
					// try que hace lo siguiente
					try {
						// Imprime por pantalla de que introduzca la hora
						System.out.println(" Introduzca la hora: ");
						// Escaneo y guardado del valor del número
						hora = sc.nextInt();
						// Imprime por pantalla de que introduzca los minutos
						System.out.println(" Introduzca los minutos: ");
						// Escaneo y guardado del valor del número
						minutos = sc.nextInt();
						// Imprime por pantalla de que introduzcas los segundos
						System.out.println(" Introduzca los segundos: ");
						// Escaneo y guardado del valor del número
						segundos = sc.nextInt();
						// Imprime por pantalla de que introduzcas el incremento de segundos
						System.out.println(" Introduzca los segundos que quieres sumarle: ");
						// Escaneo y guardado del valor del número
						cantSegundos = sc.nextInt();
					// catch de exepciones
					} catch (InputMismatchException e) {
						// Imprime por pantalla cuando introduces algo que no esta bien por ejemplo una cadena te dira: Tipo de valor incorecto
						System.out.println("Tipo de valor incorrecto");
						// Scanner de cadena
						sc.nextLine();
				} 
				// while de que si las horas son mayores a 0 o menores que 23 y que los minutos sean mayores que 0 y menor que 59 y que los segundos sean mayores que 0 o menores que 59
				// y si el incremento de segundos es mayor a 0 se salga del bucle.
				} while (hora<0||hora>23 && minutos<0||minutos>59 && segundos<0||segundos>59 && cantSegundos<0);
				
				
				// if de que si la hora es menor o igual a 23 y los minutos son menor o igual a 59 y los segundops son menor o igual a 59 que haga lo siguiente
				if (hora <= 23 && minutos <= 59 && segundos <= 59) {
					// for donde se crea la variable contador que diremos si contador es igual a 0 y contador es menor a la cantidad de segundos introducida contador se incrementa
					for (int cont = 0; cont < cantSegundos; cont++) {
						// incrementacion de los segundos
						segundos++;
						// if de que si los segundos son mayores o iguales a 60 que haga lo siguiente
						if (segundos >= 60) {
							// iguales los segundos a 0
							segundos = 0;
							// incremente uno en los minutos
							minutos = minutos + 1;
							// if de que si los minutos son mayores o iguales a 60 que haga lo siguiente
							if (minutos >= 60) {
								// minutos iguales a 0
								minutos = 0;
								// incrementacion de las horas mas 1
								hora = hora + 1;
								// if de que si la hora es mayor o igual a 24 que haga lo siguiente
								if (hora >= 24) {
									// iguale las horasa 0
									hora = 0;
									// incremento de los segundos mas 1
									segundos = segundos + 1;
								}
							}
						}
						// Imprime por pantalla el resultado con la incrementacion y la hora que seria, ya con la incrementacion	
					}
					System.out.println("La hora actual es: " + hora + " : " + minutos + " : " + segundos);
					// de lo contrario erro por no introducir bien la hora
				} else {
					System.out.println("Error los valores introducidos son incorrectos");
				}
				
				
			// Cierre del Scanner
			sc.close();
			}
		}