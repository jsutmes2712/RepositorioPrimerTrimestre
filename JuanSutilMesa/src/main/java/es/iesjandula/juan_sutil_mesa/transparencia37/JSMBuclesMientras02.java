package es.iesjandula.juan_sutil_mesa.transparencia37;

import java.util.Scanner;

public class JSMBuclesMientras02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = (int)(Math.random()*10+1);
		
		boolean acertado = false;
		do {
			
			System.out.println("Introduzca el numero");
			int num = sc .nextInt();
			
			if(num == n)
				acertado = true;
		}while(!acertado);
		
		System.out.println("Has acertado");
		sc.close();
	}

}
