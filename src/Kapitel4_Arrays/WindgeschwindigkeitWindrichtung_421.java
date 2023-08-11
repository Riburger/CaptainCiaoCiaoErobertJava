package Kapitel4_Arrays;

import java.util.Random;

/**
 * 4.2.1 Arrays ablaufen und Windgeschwindigkeit, Windrichtung ausgeben ★
 * Captain CiaoCiao segelt über das Meer, der Wind bläst von allen Seiten. Er muss die
 * Windgeschwindigkeit und Windrichtung immer im Blick haben.
 * Aufgabe:
 *  Deklariere zwei Arrays int[] windSpeed und int[] windDirection.
 *  Initialisiere beide Arrays je mit drei ganzzahligen Zufallszahlen (prinzipiell sollte
 * die Anzahl beliebig sein), wobei die Windstärke zwischen 0 und (kleiner) 200 km/h
 * und die Windrichtung zwischen 0 und (kleiner) 360 Grad liegen kann.
 *  Laufe mit einer Schleife über das Array, und gib alle Pärchen kommasepariert aus.
 * Beispiel:
 *  Enthält z. B. das Array windSpeed die Werte {82, 70, 12} und das Array windDirection
 * die Werte {12, 266, 92}, soll die Ausgabe auf dem Bildschirm sein:
 * Wind speed 82 km/h and wind direction 12°, Wind speed 70 km/h and wind direction
 * 266°, Wind speed 12 km/h and wind direction 92°
 * Hinweis: Bedenke, dass die
 *
 */
public class WindgeschwindigkeitWindrichtung_421 {
    public static void main(String[] args) {

        Random random = new Random();



        int[] windSpeed = new int[]{82,70,12};
        int[] windDirection = new int[]{12,266,92};

        for (int i = 0; i < windSpeed.length; i++){
                System.out.printf("Wind speed %d and wind direction %d Grad", windSpeed[i], windDirection[i]);

                if (i != windSpeed.length - 1){
                    System.out.print(',');
                }
        }
    }
}
