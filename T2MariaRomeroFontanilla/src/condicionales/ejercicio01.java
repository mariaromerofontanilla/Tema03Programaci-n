package condicionales;

import java.util.Scanner;

	/* Este ejercicio trata, en comprobar si es capicua o no el número que introduzca el usuario
	* Introducir -4 | Resultado: Error no esta dentro del límite
	* Introducir 500000 | Resultado: Error no esta dentro del límite
	* Introducir 5 | Resultado: Capícua
	* Introducir 11 | Resultado: Capicua
	* Introducir 14 | Resultado: No Capicua
	* Introducir 202 | Resultado: Capicua
	* Introducir 210 | Resultado: No Capicua
	* Introducir 1221 | Resultado: Capicua
	* Introducir 5486 | Resultado: No Capicua
	*/
public class ejercicio01 {
	public static void main(String[] args) {
		//variables
		int num;
		int unidad = 0,decena = 0,centenas = 0,mil = 0;
		//Crear el Scanner
		Scanner sc = new Scanner(System.in);
		//Pedir al usuairo que introduzza por teclado un numero
		System.out.println("Introduce un numero: ");
		//Scanner de la variable num
		num = sc.nextInt();
		//Comienzo del if, te dice que si el numero (variable num) es mayor a 0 y el
		
		//numero (variable num) es menor a 10 que haga lo siguiente
		if (num > 0 && num < 10) {
		//Imprime por pantalla de que es capicua
		System.out.println("Es capicúa");
		//Comienzo else if, te dice de que si el numero (variable num) es mayor a 9 y
		
		//el numero (variable num) es menor que 100 que haga lo sieguiente
		} else if (num > 9 && num < 100) {
		//calculo de modulo de 10 de la variable num
		unidad = num % 10;
		//calculo entre 10 de la varaiable num
		decena = num / 10;
		//Comienzo if dentro del else if, de que si las unidades son iguales a las decenas haga lo siguiente
		
		if (unidad == decena) {
		//Te imprime por pantalla de que el numero es capicua
		System.out.println("Numero es capicua");
		//De lo contrario en el else te dice que el numero no es capicua
		
		} else {
		System.out.println("Numero no es capicua");
		}
		//comienzo else if, de que si la variable num es mayor a 99 y ademas es menor a 1000 que haga lo siguiente
		
		} else if (num > 99 && num < 1000) {
		//calculo de la unidad de que te dice que te devuelve el modulo 10 de la variable num
		
		unidad = num % 10;
		//calculo centenas de que te devuelve la division de 100 de la variable num
		
		centenas = num / 100;
		//comienzo if dentro de else if, que te dice que si las unidades son iguales a las centenas que haga lo siguiente
		
		if (unidad == centenas) {
		//Imprime por pantalla de que el numero es capicua
		System.out.println("Numero es capicua");
		//de lo contrario en el else te imprime por pantalla de que el numero no es capicua
		
		} else {
		System.out.println("Numero no es capicua");
		}
		//comienzo de else if de que si la variable num es mayor a 999 y ademas es
		
		//menor a 10000 que te haga lo siguiente
		
		} else if (num > 999 && num < 10000) {
		//calculo de la unidad de que te devuelve el moduelo de 10 de la
		
		//variabele num
		
		unidad = num % 10;
		//calculo de mil que te devuelve la divicion de la variable num entre 1000
		
		mil = num/1000;
		//calculo decena que te devuelve la divicion de la variable num entre 100
		
		decena = num / 100;
		//calculo de las centenas que te devueleve de la variable num la division entre 100
		
		centenas = num/100;
		//Comienzo del if, que te dice de que si las unidad son iguales a la los mil y de que las decenas son iguales a centenas que haga lo siguiente
		
		if (unidad == mil && decena == centenas) {
		//imprime por pantalla de que el numero es capicua
		System.out.println("Numero es capicua");
		//de lo contrario en el else te dice lo siguente
		} else {
		
		//imprime por pantalla de que le numero no es capucua
		System.out.println("Numero no es capicua");
		}
		}
		//comienzo del else que te dice lo siguiente
		else {
		//Imprime por pantalla un error diciento que el numero que el usuario introducio por teclado alcanza el límite es decir que se soble pasa de 9999 o no llega a 0
		System.out.println("Error e sobre pasaste del limite");
		}
		//cierre del Scanner
		sc.close();
		}
}