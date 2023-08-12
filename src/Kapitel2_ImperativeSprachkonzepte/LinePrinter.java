package Kapitel2_ImperativeSprachkonzepte;

/**
 * Aufgabe:
 * Lege eine neue Klasse LinePrinter an. Setze in die Klasse eine statische Methode
 * line(), die eine Linie aus zehn Herzen schreibt. Das Unicode-Zeichen ♥ kann Java
 * in Strings speichern und ausgeben.
 * Lege eine neue Klasse LinePrinterDemo an, die eine main(…)-Methode hat und
 * line() aufruft.
 */
public class LinePrinter {

    public static void line() {
        System.out.println("♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");
    }

    public static void line(int len) {
        line(len, '-');
    }

    public static void line(int len, char c) {
        while (len-- > 0) {
            System.out.print(c);
        }
    }

    public static void line(String prefix, int len, char c, String suffix) {
        System.out.print(prefix);
        line(len, c);
        System.out.print(suffix);
    }

}
