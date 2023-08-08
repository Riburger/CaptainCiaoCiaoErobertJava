package Kapitel2_ImperativeSprachkonzepte;
/**
 * 2.5.3 Zahlen von der Kommandozeile summieren ★
 * Captain CiaoCiao möchte ein Programm, in das er die Anzahl erbeuteter Liretta aus
 * seinen einzelnen Raubzügen auf der Kommandozeile eingeben kann und das diese
 * addiert.
 * Aufgabe:
 *  Lege eine neue Klasse SummingCalculator an.
 *  Nimm über den Scanner so lange Zahlen entgegen, bis 0 eingegeben wird. Negative
 * Zahlen sind ebenfalls erlaubt, weil Captain CiaoCiao auch – wenn auch selten –
 * ausgeraubt wird. Ignoriere mögliche Überläufe durch zu große Zahlen.
 *  Nachdem 0 eingegeben wird, soll die Summe ausgegeben werden.
 * Beispiel:
 * 12
 * 3
 * -1
 * 0
 * Sum: 14
 */
public class SummingCalculator {
    public static void main(String[] args) {
        boolean activ = true;
        double total = 0;
        while (activ){
            System.out.println("Bitte die erbeuteten oder verlorenen Liretta eingeben: ");
            double liretta = new java.util.Scanner(System.in).nextDouble();
            total += liretta;
            if (liretta == 0){
                System.out.printf("Total: %.0f", total);
                activ = false;
            }

        }
    }
}
