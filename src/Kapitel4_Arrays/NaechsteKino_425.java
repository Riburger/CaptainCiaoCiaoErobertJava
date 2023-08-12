package Kapitel4_Arrays;

import java.awt.*;

/**
 * 4.2.5 Das nächste Kino finden ★★
 * Die Klasse java.awt.Point repräsentiert Punkte mit x/y-Koordinaten. Diese lassen
 * sich gut für Positionen einsetzen.
 * Im Kino läuft die Neuverfilmung »Unter der Flagge der Freibeuter« an, die Captain
 * CiaoCiao unbedingt sehen muss. Doch wo befindet sich das nächste Kino?
 * Aufgabe:
 * Gegeben ist eine Menge von Point-Objekten in einem Array points für die Kinopositionen.
 * Point[] points = { new Point(10, 20), new Point(12, 2), new Point(44, 4) };
 * Schreibe eine Methode double minDistance(Point[] points, int size), die den Abstand
 * des Punktes zurückliefert, der die geringste Distanz zum Nullpunkt besitzt.
 * Mit size können wir bestimmen, wie viele Elemente des Arrays betrachtet werden
 * sollen, damit das Array auch prinzipiell größer sein kann.
 * null als Übergabe ist nicht erlaubt, auch dürfen die Punkte nicht null sein; es muss
 * eine Ausnahme ausgelöst werden.
 * Was müssen wir ändern, wenn der Rückgabetyp Point ist, also der Punkt selbst mit
 * dem kleinsten Abstand zurückgegeben werden soll?
 * Tipp
 * Studiere die Javadoc zu java.awt.Point, um herauszufinden, ob der Punkt selbst Abstände
 * zu anderen Koordinaten berechnen kann.
 */
public class NaechsteKino_425 {
    public static void main(String[] args) {
        Point[] points = {new Point(10, 20), new Point(12, 2), new Point(44, 4)};
        System.out.println(minDistance(points));
        System.out.println(minDistancePoint(points));
    }

    /**
     * Diese Methode habe ich selbst geschrieben.
     *
     * @param points
     * @return
     */
    public static double minDistance(Point[] points) {
        Point zeroPoint = new Point(0, 0);
        double distance;
        double mindistance = zeroPoint.distance(points[0]);


        for (int i = 0; i < points.length; i++) {
            distance = zeroPoint.distance(points[i]);
            if (distance < mindistance) {
                mindistance = distance;
            }
        }
        return mindistance;
    }

    /**
     * Diese Lösung ist aus dem Buch und vom wurde vom Autor implementiert.
     *
     * @param points Das zu übergebende Array.
     * @param size   Die Größe des Arrays. Es wird an dieser Stelle von 1 zählen begonnen.
     * @return
     */
    static double minDistance(Point[] points, int size) {
        if (points.length == 0 || size > points.length)
            throw new IllegalArgumentException(
                    "Array is either empty or size out of bounds");
        double minDistance = points[0].distance(0, 0);
// Index variable i starting at 1, second element
        for (int i = 1; i < size; i++) {
            double distance = points[i].distance(0, 0);
            if (distance < minDistance)
                minDistance = distance;
        }
        return minDistance;
    }

    public static Point minDistancePoint(Point[] points) {
        Point zeroPoint = new Point(0, 0);
        Point smallestDistancePoint = null;

        double distance;
        double minDistance = zeroPoint.distance(points[0]);

        for (int i = 0; i < points.length; i++) {
            distance = zeroPoint.distance(points[i]);
            if (distance < minDistance) {
                smallestDistancePoint = points[i];
            }
        }
        return smallestDistancePoint;
    }
}
