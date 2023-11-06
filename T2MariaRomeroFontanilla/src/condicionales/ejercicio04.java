package condicionales;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// Declaración de variables
		// Número ingresado por el usuario
		int num;
		// Variables para almacenar las unidades y decenas
		int unidades=0, decenas=0;
		// Variables para descomponer el número en decenas y unidades
		int decena, unidad;
		// Strings para almacenar la representación en palabras de las unidades y decenas
		String uni = null, deci = null;
		//Creación del Scanner
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que ingrese un número entre 1 y 99
		System.out.println("Introduzca un numero del 1 al 99: ");
		//Scanner de la variable numero
		num=sc.nextInt();
		// Descomponer el número en decenas y unidades
		unidades = num % 10;
		decenas = num / 10;
		decena = num/10;
		unidad = num%10;
		// Comprobación de si el número está en el rango de 1 a 99
		if (num >= 1 && num <= 99) {
		switch (num) {
		case 1: uni = "uno";

		break;
		}
		if (num >= 1 && num <= 99){
		// Switch para convertir las unidades en palabras
		// El resultado se almacena en las variables uni (unidades) y deci (decenas)
		switch (unidad) {
		case 1: uni= "uno";
		break;
		case 2: uni= "dos";
		break;
		case 3: uni= "tres";
		break;
		case 4: uni= "cuatro";
		break;
		case 5: uni= "cinco";
		break;
		case 6: uni= "seis";
		break;
		case 7: uni= "siete";
		break;
		case 8: uni= "ocho";
		break;
		case 9: uni= "nueve";
		break;
		default: uni =" ";
		break;
		};
		// Switch para convertir las decenas en palabras
		// El resultado se almacena en las variables uni (unidades) y deci (decenas)
		switch (decena) {
		case 1: switch (unidad) {
		case 0: uni= "diez";
		break;
		case 1: uni= "once";
		break;
		case 2: uni= "doce";
		break;
		case 3: uni= "trece";
		break;
		case 4: uni= "catorce";
		break;
		case 5: uni= "quince";
		break;
		default: deci= "dieci";
		break;

		};
		break;

		case 2: switch (unidad) {
		case 0: deci= "veinte";
		break;
		default: deci= "veinti";
		break;
		};
		break;
		case 3: deci = "treinta";
		break;
		case 4: deci = "cuarenta";
		break;
		case 5: deci = "cincuenta";
		break;
		case 6: deci = "sesenta";
		break;
		case 7: deci = "setenta";
		break;
		case 8: deci = "ochenta";
		break;
		case 9: deci = "noventa";
		break;
		};
		}
		}
		// Comprobación de diferentes casos para imprimir el número en palabras
		if(num < 16) {
		// Imprime el resultado para números menores a 16
		System.out.println(uni);
		// else if te dice que si el numero esta comprendido entre 15 y menor que 20 que diga lo siguiente

		}else if (num > 15 && num < 20) {
		// Imprimir en pantalla las variables deci mas la variable uni
		System.out.println(deci+uni);
		// Si el numero es igual a 20 que diga lo siguiente
		}else if(num==20) {
		// Imprime el resultado para el número 20
		System.out.println(deci);
		}else if (num==21){
		// Imprime el resultado para el número 21
		System.out.println(deci+uni);
		// De lo contrario que diga lo siguiente
		}else {
		// Imprime el resultado para otros números
		System.out.println(deci + " y " + uni);
		}
		// Cierre del Scanner
		sc.close();

		}
	}