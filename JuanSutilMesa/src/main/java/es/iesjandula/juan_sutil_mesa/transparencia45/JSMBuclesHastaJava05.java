package es.iesjandula.juan_sutil_mesa.transparencia45;

import java.util.Scanner;

public class JSMBuclesHastaJava05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("Introduzca un numero");
			x = sc.nextInt();
		}while(x <0);
		
		for(int i = 0; i < x; i++) {
			for(int j = i; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
