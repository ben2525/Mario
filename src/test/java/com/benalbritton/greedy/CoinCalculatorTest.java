package com.benalbritton.greedy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoinCalculatorTest {

    private CoinCalculator coinCalculator = new CoinCalculator();

    //protected void setUp() throws Exception {
      //  coinCalculator = new CoinCalculator();
    //}

    @Test
    public void testOneDollarCoin() {

        int coinMessage = coinCalculator.calculateChange(2.00);

        assertEquals(2, coinMessage);
    }

    /*
    @Test
    public void zeroChangeMeansYouGetZeroCoins() {

        String coinMessage = coinCalculator.calculateChange("$0.00");

        assertEquals("No coins returned", coinMessage);
    }

    @Test
    public void oneCentShouldGiveYouOnePenny() {

        String coinMessage = coinCalculator.calculateChange("$0.01");

        assertEquals("1 penny", coinMessage);
    }

    @Test
    public void tenCentsShouldGiveYouOneDime() {

        String coinMessage = coinCalculator.calculateChange("$0.10");

        assertEquals("1 dime", coinMessage);
    }
    */

}
