import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by domin on 1/21/2018.
 */
public class Series {
    public static void main(String args[]){
        double sum;
        Scanner kb = new Scanner(System.in);
        int power = kb.nextInt();
        int numOfTerms = kb.nextInt();
        if (numOfTerms == 1){
            sum = 1;
        }
        else if(numOfTerms ==2){
            sum = 1 + power;
        }
        else {
            sum = 1 + power;
            for (int i = numOfTerms - 1; i >= 2; i--) {
                sum = sum + ((power(power, i)) / (factorial(i)));
            }
        }
        System.out.printf("%.2f",sum);
    }
    public static double power(int power, int i){
        return Math.pow(power, i);
    }
    public static double factorial(int i){
        int fact =1;
        for (int j=1; j <=i; j++){
            fact = fact*j;
        }
        return  fact;
    }
}
