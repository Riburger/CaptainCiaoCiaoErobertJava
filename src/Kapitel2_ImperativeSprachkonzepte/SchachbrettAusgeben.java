package Kapitel2_ImperativeSprachkonzepte;

import java.util.Scanner;

/**
 * 2.5.11 Einfaches Schachbrett ausgeben ★
 * Captain CiaoCiao liebt die Deutsche Dame – eine Variante des Damespiels. Er nimmt
 * regelmäßig an Wettbewerben teil und stellt fest, dass das Spielbrett manchmal unterschiedlich
 * groß ist. Mal sind es 8 × 8 Felder, mal 10 × 10 Felder, auch 12 × 12 und 14 × 14
 * hat er schon erlebt.
 * Damit sich Captain CiaoCiao auf alle möglichen Spielfeldgrößen vorbereiten kann,
 * soll ein Programm ein Schachbrett auf dem Bildschirm ausgeben.
 * Aufgabe:
 *  Erfrage von der Kommandozeile Höhe und Breite des Spielbretts.
 *  Zeichne das Spielbrett nach den Größenangaben aus den Symbolen # und _.
 * Beispiel:
 * Checkerboard width: 10
 * Checkerboard height: 5
 * _#_#_#_#_#
 * #_#_#_#_#_
 * _#_#_#_#_#
 * #_#_#_#_#_
 * _#_#_#_#_#
 */
public class SchachbrettAusgeben {
    public static void main(String[] args) {
        System.out.println("Bitte zuerst Breite dann Höhe des Spielbretts angeben: ");
        int width = new Scanner(System.in).nextInt();
        int height = new Scanner(System.in).nextInt();

        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j++){

                if (j % 2 == 0){
                    System.out.print("_");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
