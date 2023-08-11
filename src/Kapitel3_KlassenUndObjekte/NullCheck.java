package Kapitel3_KlassenUndObjekte;

/**
 * Kurzes Beispiel aus dem Buch, Verwendung von Javax und Durchführung null Check
 * Seite 257 Listing 3.13
 */
public class NullCheck {
    public static void main(String[] args) {
        String s = javax.swing.JOptionPane.showInputDialog("Eingabe");
        if (s != null && ! s.isEmpty()){
            System.out.println("Eingabe: " + s);
        }else
            System.out.println("Keine Eingabe oder Abbruch");
    }
}
