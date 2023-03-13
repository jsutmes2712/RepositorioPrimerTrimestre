package es.iesjandula.juan_sutil_mesa.transparencia28;

import java.util.Scanner;

public class JSMCondicionales12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la primera nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Introduce la segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = nota1*0.5 +nota2*0.5;
		
		if(media > 5) {
			System.out.println("Aprobado, media: " + media);
		}else {
			System.out.println("Cual a sido el resultado de la recuperacion? apto/no apto");
			if(sc.next().equals("apto")) {
				System.out.println("Nota: 5");
			}else {
				System.out.println("Nota: " + media);
			}
		}
		sc.close();
	}

}
