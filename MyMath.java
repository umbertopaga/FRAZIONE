
public final class MyMath {
	/**
	 * Calcola il massimo comun divisore (m.c.d.) tra due interi.
	 */
	public static int mcd(int a, int b) {
		int resto;
		if (b > a) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		do {
			resto = a % b;
			a = b;
			b = resto;
		} while (resto != 0);
		return a;
	}

	/**
	 * Calcola il Minimo Comune Multiplo tra due numero interi (m.c.m.)*/
	public static int mcm(int a, int b) {
		return (a*b)/mcd(a,b);
	}
	
}
