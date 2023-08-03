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
        System.out.println("");
        System.out.println("");


        //2.2 Variablen

        System.out.println("Variablen und Datentypen");
        int x = 100;
        int y = 110;
        double r = 20.5;

        System.out.println("<svg height=\"400\" width=\"1000\">\n<circle cx=\"" + x + "\" cy=\"100\" r=\"" + r + "\" />\n</svg>");
        System.out.println("<svg height=\"400\" width=\"1000\">\n<circle cx=\"10\" cy=\"10\" r=\"2.686\" />\n</svg>");

        //2.2.2 Was ist das Ergebnis des unteren Ausdrucks? Antwort = Überlauf des Zahlentyps int dadurch wird am unteren Ende des Wertebereichs von int fortgesetzt
        int werteBereichEinhalten = 1000000 * 1000000;
        System.out.println(werteBereichEinhalten);
        //2.2.3 Ist das Ergebnis des unteren Ausdrucks überraschend? Hier kommt es zu großen Rundungsfehlern und bei Gleitkommazahlen sollte man auf BigDecimal bei Berechnungen zurückgreifen.
        double test =  0.1+ 0.1+ 0.1+ 0.1+ 0.1+ 0.1+ 0.1+ 0.1+ 0.1+ 0.1-1.0;
        System.out.println(test);
        //2.2.4 Zufallszahlen bilden und verschiedene Kreise generieren.
        double zahl = 10.0;

        double radius = zahl * Math.random() + zahl ;
        System.out.println("");
        System.out.println("<svg height=\"400\" width=\"1000\">\n<circle cx=\"" + x + "\" cy=\"" + y +"\" r=\"" + radius + "\" />\n</svg>");


        //2.2.5 Aufgabe Siehe Buch Seite 42: Ich glaube dass double höhe wegen dem ö Probleme bereiten wird.

        //2.2.6 Benutzereingaben verarbeiten - Captain CiaoCiao möchte die Größe der Zielscheibe selbst bestimmen.

        System.out.println("Bitte die Breite nennen Captain!");
        int x1 = new java.util.Scanner( System.in ).nextInt();
        System.out.println("Bitte die Höhe nennen Captain!");
        int y2 = new java.util.Scanner( System.in ).nextInt();

        System.out.println("Hier die neue Zielscheibe für euch arrrr");
        System.out.println("<svg height=\"400\" width=\"1000\">\n<circle cx=\"" + x1 + "\" cy=\"" + y2 +"\" r=\"" + radius + "\" />\n</svg>");


           
    }
}
