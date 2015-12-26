package com.benalbritton.greedy;


public class CoinCalculator {

    private int numberOfCoins;
    private int dollar = 100;

    public int calculateChange(double amountToChange) {
        int change = (int)(Math.round(amountToChange * 100));

        System.out.println(change);

        numberOfCoins = change / dollar;
        return numberOfCoins;
    }

}
