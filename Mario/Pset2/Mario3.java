package Mario.Pset2;

import Mario.Pset2.PrinterPackage.ConsolePrintStrategy;
import Mario.Pset2.PrinterPackage.FilePrintStrategy;

import java.io.*;

/*
    Dependency Injection implementation, building on Singleton design pattern
    along with Factory design pattern for Mario pyramid along with Strategy
    design pattern.
    All structures would implement the  Structure  interface.
    There is only a  Pyramid  option at this time, so the argument is
    hard coded.
 */

public class Mario3 {

    int hght = -1;
    String height = "";
    String outputMode = "";

    private StructureFactory structureFactory;

    public Mario3(StructureFactory structureFactory){
        this.structureFactory = structureFactory;
    }

    public static void main(String[] args) {
        Mario3 mario = new Mario3(StructureFactory.getInstance());
        mario.startStructure();
    }

    public void startStructure() {
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


        //Structure structure = StructureFactory.makeStructure("P", hght);
        /*
          Above line changed to below 2 lines for Singleton
          Other changes made in StructureFactory.java
         */

        /*
           Changes now made to Singleton Design.
           Below 2 lines now removed to implement Dependency Injection
         */
        //Structure structure;
        //structure = StructureFactory.getInstance().makeStructure("P", hght);

        /*
            Arguments in below print statements changed for Dependency Injection
         */

        PrintContext context = new PrintContext();

        if (outputMode.equals("c")) {
            context.setStrategy(new ConsolePrintStrategy());
            context.printTextContext(structureFactory.makeStructure("P", hght));
        } else {
            context.setStrategy(new FilePrintStrategy());
            context.printTextContext(structureFactory.makeStructure("P", hght));
        }
    }
}
