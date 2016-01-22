package com.benalbritton.greedy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoinCalculatorTest {

    private CoinCalculator coinCalculator = new CoinCalculator();

    @Test
    public void testOneDollarCoin() {
        int coinMessage = coinCalculator.calculateChange("$2.00");
        assertEquals(2, coinMessage);
    }
/*
    @Test
    public void testIsEuroCurrency() {
        String currencyType = coinCalculator.verifyCurrencyType("$1.00");
        assertEquals("$", currencyType);
    }

    @Test
    public void testIsAmericanCurrency() {
        String currencyType = coinCalculator.verifyCurrencyType("€1.00");
        assertEquals("€", currencyType);
    }

    @Test
    public void testInputIsMoneyAsPositiveDecimalValue() {
        int moneyFloatValue = coinCalculator.moneyValueAsInteger("$1.00");
        assertEquals(100, moneyFloatValue);
    }



    @Test
    public void testQuarter() {
        int coinMessage = coinCalculator.calculateChange(0.75);
        assertEquals(3, coinMessage);
    }

    @Test
    public void testDime() {
        int coinMessage = coinCalculator.calculateChange(0.20);
        assertEquals(2, coinMessage);
    }

    @Test
    public void testNickel() {
        int coinMessage = coinCalculator.calculateChange(0.05);
        assertEquals(1, coinMessage);
    }

    @Test
    public void testPenney() {
        int coinMessage = coinCalculator.calculateChange(0.04);
        assertEquals(4, coinMessage);
    }

    @Test
    public void testZeroCoins() {
        int coinMessage = coinCalculator.calculateChange(0.00);
        assertEquals(0, coinMessage);
    }

    @Test
    public void testDollarQuarterDimeNickelPenney() {
        int coinMessage = coinCalculator.calculateChange(1.41);
        assertEquals(5, coinMessage);
    }
*/
}
