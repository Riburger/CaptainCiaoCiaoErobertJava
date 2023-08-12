package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.5.8 Kleinste und größte Ziffer einer Zahl finden ★
 * Bonny Brain weiß natürlich, dass Dezimalzahlen aus Ziffern von 0 bis 9 bestehen. Da
 * die Fahrt mit dem Schiff lang und langweilig ist, hat sie sich ein Spiel ausgedacht: Sie
 * nennt der Mannschaft eine Ganzzahl, und wer am schnellsten deren größte und
 * kleinste Ziffer nennt, erhält eine Liretta.
 * Aufgabe:
 * Gegeben ist eine beliebige Zahl (positiv oder negativ), gespeichert in einem long.
 * <p>
 * Hilf mit einem Programm, die kleinste und größte Ziffer der gespeicherten Zahl zu
 * ermitteln.
 * Beispiele:
 * 12345 → 1, 5
 * 987654 → 4, 9
 * 11111 → 1, 1
 * 0 → 0, 0
 * -23456788888234567L → 2, 8
 */
public class KleinsteUndGroeßteZahl_258 {
    public static void main(String[] args) {
        System.out.println("Zahl eingeben: ");
        final long n = new java.util.Scanner(System.in).nextLong();

        long largest = 0;
        long smallest = n == 0 ? 0 : 9;
        for (long value = Math.abs(n); value != 0; value /= 10) {
            long lastDigit = value % 10;

            largest = Math.max(lastDigit, largest);
            smallest = Math.min(lastDigit, smallest);
        }
        System.out.println(smallest + "," + largest);
    }
}
