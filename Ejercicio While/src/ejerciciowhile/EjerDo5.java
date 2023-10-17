package ejerciciowhile;

import java.util.Random;
import java.util.Scanner;

public class EjerDo5 {

	public static void main(String[] args) {
		//variable
		  int limiteSuperior = 100;
	      int limiteInferior = 1;
	      int intento, respuesta;
	      Scanner sc = new Scanner(System.in);
	      Random r = new Random();
	      
	      
	        do {
	            intento = (limiteSuperior + limiteInferior) / 2;

	            System.out.println("¿Es " + intento + " tu número? (1: Mayor, 0: Igual, -1: Menor)");
	            respuesta = sc.nextInt();

	            if (respuesta == 1) {
	                limiteInferior = intento + 1;
	            } else if (respuesta == -1) {
	                limiteSuperior = intento - 1;
	            }

	        } while (respuesta != 0);

	        System.out.println("¡Adiviné tu número!");

	        sc.close();
	    }
	}