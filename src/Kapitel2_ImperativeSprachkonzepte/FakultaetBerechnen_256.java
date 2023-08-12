package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.5.6 Produkte für Fakultäten berechnen ★
 * Für die neue Flotte Rigel VII muss Bonny Brain die Führungsoffiziere auswählen; zur
 * Auswahl stehen Paul Peldrion, Kate Muggl, Robinson Langdon, Lienn Langdon. Allerdings
 * ist sich Bonny Brain unsicher, welche Person welche Rolle einnehmen soll; es
 * gibt: Kommandant, Erster Offizier, Zweiter Offizier, Dritter Offizier.
 * Es gibt viele Möglichkeiten, welche Person welche Rolle einnimmt. Wie viele mögliche
 * Anordnungen von verschieden Elementen es in einer Reihe gibt, sagt die sogenannte
 * Permutation aus. Eine Permutation ohne Wiederholung wird berechnet über
 * die Fakultät. Bei vier Personen gibt es 1 × 2 × 3 × 4 = 24 mögliche Anordnungen.
 * Die Fakultät einer natürlichen Zahl wird über das Produkt der Zahlen nach folgendem
 * Muster gebildet:
 * n! = 1 × 2 × 3 × … × (n – 1) × n
 * Es gilt 0! = 1.
 * Aufgabe:
 * Schreibe ein Java-Programm, das von der Kommandozeile eine natürliche Zahl >= 0
 * einliest und die Berechnung anzeigt.
 * Beispiel:
 * Eingabe: 9 → Ausgabe: 9! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 = 362880
 * Eingabe: 3 → Ausgabe: 3! = 1 * 2 * 3 = 6
 * Eingabe: 0 → Ausgabe: 0! = 1
 * Eingabe: 1 → Ausgabe: 1! = 1
 * Eingabe: -1 → Ausgabe: Number must not be negative
 * <p>
 * Frage: Ab welcher Zahl gibt es »Probleme«? Wie fallen die »Probleme« auf, und wie
 * können wir die Probleme erkennen? Kann uns Math.multiplyExact(long x, long y)
 * helfen?
 */
public class FakultaetBerechnen_256 {
    public static void main(String[] args) {

        System.out.println("Bitte eine natürliche Zahl >= 0 eingeben:");

        int n = new java.util.Scanner(System.in).nextInt();

        if (n < 0) {
            System.err.println("Nummer darf nicht negativ sein!");
        } else if (n < 2) {
            System.out.printf("%d! = 1%n", n);
        } else
            System.out.printf("%d! = 1", n);
        long factorial = 1;

        for (int multiplier = 2; multiplier <= n; multiplier++) {
            System.out.printf(" * %d", multiplier);
            factorial *= multiplier;
        }
        System.out.printf(" = %d%n", factorial);
    }
}
