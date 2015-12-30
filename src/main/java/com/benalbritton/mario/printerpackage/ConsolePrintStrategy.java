package com.benalbritton.mario.printerpackage;


import com.benalbritton.mario.PrintStrategy;
import com.benalbritton.mario.Structure;

public class ConsolePrintStrategy implements PrintStrategy{

    public void printText(Structure structure) {
        System.out.println(structure);
    }

}
