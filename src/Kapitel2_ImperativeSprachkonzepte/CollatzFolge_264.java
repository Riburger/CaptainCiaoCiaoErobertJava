package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.6.4 Collatz-Folge berechnen ★
 * Lothar Collatz definierte 1937 eine Zahlenfolge, die heute als Collatz-Folge bekannt ist.
 * Sie wird wie folgt als Abbildung definiert, dass auf eine Zahl n folgt:
 *  n → n/2, falls n gerade ist,
 *  n → 3n + 1, falls n ungerade ist.
 *  Die Folge ist beendet, wenn 1 erreicht ist.
 * Beginnen wir etwa mit n = 7, durchläuft der Algorithmus die folgenden Zahlen:
 * 7 → 22 → 11 → 34 → 17 → 52 → 26 → 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * Jede Folge endet auf 4, 2, 1, aber warum das so ist, ist bis heute ungeklärt und ein ungelöstes
 * Problem der Mathematik.
 * Aufgabe:
 *  Lege eine Klasse Collatz mit einer Methode long collatz(long n) an.
 *  Erstelle eine main(…)-Methode, und berechne die Collatz-Folge für den Startwert
 * 27.
 *  Schreibe eine neue Methode long collatzMax(long n), die den jeweils größten erreichten
 * Zwischenwert zurückgibt.
 *  Wie können wir collatz(…) rekursiv programmieren, sodass die Methode als Ergebnis
 * den maximal angenommenen Wert liefert? Achtung, die Signatur muss geändert
 * werden! (Warum?)
 */
public class CollatzFolge_264 {

    public static void main(String[] args) {
        collatz ( 27 );
        System.out.println(collatzMax(27));
        System.out.println(collatz(27, 0));
        collatz(20);
        System.out.println(collatzMax(20));
        System.out.println(collatz(20, 0));
    }

    public static void collatz(long n)
    {
        System.out.println("Bitte Zahl eingeben: ");

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                System.out.printf("%d - ", n);

            } else {
                n = (3 * n) + 1;
                System.out.printf("%d - ", n);
            }
        }
    }

    public static long collatzMax(long n)
    {

        long max = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                if (n > max){
                    max = n;
                }

            } else {
                n = 3 * n + 1;
                if (n > max){
                    max = n;
                }

            }
        }
   return max; }

    public static long collatz(long n, long max)
    {
        if ( n > 1){
            if ( n %2 == 0 ){
                return collatz( n / 2, Math.max(n, max));
            } else {
                return collatz( 3 * n +1, Math.max(n, max));
            }
        }
        return max;
    }
}
