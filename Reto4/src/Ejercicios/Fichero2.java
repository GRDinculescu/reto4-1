 package Ejercicios;

public class Fichero2 {
	
	/*Esta funcion debe sacar el n�mero cuyo factorial es el menor m�s cercano a la suma de todos los n�meros anteriores*/
	public static int factorial (int suma) {
		int kk = 1, bueno;
		for (int i = 0; i < Math.pow(suma, suma); i++) {
			for (int j = 0; j < i; j++) {
				kk *= i;
			}
			if (kk > suma) {
				bueno = kk;
			}
		}
		return bueno;
	}

}
