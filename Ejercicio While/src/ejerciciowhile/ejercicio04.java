package ejerciciowhile;

import java.util.Scanner;

public class ejercicio04 {



	public static void main(String[] args) {
		//variable 
		int numero;
		String resultado= null;
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Ingrese un número entre 1 y 99: ");
	     numero = sc.nextInt();

	        if (numero < 1 || numero > 99) {
	            System.out.println("El número está fuera del rango válido.");
	        } else {
	            resultado = String convierte(numero);
	            System.out.println("En palabras: " + resultado);
	        }

	        sc.close(); 
	    }

	   		String convierte(int numero) {
	        String[] unidades = {
	            "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"
	        };

	        String[] especiales = {
	            "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
	        };

	        String[] decenas = {
	            "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
	        };

	        if (numero < 10) {
	            return unidades[numero];
	        } else if (numero >= 10 && numero < 20) {
	            return especiales[numero - 10];
	        } else {
	            int decena = numero / 10;
	            int unidad = numero % 10;

	            if (unidad == 0) {
	                return decenas[decena];
	            } else {
	                return decenas[decena] + " y " + unidades[unidad];
	            }
	        }
	    }
	}