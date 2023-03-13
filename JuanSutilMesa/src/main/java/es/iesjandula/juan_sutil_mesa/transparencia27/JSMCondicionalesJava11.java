package es.iesjandula.juan_sutil_mesa.transparencia27;

import java.util.Scanner;

public class JSMCondicionalesJava11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int n = sc.nextInt();
		
		if(n>9999) {
			if(n/10000==n%10) {
				if((n/1000)%10==(n%100)/10) {
					System.out.println("Es capicua");
				}
			}
		}else if(n>999) {
			if(n/1000==n%10) {
				if((n/100)%10==(n%100)/10) {
					System.out.println("Es capicua");
				}
			}
		}else if(n>99) {
			if(n/100==n%10) {
				System.out.println("Es capicua");
			}
		}else if(n>9) {
			if(n/10==n%10) {
				System.out.println("Es capicua");
			}
		}else {
			System.out.println("Es capicua");
		}
		sc.close();
	}
}
