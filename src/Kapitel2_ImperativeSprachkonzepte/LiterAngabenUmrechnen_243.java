package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.4.3 Literangaben umrechnen ★★
 * Ein Programm soll Flüssigkeitsmengen in eine für Captain CiaoCiao leicht lesbare
 * Form umwandeln.
 * Aufgabe:
 *  Lies von der Kommandozeile eine Fließkommazahl ein, die Größenordnung
 * ist Liter.
 *  Konvertiere die Zahl nach folgendem Muster:
 * 1,0 und größer: Ausgabe in Liter, etwa ca. 4 l bei der Eingabe 4
 * 0,1 und größer: Ausgabe in Zentiliter, etwa ca. 20 cl bei der Eingabe 0,2
 * 0,001 und größer: Ausgabe in Milliliter, etwa ca. 9 ml bei der Eingabe 0,009
 *  Die Ausgabe ist immer eine Ganzzahl. Rundungen sind in Ordnung.
 */
public class LiterAngabenUmrechnen_243 {
    public static void main(String[] args) {

        while ( 1 == 1 ){
        System.out.println("Willkommen beim Flüssigkeitsumrechner - Bitte gib die Menge in Litern an die umgerechnet werden soll: ");
        double inLiters = new java.util.Scanner(System.in).nextDouble();

        if (inLiters < 0.1 && inLiters >= 0.0001){
            System.out.printf("ca. %.0f ml %n", inLiters*1000);
        } else if (inLiters < 1 && inLiters >= 0.1) {
            System.out.printf("ca. %.0f cl %n", inLiters*100);
        } else if (inLiters >= 1) {
            System.out.printf("ca. %.0f l %n", inLiters);
        } else {
            System.out.printf("Value too small to display. %n");
        }
    }

    }

}
