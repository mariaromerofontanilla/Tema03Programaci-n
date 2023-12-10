package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Este ejercicio trata de un Menú de opciones en el cual se establecen una serie de opciones el usuario introduce por teclado
 * el numero de la opción que desea usar, y tan solo ahi 7 opciones las cuales son: 
 * 1. Suma, 2. Resta, 3. Multiplicación, 4. División, 5. Máximo, 6. Mínimo, 0. Salir.
 * El usuario elije una opción y automaticamente se le pedira que ingrese dos numeros, para hcer dicho calculo en cada opción.
 * EJEMPLO:
 * 1. Suma || numeros: 2 y 10 || Resultado: 12
 * 2. Resta || numeros: 30 y 21 || Resultado: 9
 * 3. Multiplicación || numeros: 18 y 6 || Resultado: 54
 * 4. División || numeros: 49 y 7 || Resultado: 7
 * 5. Máximo || numeros: 76 y 92 || Resultado: 92
 * 6. Mínimo || numeros: 48 y 65 || Resultado: 48
 * 0. Salir || Se sale del menu y deja de preguntar que opción quiere y como resultado el programa te pone el siguiente mensaje: ¡Hasta luego! 
 */
public class Calculadora {

	public static void main(String[] args) {
		// Creación del Scanner, donde se guardan los datos introducidos por el usuario
		Scanner scanner = new Scanner(System.in);
		 // Variable para almacenar la opción del menú
		int opcion;
		// Variables para almacenar los números ingresados por el usuario
		double num1, num2;
		
		// Bucle do-while para mostrar el menú y realizar operaciones hasta que el usuario elija salir
		do {
			// Llamada al método menu para obtener la opción del usuario
			opcion = menu();
			
			// Verificación de que la opción sea válida
			  if (opcion >= 1 && opcion <= 6) { 
				  	// Llamada al método pideNumero para obtener el primer número
				  	num1 = pideNumero(); 
				  	// Llamada al método pideNumero para obtener el segundo número
	                num2 = pideNumero(); 
	                // Creación de un objeto Operaciones
	                Operaciones operaciones = new Operaciones(num1, num2); 
	                // Menú switch para realizar la operación seleccionada
	                switch (opcion) { 
	                    case 1:
	                        System.out.println("Suma: " + operaciones.suma());
	                        break;
	                    case 2:
	                        System.out.println("Resta: " + operaciones.resta());
	                        break;
	                    case 3:
	                        System.out.println("Multiplicación: " + operaciones.multiplicacion());
	                        break;
	                    case 4:
	                        System.out.println("División: " + operaciones.division());
	                        break;
	                    case 5:
	                        System.out.println("Máximo: " + operaciones.max());
	                        break;
	                    case 6:
	                        System.out.println("Mínimo: " + operaciones.min());
	                        break;
	                }
	            }

			// El bucle continúa hasta que el usuario elija salir (opción 0)
	        } while (opcion != 0); 
			// Mensaje de despedida
	        System.out.println("¡Hasta luego!"); 
	        // Cierre del Scanner
	        scanner.close(); 
	    }
		// Método para mostrar el menú y obtener la opción del usuario
	    public static int menu() { 
	    	// Creación del Scanner
	        Scanner scanner = new Scanner(System.in);
	        // Variable para almacenar la opción del usuario
	        int opcion; 

	        // Mostrar el menú
	        System.out.println("---- Menú ----");
	        System.out.println("1. Suma");
	        System.out.println("2. Resta");
	        System.out.println("3. Multiplicación");
	        System.out.println("4. División");
	        System.out.println("5. Máximo");
	        System.out.println("6. Mínimo");
	        System.out.println("0. Salir");

	        // Bucle do-while para garantizar una entrada válida
	        do { 
	            System.out.print("Elija una opción: ");
	            try {
	            	// Obtener la opción del usuario como un número entero
	                opcion = scanner.nextInt(); 
	                // Verificación de la validez de la opción
	                if (opcion < 0 || opcion > 6) { 
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	                }
	            // Manejo de la excepción en caso de entrada sea no válida
	            } catch (InputMismatchException e) { 
	                System.out.println("Por favor, introduzca un número entero. Inténtelo de nuevo.");
	                // Limpia scanner
	                scanner.nextLine(); 
	                // Establece la opción en un valor menos uno para que se repita el bucle
	                opcion = -1; 
	            }
	        // Continuar hasta que se ingrese una opción válida
	        } while (opcion < 0 || opcion > 6); 
	        // Devolver la opción seleccionada
	        return opcion; 
	    }
	    // Método para obtener un número válido del usuario
	    public static double pideNumero() { 
	    	// Creación del Scanner
	        Scanner scanner = new Scanner(System.in); 
	        // Variable para almacenar el número ingresado por el usuario
	        double numero; 
	        // Bucle do-while para garantizar una entrada válida
	        do { 
	            System.out.print("Introduzca un número: ");
	            try {
	            	// Obtener el número del usuario como un valor de punto flotante
	                numero = scanner.nextDouble();
	            // Manejo de la excepción en caso de entrada sea no válida
	            } catch (InputMismatchException e) { 
	                System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
	                // Limpia scanner
	                scanner.nextLine(); 
	                // Establece el número en un valor nulo para que se repita el bucle
	                numero = Double.NaN; 
	            }
	        // Continuar hasta que se ingrese un número válido
	        } while (Double.isNaN(numero)); 
	        // Devolver el número ingresado por el usuario
	        return numero; 
	    }
	}