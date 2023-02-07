package Exer4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println(" What is the dollar price?");
        CurrencyConverter.dollar = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        CurrencyConverter.Many = sc.nextDouble();

        System.out.println(" What is the dollar price?"+CurrencyConverter.dollar);
        System.out.println("How many dollars will be bought?"+ CurrencyConverter.Many);
        System.out.println("Amount to be paid in reais ="+CurrencyConverter.Real());


    }
}
