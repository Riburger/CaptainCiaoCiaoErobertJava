package Kapitel2_ImperativeSprachkonzepte;

/**
 * Aufgabe:
 * Schreibe ein Programm, das 36 SVG-Rechtecke rotiert um 10 Grad übereinandersetzt
 * und auf dem Bildschirm ausgibt.
 * <svg height="200" width="200">
 * <rect x="50" y="50" width="100" height="100" stroke="black" fill="none"
 * transform="rotate(0 100 100)" />
 */
public class RotierteSvgRechteckeErzeugen {
    public static void main(String[] args) {

        int rotation = 0;

        for (int i = 0; i <= 36; i++) {


            System.out.printf("<svg height=\"200\" width=\"200\"><rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\"transform=\"rotate(%d 100 100)\" /> %n", rotation);

            rotation += 10;
        }
    }
}
