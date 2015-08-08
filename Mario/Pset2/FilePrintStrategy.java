package Mario.Pset2;

import java.io.*;
/**
 * Created by ben on 8/6/15.
 */
public class FilePrintStrategy implements PrintStrategy {

    @Override
    public void printText(String layers) {
        PrintWriter writer = null;
/*
        try {
            writer = new PrintWriter("marioPyramid.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/
        try {
            writer.println(layers);
        }
        catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
