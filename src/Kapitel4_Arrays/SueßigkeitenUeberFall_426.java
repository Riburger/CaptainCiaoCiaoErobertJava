package Kapitel4_Arrays;

import java.util.logging.Logger;

/**
 * 4.2.6 Süßigkeitenladen überfallen und fair aufteilen ★★
 * Captain CiaoCiao überfällt mit seinen Kindern Junior und Jackie einen Süßigkeitenladen.
 * Die Süßigkeiten stehen in einem langen Regal, und jedes Produkt hat ein Gewicht.
 * Die Daten liegen als Array vor:
 * int[] values = { 10, 20, 30, 40, 40, 50 };
 * Junior und Jackie stellen sich links und rechts an entgegengesetzten Enden des Regals
 * auf, und da Captain CiaoCiao beide Kinder gleich lieb hat, sollen sie am Ende
 * auch gleich viel mit nach Hause nehmen. Captain CiaoCiao zeigt im Regal auf eine
 * Süßigkeit, sodass alle Produkte links davon zu Junior gehen und alle Produkte rechts
 * von der Position (inklusive dem gezeigten) für Jackie sind.
 * Der Captain weiß zwar, was im Regal steht, aber nicht, ab welcher Position links und
 * rechts die gleiche Summe entsteht. Abweichungen von 10 % sind für die Kinder in
 * Ordnung. Für den Unterschied wollen wir auf folgende Formel für die relative Differenz
 * zurückgreifen:
 * private static int relativeDifference( int a, int b ) {
 * int absoluteDifference = Math.abs( a - b );
 * return (int) (100. * absoluteDifference / Math.max( a, b ));
 * }
 * Aufgabe:
 * Schreibe eine Methode int findSplitPoint(int[]), die den Index im Array findet,
 * bei dem links und rechts fair geteilt werden kann. Irgendeine Lösung reicht, es
 * sind nicht alle Lösungen nötig.
 * Falls es keine faire Teilung gibt, soll eine Methode -1 liefern.
 * Beispiele:
 * 10 + 20 + 30 + 40 ≈ 40 + 50, denn 100 ≈ 90, und der Index für die Rückgabe ist 4.
 * 10 20 30 40 40 100 führt zu -1, denn es gibt keine gültige Partitionierung.
 */
public class SueßigkeitenUeberFall_426 {

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 40, 50};

        System.out.println(findSplitPoint(values));
    }

    private static int relativeDifference(int a, int b) {
        if (a == b) return 0;
        int absoluteDifference = Math.abs(a - b);
        return (int) (100. * absoluteDifference / Math.max(a, b));
    }

    public static int findSplitPoint(int[] values) {
        if (values.length < 2) {
            return -1;
        }
        int sumLeft = values[0];

        int sumRight = 0;

        for (int i = 1; i < values.length; i++)
            sumRight += values[i];

        for (int splitIndex = 1; splitIndex < values.length; splitIndex++) {
            int relativeDifference = relativeDifference(sumLeft, sumRight);

            Logger.getLogger("MuggingFairly").info("splitIndex=" +
                    splitIndex +
                    ", sum left/right="
                    + sumLeft + "/"
                    + sumRight + ", difference=" + relativeDifference);

            if (relativeDifference <= 10)
                return splitIndex;

            int element = values[splitIndex];
            sumLeft += element;
            sumRight -= element;
        }
        return -1;
    }
}
