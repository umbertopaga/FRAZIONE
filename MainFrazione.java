/**
  * Classe di test
 * @author Fondamenti di Informatica T-2
 * @version March 2024
 */
public class MainFrazione
{
    public static void main(String[] args) {

        // Test costruzione frazione e funzionamento metodi accessor e toString
        Frazione frazione1 = new Frazione(3, 12);
        System.out.println("Creata la frazione " + frazione1);

        Frazione frazione2 = new Frazione(1, 4);
        System.out.println("Creata la frazione " + frazione2);

        Frazione frazione3 = new Frazione(1, 8);
        System.out.println("Creata la frazione " + frazione3);

        Frazione frazione4 = new Frazione(4, 1);
        System.out.println("Creata la frazione " + frazione4);

        // Test valori negativi
        Frazione frazione5 = new Frazione(-1, 8);
        System.out.println("Creata la frazione " + frazione5);

        Frazione frazione6 = new Frazione(2, -3);
        System.out.println("Creata la frazione " + frazione6);

        Frazione frazione7 = new Frazione(-5, -7);
        System.out.println("Creata la frazione " + frazione7);

        // Test funzionamento equals
        if (frazione1.equals(frazione2)) // true
            System.out.println("Le frazioni " + frazione1 + " e " + frazione2 + " sono equivalenti");
        else
            System.out.println("Le frazioni " + frazione1 + " e " + frazione2 + " non sono equivalenti");


        if (frazione1.equals(frazione3)) // false
            System.out.println("Le frazioni " + frazione1 + " e " + frazione3 + " sono equivalenti");
        else
            System.out.println("Le frazioni " + frazione1 + " e " + frazione3 + " non sono equivalenti");


        if (frazione1.equals(frazione6)) // false
            System.out.println("Le frazioni " + frazione1 + " e " + frazione6 + " sono equivalenti");
        else
            System.out.println("Le frazioni " + frazione1 + " e " + frazione6 + " non sono equivalenti");

        // Test funzionamento riduzioneMinimiTermini
        Frazione frazioneRid = frazione1.minTerm();
        System.out.println("La frazione " + frazione1 + " ridotta ai minimi termini diventa " + frazioneRid); // 1/4

        frazioneRid = frazione6.minTerm();
        System.out.println("La frazione " + frazione6 + " ridotta ai minimi termini diventa " + frazioneRid); // -2/3

    }
}