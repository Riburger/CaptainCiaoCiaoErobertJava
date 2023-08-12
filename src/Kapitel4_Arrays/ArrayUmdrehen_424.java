package Kapitel4_Arrays;

import java.util.Arrays;

/**
 * 4.2.4 Array umdrehen ★
 * Charlie Creevey macht für Captain CiaoCiao die Finanzen. Doch statt die Einnahmen
 * aufsteigend zu sortieren, hat er sie absteigend sortiert. Daher muss die Liste umgedreht
 * werden.
 * Ein Array umzudrehen bedeutet, dass das erste Element mit dem letzten Element vertauscht
 * wird, das zweite mit dem zweitletzten usw.
 * Aufgabe:
 * Schreibe eine neue statische Methode reverse(…), die ein gegebenes Array umdreht:
 * public static void reverse( double[] numbers ) {
 * // TODO
 * }
 * Die Operation soll in place sein, also das übergebene Array ändern. Wir wollen kein
 * neues Array anlegen.
 * Die Übergabe null führt zu einer Ausnahme.
 * Beispiel:
 * { } → { }
 * { 1 } → { 1 }
 * { 1, 2 } → { 2, 1 }
 * { 1, 2, 3 } → { 3, 2, 1 }
 * Die Darstellung in den geschweiften Klammen ist nur symbolisch.
 */
public class ArrayUmdrehen_424 {
    public static void main(String[] args) {
        double[] numbers = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void reverse(double[] numbers) {
        final int middle = numbers.length / 2;

        for (int left = 0; left < middle; left++) {

            int right = numbers.length - left - 1;
            swap(numbers, left, right);

        }


    }

    public static void swap(double[] numbers, int i, int j) {
        double swap = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = swap;

    }
}
