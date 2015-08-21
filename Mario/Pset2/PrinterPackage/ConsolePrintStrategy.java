package Mario.Pset2.PrinterPackage;

import Mario.Pset2.PrintStrategy;
import Mario.Pset2.PyramidFactory;

public class ConsolePrintStrategy implements PrintStrategy {

    public void printText(PyramidFactory pyramidFactory) {
        System.out.println(pyramidFactory);
    }
}
