package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Este ejercicio trata de calcular la circunferencia y área de un circulo, te muestra un menú, con tres opciones las cuales son:
 * 1. Circunferencia, 2. Área, 0. Salir.
 * en cada ópcion te pedira que introduzcas el radio del círculo.
 * EJEMPLO:
 * 1. Circunferencia || Introduzcas el radio del círculo: 2 || Resultado: 12.566370614359172
 * 2. Área || Introduzcas el radio del círculo: 6 || Resultado: 113.09733552923255
 * 0. Salir || Se sale del menu y deja de preguntar que opción quiere y como resultado el programa te pone el siguiente mensaje: ¡Hasta luego! 
 */
public class CalculadoraCirculo {

	public static void main(String[] args) {
		// Creación del Scanner, donde se guardan los datos introducidos por el usuario
		Scanner sc = new Scanner(System.in);
		 // Declaración de variables para almacenar la opción del menú y el radio del círculo
        int opcion;
        double radio;

        // Bucle principal que se ejecuta hasta que se elige la opción 0 (Salir)
        do {
            // Llama al método menu() para mostrar el menú y obtener la opción del usuario
            opcion = menu();

            // Verifica si la opción es válida (1 o 2) para realizar operaciones con el círculo
            if (opcion >= 1 && opcion <= 2) {
                // Llama al método pideRadio() para obtener el radio del círculo
                radio = pideRadio();

                // Crea un objeto Circulo con el radio proporcionado
                Circulo circulo = new Circulo(radio);

                // Realiza la operación correspondiente según la opción elegida
                switch (opcion) {
                    case 1:
                        System.out.println("Circunferencia: " + circulo.circunferencia());
                        break;
                    case 2:
                        System.out.println("Área: " + circulo.area());
                        break;
                }
            }
        // Repite el bucle hasta que se elige salir (opción 0)
        } while (opcion != 0); 

        // Imprime un mensaje de despedida al salir del bucle
        System.out.println("¡Hasta luego!");
        // Cierre del Scanner
        sc.close();
    }

    // Método para mostrar el menú y obtener la opción del usuario
    public static int menu() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Declaración de variable para almacenar la opción del menú
        int opcion;

        // Muestra el menú en la consola
        System.out.println("---- Menú ----");
        System.out.println("1. Circunferencia");
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
                // Limpiar Scanner
                sc.nextLine(); 
                // Establece una opción no valida para repetir el bucle
                opcion = -1; 
            }
        // Repite el bucle si la opción no es válida   
        } while (opcion < 0 || opcion > 2); 

        // Devuelve la opción seleccionada por el usuario
        return opcion;
    }

    // Método para solicitar el radio del círculo al usuario
    public static double pideRadio() {
        // Creación de Scanner
        Scanner sc = new Scanner(System.in);
        // Declaración de variable para almacenar el radio del círculo
        double radio;

        // Bucle para asegurarse de que se introduce un radio válido
        do {
            System.out.print("Introduzca el radio del círculo: ");
            try {
                // Intenta leer un número decimal del usuario
                radio = sc.nextDouble();
                // Verifica si el radio es menor o igual a cero
                if (radio <= 0) {
                    System.out.println("El radio debe ser mayor que cero. Inténtelo de nuevo.");
                    // Valor para indicar que el número es nulo
                    radio = Double.NaN; 
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se introduce algo que no es un número
                System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
                // Limpiar Scanner
                sc.nextLine();
                // Valor para indicar que el número es nulo
                radio = Double.NaN;
            }
        // Repite el bucle si el número no es válido
        } while (Double.isNaN(radio));

        // Devuelve el radio introducido por el usuario
        return radio;
    }
}