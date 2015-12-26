package com.benalbritton.greedy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy {

    int coin;
    int dollar = 100;

    public static void main(String[] varArgs) {

        Greedy greedy = new Greedy();
        greedy.startGreedy();

    /*
        if (varArgs.length > 1) {
            CoinCalculator coinCalculator = new CoinCalculator();
            coinCalculator.calculateChange(varArgs[0]);
        }
        throw new IllegalArgumentException("No value given");
    */
    }




    public void startGreedy() {

        String moneyFromUser = "";
        float moneyToChange = -1;
        int totalCoins;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Enter the monetary amount to be returned in coins as a decimal :  ");

            try {
                moneyFromUser = br.readLine();
            }
            catch (IOException ex) {
                System.out.println("I am sorry.  Error reading your input");
                ex.printStackTrace();
            }

            try {
                moneyToChange = Float.valueOf(moneyFromUser.trim()).floatValue();
            }
            catch (NumberFormatException nfe) {
                System.out.println("Just a decimal number, please");
            }
        }
        while (moneyToChange < 0);

        CoinCalculator coinCalculator = new CoinCalculator();
        totalCoins = coinCalculator.calculateChange(moneyToChange);
    }


}
