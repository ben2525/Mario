package com.benalbritton.greedy;


//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy {

    private int totalCoins;

    public static void main(String[] varArgs) {

        if (varArgs.length > 0) {
            CoinCalculator coinCalculator = new CoinCalculator();
            coinCalculator.calculateChange(varArgs[0]);
            //System.out.println(totalCoins);
        }
        else
            throw new IllegalArgumentException("No value given");

        //Greedy greedy = new Greedy();
        //greedy.startGreedy();
    }

    public void startGreedy() {
    }

}
