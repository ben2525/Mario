package com.benalbritton.mario;


public class PrintContext {

    private PrintStrategy strategy;

    public void setStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void printTextContext(Structure structure) {
        strategy.printText(structure);
    }

}
