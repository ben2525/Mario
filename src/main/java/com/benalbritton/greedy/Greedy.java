package com.benalbritton.greedy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Greedy {

    public static void main(String[] varArgs) {

        if (varArgs.length > 0) {

            ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
            CoinCalculator coinCalculator = (CoinCalculator) context.getBean("coinCalculator");
            coinCalculator.calculateChange(varArgs[0]);
        }
        else {
            throw new IllegalArgumentException("No value given");

        }
    }
}
