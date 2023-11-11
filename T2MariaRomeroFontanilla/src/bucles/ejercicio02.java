package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
* Este programa va de  cuántos números hay entre 1 y el numero que introduce el usuario y dice cuantos numeros primos ahi dentro de ese numero.
* CASO 1: Usuairo introduce 5 || Resultado: 3 numeros primos
* CASO 2: Usuairo introduce 20 || Resultado: 8 numeros primos
* CASO 3: Usuairo introduce -17 || Resultado: 0 numeros primos
* CASO 4: Usuairo introduce 0 || Resultado: 0 numeros primos
*/

public class ejercicio02 {

	public static void main(String[] args) {
		// variable
		// crear la variable num y la v ariable j
		int num = 0, j;
		// crear un boolean (true o false) de primo
		boolean primo;
		// contar primo = 0
		int contPri=0;
		// Creación del escáner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// do del try catch que hace lo siguiente
		do {
			// try que hace lo siguiente
			try {
				// Imprime por pantalla de que intrpoduzcas un numero
				System.out.println("Introduzca un numero: ");
				// Escaneo y guardado del valor del número
				num = sc.nextInt();
			// catch de exepciones
			} catch (InputMismatchException e) {
				// Imprime por pantalla cuando introduces algo que no esta bien por ejemplo una cadena te dira: Tipo de valor incorecto
				System.out.println("Tipo de valor incorrecto");
				// Scanner de cadena
				sc.nextLine();
			}
		// while que te dice que si el num es menor a 0 se salga del bucle
		}while(num<0);
		// for donde creamos una variable que dice que esta es igual a 2 y de que si es menor o mayor a numero se incremente
		for(int i=2;i<=num;i++){
			// primeo es igual a true
            primo=true;
            // j es igual a 2
            j=2;
         // while de que si la variable j es menor o igual a la variabe i. Y la variable primo es igual igual a true entonces haga lo siguiente
            while (j<=i-1 && primo==true){
            	// if de i, modulo de j es igual a 0 haga lo siguiente
                if (i%j==0) {
                	// la variable primo igual a false
                    primo=false;
                }
             // variabele j se incrementa
                j++;
            }
         // if de que si primo es igual igual a true haga lo siguiente
            if (primo==true){
            	// incremento de contar primo
                contPri++;
            }
        }
			// Imprime por pantalla cuantos numero primos tiene el numero que introduciste numero primo
			System.out.println(contPri + " numeros primos");
			// ciere del escaner
			sc.close();
			}
	}
