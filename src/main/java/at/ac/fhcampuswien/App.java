package at.ac.fhcampuswien;

import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int numberDays, int startingDay){

        int count = 0;
        int day = 1;
        int space = 0;

        for (int i = 0; i < numberDays + space ; i++)
        {
            /*for ( int j = 0; j < startingDay; j++)
            {
                System.out.print("   ");
                count++;
            }
*/          if (count < startingDay-1)
            {
                System.out.print("   ");
                space++;
            }

            else
            {
                if (day < 10)
                {
                    System.out.printf(" %d ", day);
                    day++;

                }
                else
                {
                    System.out.print(day + " ");
                    day++;
                }
            }

            count++;

            if (count % 7 == 0 && count <= 28)
            {
                System.out.print(System.lineSeparator());
            }

        }
        System.out.print(System.lineSeparator());


    }

    public static long[] lcg(long seed) {

        long[] random = new long[10];
        //random[0] = seed;
        long m = (long) Math.pow(2, 31);
        long a = 1103515245;
        int c = 12345;

        for (int i = 0; i < 10; i++)
        {
            if( i == 0)
            {
                random[i] = ((a * seed) + c) % m;

            }
            else
            {
                random[i] = ((a * random[i - 1]) + c) % m;
                //seed++
            }
        }
        return random;

    }

    public static void guessingGame(int numberToGuess){
        Scanner input = new Scanner(System.in);
        int i = 1;
        int userNumber;

        do
        {
            System.out.print("Guess number " + i + ": ");
            userNumber = input.nextInt();

            if ( i == 10 )
            {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                return;
            }

            else if (userNumber < numberToGuess)
                System.out.println("The number AI picked is higher than your guess.");
            else if (userNumber > numberToGuess)
                System.out.println("The number AI picked is lower than your guess.");
            else
                System.out.println("You won wisenheimer!");
            i++;

        } while ( userNumber != numberToGuess);
    }

    public static int randomNumberBetweenOneAndHundred(){

        return new Random().nextInt(99) +1 ;

    }

    public static boolean swapArrays(int[] numbers1, int[] numbers2){

        int[] arrayTemp = new int[numbers1.length];

        if(numbers1.length != numbers2.length)
            return false;

        for( int i = 0; i < numbers1.length; i++)
        {
            arrayTemp[i] = numbers1[i];
            numbers1[i] = numbers2[i];
            numbers2[i] = arrayTemp[i];
        }
        return true;
    }

    /*public static String camelCase(String userText){


    }*/

    public static int checkDigit(int[] userArray){

        int sum = 0;
        int checkNumber;

        for (int i = 0; i< userArray.length; i++)
        {
            sum = sum + (i+2) * userArray[i];
        }
        int remainder = sum % 11;
        checkNumber = 11 - remainder;

        if (checkNumber == 10)
            checkNumber = 0;
        else if (checkNumber == 11)
            checkNumber = 5;

        return checkNumber;
    }


        public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.



        //Task 1
        oneMonthCalendar( 30, 6);



        //Task 2
        lcg(0 );
        long[] array = lcg(0);

        for(int i = 0; i < 10; i++)
        {
            System.out.println(array[i]);
        }



        //Task 3
        int x = randomNumberBetweenOneAndHundred();
        guessingGame(x);


        //Task 4
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] array2 = new int[]{100, 202, 30, 14, 15, 16};
        swapArrays(array1,array2);

        //Task 5

        //camelCase();

        //Task 6

        int[] iban = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        checkDigit(iban);





    /*    for(int i=0; i<args.length;i++){
            System.out.println(args[i]);
        }
        int[]numbers1 = new int[10]; //größe, nicht dekl
        numbers1[0] = 44; //deklarieren, keine größe
        int x = numbers1[9];
        int[] numbers2 = {4,3,2}; //größe und deklarieren
        boolean returnvalue = swapArrays(new int[]{4,3,2}, new int[]{4});



        System.out.println((int)('a'-'A'));
    }*/
    }
}