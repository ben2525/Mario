package com.benalbritton.greedy;

public class MoneyChangerFactory {

    int moneyValueToChange;

    char currencyType;

    private static final int[] euroCoins = {200, 100, 50, 20, 10, 5, 2, 1};
    private static final int[] usCoins = {100, 25, 10, 5, 1};

    /*
    public int acquireCoins(char currencyType, int moneyValueToChange){

        int totalCoins = -1;

        if (currencyType == '$') {
            totalCoins = calculateCoins(moneyValueToChange, usCoins);
        }
        else if (currencyType == '€') {
            totalCoins = calculateCoins(moneyValueToChange, euroCoins);
        }

        return totalCoins;
    }

    /*
    if (currencyType == '$') {
        totalCoins = calculateCoins(moneyValueToChange, usCoins);
    }
    else if (currencyType == '€') {
        totalCoins = calculateCoins(moneyValueToChange, euroCoins);
    }
    */

}
