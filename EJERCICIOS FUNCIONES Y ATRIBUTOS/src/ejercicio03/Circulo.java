package ejercicio03;

public class Circulo {

	// Atributo para almacenar el radio del círculo
    double radio;

    // Constructor predeterminado que inicializa el radio en 0
    public Circulo() {
        this.radio = 0;
    }

    // Constructor que permite establecer el radio al crear un objeto de la clase
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular la circunferencia del círculo
    public double circunferencia() {
        return 2 * Math.PI * radio;
    }

    // Método para calcular el área del círculo
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
}