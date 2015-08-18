package Mario.Pset2.PrinterPackage;

import Mario.Pset2.PrintStrategy;

import java.io.*;

public class FilePrintStrategy implements PrintStrategy {

    @Override
    public void printText(String layers) {

        try (PrintWriter writer = new PrintWriter("marioPyramid.txt")) {
            writer.println(layers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
