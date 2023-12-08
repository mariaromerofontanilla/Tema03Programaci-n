package ejercicio02;

public class Rectangulo {

	double alto;
	double ancho;

	public Rectangulo() {
		this.alto = 0;
		this.ancho = 0;
	}

	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	public double perimetro() {
		return 2 * (alto + ancho);
	}

	public double area() {
		return alto * ancho;
	}
}
