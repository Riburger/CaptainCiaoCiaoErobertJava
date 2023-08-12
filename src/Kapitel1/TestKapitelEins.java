package Kapitel1;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TestKapitelEins {
    public static void main(String[] args) {
        /**System.out.println(20000000000F == 20000000000F + 1);
         System.out.println(20000000000D == 20000000000D + 1);

         System.out.println(Float.toHexString(20000000000F));
         System.out.println(Float.toHexString(20000000000F + 1));
         System.out.println(Double.toHexString(20000000000D));
         System.out.println(Double.toHexString(20000000000D + 1));

         System.out.println(123456789 + 5432l);
         System.out.println(12);

         long currentMillis = System.currentTimeMillis();
         long days = TimeUnit.MILLISECONDS.toDays(currentMillis);

         System.out.println(days);

         int i = 12, j;
         j = 2 *i;
         System.out.println(j);

         System.out.println("+5 % +3 = " + (+5 % +3));
         System.out.println(" +5 / +3 = " + (+5 / +3));



         double d = 6.66;
         System.out.println((d%1) == 0);

         double x, y, z;
         x = 4195835.0;
         y = 3145727.0;
         z = x - (x/y) * y;
         System.out.println(z);

         int l = 1;
         l = l++;
         int result = l++;
         System.out.println(l);
         System.out.println(result);
         int i = 2;
         System.out.println( i -=- i);
         int [] array1 = {10 , 90 , 0};
         int i = 0;

         array1[++i] = array1[++i] + 10;
         System.out.println(Arrays.toString(array1));*/
        double x, y;

        for (x = Math.random(), y = Math.random(), x++, y++;
             x < 10 || y < 10;
             x += Math.random(), y += Math.random()) {
            System.out.println(x);
            System.out.println(y);
        }


        int number = (int) (Math.random() * 5 + 1);
        while (true) {
            System.out.println("Welche Zahl denke ich mir zwischen 1 und 5?");
            int guess = new java.util.Scanner(System.in).nextInt();

            if (guess < 1 || guess > 5) {
                System.out.println("Nur zahlen zwischen 1 und 5");
                continue;
            }
            if (number == guess) {
                System.out.println("Super Tipp");
                break;
            } else if (number > guess) {
                System.out.println("Zuviel");

            } else if (number < guess) {
                System.out.println("zu klein");
            }
        }


        int i = 1;
        System.out.println(Math.max(i++, --i));


    }

}

