package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Este ejercicio trata de calcular el perímetro y área de un rectangulo, te muestra un menú, con tres opciones las cuales son:
 * 1. Perímetro, 2. Área, 0. Salir.
 * en cada ópcion te pedira que introduzca también el ancho como el alto del rectángulo.
 * EJEMPLO:
 * 1. Perímetro || Introduzca el ancho del rectángulo: 6 Introduzca el alto del rectángulo: 3 || Resultado: 18.0
 * 2. Área || Introduzca el ancho del rectángulo: 6 Introduzca el alto del rectángulo: 2 || Resultado: 12.0
 * 0. Salir || Se sale del menu y deja de preguntar que opción quiere y como resultado el programa te pone el siguiente mensaje: ¡Hasta luego! 
 */
public class CalculadoraRectangulo {

	public static void main(String[] args) {
		// Creación del Scanner, donde se guardan los datos introducidos por el usuario
		Scanner sc = new Scanner(System.in);
		 // Declaración de variables para almacenar la opción del menú, ancho y alto del rectángulo
        int opcion;
        double ancho, alto;

        // Bucle principal que se ejecuta hasta que se elige la opción 0 (Salir)
        do {
            // Llama al método menu() para mostrar el menú y obtener la opción del usuario
            opcion = menu();

            // Verifica si la opción es válida (1 o 2) para realizar operaciones con el rectángulo
            if (opcion >= 1 && opcion <= 2) {
                // Llama a los métodos pideAncho() y pideAlto() para obtener las dimensiones del rectángulo
                ancho = pideAncho();
                alto = pideAlto();

                // Crea un objeto Rectangulo con las dimensiones proporcionadas
                Rectangulo rectangulo = new Rectangulo(alto, ancho);

                // Realiza la operación correspondiente según la opción elegida
                switch (opcion) {
                    case 1:
                        System.out.println("Perímetro: " + rectangulo.perimetro());
                        break;
                    case 2:
                        System.out.println("Área: " + rectangulo.area());
                        break;
                }
            }
        // Repite el bucle hasta que se elige salir (opción 0)
        } while (opcion != 0); 

        // Imprime un mensaje de despedida al salir del bucle
        System.out.println("¡Hasta luego!");
        // Cierra del Scanner
        sc.close();
    }

    // Método para mostrar el menú y obtener la opción del usuario
    public static int menu() {
        // Creación del Scanner
        Scanner sc = new Scanner(System.in);
        // Declaración de variable para almacenar la opción del menú
        int opcion;

        // Muestra el menú en la consola
        System.out.println("---- Menú ----");
        System.out.println("1. Perímetro");
        System.out.println("2. Área");
        System.out.println("0. Salir");

        // Bucle para asegurarse de que se introduce una opción válida
        do {
            System.out.print("Elija una opción: ");
            try {
                // Intenta leer un entero del usuario
                opcion = sc.nextInt();
                // Verifica si la opción está fuera del rango válido
                if (opcion < 0 || opcion > 2) {
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se introduce algo que no es un número entero
                System.out.println("Por favor, introduzca un número entero. Inténtelo de nuevo.");
                sc.nextLine(); // Limpia el búfer del Scanner
                opcion = -1; // Establece una opción inválida para repetir el bucle
            }
        // Repite el bucle si la opción no es válida
        } while (opcion < 0 || opcion > 2); 

        // Devuelve la opción seleccionada por el usuario
        return opcion;
    }

    // Método para solicitar el ancho del rectángulo al usuario
    public static double pideAncho() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Declaración de variable para almacenar el ancho del rectángulo
        double ancho;

        // Bucle para asegurarse de que se introduce un ancho válido
        do {
            System.out.print("Introduzca el ancho del rectángulo: ");
            try {
                // Intenta leer un número decimal del usuario
                ancho = sc.nextDouble();
                // Verifica si el ancho es menor o igual a cero
                if (ancho <= 0) {
                    System.out.println("El ancho debe ser mayor que cero. Inténtelo de nuevo.");
                    // Valor para indicar que el número es nulo
                    ancho = Double.NaN;
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se introduce algo que no es un número
                System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
                // Limpiar Scanner
                sc.nextLine(); 
             // Valor para indicar que el número es nulo
                ancho = Double.NaN; 
            }
        // Repite el bucle si el número no es válido
        } while (Double.isNaN(ancho)); 

        // Devuelve el ancho introducido por el usuario
        return ancho;
    }

    // Método para solicitar el alto del rectángulo al usuario
    public static double pideAlto() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Declaración de variable para almacenar el alto del rectángulo
        double alto;

        // Bucle para asegurarse de que se introduce un alto válido
        do {
            System.out.print("Introduzca el alto del rectángulo: ");
            try {
                // Intenta leer un número decimal del usuario
                alto = sc.nextDouble();
                // Verifica si el alto es menor o igual a cero
                if (alto <= 0) {
                    System.out.println("El alto debe ser mayor que cero. Inténtelo de nuevo.");
                    // Valor para indicar que el número es nulo
                    alto = Double.NaN;
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se introduce algo que no es un número
                System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
                // Limpiar Scanner
                sc.nextLine(); 
                // Valor para indicar que el número es nulo
                alto = Double.NaN;
            }
        // Repite el bucle si el número no es válido
        } while (Double.isNaN(alto)); 

        // Devuelve el alto introducido por el usuario
        return alto;
    }
}