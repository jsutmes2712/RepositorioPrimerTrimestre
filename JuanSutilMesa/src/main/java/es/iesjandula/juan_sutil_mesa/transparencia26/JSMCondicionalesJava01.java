package es.iesjandula.juan_sutil_mesa.transparencia26;

import java.util.Scanner;

public class JSMCondicionalesJava01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un dia de la semana: ");

		switch (sc.nextInt()) {
			case 1: {
				System.out.println("Bases de datos");
				break;
			}
			case 2: {
				System.out.println("Programacion");
				break;
			}
			case 3:{
				System.out.println("Sistemas Informaticos");
				break;
			}
			case 4:{
				System.out.println("Formacion y orientacion laboral");
				break;
			}
			case 5: {
				System.out.println("Programacion");
				break;
			}
			case 6:{
				System.out.println("Fin de semana");
				break;
			}
			case 7:{
				System.out.println("Fin de semana");
				break;
			}
	
			default:{
				System.out.println("Error: dia de la semana invalido.");
				break;
			}
		}
		sc.close();

	}

}
