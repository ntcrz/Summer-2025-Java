package Homework;

public class Homework2 {
    public static void main(String[] args) {

        /**
         * Question-1: Find the character present at the last-index in the name-string
         *
         * name = "John"
         * result = 'n'
         *
         * name = "Lisa"
         * result = 'a'
         *
         * name = "Liya Holmes"
         * result = 's'
         *
         * Hint:
         *      find length of name-string
         *      using length, find the last-index-number
         *      use that last-index-number with charAt()-method
         *
         */
        String name = "Lisa";
        int stringLength = name.length();
        int lastChar = stringLength-1;
        System.out.println("The character present at the last-index in the name-string "+name+ " is: "+ name.charAt(lastChar));

        // write code to print the last character in the name-string


        /**
         * Question-2: Assign value to result2-variable
         * if the countryName2-length is greater than or equals to 7
         *      assign 10 in result2-variable
         * otherwise
         *      assign 20 in result2-variable
         *
         * Hint: Ternary operator
         */
        String countryName2 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        int countryNameLength = countryName2.length();
        int result2 = 0;
        result2 = countryNameLength >= 7 ? 10: 20;
        System.out.println("Result2 value is: "+result2);

        /**
         * Question-3: Ignore cases for all below tasks
         *  a) find if the countryName3 contains "R"
         *  b) find if the countryName3 starts with "ja"
         *
         **/
        String countryName3 = "JA UNiTeD KInGDom OF GreAt BriTaIn And NorTHerN irElaND";
        String countryName3Lower = countryName3.toLowerCase();
        boolean containsR = countryName3Lower.contains("r");
        boolean containsJa = countryName3Lower.startsWith("ja");

        System.out.println(countryName3 + " contains an R: " +containsR);
        System.out.println(countryName3 + " starts with ja : " +containsJa);
    }
}
