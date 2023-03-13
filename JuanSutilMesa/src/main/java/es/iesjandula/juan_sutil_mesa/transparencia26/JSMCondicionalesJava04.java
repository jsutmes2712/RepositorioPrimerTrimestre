package es.iesjandula.juan_sutil_mesa.transparencia26;

import java.util.Scanner;

public class JSMCondicionalesJava04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el valor de la x: ");
		int a = sc.nextInt();
		

		System.out.print("Introduzca el valor de la y: ");
		int b = sc.nextInt();
		
		if(a!=0)
			System.out.println("x " + " = " + (-b/a));
		else
			System.out.println("No tiene solucion");
		sc.close();

	}

}
