package Mario.Pset2.PrinterPackage;

import Mario.Pset2.PrintStrategy;
import Mario.Pset2.Structure;

import java.io.*;

public class FilePrintStrategy implements PrintStrategy {

    @Override
    public void printText(Structure structure) {

        try (PrintWriter writer = new PrintWriter("marioPyramid.txt")) {
            writer.println(structure);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
