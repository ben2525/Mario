package com.benalbritton.greedy;

public class CoinCalculator {

    //private float moneyValueToChange;

    private int numberOfCoins = 0;
    private int[] USCoins = {100, 25, 10, 5, 1};
    private int[] EuroCoins = {200, 100, 50, 20, 10, 5, 2, 1};

    public int calculateCoins(double amountToChange) {

        int change = (int)(Math.round(amountToChange * 100));

        int numberUSCoins = USCoins.length;
        for(int coin = 0; coin < numberUSCoins; coin++) {
            numberOfCoins += change / USCoins[coin];
            change = change % USCoins[coin];
        }

        return numberOfCoins;
    }

    public int calculateChange(String moneyToChange) {
        System.out.println(moneyToChange);


        float moneyValueToChange = 0;
        int totalCoins;
        char currencyType;

        /*
        String currencyType = moneyToChange.substring(0, 1);
        char cT = moneyToChange.trim().charAt(0);
        if(!currencyType.equals("$") && !currencyType.equals("€")) {
            System.out.println("Please use  $  for US currency or  €  for Euro currency");
        }
        else {
            //TODO
        }
        */

        currencyType = verifyCurrency(moneyToChange);

        /*
        if(!(currencyType == '$') && !(currencyType == '€')) {
            System.out.println("Please use  $  for US currency or  €  for Euro currency");
            throw new IllegalArgumentException("Invalid currency type");
        }
        */
        //////
        System.out.println(currencyType);

        try {
            moneyValueToChange = Float.valueOf(moneyToChange.substring(1).trim());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Just a monetary amount, please");
        }

        totalCoins = calculateCoins(moneyValueToChange);
        System.out.println(totalCoins);
        return totalCoins;
    }

    private char verifyCurrency(String money) throws IllegalArgumentException {
        char monetaryType = money.trim().charAt(0);
        if(monetaryType != '$' && monetaryType != '€') {
            System.out.println("Please use  $  for US currency or  €  for Euro currency");
            throw new IllegalArgumentException("Invalid currency type");
        }
        return monetaryType;
    }

}
