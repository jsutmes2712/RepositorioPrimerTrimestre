package es.iesjandula.juan_sutil_mesa.transparencia26;

import java.util.Scanner;

public class JSMCondicionalesJava02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca una hora: ");
		int hora = sc.nextInt();
		
		hora%=24;
		
		if(hora < 12 && hora > 6) {
			System.out.println("Buenos dias");
		}else if(hora >= 12 && hora < 24) {
			System.out.println("Buenas tardes");
		}else{
			System.out.println("Buenas noches");
		}
		sc.close();
		
	}

}
