package com.benalbritton.mario;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;

/*
    Use of Maven  &  Spring.
    Singleton design pattern eliminated.  Used Factory design pattern for pyramid
    and Strategy design pattern.
    All structures would implement the  com.benalbritton.mario.Structure  interface.
    There is only a  Pyramid  option at this time, so the argument is
    hard coded.
 */


public class Mario {

    int hght;
    String height = "";
    String outputMode = "";

    private StructureFactory structureFactory;

    public Mario(StructureFactory structureFactory){
        this.structureFactory = structureFactory;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
        Mario mario1 = (Mario) context.getBean("mario");

        mario1.startStructure();
    }

    public void startStructure() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            do {
                System.out.print("Enter pyramid height from 0 to 23 :  ");
                try {
                    height = br.readLine();
                } catch (IOException ex) {
                    System.out.println("I am sorry.  Error reading your input");
                    ex.printStackTrace();
                }
                try {
                    hght = Integer.parseInt(height);
                } catch (NumberFormatException ex) {
                    System.out.println("You did not enter an integer");
                }
            }
            while (hght < 0 || hght > 23);

            do {
                System.out.println("Enter  t  to print your output to a text file,");
                System.out.println("Enter  c  to print your output to the console,");

                try {
                    outputMode = br.readLine();
                } catch (IOException ex) {
                    System.out.println("I am sorry.  Error reading your input");
                    ex.printStackTrace();
                }
            }
            while (!outputMode.equals("t") && !outputMode.equals("c"));

        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

            // The structure choice "P" is hard coded because it is the only choice
            // at this time. The argument would otherwise be the user's choice.

        ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");

        PrintContext printContext = (PrintContext) context.getBean("printContext");

        PrintStrategy printStrategy;
        if (outputMode.equals("c")) {
            printStrategy = (PrintStrategy) context.getBean("consolePrintStrategy");
        } else {
            printStrategy = (PrintStrategy) context.getBean("filePrintStrategy");
        }

        printContext.setStrategy(printStrategy);
        printContext.printTextContext(structureFactory.makeStructure("P", hght));
    }
}
