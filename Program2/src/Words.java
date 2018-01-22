import java.util.Scanner;
/**
 * Created by domin on 1/21/2018.
 */
public class Words {
    public static void main(String args[]) {
        int notRepeated = 0;
        Scanner kb = new Scanner(System.in);
        int numOfWords = kb.nextInt();
        String[] Words = new String[numOfWords];
        for (int i = 0; i < numOfWords; i++) {
            Words[i] = kb.next();
        }
        for (int i = 0; i < numOfWords; i++){
            for (int j = 0; j < Words[i].length(); j++){
                char check = Words[i].charAt(j);
                int index1 = Words[i].indexOf(check);
                int index2 = Words[i].lastIndexOf(check);
                if (index1 == index2){
                    if (j==Words[i].length()-1){
                        notRepeated++;

                    }
                }
            }
        }
        System.out.print(notRepeated);
    }
}
