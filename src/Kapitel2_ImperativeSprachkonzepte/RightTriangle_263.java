package Kapitel2_ImperativeSprachkonzepte;

/**
 * 2.6.3 Alles im Lot ★
 * In der Vergangenheit haben die Einfaltspinsel unter Bonny Brain den Mast schief
 * aufgestellt. Ein Pirat muss nicht immer senkrecht stehen, der Mast aber schon!
 * Nimmt man ein Dreieck, so kann es in verschiedenen Formen auftauchen. Es gibt
 * unter anderem spitzwinklige Dreiecke, stumpfwinklige Dreiecke, gleichseitige Dreiecke
 * und rechtwinklige Dreiecke. Zur Erinnerung: Dreiecke sind rechtwinklig, wenn
 * c2 = a2 + b2 ist.
 * Aufgabe:
 *  Lege eine neue Klasse RightTriangle an, und schreibe eine neue Methode; nutze
 * folgenden Code als Vorlage:
 * class RightTriangle {
 * public static boolean isRightTriangle( double x, double y, double z ) {
 * // Your implementation goes here
 * }
 * }
 *  Die Methode soll drei Seiten eines Dreiecks annehmen und true als Rückgabe liefern,
 * wenn es sich um ein rechtwinkliges Dreieck handelt, andernfalls false.
 *  Bedenke: Jeder Parameter x, y, z kann für die Katheten oder Hypotenuse stehen.
 * Beispiel:
 *  isRightTriangle(3, 4, 5) → true
 *  isRightTriangle(5, 4, 3) → true
 *  isRightTriangle(5, 12, 13) → true
 *  isRightTriangle(1, 2, 3) → false
 *  isRightTriangle(1, 1, Math.sqrt(2)) → false
 */
public class RightTriangle_263 {

    public static boolean isRightTriangle( double x, double y, double z ) {

        if ((x*x) + (y*y) == (z*z)){
            return true;
        } else if ((x*x) + (z*z) == (y*y)) {
            return true;
        } else if ( (z*z) + (y*y) == (x*x)) {
            return true;
        } else {
            return false;
        }

        /*
        Lösung aus dem Buch - Eleganter und Effizienter

        Step 1: Propagate the largest value in c //Weil c² die größte Einheit ist
        If a > c then swap


            if  ( a > c) {
            double swap = a;
            a = c;
            c= swap;
            }
            if ( b > c ){
            double temp = b;
            b = c;
            c = temp;

            return a*a + b*b == c*c

            if ( a > c ) {
            double swap = a;
            a = c;
            c = swap;
            }
            // If b > c then swap
            if ( b > c ) {
            double tmp = b;
            b = c;
            c = tmp;
            }
            // Step 2: The test
            return a * a + b * b == c * c;
            }*/

    }
}
