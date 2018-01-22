import java.util.Scanner;

public class Words {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        int numOfWords = kb.nextInt();
        String[] Words = new String[numOfWords];
        for(int i =0; i < numOfWords; i++){
            Words[i] = kb.next();
        }
    }
}
