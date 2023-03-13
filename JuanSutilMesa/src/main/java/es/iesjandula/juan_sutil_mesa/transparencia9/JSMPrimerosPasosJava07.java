package es.iesjandula.juan_sutil_mesa.transparencia9;

import java.util.Scanner;

public class JSMPrimerosPasosJava07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el primer valor: ");
		double x = sc.nextDouble();

		System.out.println("x^2 + x + 1 = " + (Math.pow(x, 2) + x + 1));
		sc.close();
	}
}