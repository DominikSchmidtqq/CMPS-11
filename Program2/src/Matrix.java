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
        String action = kb.next();
        while ((!action.equalsIgnoreCase("q"))) {
            try {
                if (action.equalsIgnoreCase("t")) {
                    transpose(Matrix);
                } else if (action.equalsIgnoreCase("r")) {
                    multiply(Matrix);
                } else if (action.equalsIgnoreCase("c")) {
                    minimum(Matrix);
                }
                action = kb.next();
            }catch (Exception e){}
        }
    }
    public static void transpose(int[][] Matrix){

    }
    public static void multiply(int[][] Matrix){
        int product = 1;
        for (int j = 0; j < Matrix.length; j++) {
            for (int i = 0; i < Matrix[0].length; i++) {
                product*= Matrix[j][i];
            }
            System.out.print(product+" ");
            product = 1;
        }
    }
    public static void minimum(int[][] Matrix){

    }
}
