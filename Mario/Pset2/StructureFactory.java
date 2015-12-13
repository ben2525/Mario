package Mario.Pset2;


public class StructureFactory {

    //  Start code implementing Singleton design pattern

    private StructureFactory(){}

    private static StructureFactory structureFactory;

    public static StructureFactory getInstance() {
        if(structureFactory == null){
            structureFactory = new StructureFactory();
        }
        return structureFactory;
    }

    //  End Singleton implementation

    /*
       Remove "static" from  method for Singleton

       So "structure" in Mario3.java now uses an instance reference
       instead of a class reference
     */
    public Structure makeStructure(String structureType, int hght) {

        if (structureType.equals("P")) {
            Pyramid pyramid = new Pyramid(hght);
            pyramid.BuildStructure();
            return pyramid;
        } else
            return null;

    }

}
