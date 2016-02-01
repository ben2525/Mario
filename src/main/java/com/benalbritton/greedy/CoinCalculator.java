package com.benalbritton.greedy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

public class CoinCalculator {

    private String acquireCurrencyType(String money) {
        money = money.trim().substring(0, 1);
        return money;
    }

    private int moneyValueAsInteger(String money) {

        int changeValue = 0;
        try {
            changeValue = Math.round(Float.valueOf(money.substring(1).trim()) * 100);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Just a (positive) monetary amount, please");
        }

        return changeValue;
    }

    private int calculateCoins(int amountToChange, int[] currenciesCoins) {

        int numberOfCoins = 0;
        int change = amountToChange;

        for (int coins:currenciesCoins) {
            numberOfCoins += change / coins;
            change = change % coins;
        }

        return numberOfCoins;
    }

    public int calculateChange(String moneyToChange) {

        int moneyValueToChange;
        int totalCoins = 0;
        String currencyType;

        currencyType = acquireCurrencyType(moneyToChange);
        moneyValueToChange = moneyValueAsInteger(moneyToChange);

        // Spring bean is coded to an interface in below code.
        ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
        CurrenciesCoinsInterface currenciesCoinsInterface = (CurrenciesCoinsInterface) context.getBean("currenciesCoins");
        HashMap coinList = currenciesCoinsInterface.makeCurrencyHashMap();

        if(moneyValueToChange >= 0) {
            if(coinList.containsKey(currencyType)){
                totalCoins = calculateCoins(moneyValueToChange, (int[])coinList.get(currencyType));
                System.out.println(moneyToChange + " gives coins in currency " + currencyType + " returned are " + totalCoins);
            }
            else {
                System.out.println("Please use  $  for US currency or  €  for Euro currency.");
            }
        }
        else {
            System.out.println("No change can be returned for a negative amount.");
        }

        return totalCoins;
    }

}
