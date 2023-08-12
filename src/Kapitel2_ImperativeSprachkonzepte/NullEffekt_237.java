package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.3.7 Quiz: Der Nulleffekt ★
 * Lässt sich die folgende Klasse übersetzen? Wenn das der Fall ist und man das Programm
 * ausführt, was ist das Ergebnis?
 */
public class NullEffekt_237 {
    public static void main(String[] args) {
        int zero = 0;
        int ten = 10;
        double anotherTen = 10;
        System.out.println(anotherTen / zero);
        System.out.println(ten / zero);

        //Da durch 0 dividiert wird, wird eine Exception geschmissen, welche zum jetzigen Zeitpunkt unbehandelt ist und daher das Programm abbricht.
    }
}
