package condicionales;

import java.util.Random;
import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		//Declaración de las variables
		// Variable para almacenar la respuesta del usuario
		int num;
		// Variable para el primer número aleatorio
		int n1;
		// Variable para el segundo número aleatorio
		int n2;
		// Variable para la suma de n1 y n2
		int suma=0;
		// Crear Scanner
		Scanner sc = new Scanner(System.in);
		// Crear Ramdon para generar numeros aleatorios

		Random r = new Random();
		// Generar dos números aleatorios entre 1 y 100
		n1= r.nextInt(1,100);
		n2= r.nextInt(1,100);
		// Calcular la suma de n1 y n2
		suma= n1+n2;
		// Realizar un bucle "do-while" que se ejecutará al menos una vez
		do {
		// Imprime por pantalla n1 + n2 =
		System.out.println(n1 + " + " + n2 + " = ");
		// Imprime por pantalla de que introduzca la suma de los dos numeros

		System.out.println("Introduce la suma de los dos numeros: ");
		// Sacnner de la variable numero
		num = sc.nextInt();
		// Comprobar si la respuesta del usuario es igual a la suma
		if (num == suma) {
		// Imprime de que has acertado en la suma
		System.out.println("Perfecto acertaste la suma es: " + n1 + " + " + n2

		+ " = " + suma);

		} else {
		// Imprime de que te has equivocado
		System.out.println("Suma incorrecta vuelvelo a intentar: ");
		}
		// Continuar el bucle hasta que la respuesta del usuario sea igual a la suma
		}while (num != suma);
		// Cierre del Scanner
		sc.close();
		}
	}