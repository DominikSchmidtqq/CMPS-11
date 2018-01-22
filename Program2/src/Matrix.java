/**
 * Created by domin on 1/21/2018.
 */
import java.util.*;
public class Matrix {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int rows = kb.nextInt();
        int columns = kb.nextInt();
        int Matrix[][] = new int[rows][columns];
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < columns; i++) {
                Matrix[j][i] = kb.nextInt();
            }
        }
    }
}
