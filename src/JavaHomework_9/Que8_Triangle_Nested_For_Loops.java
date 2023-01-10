package JavaHomework_9;

// 8. Display left angle triangle of * using nested for loops.

public class Que8_Triangle_Nested_For_Loops {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++ ) {

            for (int x = 1; x <= i; x++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

