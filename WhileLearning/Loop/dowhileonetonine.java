import java.util.Scanner;

public class dowhileonetonine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, total = 0;
        do {
            System.out.print("Enter Number: ");
            num = sc.nextInt();
            if (num > 0 && num < 10)
                total += num;
        } while (num > 0 && num < 10);

        System.out.println("Sum Of Number = " + total);
        sc.close();
    }
}