package Kapitel3_KlassenUndObjekte;

/**
 * Aufgabe aus dem Lernbuch Seite 243.
 */
public class ZZZZZnake {
    public static void main(String[] args) {
        java.awt.Point playerPosition = new java.awt.Point(10, 9);
        java.awt.Point snakePosition = new java.awt.Point(30, 2);
        java.awt.Point goldPosition = new java.awt.Point(6, 6);
        java.awt.Point doorPosition = new java.awt.Point(0, 5);
        boolean rich = false;

        while (true) {
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 40; x++) {
                    java.awt.Point p = new java.awt.Point(x, y);
                    if (playerPosition.equals(p)) {
                        System.out.print('&');
                    } else if (snakePosition.equals(p)) {
                        System.out.print('S');
                    } else if (goldPosition.equals(p)) {
                        System.out.print('$');
                    } else if (doorPosition.equals(p)) {
                        System.out.print('#');
                    } else System.out.print('.');
                }
                System.out.println();
            }
            System.out.println();

            if (rich && playerPosition.equals(doorPosition)) {
                System.out.println("Gewonnen");
            }
            if (playerPosition.equals(goldPosition)) {
                rich = true;
                goldPosition.setLocation(-1, -1);
            }
            if (playerPosition.equals(snakePosition)) {
                System.out.println("ZZZZZZ. Die Schlange hat dich!");
            }

            System.out.print("Richtung eingeben h - höher, t-tiefer, l-links, r-rechts");
            String input = new java.util.Scanner(System.in).next();
            switch (input) {
                case "h":
                    playerPosition.y = Math.max(0, playerPosition.y - 1);
                    break;
                case "t":
                    playerPosition.y = Math.min(9, playerPosition.y + 1);
                    break;
                case "l":
                    playerPosition.x = Math.max(0, playerPosition.x - 1);
                    break;
                case "r":
                    playerPosition.x = Math.min(9, playerPosition.x + 1);
                    break;}

                if ((playerPosition.x < snakePosition.x)) {
                    snakePosition.x--;
                } else if (playerPosition.x > snakePosition.x) {
                    snakePosition.x++;
                }

                if (playerPosition.y < snakePosition.y) {
                    snakePosition.y--;
                } else if (playerPosition.y > snakePosition.y) {
                    snakePosition.y++;
                }
            }
        }
    }


