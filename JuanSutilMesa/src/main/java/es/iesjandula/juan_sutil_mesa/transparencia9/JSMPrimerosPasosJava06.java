package es.iesjandula.juan_sutil_mesa.transparencia9;

import java.util.Scanner;

public class JSMPrimerosPasosJava06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer valor: ");
		double n1 = sc.nextDouble();

		System.out.print("Introduzca el segundo valor: ");
		double n2 = sc.nextDouble();

		System.out.print("Introduzca el tercer valor: ");
		double n3 = sc.nextDouble();
		
		System.out.println(n1 + " x " + n2 + " x " + n3 + " = " + (n1*n2*n3));
		sc.close();
	}

}
