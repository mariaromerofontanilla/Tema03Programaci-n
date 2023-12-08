package ejercicio01;

public class Operaciones {

	double num1;
	double num2;

	public Operaciones() {
		this.num1 = 0;
		this.num2 = 0;
	}

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double suma() {
		return num1 + num2;
	}

	public double resta() {
		return num1 - num2;
	}

	public double multiplicacion() {
		return num1 * num2;
	}

	public double division() {
		if (num2 != 0 || num1 != 0 || num2 != 0 || num1 != 0) {
			return num1 / num2;
		} else {
			System.out.println("Error: No se puede dividir por cero.");
			return Double.NaN;
		}
	}

	public double max() {
		if (num1 > num2) {
			return num1;
		} else if (num2 > num1) {
			return num2;
		}
		return num1;
	}

	public double min() {
		if (num1 < num2) {
			return num1;
		} else if (num2 < num1) {
			return num2;
		}
		return num1;
	}
}
