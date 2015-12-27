package com.benalbritton.greedy;

public class CoinCalculator {

    private int numberOfCoins = 0;
    private int[] USCoins = {100, 25, 10, 5, 1};
    private int[] EuroCoins = {200, 100, 50, 20, 10, 5, 2, 1};

    public int calculateChange(double amountToChange) {
        int change = (int)(Math.round(amountToChange * 100));

        int numberUSCoins = USCoins.length;
        for(int coin = 0; coin < numberUSCoins; coin++) {
            numberOfCoins += change / USCoins[coin];
            change = change % USCoins[coin];
        }

        return numberOfCoins;
    }

}
