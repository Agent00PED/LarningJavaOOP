import java.util.Scanner;

public class whileonetonine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, total = 0;

        while (true) {
            System.out.print("Enter Number: ");
            num = sc.nextInt();

            if (!(num > 0 && num < 10)) { // not in 1 - 9
                sc.close();
                break;
            }
            total += num;
        }
        System.out.println("Sum Of Number = " + total);
        sc.close();
    }
}
