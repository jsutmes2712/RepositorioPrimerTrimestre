package es.iesjandula.juan_sutil_mesa.transparencia37;

import java.util.Scanner;

public class JSMBuclesMientras03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int z;
		do {
			
			System.out.print("Introduzca el primer valor: ");
			double x = sc.nextDouble();

			System.out.print("Introduzca el segundo valor: ");
			double y = sc.nextDouble();
			
			System.out.println(x + " + " + y + " = " + (x+y));
			System.out.println(x + " - " + y + " = " + (x-y));
			System.out.println(x + " x " + y + " = " + (x*y));
			
			if(y != 0){
				System.out.println(x + " / " + y + " = " + (x/y));
				System.out.println(x + " % " + y + " = " + (x%y));
			}else
				System.out.println("No se puede dividir por cero");
			
			System.out.println(x + "^" + y + " = " + (Math.pow(x, y)));
			
			if(x>=0 || y>=0)
				System.out.println("Raiz de " + x + " + " + " raiz de " + y + " = " + (Math.sqrt(x)+Math.sqrt(y)));
			else
				System.out.println("No se puede realizar la raiz cuadrada de un numero negativo");	
			
			System.out.print("Quiere continuar? (0 para salir)");
			z = sc.nextInt();
			
		}while(z != 0);
		sc.close();
	}
}
