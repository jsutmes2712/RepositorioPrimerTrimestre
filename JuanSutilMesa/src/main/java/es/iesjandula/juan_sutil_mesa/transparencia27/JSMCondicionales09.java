package es.iesjandula.juan_sutil_mesa.transparencia27;

import java.util.Scanner;

public class JSMCondicionales09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int n = sc.nextInt();
		
		n = Math.abs(n);
		
		if(n>9999) {
			System.out.println(n/10000);
		}else if(n>999) {
			System.out.println(n/1000);
		}else if(n>99) {
			System.out.println(n/100);
		}else if(n>9) {
			System.out.println(n/10);
		}else {
			System.out.println(n);
		}
		sc.close();
		
	}

}
