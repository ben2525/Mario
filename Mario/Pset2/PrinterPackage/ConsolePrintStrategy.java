package Mario.Pset2.PrinterPackage;


import Mario.Pset2.PrintStrategy;

public class ConsolePrintStrategy implements PrintStrategy {
    public void printText(String layers) {
        System.out.println(layers);
    }
}
