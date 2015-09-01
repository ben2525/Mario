package Mario.Pset2.PrinterPackage;

import Mario.Pset2.PrintStrategy;
import Mario.Pset2.Structure;

public class ConsolePrintStrategy implements PrintStrategy {

    public void printText(Structure structure) {
        System.out.println(structure);
    }
}
