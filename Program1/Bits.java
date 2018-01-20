import java.util.Scanner;
public class Bits {
    public static void main(String args[]){
        int x = 0;
        Scanner kb = new Scanner(System.in);
        int Number = kb.nextInt();
        if (Number <=0){
            System.out.println("Illegal Input");
        }
        while (Number >= 1){
            Number = Number/2;
            x++;
            }
        if (x >=1){
            System.out.println(x);
        }
    }
}
