package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
* Este ejercicio trata de que el usuario introduce un numero cualquiera, y el programa le dibujara una piramide con asteriscos (*)
* CASO 1: Usuario introduce 5 || Resultado:  
* 	   *
*     * *
*    * * *
*   * * * *
*  * * * * *
*  CASO 2: Usuario introduce -2 || Resultado: Error debes de introducir un numero mayor que 0
*  CASO 3: Usuario introduce 1 || Resultado: *
*/

public class ejercicio03 {

	public static void main(String[] args) {
		// variable
				// Crear la variable n
				int n=0;
				// Creación del escáner para leer la entrada del usuario
				Scanner sc = new Scanner(System.in);
				// do que hace lo siguiente
				do {
					// try que hace lo siguiente
					try {
						// Imprime por pantalla de que incgrese un numero entero
						System.out.print("Ingresa un número entero: ");
						// Escaneo y guardado del valor del número
						n = sc.nextInt();
					// catch de exepciones
					} catch (InputMismatchException e) {
						// Imprime por pantalla cuando introduces algo que no esta bien por ejemplo una cadena te dira: Tipo de valor incorecto
						System.out.println("Tipo de valor incorrecto");
						// Scanner de cadena
						sc.nextLine();
					}
				// while que si numero es menor a 0 se salga del bucle
				}while(n<0);
				
				// if de que n es mayor a 0 haga lo siguiente
				if (n > 0) {	
				for (int i = 1; i <= n; i++) {
				// Imprime espacios para darle la forma
					for (int j = 1; j <= i; j++)
					{
				System.out.print(" ");
				}
				// Imprime los asteriscos para formarlo
					for (int j = 1; j <= n - i; j++)  {
				System.out.print("* ");
				}
				// Salto de línea para la siguiente fila del triángulo
				System.out.println();
				}
				// De lo contrario hara lo siguiente
				} else {
					// Imrpime por pantalla que introduzcas otro numero que sea mayor que 0
					System.out.println("Error, debes de introducir un numero mayor que 0");
				}
				// Cierre de la variable
				sc.close();
			}
		}
