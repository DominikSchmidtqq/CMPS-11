import java.util.Scanner;
public class Converter {
    public static void main(String args[]) {
        double CelsiusTemp = 0;
        Scanner kb = new Scanner(System.in);
        String fOrK = kb.next();
        double userTemp = kb.nextDouble();
        if (fOrK.contains("f")){
            CelsiusTemp = FTemp(userTemp);
        }
        else if (fOrK.contains("k")) {
            CelsiusTemp = KTemp(userTemp);
        }
        System.out.printf("%.2f",CelsiusTemp);
    }
    public static double FTemp(double C){
        return ((C-32) *(0.55555556));
    }
    public static double KTemp(double c){
        return (c - 273.15);
    }
}
