package Kapitel2_ImperativeSprachkonzepte;

/**
 * Bonny Brain hat in der Magical Company zwei neue Produkte aufgenommen: Flammenwerfer
 * (englisch flamethrower) und Feuerlöscher (englisch fire extinguisher). Der
 * Flammenwerfer kostet 500 Liretta, der Feuerlöscher kostet 100 Liretta.
 * Um bei einer größeren Abnahme schnell ablesen zu können, wie hoch der Preis ist,
 * soll eine Tabelle in HTML erzeugt werden:
 */
public class MultiplikationsTabelle_265 {
    public static void main(String[] args) {

        final int BASE_PRICE_FLAMETHROWER = 500;
        final int BASE_PRICE_FIRE_EXTINGUISHER = 100;

        startTable();

        startRow();
        headerCell("Quantity");
        headerCell("Flamethrower");
        headerCell("Fire Extinguisher");
        endRow();

        for (int i = 1; i <= 10; i++) {
            startRow();
            dataCell(i);
            dataCell(BASE_PRICE_FLAMETHROWER * i);
            dataCell(BASE_PRICE_FIRE_EXTINGUISHER * i);

            endRow();
        }
        endTable();

    }

    private static void startTable() {
        System.out.println("<table>");
    }

    private static void endTable() {
        System.out.println("</table>");
    }

    private static void startRow() {
        System.out.print("<tr>");
    }

    private static void endRow() {
        System.out.println("</tr>");
    }

    private static void headerCell(String value) {
        System.out.print("<th>" + value + "</th>");
    }

    private static void dataCell(String value) {
        System.out.print("<td>" + value + "</td>");
    }

    private static void dataCell(int value) {
        dataCell(Integer.toString(value));
    }















    /* Meine Lösung - funktioniert, ist aber hart codiert zum teil
        System.out.println("<html>");
        System.out.println("<table>");
        System.out.println("<tr><th>Quantity</th><th>Flamethrower</th></tr>");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("<tr><td>%d</td><td>%d</td><td>%d</td></tr>%n", i, priceFlamethrower(i), priceFireExtinguisher(i));

        }
        System.out.println("</table>");
        System.out.println("</html>");
    }

    public static int priceFlamethrower(int quantity){
        int price = 500;

        return price * quantity;
    }
    public static int priceFireExtinguisher(int quantity){
        int price = 100;

        return price * quantity;
    }*/
}
