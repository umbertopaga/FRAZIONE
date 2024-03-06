
public class Frazione {
	private int num, den;
	public Frazione(int num, int den) {
		boolean negativo = num * den < 0;
		this.num = negativo ? -Math.abs(num) : Math.abs(num);
		this.den = Math.abs(den);
	}

	public Frazione(int num) {
		this(num, 1);
	}
	
	public int getNum() {
		return num;
	}


	public int getDen() {
		return den;
	}
	public Frazione minTerm() {
		if (getNum()==0) return new Frazione(getNum(), getDen());
		int mcd = MyMath.mcd(Math.abs(getNum()), getDen());
		int n = getNum() / mcd;
		int d = getDen() / mcd;
		return new Frazione(n, d);
	}

	

	public boolean equals(Frazione f) {
		return f.getNum() * getDen() == f.getDen() * getNum();
	}

	@Override
	   public String toString() {
		   String str = "";
			int num = getNum();
			int den = getDen();

			str += getDen() == 1 ? num : num + "/" + den;		
			return str;	   
	   }
	public Frazione sum(Frazione f) {
		int n = num * f.den + den * f.num;
		int d= den * f.den;
		Frazione fSum = new Frazione (n,d);
		return fSum.minTerm();
	}
	public Frazione sumWithMcm(Frazione f) {
		int mcm = MyMath.mcm(den, f.den);
		int n = ((mcm/den)+num) + ((mcm/f.den)+f.num);
		Frazione fSum = new Frazione (n,mcm);
		return fSum.minTerm();
	}
	public Frazione sub(Frazione f){
		int mcm = MyMath.mcm(den, f.den);
		int n = ((mcm/den)+num) - ((mcm/f.den)+f.num);
		Frazione fSum = new Frazione (n,mcm);
		return fSum.minTerm();
	}
	public Frazione mul(Frazione f){
		int n = num * f.num;
		int d = den * f.den;
		Frazione fMul = new Frazione (n,d);
		return fMul.minTerm();
	}
	public Frazione div(Frazione f){
		int n = num * f.den;
		int d = den * f.num;
		Frazione fMul = new Frazione (n,d);
		return fMul.minTerm();
	}
	public Frazione reciprocal(){
		int d = num;
		int n = den;
		Frazione fRec = new Frazione (n,d);
		return fRec.minTerm();
	}
	public int compareTo(Frazione f){
		float a = num / den;
		float b = f.num / f.den;
		if (a == b)
			return 0;
		else if( a > b)
			return 1;
		else
			return -1;
	}
	public double getDouble(){
		return ((double) num / den);
		
	}
}
