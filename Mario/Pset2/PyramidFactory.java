package Mario.Pset2;


public class PyramidFactory {

    private static final String BRICK = "#";
    private static final String NO_BRICK = " ";

    public static String buildPyramid(int hght){

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
        return stringBuilder.toString();
    }

}
