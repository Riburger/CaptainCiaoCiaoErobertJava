package Kapitel4_Arrays;

/**
 * 4.3.1 Berge zeichnen ★★
 * Für die nächste Schatzsuche müssen Bonny Brain und die Crew über Berge und
 * Hügel gehen. Sie bekommt vorher die Höhenmeter mitgeteilt und möchte sich vorher
 * einen Eindruck vom Profil machen.
 * Aufgabe:
 *  Schreibe ein Programm mit einer Methode printMountain(int[] altitudes), die
 * ein Array mit Höhenmetern in eine ASCII-Darstellung umsetzt.
 *  Die Höhe soll darstellt werden über ein Multiplikationszeichen * in genau dieser
 * Höhe von einer Grundlinie. Die Höhen können beliebig sein, aber nicht negativ.
 * Beispiel:
 * Das Array { 0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2, 2, 1, 0 } soll darstellt werden als:
 * 5 *
 * 4 **
 * 3 *** *
 * 2 ** **
 * 1 ** *
 * 0 * *
 * Die erste Spalte dient der Verdeutlichung und muss nicht umgesetzt werden.
 */
public class BergeZeichnen {
    public static void main(String[] args) {
        int[] hoehen = new int[]{0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2, 2, 1, 0};

        printMountain(hoehen);
    }

    private static String mountainChar(){
        return "+";
    }

    public static void printMountain(int[] hoehenmeter)
    {
        int maxHoehenmeter = hoehenmeter[0];

        for (int aktuellerHoehenmeter : hoehenmeter)
            if (aktuellerHoehenmeter > maxHoehenmeter) {
                maxHoehenmeter = aktuellerHoehenmeter;
            }

            for (int hoehe = maxHoehenmeter; hoehe >= 0; hoehe--){
                System.out.print(hoehe + " ");
                for (int hoehenmeter1 : hoehenmeter)
                    System.out.print(hoehenmeter1 == hoehe ? mountainChar() : ' ');
                System.out.println();
            }
        }
    }

