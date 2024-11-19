package Ejercicios;

import java.util.Scanner;

public class reto4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		do {
			try {
				num=Funciones.dimeEntero("Escribe un numero", sc);
				sc.nextInt();
			} catch (Exception e) {
				System.out.println("Escribe un numero valido");
			}
		} while (num%2==0 || num%3==0 || num%5==0);
		int sum = Fichero1.divisores(num);
		System.out.println(factorial(suma));
		sc.close();
	}
}
