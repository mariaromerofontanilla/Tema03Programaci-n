package condicionales;

import java.util.Scanner;
/*
 * Este ejercicio trata de que el usuario pone una hora por teclado y luego muestre la hora después de incrementarle un segundo
 * CASO 1: Usuario introduce las horas, minutos y segundos: 12:12:1 || Resultado: 12 : 12: 2
 * CASO 2: Usuario introduce las horas, minutos y segundos: 70:70:70 || Resultado: No existe esa hora
 * CASO 3: Usuario introduce las horas, minutos y segundos: 12:59:59 || Resultado: 13:0:0
 * CASO 4: Usuario introduce las horas, minutos y segundos: 23:59:59 || Resultado: 0:0:0
 * CASO 5: Usuario introduce las horas, minutos y segundos: 23:59:59 || Resultado: 0:0:0
 * CASO 6: Usuario introduce las horas, minutos y segundos: 12:45:59 || Resultado: 12:46:0
 */

public class ejercicio07 {

	public static void main(String[] args) {
				// Declaración de las variables
				// variables
				// numero entero de horas
				int horas;
				// Numero entero de minutos
				int minutos;
				// Numero entero de segundos
				int segundos;
				// Creación del escáner para leer la entrada del usuario
				Scanner sc = new Scanner(System.in);
				// Imprime por pantalla de que introduzcas la hora
				System.out.println("Introduzca la hora: ");
				// Escaneo y guardado del valor del número
				horas = sc.nextInt();
				// Imprime por pantalla de que introduzcas los minutos
				System.out.println("Introduzca los minutos: ");
				// Escaneo y guardado del valor del número
				minutos = sc.nextInt();
				// Imprime por pantalla de que introduzcas los segundos
				System.out.println("Introduzca los segundos: ");
				// Escaneo y guardado del valor del número
				segundos = sc.nextInt();
				segundos++; // Incrementar un segundo
				// calculo de if de que si los segundos son menores a 60 y los minutos menores a 60 y las horas menores a 24 que haga lo siguiente
				if (segundos < 60 && minutos < 60 && horas < 24) {
				// if de que si segundos es mayor o igual a 60 que haga lo siguiente
				if (segundos >= 60) {
				// segundos sea igual a 0
				segundos = 0;
				// y se le incremente uno a minutos
				minutos++;
				// if de que si los minutos son mayores o iguales a 60 que haga lo siguiente
				if (minutos >= 60) {
				// minutos sea igual a 0
				minutos = 0;
				// y se le incremente uno a horas
				horas++;
				// if de que se las horas son mayores o iguales a 24 que haga lo siguiente
				if (horas >= 24) {
				// horas iguales a 0
				horas = 0;
				}
				}
				}
				// Imprime por pantalla las horas los minutos y los segundos, con la incrementacion ya realizada
				System.out.println("Hora después de incrementar un segundo: " + horas + " : " + minutos + ": " + segundos);
				// De lo contrario te dira lo siguiente
				} else {
				// Te imprimira por pantalla de que la hora introducida no existe
				System.out.println("No existe");
				}
				// Cierre del Scanner
				sc.close();
				}
			}
