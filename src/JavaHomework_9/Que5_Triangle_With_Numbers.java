package JavaHomework_9;

/* 5. Write a program in Java to display the pattern like a triangle with a number.
      For e.g. Input number of rows: 10
 */

import java.util.Scanner;

public class Que5_Triangle_With_Numbers {

    public static void main(String[] args) {

        int i, j, n;
        System.out.print("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
