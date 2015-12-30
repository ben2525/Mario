package com.benalbritton.mario.printerpackage;


import com.benalbritton.mario.PrintStrategy;
import com.benalbritton.mario.Structure;

import java.io.*;

public class FilePrintStrategy implements PrintStrategy{

    public void printText(Structure structure) {

        try (PrintWriter writer = new PrintWriter("marioPyramid.txt")) {
            writer.println(structure);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
