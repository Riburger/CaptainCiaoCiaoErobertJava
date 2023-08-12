package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.3.6 Einundzwanzig ★
 * Im Casino von Captain CiaoCiao spielt der Croupier gegen einen Spieler das Spiel
 * »Einundzwanzig«. Ziel ist es, mit zwei oder mehr Karten näher an 21 Punkte heranzukommen
 * als der Croupier.
 * Aufgabe:
 * Lies zwei positive Ganzzahlen dealer und player für die erreichte Punktzahl von
 * Croupier und Spieler ein.
 * Gib genau den Wert aus, der näher an 21 liegt. Geht ein Wert über 21, hat die andere
 * Seite gewonnen. Gehen beide Werte über 21, soll 0 ausgegeben werden.
 * Beispiel:
 * Eingaben 21 und 18 → Ausgabe 21
 * Eingaben 18 und 21 → Ausgabe 21
 * Eingaben 21 und 21 → Ausgabe 21
 * Eingaben 22 und 23 → Ausgabe 0
 * Eingaben 1 und 10 → führen zum Programmende
 * Eingaben 1 und 22 → führen zum Programmende
 */
public class EinundZwanzig_236 {
    public static void main(String[] args) {

        boolean spielAktiv = true;

        while (spielAktiv) {
            System.out.printf("Bitte die Summe beider Karten des Dealers eingeben: ");
            int zahlenDealer = new java.util.Scanner(System.in).nextInt();
            System.out.printf("Bitte die Summe beider Karten des Spielers eingeben: ");
            int zahlenSpieler = new java.util.Scanner(System.in).nextInt();
            int maxScore = 21;

            if (zahlenSpieler > maxScore && zahlenDealer > maxScore) {
                System.out.printf("Beide drüber. %n");
            } else if (zahlenSpieler > maxScore) {
                System.out.println(zahlenDealer + " Dealer");
            } else if (zahlenDealer > maxScore) {
                System.out.println(zahlenSpieler + " Spieler");
            } else
                System.out.println(Math.max(zahlenDealer, zahlenSpieler));

        }
    }
}
