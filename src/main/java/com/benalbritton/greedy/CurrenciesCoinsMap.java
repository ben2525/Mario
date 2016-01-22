package com.benalbritton.greedy;


import java.util.HashMap;
import java.util.Map;

public class CurrenciesCoinsMap implements CurrenciesCoinsInterface{

    public HashMap makeCurrencyHashMap(){

        HashMap<String, int[]> coins = new HashMap<String, int[]>();

        coins.put(usDollar, usCoins);
        coins.put(euro, euroCoins);

        return coins;
    }
}
