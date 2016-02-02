package com.benalbritton.mario;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StructureFactory {

    public StructureFactory(){}

    public Structure makeStructure(String structureType, int hght) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");

        if (structureType.equals("P")) {

            /*
             * The below bean overrides the  hght  value of the constructor parameter
             * set in the   springBeans.xml  file
             * The   prototype   designation of the  scope  value in the xml file
             * causes a new instance of the object to be created each time instead
             * of the default singleton instance.
             */

            Structure pyramid = (Structure) context.getBean("pyramid", hght);
            //Pyramid pyramid = new Pyramid(hght);
            pyramid.buildStructure();
            return pyramid;
        } else
            throw new IllegalArgumentException("The only structure choice \n" +
                    "is currently  P  for pyramid");

    }

}
