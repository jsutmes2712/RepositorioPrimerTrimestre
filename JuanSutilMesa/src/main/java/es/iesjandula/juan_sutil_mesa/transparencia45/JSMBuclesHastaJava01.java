package es.iesjandula.juan_sutil_mesa.transparencia45;

import java.util.Scanner;

public class JSMBuclesHastaJava01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero a calcular");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i = 1; i < n; i++) {
			factorial*=i;
		}
		System.out.println(factorial);
		sc.close();
	}
}
