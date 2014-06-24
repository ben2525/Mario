
import java.io.*;

public class Mario3 {

    public static void main(String[] args) {
        int hght = 0;
        String height = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Enter pyramid height from 0 to 23 :  ");
            try {
                height = br.readLine();
            }
            catch (IOException ex) {
                System.out.println("I am sorry.  Error reading your input");
        //        ex.printStackTrace();
            }
            try {
                hght = Integer.parseInt(height);
            }
            catch (NumberFormatException ex) {
                System.out.println("You did not enter an integer");
        //        ex.printStackTrace();
            }
        }
        while (hght < 0 || hght > 23);

        String no_Brick = " ";
        String Brick = "#";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= hght; i++) {
            stringBuilder.setLength( 0 );
            for (int k = 1; k <= hght - i; k++) {
                stringBuilder.append(no_Brick);
            }
            for (int j = 1; j <= i + 1; j++) {
                stringBuilder.append(Brick);
            }
            System.out.println(stringBuilder.toString());
        }

    }
}
