package Kapitel3_KlassenUndObjekte;

import java.awt.*;
import java.util.Random;

/**
 * Aufgabe:
 * Lege eine neue Klasse BermudaTriangle an mit einer main(…)-Methode.
 * Erzeuge ein java.awt.Polygon-Objekt.
 * Ein Polygon besteht aus Punkten, die mit einer Methode hinzugefügt werden. Wie
 * heißt diese Methode?
 * Erzeuge ein Dreieck für das geheimnisvolle Bermudadreieck. Bleibe bei den Koordinaten
 * im Wertebereich von 0 bis 50.
 * Wenn die Position des Schiffs ein Punkt ist, wie lässt sich herausfinden, ob ein
 * gewählter Punkt innerhalb des Dreiecks liegt?
 * Schachtele zwei Schleifen für 0 <= x < 50 und 0 <= y < 50, und erzeuge damit ein
 * rechteckiges Raster. Gib genau dann eine Krake aus, wenn die x-y-Koordinate einen
 * Punkt trifft, der im Polygon liegt, und sonst einen Regenbogen. Setze den Bedingungsoperator
 * ein: print(ist_im_Polygon ? "\uD83D\uDC19" : "\uD83C\uDF08");
 * Dabei steht ist_im_Polygon sinnbildlich für den Test, ob sich der Punkt im Polygon
 * befindet.
 * Optional: Gehören die Punkte auf der Linie zum Inneren? Was ist mit den Punkten
 * selbst? Gehören sie zum Inneren oder zum Äußeren des Polygons?
 */
public class BermudaTriangle_311 {

    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        Point ship = new Point(30, 30);

        polygon.addPoint(25, 5);
        polygon.addPoint(10, 40);
        polygon.addPoint(45, 45);

        System.out.println(polygon.contains(ship));

        final int dimension = 50;
        final String octopus = "\uD83D\uDC19";
        final String rainbow = "\uD83C\uDF08";
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++)
                System.out.print(polygon.contains(i, j) ? octopus : rainbow);
            System.out.println();
        }
    }

    /**
     * 3.3.2 Dreiecke aufbauen ★
     * Captain CiaoCiao ist sich sicher, dass die gefährlichen Stellen im Bermudadreieck zufällig
     * sein können – er muss auf alles vorbereitet sein.
     * Aufgabe:
     * Lege in der vorhandenen Klasse BermudaTriangle eine neue statische Methode an:
     * static Polygon resetWithRandomTriangle( Polygon polygon ) {
     * // return gesetztes Dreieck
     * }
     * Diese Methode soll das übergebene java.awt.Polygon, das noch Punkte enthalten
     * könnte, erst leeren, dann mit einem zufälligen Dreieck belegen und am Ende zurückgeben.
     * Schreibe eine weitere statische Methode, welche ein neues zufälliges Dreieck zurückgibt:
     * static Polygon createRandomTriangle() {
     * //return beliebiges Dreieck
     */

    public static Polygon resetWithRandomTriangle(Polygon polygon) {
        polygon.reset();
        Random random = new Random();
        final int dimension = 50;
        polygon.addPoint(random.nextInt(dimension), random.nextInt(dimension));
        polygon.addPoint(random.nextInt(dimension), random.nextInt(dimension));
        polygon.addPoint(random.nextInt(dimension), random.nextInt(dimension));

        return polygon;
    }

    public static Polygon createRandomTriangle() {

        return resetWithRandomTriangle(new Polygon());
    }

}
