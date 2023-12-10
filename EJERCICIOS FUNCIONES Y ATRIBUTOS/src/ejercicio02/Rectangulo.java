package ejercicio02;

public class Rectangulo {

	// Atributos para almacenar las dimensiones del rectángulo
    double alto;
    double ancho;

    // Constructor predeterminado que inicializa las dimensiones en 0
    public Rectangulo() {
        this.alto = 0;
        this.ancho = 0;
    }

    // Constructor que permite establecer las dimensiones al crear un objeto de la clase
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    // Método para calcular el perímetro del rectángulo
    public double perimetro() {
        return 2 * (alto + ancho);
    }

    // Método para calcular el área del rectángulo
    public double area() {
        return alto * ancho;
    }
}