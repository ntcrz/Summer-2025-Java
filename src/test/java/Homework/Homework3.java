package Homework;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        /**
         * Question-1:
         * Create an empty array which can store 5-string values
         * using index-values, store 5-names in it.
         *
         * a) Print the entire array
         * b) if index-2-name has more than 5 characters, print the total number of characters present in the name
         *      otherwise, print the index-2-name in uppercase
         *
         */
    String[] petsArray = new String[5];
        petsArray[0] = "Cat";
        petsArray[1] = "Turtle";
        petsArray[2] = "Dog";
        petsArray[3] = "Hamster";
        petsArray[4] = "Parrot";

        System.out.println("\nList of common pets: "+ Arrays.toString(petsArray));

        if (petsArray[2].length() > 5) {
            System.out.println("Length of index-2 common pets -> " + petsArray[2].length());
        } else {
            System.out.println("Index-2 common pets in Uppercase -> " + petsArray[2].toUpperCase());
        }

        if (petsArray[0].length() > 5) {
            System.out.println("Length of index-0 common pets -> " + petsArray[0].length());
        } else {
            System.out.println("Index-0 common pets in Uppercase -> " + petsArray[0].toUpperCase());
        }

        if (petsArray[1].length() > 5) {
            System.out.println("Length of index-1 common pets -> " + petsArray[1].length());
        } else {
            System.out.println("Index-1 common pets in Uppercase -> " + petsArray[1].toUpperCase());
        }
        if (petsArray[3].length() > 5) {
            System.out.println("Length of index-3 common pets -> " + petsArray[3].length());
        } else {
            System.out.println("Index-3 common pets in Uppercase -> " + petsArray[3].toUpperCase());
        }
        if (petsArray[4].length() > 5) {
            System.out.println("Length of index-4 common pets -> " + petsArray[4].length());
        } else {
            System.out.println("Index-4 common pets in Uppercase -> " + petsArray[4].toUpperCase());
        }



        /**
         * Question-2:
         * Create a String-variable and store any 4-words sentence in it
         *  4-words sentence example:
         *          Have a happy life
         *          have a great day
         *          wOrk HaRD paRTy HArdEr
         *          stay humble keep smiling
         *
         * convert the String into Titlecase (convert 1st-letter of each word into Uppercase and all other letters into lowercase)
         * wOrk HaRD paRTy HArdEr   -> Work Hard Party Harder
         * stay humble keep smiling -> Stay Humble Keep Smiling
         *
         */
        String sentence2 = "";
        String result2 = "";
        // code
        System.out.println("sentence2 -> "+sentence2);
        System.out.println("result2 -> "+result2);

        /**
         * Question-3:
         * Create an int-variable and store any number in it.
         * If the variable-value is divisible by 3 only, print "The variable-value is divisible by 3"
         * If the variable-value is divisible by 5 only, print "The variable-value is divisible by 5"
         * If the variable-value is divisible by 3 and 5, print "The variable-value is divisible by 3 and 5"
         * If the variable-value is NOT divisible by 3 and 5, print the variable-value
         *
         * 18 -> The variable-value is divisible by 3
         * 20 -> The variable-value is divisible by 5
         * 15 -> The variable-value is divisible by 3 and 5
         * 17 -> 17
         */
    }
}
