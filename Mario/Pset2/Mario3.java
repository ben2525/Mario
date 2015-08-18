package Mario.Pset2;

import Mario.Pset2.PrinterPackage.ConsolePrintStrategy;
import Mario.Pset2.PrinterPackage.FilePrintStrategy;

import java.io.*;

public class Mario3 {

    private static final String BRICK = "#";
    private static final String NO_BRICK = " ";

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

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= hght; i++) {
            for (int k = 1; k <= hght - i; k++) {
                stringBuilder.append(NO_BRICK);
            }
            for (int j = 1; j <= i + 1; j++) {
                stringBuilder.append(BRICK);
            }
            stringBuilder.append(System.lineSeparator());
        }

        do {
            System.out.println("Enter  t  to print your output to a text file,");
            System.out.println("Enter  c  to print your output to the console,");

            try {
                outputMode = br.readLine();
            }
            catch (IOException ex) {
                System.out.println("I am sorry.  Error reading your input");
                //        ex.printStackTrace();
            }
        }
        while (!outputMode.equals("t") && !outputMode.equals("c"));

        PrintContext context = new PrintContext();
        if (outputMode.equals("c")) {
            context.setStrategy(new ConsolePrintStrategy());
            context.printTextContext(stringBuilder.toString());
        }
        else {
            context.setStrategy(new FilePrintStrategy());
            context.printTextContext(stringBuilder.toString());
        }
    }
}
