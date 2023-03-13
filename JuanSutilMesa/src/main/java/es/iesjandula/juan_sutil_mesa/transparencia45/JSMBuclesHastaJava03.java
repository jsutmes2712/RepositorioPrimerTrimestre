package es.iesjandula.juan_sutil_mesa.transparencia45;

import java.util.Scanner;

public class JSMBuclesHastaJava03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("Introduzca la x");
			x = sc.nextInt();
		}while(x <0);
		
		int y;
		do {
			System.out.println("Introduzca la x");
			y = sc.nextInt();
		}while(y <0);
		
		int multi = 0;
		for(int i = 0; i < x; i++) {
			multi += y;
		}
		System.out.println(multi);
		sc.close();

	}
}
