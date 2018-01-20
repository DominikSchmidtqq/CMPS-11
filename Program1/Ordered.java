import java.util.Scanner;
public class Ordered {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();
        int z = kb.nextInt();
        boolean ordered = false;
        if (x<y && y<z){
            ordered = true;
        }
        else if (x>y&&y>z){
            ordered = true;
        }
        System.out.print(ordered);
    }
}
