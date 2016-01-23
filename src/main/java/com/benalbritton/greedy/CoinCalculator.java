package com.benalbritton.greedy;

import java.util.HashMap;

public class CoinCalculator {

    private String acquireCurrencyType(String money) {
        money = money.trim().substring(0, 1);
        return money;
    }

    private int moneyValueAsInteger(String money) {
        int changeValue = 0;
        try {
            changeValue = (int)(Float.valueOf(money.substring(1).trim()) * 100);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Just a (positive) monetary amount, please");
        }

        return changeValue;
    }

    private int calculateCoins(int amountToChange, int[] currenciesCoins) {

        int numberOfCoins = 0;
        int change = amountToChange;

        int length = currenciesCoins.length;
        for(int i = 0; i < length; i++) {
            numberOfCoins += change / currenciesCoins[i];
            change = change % currenciesCoins[i];
        }

        return numberOfCoins;
    }

    public int calculateChange(String moneyToChange) {

        int moneyValueToChange;
        int totalCoins = -1;
        String currencyType;

        currencyType = acquireCurrencyType(moneyToChange);
        moneyValueToChange = moneyValueAsInteger(moneyToChange);

        CurrenciesCoinsMap currenciesCoinsMap = new CurrenciesCoinsMap();
        HashMap coinList = currenciesCoinsMap.makeCurrencyHashMap();

        if(moneyValueToChange >= 0) {
            if(coinList.containsKey(currencyType)){
                totalCoins = calculateCoins(moneyValueToChange, (int[])coinList.get(currencyType));
            }
            else {
                System.out.println("Please use  $  for US currency or  €  for Euro currency.");
            }
        }
        else {
            System.out.println("No change can be returned for a negative amount.");
        }

        System.out.println(totalCoins);
        return totalCoins;
    }

}
