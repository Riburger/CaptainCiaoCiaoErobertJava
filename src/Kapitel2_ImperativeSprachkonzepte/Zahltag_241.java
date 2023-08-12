package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.4.1 Zahltag ★
 * Bonny Brain hat Tort Ellini eine antike Taschenuhr für 1.000 Liretta verkauft. Tort
 * muss nun das Geld bezahlen.
 * Aufgabe:
 * Schreibe ein Programm, das auf der Kommandozeile mit new java.util.Scanner(
 * System.in).nextDouble() den Betrag der Rückzahlung einliest.
 * Bonny Brain ist immer guter Laune, daher ist sie auch mit 10 % weniger zufrieden.
 * Auch fühlt sie sich gebauchpinselt, wenn Tort 20 % mehr gibt. Zahlt Tort allerdings
 * freiwillig über 20 % mehr, hat Bonny Brain den Eindruck, dass etwas nicht stimmt
 * und die Taschenuhr wohl eine wertvolle versteckte Funktion hat oder ein Geheimnis
 * birgt. Überlege, wie man das Programm so aufbaut, dass wenig Codeänderungen
 * nötig sind, wenn die Grenzen sich aus einer Laune heraus verschieben.
 * Wenn Tort den passenden Betrag beisammenhat, erscheint auf dem Bildschirm
 * "Good boy!"; bei einem zu niedrigen Betrag oder einem Versuch der Bestechung
 * kommt "You son of a bi***!".
 */
public class Zahltag_241 {
    public static void main(String[] args) {

        double tortsPayment = new java.util.Scanner(System.in).nextDouble();
        double minPayment = 1000;
        minPayment -= minPayment * 0.1;
        double maxPayment = 1000;
        maxPayment += maxPayment * 0.2;

        if (tortsPayment >= minPayment && tortsPayment <= maxPayment) {
            System.out.println("Good Boy");
        } else
            System.out.println("You son of a Bitch");




        /*
        Meine erste Lösung

        System.out.printf("Heute ist Zahltag mein lieber Tort! Wieviel kannst du bezahlen? %n");
        int bezahlung = new java.util.Scanner(System.in).nextInt();
        int schuld = 1000;

      if (bezahlung >= (schuld/100*90) && bezahlung < schuld){
          System.out.printf("Good Boy, Na gut ich geb mich mit %d zufrieden! %n", bezahlung);
      } else if (bezahlung == schuld) {
          System.out.println("Good Boy");
      } else if (bezahlung <= (schuld/100*120) && bezahlung >= schuld) {
          System.out.printf("Good Boy, Die Firma dankt für die paar extra Münzen, %d ! %n", bezahlung);

      } else if (bezahlung > (schuld/100*120)) {
          System.out.printf("Etwas stimmt hier nicht. %n");

      } else System.out.println("You son of a bitch!");*/
    }
}
