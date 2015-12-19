package Mario.Pset2;


public class Pyramid implements Structure{

    static StringBuilder stringBuilder = new StringBuilder();

    private int height;

    public Pyramid(int height) {
        this.height = height;
    }

    public void buildStructure() {
        for (int i = 1; i <= height; i++) {
            for (int k = 1; k <= height - i; k++) {
                stringBuilder.append(NO_BRICK);
            }
            for (int j = 1; j <= i + 1; j++) {
                stringBuilder.append(BRICK);
            }
            stringBuilder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

}
