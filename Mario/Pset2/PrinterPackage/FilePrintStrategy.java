package Mario.Pset2.PrinterPackage;

import Mario.Pset2.PrintStrategy;
import Mario.Pset2.PyramidFactory;

import java.io.*;

public class FilePrintStrategy implements PrintStrategy {

    @Override
    public void printText(PyramidFactory pyramidFactory) {

        try (PrintWriter writer = new PrintWriter("marioPyramid.txt")) {
            writer.println(pyramidFactory);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
