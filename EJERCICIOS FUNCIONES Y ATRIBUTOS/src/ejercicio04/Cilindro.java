package ejercicio04;

public class Cilindro {

	double radioBase;
	double altura;

	public Cilindro() {
		this.radioBase = 0;
		this.altura = 0;
	}

	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}

	public double volumen() {
		return Math.PI * Math.pow(radioBase, 2) * altura;
	}

	public double area() {
		return 2 * Math.PI * radioBase * (altura + radioBase);
	}
}