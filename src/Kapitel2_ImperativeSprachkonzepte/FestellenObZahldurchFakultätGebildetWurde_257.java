package Kapitel2_ImperativeSprachkonzepte;

import java.util.Scanner;

/**
 * 2.5.7 Feststellen, ob eine Zahl durch Fakultät gebildet wurde ★
 * Jar Jar Dumbs hat von Bonny Brain den Auftrag bekommen, für eine gegebene Anzahl
 * Personen alle möglichen Anordnungen aufzuschreiben. Bevor sie sich die Liste
 * anschaut, zählt sie die Anzahl, um festzustellen, ob alle Permutationen aufgeführt
 * wurden.
 * Wie wir für eine natürliche Zahl die Fakultät berechnen, haben wir in der vorherigen
 * Aufgabe gesehen. Doch wie können wir herausfinden, ob eine Zahl eine Fakultät ist?
 * Wir wissen, dass 9! = 362.880 ist, aber was ist mit 212.880 oder 28?
 * Aufgabe:
 * Schreibe ein Programm, das eine natürliche Zahl von der Kommandozeile einliest
 * und ausgibt, ob die Zahl eine Fakultät darstellt.
 * Beispiel:
 *  Zahl ist Fakultät:
 * Enter a number:
 * 362880
 * 362880 = 9!
 *  Zahl ist keine Fakultät:
 * Enter a number:
 * 1000
 * 1000 is not a factorial
 */
public class FestellenObZahldurchFakultätGebildetWurde_257 {
    public static void main(String[] args) {
        System.out.println("Zahl eingeben");
        int n = new Scanner(System.in).nextInt();

        if (n < 1){
            System.out.println("Factorials are always > 1!");
        } else {

            long number = n;
            long divisor = 2;

            while(number % divisor == 0){
                number /= divisor;
                divisor++;
            } if (number == 1){
                System.out.printf("%d! = %d!%n",n, divisor - 1);
            } else {
                System.out.printf("%d is not a factorial%n", n);
            }


        }
    }
}
