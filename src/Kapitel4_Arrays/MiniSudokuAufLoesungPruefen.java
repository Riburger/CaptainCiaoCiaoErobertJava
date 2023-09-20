package Kapitel4_Arrays;

/**
 * 4.4.1 Mini-Sudoku auf gültige Lösung prüfen ★★
 * Da Überfälle ziemlich anstrengend sind, braucht Bonny Brain einen Ausgleich und
 * beschäftigt sich mit Sudoku. Ein Sudoku-Spiel besteht aus 81 Feldern in einem 9-×-9-
 * Gitter. Das Gitter lässt sich in neun Blöcke zerlegen, jeder Block ist ein zweidimensionales
 * Array der Größe 3 × 3. In jedem dieser Blöcke muss jede Zahl von 1 bis 9 genau
 * einmal vorkommen – keine darf fehlen.
 * Aufgabe:
 * Schreibe ein Programm, das ein zweidimensionales Array mit neun Elementen daraufhin
 * testet, ob alle Zahlen von 1 bis 9 vorkommen.
 * Beispiel:
 *  Das folgende Array ist eine gültige Sudoku-Belegung:
 * int[][] array = {
 * { 1, 2, 3 },
 * { 4, 5, 6 },
 * { 7, 8, 9 }
 * };
 *  Das folgende Array ist keine gültige Sudoku-Belegung:
 * int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 8 } };
 * Der Fehler könnte etwa gemeldet werden mit "missing: 9".
 */
public class MiniSudokuAufLoesungPruefen {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        final int DIMENSION = 3;
        /*for(int i = 1; i < DIMENSION * DIMENSION; i++){
            boolean found = false;
             Diese Lösung bedeutet eine relativ hohe Laufzeit und das break macht den Code eher unleserlich
            matrixLoop:
            for (int row = 0; row < DIMENSION; row++){
                for (int column = 0; column < DIMENSION; i++){
                    int element = array[row][column];
                    if (element == i ){
                        found = true;
                        break matrixLoop;
                    }
                }
            }*/
        boolean[] numberExisted = new boolean[DIMENSION * DIMENSION];

        for (int row = 0; row < DIMENSION; row++) {
            for (int column = 0; column < DIMENSION; column++) {
                int element = array[row][column];
                if (element >= 1 && element <= 9)
                    numberExisted[element - 1] = true;
            }
        }
        for (int i = 0; i < numberExisted.length; i++) {
            boolean found = numberExisted[i];

            if (!found)
                System.out.printf("Missing %d%n", i + 1);
        }
    }
}


