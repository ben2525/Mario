package com.benalbritton.mario;

public class StructureFactory {

    public StructureFactory(){}

    public Structure makeStructure(String structureType, int hght) {

        if (structureType.equals("P")) {
            Pyramid pyramid = new Pyramid(hght);
            pyramid.buildStructure();
            return pyramid;
        } else
            throw new IllegalArgumentException("The only structure choice \n" +
                    "is currently  P  for pyramid");

    }

}
