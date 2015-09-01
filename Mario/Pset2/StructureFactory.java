package Mario.Pset2;


public class StructureFactory {

    public static Structure makeStructure(String structureType, int hght) {

        if (structureType.equals("P")) {
            Pyramid pyramid = new Pyramid();
            pyramid.BuildStructure(hght);
            return pyramid;
        } else
            return null;

    }

}
