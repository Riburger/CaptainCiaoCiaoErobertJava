package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.3.4 Währungsbetrag in Münzen umrechnen ★★
 * Geld spielt bei Captain CiaoCiao naturgemäß eine wichtige Rolle.
 * Aufgabe:
 * Lege eine neue Klasse CoinMachine an.
 * Das Programm soll als Erstes eine Fließkommazahl für einen Geldbetrag fordern.
 * Gib aus, wie viele 2-Euro-, 1-Euro-, 50-Cent-, 20-Cent-, 10-Cent-, 5-Cent-, 2-Cent- und
 * 1-Cent-Münzen verwendet werden müssen, um diesen Betrag mit Münzen auszuzahlen.
 * Beispiel mit Eingabe »12,91«:
 * Please enter the amount of money:
 * 12,91
 * 6 x 2 €
 * 0 x 1 €
 * 1 x 50 Cent
 * 2 x 20 Cent
 * 0 x 10 Cent
 * 0 x 5 Cent
 * 0 x 2 Cent
 * 1 x 1 Cent
 * Die Formatierung der Ausgabe spielt keine Rolle.
 * Hinweis: Wenn man den Scanner nutzt, muss auf deutschen Systemen die Fließkommazahl
 * mit einem Komma statt eines Punktes eingegeben werden.
 */
public class CoinMachine_234 {
    public static void main(String[] args) {
        System.out.println("Wieviel habt ihr insgesamt erbeutet? (Kommazahl) :");
        double total = new java.util.Scanner(System.in).nextDouble();
        int totalInCoins = (int) (total * 100);
        System.out.println(totalInCoins / 200 + " x 2 - Euro");
        totalInCoins %= 200;
        System.out.println(totalInCoins / 100 + " x 1 - Euro");
        totalInCoins %= 100;
        System.out.println(totalInCoins / 50 + " x 0,50 - Euro");
        totalInCoins %= 50;
        System.out.println(totalInCoins / 20 + " x 0,20 - Euro");
        totalInCoins %= 20;
        System.out.println(totalInCoins / 10 + " x 0,10 - Euro");
        totalInCoins %= 10;
        System.out.println(totalInCoins / 5 + " x 0,05 - Euro");
        totalInCoins %= 5;
        System.out.println(totalInCoins / 2 + " x 0,02 - Euro");
        totalInCoins %= 2;
        System.out.println(totalInCoins / 1 + " x 0,01 - Euro");
        totalInCoins %= 1;

    }
}
