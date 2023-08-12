package Kapitel2_ImperativeSprachkonzepte;

/**
 * App Klasse für die Aufgabe Alles im Lot 2.6.3
 * Die Klasse RightTriangle beinhaltet die hier verwendeten Methoden.
 */
public class AllesimLot {
    public static void main(String[] args) {
        System.out.println(RightTriangle_263.isRightTriangle(3, 4, 5));
        System.out.println(RightTriangle_263.isRightTriangle(5, 4, 3));
        System.out.println(RightTriangle_263.isRightTriangle(5, 12, 13));
        System.out.println(RightTriangle_263.isRightTriangle(1, 2, 3));
        System.out.println(RightTriangle_263.isRightTriangle(1, 1, Math.sqrt(2)));

    }
}
