package Ejercicios;

public class Fichero1 {

	//sacar los divisores por pantalla y devuelve su suma total 
	public static int divisoresSuma(int num) {
		int p=0;
		int pm=0;
		for (int i = 0; i > num; i++) {
			if (i%num==0) {
				System.out.println(i);
				p++;
			}
			pm +=p;
			System.out.println(pm);
			
		}
	}

}
