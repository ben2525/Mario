package Mario.Pset2;

import Mario.Pset2.PrinterPackage.ConsolePrintStrategy;
import Mario.Pset2.PrinterPackage.FilePrintStrategy;

import java.io.*;

/*
    Factory design pattern for Mario pyramid along with Strategy design pattern.
    All structures would implement the  Structure  interface.
    There is only a  Pyramid  option at this time, so the argument is
    hard coded.
 */

public class Mario3 {

    public static void main(String[] args) {
        int hght = -1;
        String height = "";
        String outputMode = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Enter pyramid height from 0 to 23 :  ");
            try {
                height = br.readLine();
            }
            catch (IOException ex) {
                System.out.println("I am sorry.  Error reading your input");
                ex.printStackTrace();
            }
            try {
                hght = Integer.parseInt(height);
            }
            catch (NumberFormatException ex) {
                System.out.println("You did not enter an integer");
            }
        }
        while (hght < 0 || hght > 23);

        do {
            System.out.println("Enter  t  to print your output to a text file,");
            System.out.println("Enter  c  to print your output to the console,");

            try {
                outputMode = br.readLine();
            }
            catch (IOException ex) {
                System.out.println("I am sorry.  Error reading your input");
                ex.printStackTrace();
            }
        }
        while (!outputMode.equals("t") && !outputMode.equals("c"));

        // The structure choice "P" is hard coded because it is the only choice
        // at this time. The argument would otherwise be the user's choice.
        Structure structure = StructureFactory.makeStructure("P", hght);

        PrintContext context = new PrintContext();

        if (outputMode.equals("c")) {
            context.setStrategy(new ConsolePrintStrategy());
            context.printTextContext(structure);
        } else {
            context.setStrategy(new FilePrintStrategy());
            context.printTextContext(structure);
        }
    }
}
