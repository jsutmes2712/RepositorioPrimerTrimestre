package es.iesjandula.juan_sutil_mesa.transparencia27;

import java.util.Scanner;

public class JSMCondicionalesJava07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("No es par");
		}
		if(n%5==0) {
			System.out.println("Es divisible por 5");
		}else {
			System.out.println("No es divisible por 5");
		}
		
		sc.close();
	}

}
