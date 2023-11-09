package bucles;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// variable
		// crear la variable num y la v ariable j
		int num, j;
		// crear un boolean (true o false) de primo
		boolean primo;
		// contar primo = 0
		int contPri=0;
		// crear Scanner
		Scanner sc = new Scanner(System.in);
		// Imprime por pantalla de que intrpoduzcas un numero
		System.out.println("Introduzca un numero: ");
		// Scanner de la variable num
		num = sc.nextInt();
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