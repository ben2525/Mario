package com.benalbritton.greedy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoinCalculatorTest {

    private CoinCalculator coinCalculator = new CoinCalculator();

    @Test
    public void testOneDollarCoin() {
        int coinMessage = coinCalculator.calculateChange("$1.00");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testQuarter() {
        int coinMessage = coinCalculator.calculateChange("$0.25");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testDime() {
        int coinMessage = coinCalculator.calculateChange("$0.10");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testNickel() {
        int coinMessage = coinCalculator.calculateChange("$0.05");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testPenney() {
        int coinMessage = coinCalculator.calculateChange("$0.01");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testZeroCoins() {
        int coinMessage = coinCalculator.calculateChange("$0.00");
        assertEquals(0, coinMessage);
    }

    @Test
    public void testDollarQuarterDimeNickelPenney() {
        int coinMessage = coinCalculator.calculateChange("$1.41");
        assertEquals(5, coinMessage);
    }

    @Test
    public void testRoundingOfFloatToInt() {
        int coinMessage = coinCalculator.calculateChange("$2.34");
        assertEquals(8, coinMessage);
    }

    @Test
    public void testEuro_1Coin() {
        int coinMessage = coinCalculator.calculateChange("€0.01");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testEuro_2Coin() {
        int coinMessage = coinCalculator.calculateChange("€0.02");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testEuro_5Coin() {
        int coinMessage = coinCalculator.calculateChange("€0.05");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testEuro_10Coin() {
        int coinMessage = coinCalculator.calculateChange("€0.10");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testEuro_20Coin() {
        int coinMessage = coinCalculator.calculateChange("€0.20");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testEuro_50Coin() {
        int coinMessage = coinCalculator.calculateChange("€0.50");
        assertEquals(1, coinMessage);
    }
    @Test
    public void testEuro_100Coin() {
        int coinMessage = coinCalculator.calculateChange("€1.00");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testEuro_200Coin() {
        int coinMessage = coinCalculator.calculateChange("€2.00");
        assertEquals(1, coinMessage);
    }

    @Test
    public void testEuro_AllCoins() {
        int coinMessage = coinCalculator.calculateChange("€3.88");
        assertEquals(8, coinMessage);
    }
}
