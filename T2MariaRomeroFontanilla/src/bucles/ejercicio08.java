package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
* Este programa lee y acepta únicamente aquellos que sean mayores que el último numero dado por el usuario, el 0 lo saca y los espacio los cuenta como fallo.
* CASO 1: Usuario pone 20 || Usuario pone 8 -> fallo es menor || usuario pone 0 -> se sale y te sale el resultado: Total de numeros introducidos: 2 || Total numeros fallados: 1
* Cuenta los numeros introducidos excluyendo el 0 y te dice cuales son los fallos, es decir los numeros pequeños al numero anterior dado
* CASO 2: Usuario pone 10 || usuario pone 30 || usuario pone 1 -> fallo es menor || usuario pone 0 || Resultado: Total de numeros introducidos: 3 || Total numeros fallados: 1
*/

public class ejercicio08 {

	public static void main(String[] args) {
		 // Creación del escáner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Creación de variables: número del usuario, número auxiliar, contador de números y contador de fallos
        int n = 0, aux, cont = 0, contF = 0;

        // Bucle do-while que solicita al usuario introducir un número inicial hasta que se ingrese un valor diferente de cero
        do {
            try {
                // Imprime por pantalla de que introduzca un número inicial
                System.out.print("Dime un numero inicial: ");
                // Escaneo y guardado del valor del número
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                // Si se ingresa un valor no válido, imprime un mensaje de error, limpia el buffer del escáner y continúa el bucle
                System.out.println("Tipo de valor incorrecto");
                sc.nextLine();
            }
        } while (n == 0);

        // Bucle do-while que cuenta los números, los fallos y pregunta una y otra vez por otro número. Se sale del bucle si se introduce 0.
        do {
            // Incremento del contador
            cont++;
            // Almacena el valor actual del número en la variable auxiliar
            aux = n;

            try {
                // Imprime por pantalla que el usuario diga un número
                System.out.print("Dime un número: ");
                // Escaneo y guardado del valor del número
                n = sc.nextInt();
            } catch (InputMismatchException e) {
            	// Imprime por pantalla cuando introduces algo que no esta bien por ejemplo una cadena te dira: Tipo de valor incorecto
                System.out.println("Tipo de valor incorrecto");
                // Escanea, cadena
                sc.nextLine();
                // Descremento del contador
                cont--;
            }

            // if que verifica si el número actual es menor al número auxiliar y si el número actual es mayor a cero o menor que cero
            if (n < aux && (n > 0 || n < 0)) {
                // Imprime por pantalla un mensaje de fallo, es menor
                System.out.println("Fallo, es menor");
                // Incrementa el contador de fallos
                contF++;
            }
         // Bucle while de que si número es mayor que sero o menor que 0 haga lo siguiente
        } while (n > 0 || n < 0);

        // Si el número es igual a 0 imprimen los mensajes siguientes
        if (n == 0) {
            System.out.println("Total de números introducidos: " + cont);
            System.out.println("Numeros fallados: " + contF);
        }

        // Cierre del escáner
        sc.close();
    }
}