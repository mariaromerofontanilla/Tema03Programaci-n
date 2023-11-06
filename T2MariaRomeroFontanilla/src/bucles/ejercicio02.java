package bucles;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// variable
		int num, j;
		boolean primo;
		int contPri=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		
		for(int i=2;i<=num;i++){
            primo=true;
            j=2;
            while (j<=i-1 && primo==true){
                if (i%j==0) {
                    primo=false;
                }
                j++;
            }
            if (primo==true){
                contPri++;
            }
        }
			System.out.println(contPri + " numeros primos");
			}
	}