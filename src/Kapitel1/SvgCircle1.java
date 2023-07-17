package Kapitel1;

public class SvgCircle1 {
    public static void main(String[] args) {

        //Ohne Zeilenumbruch
        System.out.println("<svg height='400' width='1000'><circle cx='100' cy='100' r='50' /></svg>");
        System.out.println(); // Leerzeile
        //Mit Zeilenumbruch
        System.out.printf("<svg height='400' width='1000'>%n<circle cx='100' cy='100' r='50' />%n</svg>");

        //Mit doppelten Anführungsstrichen
        System.out.println();
        System.out.printf("<svg height=\"400\" width=\"1000\">%n<circle cx=\"100\" cy=\"100\" r=\"50\" />%n</svg>");

    }
}
