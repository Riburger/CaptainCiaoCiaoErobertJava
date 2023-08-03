package Kapitel2_ImperativeSprachkonzepte;

import java.util.Scanner;

/**
 * 2.3.2 Prüfen, ob Beute fair aufgeteilt werden kann ★
 * Nach einem Raubzug in der Schnapsbrennerei erbeuten Captain CiaoCiao und seine
 * Crew unzählige Flaschen. Jetzt muss die Beute aufgeteilt werden, wobei Captain Ciao-
 * Ciao grundsätzlich die Hälfte bekommt (bei einer ungeraden Anzahl Flaschen bekommt
 * er weniger als die Hälfte, so großzügig ist der Captain). Alle anderen Räuber
 * sollen exakt den gleichen Anteil bekommen. Aber geht das auf?
 * Aufgabe:
 *  Schreibe ein Programm, das die erbeutete Anzahl Flaschen von der Kommandozeile
 * einliest und ausgibt, wie viel Captain CiaoCiao davon bekommt.
 *  Gib aus, was für die Crew verbleibt.
 *  Frage nach der Crewgröße, und prüfe, ob die Beute fair und gleich verteilt werden
 * kann, sodass jedes Crewmitglied exakt die gleiche Anzahl Flaschen bekommt. Eine
 * Antwort in der Form true oder false reicht.
 */
public class FaireBeute_232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wieviele Flaschen habt ihr erbeutet arrrr?");
        int beute = Integer.valueOf(scanner.nextLine());
        int beuteFuerCaptain = beute / 2;
        int beuteFuerCrew = beute - beuteFuerCaptain;
        System.out.println(beuteFuerCaptain);
        System.out.println("Wieviele Piraten waren auf dem Beutezug??");
        int anzahlPiraten = Integer.valueOf(scanner.nextLine());
        int flaschen = beuteFuerCrew / anzahlPiraten;

        boolean faireBeute;

        if (beuteFuerCrew % anzahlPiraten > 0)
        {
            faireBeute = false;
        } else {

            faireBeute = true;
            System.out.println("Jeder Pirat erhält: " + flaschen + " und es bleiben insgesamt " + (beuteFuerCrew % anzahlPiraten) + " übrig." + faireBeute);

        }

    }
}
