package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.5.10 Ein Wimpel im Wind durch geschachtelte Schleifen ★
 * Aufgabe:
 * Erzeuge folgende Ausgabe, die so aussieht wie eine kleine Fahne:
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * Optional: Die Ausgabe soll als in dem Sinne als Baum erscheinen, dass alle Zeilen zentriert
 * sind.
 */
public class WimpelimWind_2510 {
    public static void main(String[] args) {
        final int max = 5;
        for (int i = 1; i <= max; i++){
            for (int j = 1; j <= i; j++)
                System.out.print(i);

            System.out.println();
        }

    }
}
