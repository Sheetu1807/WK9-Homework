package JavaHomework_9;

/*7. Write a programme to input any number and check if it is prime or not.

Prime number is a number that is greater than 1 and divided by 1 or itself only.
In other words, prime numbers can't be divided by other numbers than itself or 1.
For example 2, 3, 5, 7, 11, 13, 17... are the prime numbers.
 */

import java.util.Scanner;
public class Que7_Prime_Number {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number to check if it is a prime number or not: ");

            int number = sc.nextInt();
            if(itsPrime(number)) {
                System.out.println(number + " It's prime number");
            }
            else{
                System.out.println(number + " It's not prime number");
            }
        }
        static boolean itsPrime(int num)
        {
            if(num <= 1)
            {
                return false;
            }
            for(int i = 2; i <= num / 2; i++)
            {
                if((num % i) ==0)
                    return  false;
            }
            return true;
        }
    }

