import java.util.Scanner;

public class LAB04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        sc.close();
    }
}
