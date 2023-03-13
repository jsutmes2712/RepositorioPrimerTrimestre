package es.iesjandula.juan_sutil_mesa.transparencia37;

import java.util.Scanner;
public class BuclesMientras01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int n = sc.nextInt();

		for(int i =0; i< n ; i++){
			
			System.out.print("*");
		}
		sc.close();

	}

}
