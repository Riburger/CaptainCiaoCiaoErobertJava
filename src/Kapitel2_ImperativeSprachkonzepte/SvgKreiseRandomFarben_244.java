package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.4.4 SVG-Kreise mit zufälligen Farben erzeugen ★
 * In einer früheren Aufgabe hat Captain CiaoCiao einen schwarzen Kreis auf weißem
 * Grund eingefordert. Doch etwas Farbe dürfte es schon sein!
 * Aufgabe:
 * Lege eine neue Klasse mit einer main(…)-Methode an.
 * Gib auf der Kommandozeile zufällig, und mit gleicher Wahrscheinlichkeit, red,
 * green, blue aus.
 * In SVG kann man bei Kreisen die Farbe mit dem Attribut fill bestimmen, etwa so:
 * <circle cx="20" cy="20" r="5" fill="blue" />. Gib dem Kreis eine zufällige Farbe.
 */
public class SvgKreiseRandomFarben_244 {
    public static void main(String[] args) {
        String farbe;
        double randomFarbe = Math.random();

        if (randomFarbe <= 0.3) {
            farbe = "green";
        } else if (randomFarbe <= 0.6 && randomFarbe > 0.3) {
            farbe = "blue";
        } else {
            farbe = "red";
        }
        System.out.printf("<svg height=\"400\" width=\"1000\">%n<circle cx=\"100\" cy=\"100\" r=\"50\" fill=\"%s\" />%n</svg>", farbe);
    }
}
