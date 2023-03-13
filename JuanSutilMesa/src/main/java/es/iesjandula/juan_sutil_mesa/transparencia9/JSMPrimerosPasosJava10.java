package es.iesjandula.juan_sutil_mesa.transparencia9;

import java.util.Scanner;

public class JSMPrimerosPasosJava10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca las horas trabajadas: ");
		int horas = sc.nextInt();
		
		System.out.println("El salario es " + (horas*12));
		sc.close();
	}
}
