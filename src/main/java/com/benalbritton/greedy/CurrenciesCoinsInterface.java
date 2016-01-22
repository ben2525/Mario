package com.benalbritton.greedy;


import java.util.HashMap;

public interface CurrenciesCoinsInterface {

    int[] euroCoins = {200, 100, 50, 20, 10, 5, 2, 1};
    int[] usCoins = {100, 25, 10, 5, 1};

    String usDollar = "$";
    String euro = "€";

    HashMap makeCurrencyHashMap();
}
