package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.3.3 Besitzen zwei Zahlen gleiche Ziffern? ★★
 * Bonny Brain spielt Anker-Domino, und alle Spielsteine haben zwei Felder, mit Werten
 * 0 bis 9. Jetzt möchte sie wissen, ob – auch durch Rotation – zwei Spielsteine so aneinandergelegt
 * werden können, dass die beiden Felder die gleichen Werte haben.
 * Aufgabe:
 * <p>
 * Schreibe ein Programm, das zwei Zahlen einliest, wobei die Zahlen im Bereich von
 * 0 bis 99 (beide Grenzen inklusive) liegen sollen.
 * Sind die Zahlen über 100, sollen nur die letzten zwei Ziffern gewertet werden; 100
 * oder 200 wären dann wie 00 (also 0), 1111 wäre wie 11.
 * Teste, ob die beiden Zahlen eine gemeinsame Ziffer haben.
 * Beispiele:
 * 12 und 31 haben 1 als gemeinsame Ziffer.
 * 22 und 33 haben keine gemeinsame Ziffer.
 * Hinweis: Es ist nicht die gemeinsame Ziffer gefragt, sondern einfach nur eine Ausgabe
 * true/false. Ist die Zahl einstellig, steht vorne gedanklich eine 0, sodass 01 und 20
 * eine Gemeinsamkeit haben, nämlich 0.
 */
public class ZweiZahlenGleicheZiffern_233 {
    public static void main(String[] args) {

        System.out.println("Bitte Zahl 1 eingeben: ");

        int zahl1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Bitte Zahl 2 eingeben: ");
        int zahl2 = new java.util.Scanner(System.in).nextInt();

        boolean sameNumber = false;

        ///zahl1 = zahl1 % 100;
        zahl1 %= 100;
        zahl2 %= 100;
        //zahl2 = zahl2 % 100;
        if (zahl1 == zahl2) {
            sameNumber = true;
            System.out.println("Same Number found!" + sameNumber);

        } else {
            int zahl1FirstNumberDigit = zahl1 / 10;
            int zahl1SecondnumberDigit = zahl1 % 10;
            int zahl2FirstNumberDigit = zahl2 / 10;
            int zahl2SecondnumberDigit = zahl2 % 10;

            if (zahl1FirstNumberDigit == zahl2FirstNumberDigit) {
                sameNumber = true;
                System.out.println("Same Number found!" + sameNumber);
            } else if (zahl1SecondnumberDigit == zahl2SecondnumberDigit) {

                sameNumber = true;
                System.out.println("Same Number found!" + sameNumber);
            }
        }


    }
}
