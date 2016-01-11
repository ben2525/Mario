package com.benalbritton.greedy;

public class CoinCalculator {

    private char verifyCurrencyType(String money) {
        char monetaryType = money.trim().charAt(0);
        return monetaryType;
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

        int numberCurrenciesCoins = currenciesCoins.length;

        for(int coin = 0; coin < numberCurrenciesCoins; coin++) {
            numberOfCoins += change / currenciesCoins[coin];
            change = change % currenciesCoins[coin];
        }

        return numberOfCoins;
    }

    public int calculateChange(String moneyToChange) {

        int moneyValueToChange;
        int totalCoins = 0;
        char currencyType;

        int[] euroCoins = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] usCoins = {100, 25, 10, 5, 1};

        currencyType = verifyCurrencyType(moneyToChange);
        moneyValueToChange = moneyValueAsInteger(moneyToChange);

        if(moneyValueToChange >= 0) {
            if (currencyType == '$') {
                totalCoins = calculateCoins(moneyValueToChange, usCoins);
            }
            else if (currencyType == '€') {
                totalCoins = calculateCoins(moneyValueToChange, euroCoins);
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
