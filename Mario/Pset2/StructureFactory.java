package Mario.Pset2;


public class StructureFactory {

    public static Structure makeStructure(String structureType, int hght) {

        if (structureType.equals("P")) {
            Pyramid pyramid = new Pyramid(hght);
            pyramid.buildStructure();
            return pyramid;
        } else
            return null;

    }

}
