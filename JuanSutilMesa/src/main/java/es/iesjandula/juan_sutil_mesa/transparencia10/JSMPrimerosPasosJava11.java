package es.iesjandula.juan_sutil_mesa.transparencia10;

import java.util.Scanner;

public class JSMPrimerosPasosJava11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la nota del primer examen:");
		double nota1 = sc.nextDouble();
		
		System.out.print("Introduzca la nota media que desea:");
		double media = sc.nextDouble();
		System.out.println("La nota necesaria en el segundo examen: " + ((media - nota1*0.4)/0.6));
		sc.close();
	}

}