package Kapitel4_Arrays;

import java.util.Objects;

/**
 * 4.2.3 Aufeinanderfolgende Strings suchen und feststellen,
 * ob Salty Snook kommt ★
 * Bonny Brain beobachtet die Flaggen der vorbeiziehenden Schiffe, denn sie wartet auf
 * Salty Snook. Sie schaut sich jede Flagge an und weiß, dass Salty Snook nie alleine
 * kommt, sondern sich in einem Konvoi von vier Schiffen bewegt. Die Flaggen selbst
 * kennt sie nicht, nur weiß sie, dass alle die gleiche Aufschrift haben.
 * Aufgabe:
 * Schreibe eine neue Methode isProbablyApproaching(String[] signs), die dann
 * true zurückliefert, wenn es im Array vier gleiche Kürzel hintereinander gibt. Bedenke,
 * dass man Strings mit equals(…)vergleicht.
 * Das übergebene Array darf nicht null sein, und kein Element im Array darf null
 * sein.
 * Beispiel:
 * String[] signs1 = { "F", "DO", "MOS", "MOS", "MOS", "MOS", "WES" };
 * isProbablyApproaching( signs1 ); // true
 * String[] signs2 = { "F", "DO", "MOS", "MOS", "WES", "MOS", "MOS" };
 */
public class SaltySnook_423 {
    public static void main(String[] args) {
        String[] signs1 = new String[]{"F", "DO", "MOS", "MOS", "MOS", "MOS", "WES"};
        String[] signs2 = new String[]{"F", "DO", "MOS", "MOS", "WES", "MOS", "MOS"};
        System.out.println(isPropablyApproaching(signs1));
        System.out.println(isPropablyApproaching(signs2));

    }

    public static boolean isPropablyApproaching(String[] signs) {

        int counter = 1;
        int minOccurences = 4;
        for (int i = 0; i < signs.length - 1; i++) {
            String currentSign = Objects.requireNonNull(signs[i]); // Auch ohne Objects.requireNonNull möglich
            String nextSign = Objects.requireNonNull(signs[i + 1]); // Auch ohne Objects.requireNonNull möglich
            if (currentSign.equals(nextSign)) {
                counter++;
                if (counter == minOccurences)
                    return true;


            } else {
                counter = 1;
            }
        }
        return false;
    }
}
