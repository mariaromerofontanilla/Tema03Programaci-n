package ejercicio01;

public class Operaciones {

	 // Atributos para almacenar los números sobre los cuales se realizarán las operaciones
    double num1;
    double num2;

    // Constructor predeterminado que inicializa los números en 0
    public Operaciones() {
        this.num1 = 0;
        this.num2 = 0;
    }

    // Constructor que permite establecer los números al crear un objeto de la clase
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Calculo para realizar la operación de suma
    public double suma() {
        return num1 + num2;
    }

    // Calculo para realizar la operación de resta
    public double resta() {
        return num1 - num2;
    }

    // Calculo para realizar la operación de multiplicación
    public double multiplicacion() {
        return num1 * num2;
    }

    // Calculo para realizar la operación de división
    public double division() {
        // Verifica si el divisor (num2) es diferente de cero antes de realizar la división
        if (num2 != 0) {
            return num1 / num2;
        } else {
            // Muestra un mensaje de error si se intenta dividir por cero
            System.out.println("Error: No se puede dividir por cero.");
            // Devuelve un valor especial para indicar un resultado no válido (NaN - Not a Number)
            return Double.NaN;
        }
    }

    // Calculo para obtener el máximo entre los dos números
    public double max() {
        // Compara los dos números y devuelve el mayor
        if (num1 > num2) {
            return num1;
        } else if (num2 > num1) {
            return num2;
        }
        // Si son iguales, devuelve cualquiera de ellos
        return num1;
    }

    // Calculo para obtener el mínimo entre los dos números
    public double min() {
        // Compara los dos números y devuelve el menor
        if (num1 < num2) {
            return num1;
        } else if (num2 < num1) {
            return num2;
        }
        // Si son iguales, devuelve cualquiera de ellos; en este caso num1 porque ambos seran iguales
        return num1;
    }
}