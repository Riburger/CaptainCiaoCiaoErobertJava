package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.4.5 Quiz: Zu welchem Block gehört das »else«? ★★
 * Einrückungen gehören mit zu den wichtigsten Prinzipien von Clean Code. Sind die
 * Einrückungen falsch, fasst ein Leser das Programm falsch auf.
 * Welche Ausgabe erzeugt folgendes Programm?
 * if ( true ) {
 * if ( false )
 * if ( 3!=4 )
 * ;
 * else
 * System.out.println( "Klabautermann" );
 * else
 * System.out.println( "Pumuckl" );
 * }
 * Finde das Ergebnis, ohne das Programm zu übersetzen.
 * Tipp: Rücke das Programm erst korrekt ein.
 */
public class ZuWelchemBlockGehoert_245 {
    public static void main(String[] args) {
        if (true) {
            if (false) {
                if (3 != 4) {
                    ;
                } else
                    System.out.println("Klabautermann");
            } else
                System.out.println("Pumuckl");
        }
    }
}
