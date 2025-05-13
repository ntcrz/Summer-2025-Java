package Homework;

public class Homework1 {
    public static void main(String[] args) {

        /**
         * Formula sheet -> https://www.rapidtables.com/convert/temperature/fahrenheit-to-celsius.html?x=74
         *
         * Temperature in Fahrenheit = 74°F
         *  Celsius = (Fahrenheit - 32) / 1.8
         * Temperature in Celsius = 23.33°C
         *
         */
        // F -> C
        double fTemp = 74;
        // Celsius = (Fahrenheit - 32) / 1.8
        double cTemp = (fTemp - 32) / 1.8;
        System.out.println(fTemp+"°F is equals to "+cTemp+"°C");

        // F -> K
        // T(K) = (fTemp + 459.67) × 5/9.0
        double kTemp = (fTemp + 459.67) * (5/9.0);
        System.out.println(fTemp+"°F is equals to "+kTemp+"°K");


         // C -> F
        double fTemp2 = cTemp * (9.0/5.0) + 32;
        System.out.println(cTemp+"°C is equals to "+fTemp2+"°F");

        // C -> K
        double kTemp2 = cTemp + 273.15;
        System.out.println(cTemp+"°C is equals to "+kTemp2+"°K");

        // K -> F

        double fTemp3 = kTemp * (9.0/5.0) - 459.67;
        System.out.println(kTemp+"°K is equals to "+fTemp3+"°F");


        // K -> C
        double cTemp2 = kTemp -273.15;
        System.out.println(kTemp+"°K is equals to "+cTemp2+"°C");


    }
}
