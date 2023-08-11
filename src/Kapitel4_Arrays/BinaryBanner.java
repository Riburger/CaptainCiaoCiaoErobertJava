package Kapitel4_Arrays;

import java.util.Scanner;

/**
 * Übung aus dem Lernbuch - Seite 287.
 */
public class BinaryBanner {
    public static void printLetter(char [][] letter){
        for (int spalte = 0; spalte < letter[0].length; spalte++){
            for (int zeile = 0; zeile < letter.length -1; zeile++)
                System.out.print(letter[zeile][spalte]);
            System.out.println();

        }
        System.out.println();
    }

    public static void printZero(){
        char [][] zero = {
                { ' ', '#', ' '},
                { '#', ' ', '#' },
                { '#', ' ', '#' },
                { '#', ' ', '#' },
                { ' ', '#', ' ' } };
        printLetter(zero);
    }

    public static void printOne() {
        char[][] one = {
                {' ', '#'},
                {'#', '#'},
                {' ', '#'},
                {' ', '#'},
                {' ', '#'}};
        printLetter(one);
    }

    public static void main(String[] args) {
        int input = new Scanner( System.in ).nextInt();
        String bin = Integer.toBinaryString(input);

        System.out.printf("Banner für %s (binär %s):%n", input, bin);
        for (int i = 0; i < bin.length(); i++){
            switch (bin.charAt(i)){
                case '0': printZero(); break;
                case '1': printOne();break;

            }
        }
    }
}
