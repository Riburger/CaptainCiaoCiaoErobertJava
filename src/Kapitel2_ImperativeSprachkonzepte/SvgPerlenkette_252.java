package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.5.2 SVG-Perlenkette erzeugen ★
 * Captain CiaoCiao möchte seiner geliebten Bonny Brain eine Perlenkette schenken.
 * Diese soll aus drei verschiedenen Edelsteinen bestehen: Saphir (blau), Smaragd
 * (grün), Spessartit-Granat (orange). Er möchte einen Designvorschlag haben, in dem
 * die Farben zufällig angeordnet werden.
 * Folgendes steht für ein SVG-Dokument mit drei Kreisen:
 * <svg height="100" width="1000">
 * <circle cx="20" cy="20" r="5" fill="blue" />
 * <circle cx="30" cy="20" r="5" fill="green" />
 * <circle cx="40" cy="20" r="5" fill="orange" />
 * </svg>
 * Aufgabe:
 * Erzeuge eine SVG-Ausgabe auf der Kommandozeile, in der 50 Kreise nebeneinanderstehen.
 */
public class SvgPerlenkette_252 {
    public static void main(String[] args) {

        String farbe;
        double randomFarbe;

        System.out.println( "<svg height=\"100\" width=\"1000\">" );
        for (int i = 0; i <= 50; i++){
        randomFarbe= Math.random();

        if (randomFarbe <= 0.3){
            farbe = "green";
        } else if (randomFarbe <= 0.6 && randomFarbe > 0.3) {
            farbe = "blue";
        } else {
            farbe = "orange";
        }

            System.out.printf( "<circle cx=\"%d\" cy=\"20\" r=\"5\" fill=\"%s\" />%n",
                    20 + (i * 10), farbe );
        }
        System.out.println("</svg>");
    }
}
