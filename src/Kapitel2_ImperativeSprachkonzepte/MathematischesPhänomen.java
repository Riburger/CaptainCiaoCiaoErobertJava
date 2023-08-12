package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.5.4 Ein mathematisches Phänomen durchlaufen ★
 * Eine Iteration ist in der Mathematik eine wiederholte Berechnung beginnend mit
 * einem Startwert, bis eine bestimmte Bedingung erfüllt ist. Bei Berechnungen sind
 * Iterationen ein wichtiges Verfahren, um nach einer ersten Näherung bei jedem zusätzlichen
 * Schritt die Lösung zu verbessern.
 * Aufgabe:
 * Deklariere eine double-Variable t zwischen 0 (inklusiv) und 10 (exklusiv) mit folgender
 * Zeile:
 * double t = Math.random() * 10;
 * Multipliziere t mit 2, wenn t < 1. Wenn jedoch t >= 1 ist, ziehe 1 ab.
 * Setze diese Berechnung in eine while-Schleife, die enden soll, wenn t kleiner gleich
 * 0 ist.
 * Beispiel:
 * Die Ausgabe könnte sich so entwickeln:
 * 9.835060881347246
 * 8.835060881347246
 * 7.835060881347246
 * 6.835060881347246
 * ...
 * 0.75
 * 1.5
 * 0.5
 * 1.0
 */
public class MathematischesPhänomen {
    public static void main(String[] args) {
        double t = Math.random() * 10;
        boolean activ = true;

        while (activ) {
            System.out.printf("%.9f%n", t);
            if (t < 1 && t > 0) {
                t *= 2;
            } else if (t <= 0) {
                activ = false;
            } else {
                t -= 1;
            }
        }
    }
}
