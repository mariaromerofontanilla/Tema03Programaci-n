package ejercicio04;

public class Cilindro {

	// Atributos para almacenar el radio de la base y la altura del cilindro
    double radioBase;
    double altura;

    // Constructor predeterminado que inicializa el radio de la base y la altura en 0
    public Cilindro() {
        this.radioBase = 0;
        this.altura = 0;
    }

    // Constructor que permite establecer el radio de la base y la altura al crear un objeto de la clase
    public Cilindro(double radioBase, double altura) {
        this.radioBase = radioBase;
        this.altura = altura;
    }

    // Método para calcular el volumen del cilindro
    public double volumen() {
        return Math.PI * Math.pow(radioBase, 2) * altura;
    }

    // Método para calcular el área superficial del cilindro
    public double area() {
        return 2 * Math.PI * radioBase * (altura + radioBase);
    }
}