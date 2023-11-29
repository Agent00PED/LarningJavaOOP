import java.util.Scanner;

public class CtoFCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C = sc.nextDouble();
        double CtoF = ((9*C)/5)+32;
        System.out.println(C + " C = " + CtoF + " F");
        System.out.printf("%.2f C = %.2f F",C,CtoF);
        sc.close();
    }
}
