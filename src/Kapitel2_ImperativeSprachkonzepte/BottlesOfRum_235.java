package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.3.5 Eine Flasche Rum, 10 Flaschen Rum ★
 * Bonny Brain ist eine Jägerin der falschen Sprache, und sie achtet immer darauf, dass
 * Beschriftungen grammatikalisch korrekt sind. Die Regeln für den Plural sind in vielen
 * Sprachen besonders, denn es heißt zum Beispiel »1 Flasche« oder »99 Flaschen«,
 * aber auch »0 Flaschen«. Oftmals finden sich in Oberflächen Vereinfachungen wie
 * »1 Flasche(n)«.
 * Aufgabe:
 * Lege eine Variable noOfBottles an, und belege sie mit einem Wert größer gleich 0.
 * Programmiere eine grammatikalisch korrekte Ausgabe, abhängig davon, ob es 0, 1
 * oder viele Flaschen gibt.
 * Beispiel:
 * "0 bottles of rum"
 * "1 bottle of rum"
 * "99 bottles of rum"
 */
public class BottlesOfRum_235 {
    public static void main(String[] args) {


        System.out.println("Wieviele Flaschen sind noch im Lager?");
        int nrOfBottles = new java.util.Scanner(System.in).nextInt();

        String bottles = nrOfBottles > 1 || nrOfBottles == 0 ? "Flaschen" : "Flasche";

        System.out.printf("%d %s im Lager! %n", nrOfBottles, bottles);

    }
}
