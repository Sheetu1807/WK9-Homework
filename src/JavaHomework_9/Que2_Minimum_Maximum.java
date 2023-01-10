package JavaHomework_9;

/* 2. Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.

 -Before the user enters the number, print the message Enter number:
 -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

  Hint:
  -Use an endless while loop.
  -Create a class with the name MinAndMaxInputChallenge
  */

import java.util.Scanner;

public class Que2_Minimum_Maximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");

            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }

            } else {
                break;
            }
            sc.nextLine();
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}



