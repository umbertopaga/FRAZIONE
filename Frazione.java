public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        if (denominatore == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero");
        }
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public int getNum() {
        return numeratore;
    }

    public int getDen() {
        return denominatore;
    }

    public Frazione minTerm() {
        int mcd = MyMath.mcd(numeratore, denominatore);
        return new Frazione(numeratore / mcd, denominatore / mcd);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }
}
