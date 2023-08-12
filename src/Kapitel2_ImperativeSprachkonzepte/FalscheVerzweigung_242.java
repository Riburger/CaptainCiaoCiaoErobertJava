package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.4.2 Quiz: Falsche Verzweigung ★
 * Das folgende Programmstückchen vertauscht den Inhalt der Variablen x und y, wenn
 * x größer als y ist. Stimmt das?
 * <p>
 * Nein stimmt nicht da der Wert von Swap nicht verwendet wurde, beide zahlen geben 1 aus, zusätzlich befinden sich im Beispiel fehler welche eine Ausführung unmöglich machen.
 * <p>
 * int x = 2; y = 1;
 * if ( x > y )
 * int swap = x;
 * x = y;
 * y = x;
 */
public class FalscheVerzweigung_242 {
    public static void main(String[] args) {

        int x = 2, y = 1;
        if (x > y) {
            int swap = x;
            x = y;
            y = swap;
// x sollte 1 sein und y 2

        }
    }
}
