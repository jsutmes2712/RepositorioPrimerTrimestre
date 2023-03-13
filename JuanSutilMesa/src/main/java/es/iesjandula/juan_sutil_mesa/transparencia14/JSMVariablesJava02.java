package es.iesjandula.juan_sutil_mesa.transparencia14;

import java.util.Scanner;

public class JSMVariablesJava02 {

	public static void main(String[] args) {
		double pesetas = 166.386;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una cantidad en euros: ");
		double x = sc.nextDouble();
		
		double sol = (x*pesetas);
		
		System.out.println("La cantidad en pesetas es: " + sol);
		sc.close();
	}

}
