package Misc;

public class JavaOperators_Practice {
    public static void main(String[] args) {
        /**
         * Create a variable to store customer bank balance
         * Based on Bank-balance amount, Bank puts customer into different category (Basic, Premium)
         *
         * if bank balance is greater than 25000, Customer is Premium customer
         * otherwise, Customer is Basic customer
         */
    double cBankBalance = 0.0;
    cBankBalance = 25000.01;
    String cCategory = "";

    cCategory = cBankBalance > 25000.00 ? "Premium" : "Basic";

        System.out.println(cCategory);

        String stringOne = "Esta es una oracion para contar cada letra y espacio";
        System.out.println(stringOne.length());
       

    }
}
