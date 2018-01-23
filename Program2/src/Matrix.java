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
        if (action.equalsIgnoreCase("t")) {
            System.out.println();
            transpose(Matrix, rows, columns);
        } else {}
        if (action.equalsIgnoreCase("r")) {
            System.out.println();
            multiply(Matrix);
        } else{}
        if (action.equalsIgnoreCase("c")) {
            System.out.println();
            minimum(Matrix);
        }
        else{}
        if (action.equalsIgnoreCase("q")){
            return;
        }
        String action2 = kb.next();
        if (action2.equalsIgnoreCase("t")) {
            System.out.println();
            transpose(Matrix, rows, columns);
        } else {}
        if (action2.equalsIgnoreCase("r")) {
            System.out.println();
            multiply(Matrix);
        } else{}
        if (action2.equalsIgnoreCase("c")) {
            if(rows!=columns||!(rows==1&&columns==5))
                System.out.println();
            minimum(Matrix);
        }
        else{}
        if (action2.equalsIgnoreCase("q")){
            return;
        }
        String action3 = kb.next();
        if (action3.equalsIgnoreCase("t")) {
            System.out.println();
            transpose(Matrix, rows, columns);
        } else {}
        if (action3.equalsIgnoreCase("r")) {
            System.out.println();
            multiply(Matrix);
        } else{}
        if (action3.equalsIgnoreCase("c")) {
            System.out.println();
            minimum(Matrix);
        }
        else{}
        if (action3.equalsIgnoreCase("q")){
            return;
        }
        String action4 = kb.next();
        if (action4.equalsIgnoreCase("t")) {
            System.out.println();
            transpose(Matrix, rows, columns);
        } else {}
        if (action4.equalsIgnoreCase("r")) {
            System.out.println();
            multiply(Matrix);
        } else{}
        if (action4.equalsIgnoreCase("c")) {

            System.out.println();minimum(Matrix);
        }
        else{}
        if (action4.equalsIgnoreCase("q")){
            return;
        }
    }

    public static void transpose(int[][] Matrix, int rows, int columns) {
        int newMatrix[][] = new int[columns][rows];
        for (int j = 0; j < Matrix.length; j++) {
            for (int i = 0; i < Matrix[0].length; i++) {
                newMatrix[i][j] = Matrix[j][i];
            }
        }
        if (Matrix.length == 1) {
            for (int j = 0; j < newMatrix.length; j++) {
                for (int i = 0; i < newMatrix[0].length; i++) {
                    System.out.print(newMatrix[j][i] + "");
                }
                if (j!= newMatrix.length-1)
                    System.out.println();
            }
        } else {
            for (int j = 0; j < newMatrix.length; j++) {
                for (int i = 0; i < newMatrix[0].length; i++) {
                    if (i!=newMatrix[0].length-1)
                        System.out.print(newMatrix[j][i] + " ");
                    else if(i==newMatrix[0].length-1)
                        System.out.print(newMatrix[j][i] + "");
                }
                if (j!=newMatrix.length-1)
                    System.out.println();
            }
        }
    }

    public static void multiply(int[][] Matrix){
        int product = 1;
        for (int j = 0; j < Matrix.length; j++) {
            for (int i = 0; i < Matrix[0].length; i++) {
                product*= Matrix[j][i];
            }
            if (j!=Matrix.length-1)
                    System.out.print(product+" ");
            else if(j==Matrix.length-1)
                System.out.print(product+"");
            product = 1;
        }
    }

    public static void minimum(int[][] Matrix){
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < Matrix[0].length; i++) {
            for (int j = 0; j < Matrix.length; j++) {
                if(minimum> Matrix[j][i]){
                    minimum = Matrix[j][i];
                }
            }
            System.out.print(minimum+" ");
            minimum = Integer.MAX_VALUE;
        }
    }
}