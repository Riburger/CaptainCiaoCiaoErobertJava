package Kapitel4_Arrays;

/**
 * 4.2.2 Konstante Umsatzsteigerung feststellen ★
 * Am Ende eines Monats bekommt Captain CiaoCiao die Umsätze gemeldet, die er und
 * seine Crew – sagen wir mal – erwirtschaftet haben. In der monatlichen Liste ist vermerkt,
 * wie der Gewinn an einem Tag ausfiel. Sie hat dieses Format:
 * // Tag 1, 2, 3, 4, 5, ... bis maximal 31
 * int[] dailyGains = { 1000, 2000, 500, 9000, 9010 };
 * Captain CiaoCiao ist mit den Zahlen zufrieden, und er möchte eine Belohnung zahlen,
 * wenn Gewinne über 5 % gestiegen sind. Von 1.000 auf 2.000 ist ein satter Sprung
 * um 100 %, von 500 auf 9.000 ebenso, doch definitiv nicht von 2.000 auf 500 und
 * auch nicht von 9.000 auf 9.010.
 * Aufgabe:
 * Schreibe eine Methode int count5PercentJumps(int[]), die die Anzahl der Umsatzsprünge
 * liefert. Ein Umsatzsprung ist dann gegeben, wenn der Umsatz 5 % über
 * dem des Vortags lag.
 * Das übergebene Array darf nicht null sein, andernfalls folgt eine Ausnahme.
 */
public class UmsatzSteigerung_422 {
    public static void main(String[] args) {
        final int length = 31;
        int[] dailyGains = new int[length];
        dailyGains = new int[]{1000, 2000, 500, 9000, 9010,
                750, 3000, 150, 8000, 5500,
                200, 7000, 9500, 100, 4200,
                7750, 280, 6400, 930, 8010,
                975, 3100, 7400, 570, 1250,
                2600, 1800, 370, 4500, 7020,
                9500};

        int spruenge = count5PercentJumps(dailyGains);
        System.out.printf("Es wurden insgesamt %d Sprünge erreicht", count5PercentJumps(dailyGains));
    }


    public static int count5PercentJumps(int[] dailyGains) {
        int counter = 0;

        for (int i = 0; i < dailyGains.length - 1; i++) {
            if (dailyGains[i + 1] > dailyGains[i] * 1.05) {
                counter++;
            }
        }
        return counter;
    }

}
/*      Lösung aus dem Buch - wieder etwas eleganter und effizienter jedoch meine Lösung sollte auch zum Ziel führen.
        private static int count5PercentJumps( int[] dailyGains ) {
        if ( dailyGains.length < 2 )
        return 0;
        final double MIN_PERCENT = 5;
        int result = 0;
        // Index variable i starting at 1, second element
        for ( int i = 1; i < dailyGains.length; i++ ) {
        double yesterday = dailyGains[ i - 1 ];
        double today = dailyGains[ i ];
        double percent = today / yesterday * 100 - 100;
        if ( percent >= MIN_PERCENT )
        result++;
        }
        return result;
}
 */

