package es.iesjandula.juan_sutil_mesa.transparencia26;

import java.util.Scanner;

public class JSMCondicionalesJava06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer valor: ");
		int n1 = sc.nextInt();
		
		System.out.print("Introduzca el segundo valor: ");
		int n2 = sc.nextInt();

		System.out.print("Introduzca el tercer valor: ");
		int n3 = sc.nextInt();
		
		if(n1 >= n2) {
			if(n1>=n3) {
				if(n2>=n3) {
					System.out.println(n1 + " - " + n2 + " - " + n3);
				}else {
					System.out.println(n1 + " - " + n3 + " - " + n2);
				}
			}else {
				System.out.println(n3 + " - " + n1 + " - " + n2);
			}
		}else {
			if(n2>=n3) {
				if(n1>=n3) {
					System.out.println(n2 + " - " + n1 + " - " + n3);
				}else {
					System.out.println(n2 + " - " + n3 + " - " + n1);
				}
			}else {
				System.out.println(n3 + " - " + n2 + " - " + n1);
			}	
		}
		sc.close();
	}
}
