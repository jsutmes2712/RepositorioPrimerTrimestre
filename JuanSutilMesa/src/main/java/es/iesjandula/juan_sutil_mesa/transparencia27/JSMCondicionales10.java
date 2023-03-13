package es.iesjandula.juan_sutil_mesa.transparencia27;

import java.util.Scanner;

public class JSMCondicionales10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int n = sc.nextInt();
		
		if(n>9999) {
			System.out.println(5);
		}else if(n>999) {
			System.out.println(4);
		}else if(n>99) {
			System.out.println(3);
		}else if(n>9) {
			System.out.println(2);
		}else {
			System.out.println(1);
		}
		sc.close();
	}
}
