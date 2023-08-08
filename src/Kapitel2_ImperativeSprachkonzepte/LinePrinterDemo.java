package Kapitel2_ImperativeSprachkonzepte;

public class LinePrinterDemo {
    public static void main(String[] args) {

        System.out.println("Bitte Zahl eingeben: ");
        int len = new java.util.Scanner(System.in).nextInt();
        LinePrinter.line(len);
        System.out.println();

        LinePrinter.line(4, '*');
        System.out.println();

        LinePrinter.line("{", 4, '*', "}");


    }
}
