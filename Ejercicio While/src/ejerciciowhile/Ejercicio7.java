package ejerciciowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//variable
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num;
        int num2 = r.nextInt(1,101);

        System.out.println("Introduce un numero del 1 al 100: ");
        num = sc.nextInt();

        while (num != num2 && num > 0) {
            if (num > num2) {
                System.out.println("menor");
            } else {
                System.out.println("mayor");
            }

            System.out.println("Introduce un numero del 1 al 100: ");
            num = sc.nextInt();

            if (num == -1) {
                System.out.println("Te has rendido");
                break;
            }
        }

        if (num == num2) {
            System.out.println("Excelente acertaste!!!!");
        }

        sc.close();
    }
}