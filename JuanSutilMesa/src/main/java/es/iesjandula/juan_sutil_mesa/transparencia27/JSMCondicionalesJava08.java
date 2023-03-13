package es.iesjandula.juan_sutil_mesa.transparencia27;

import java.util.Scanner;

public class JSMCondicionalesJava08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int n = sc.nextInt();
		
		System.out.println("El ultimo digito del numero es: " + (n%10));
		
		sc.close();
	}

}
