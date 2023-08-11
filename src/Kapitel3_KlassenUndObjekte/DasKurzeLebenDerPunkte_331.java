package Kapitel3_KlassenUndObjekte;

/**
 * 3.3.1 Quiz: Das kurze Leben der Punkte ★
 * Gegeben ist folgender Programmcode, wobei Point aus java.awt stammt:
 * Point p, q, r;
 * p = new Point();
 * q = p;
 * Point s = new Point();
 * p = new Point();
 * s = new Point();
 * // Wie viele Objekte bleiben übrig? 1 - r
 * Frage:
 *  Wie viele Referenzvariablen werden deklariert? ---- 4 p,q,r
 *  Wie viele Objekte werden aufgebaut? ------ 4 p s q
 *  Wie viele Objekte werden am Ende der Zeilen beim Kommentar referenziert? Was
 * kann die automatische Speicherbereinigung entfernen? Den ersten p = new Point, unter anderem weil der wert in q gespeichert wurde,
 */
public class DasKurzeLebenDerPunkte_331 {
}
