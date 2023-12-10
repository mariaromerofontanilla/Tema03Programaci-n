package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Este ejercicio trata de calcular el volumen y área de un cilindro, te muestra un menú, con tres opciones las cuales son:
 * 1. Volumen, 2. Área, 0. Salir.
 * en cada ópcion te pedira que introduzcas el radio de la base del cilindro y la altura del cilindro.
 * EJEMPLO:
 * 1. Volumen || Introduzcas el radio de la base del cilindro: 9 Introduzca la altura del cilindro: 5 || Resultado: 1272.345024703866
 * 2. Área || Introduzcas el radio de la base del cilindro: 5 Introduzca la altura del cilindro: 8 || Resultado: 408.4070449666731
 * 0. Salir || Se sale del menu y deja de preguntar que opción quiere y como resultado el programa te pone el siguiente mensaje: ¡Hasta luego! 
 */
public class CalculadoraCilindro {

	public static void main(String[] args) {
		// Creación del Scanner, donde se guardan los datos introducidos por el usuario
		Scanner sc = new Scanner(System.in);
		// Declaración de variables para almacenar la opción del menú, el radio de la base y la altura del cilindro
        int opcion;
        double radioBase, altura;

        // Bucle principal que se ejecuta hasta que se elige la opción 0 (Salir)
        do {
            // Llama al método menu() para mostrar el menú y obtener la opción del usuario
            opcion = menu();

            // Verifica si la opción es válida (1 o 2) para realizar operaciones con el cilindro
            if (opcion >= 1 && opcion <= 2) {
                // Llama al método pideRadioBase() para obtener el radio de la base del cilindro
                radioBase = pideRadioBase();
                // Llama al método pideAltura() para obtener la altura del cilindro
                altura = pideAltura();

                // Crea un objeto Cilindro con el radio de la base y la altura proporcionados
                Cilindro cilindro = new Cilindro(radioBase, altura);

                // Realiza la operación correspondiente según la opción elegida
                switch (opcion) {
                    case 1:
                        System.out.println("Volumen: " + cilindro.volumen());
                        break;
                    case 2:
                        System.out.println("Área: " + cilindro.area());
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
        // Crear Scanner
        Scanner sc = new Scanner(System.in);
        // Declaración de variable para almacenar la opción del menú
        int opcion;

        // Muestra el menú en la consola
        System.out.println("---- Menú ----");
        System.out.println("1. Volumen");
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

    // Método para solicitar el radio de la base del cilindro al usuario
    public static double pideRadioBase() {
        // Creación de Scanner
        Scanner sc = new Scanner(System.in);
        // Declaración de variable para almacenar el radio de la base del cilindro
        double radioBase;

        // Bucle para asegurarse de que se introduce un radio válido
        do {
            System.out.print("Introduzca el radio de la base del cilindro: ");
            try {
                // Intenta leer un número decimal del usuario
                radioBase = sc.nextDouble();
                // Verifica si el radio es menor o igual a cero
                if (radioBase <= 0) {
                    System.out.println("El radio de la base debe ser mayor que cero. Inténtelo de nuevo.");
                    // Valor para indicar que el número es nulo
                    radioBase = Double.NaN;
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se introduce algo que no es un número
                System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
                // Limpiar Scanner
                sc.nextLine();
                // Valor para indicar que el número es nulo
                radioBase = Double.NaN;
            }
        // Repite el bucle si el número no es válido
        } while (Double.isNaN(radioBase));

        // Devuelve el radio introducido por el usuario
        return radioBase;
    }

    // Método para solicitar la altura del cilindro al usuario
    public static double pideAltura() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Declaración de variable para almacenar la altura del cilindro
        double altura;

        // Bucle para asegurarse de que se introduce una altura válida
        do {
            System.out.print("Introduzca la altura del cilindro: ");
            try {
                // Intenta leer un número decimal del usuario
                altura = sc.nextDouble();
                // Verifica si la altura es menor o igual a cero
                if (altura <= 0) {
                    System.out.println("La altura del cilindro debe ser mayor que cero. Inténtelo de nuevo.");
                    // Valor para indicar que el número es nulo
                    altura = Double.NaN;
                }
            } catch (InputMismatchException e) {
                // Captura la excepción si se introduce algo que no es un número
                System.out.println("Por favor, introduzca un número válido. Inténtelo de nuevo.");
                // Limpiar Scanner
                sc.nextLine();
                // Valor para indicar que el número es nulo
                altura = Double.NaN;
            }
        // Repite el bucle si el número no es válido
        } while (Double.isNaN(altura));

        // Devuelve la altura introducida por el usuario
        return altura;
    }
}