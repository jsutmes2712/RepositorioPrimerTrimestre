package es.iesjandula.juan_sutil_mesa.transparencia26;

import java.util.Scanner;

public class JSMCondicionalesJava05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la hora: ");
		int hora = sc.nextInt();
		
		System.out.print("Introduzca los minutos: ");
		int minutos = sc.nextInt();
		
		if(hora == 0 && minutos == 0)
			System.out.println("Es media noche");
		else {
			int segundos = (((23 - hora)*60) + (60 - minutos))*60;
			System.out.println("Quedan " + segundos);
		}
		sc.close();
	}

}
