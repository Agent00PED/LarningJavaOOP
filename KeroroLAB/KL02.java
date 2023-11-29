package KeroroLAB;

import java.util.Scanner;

public class KL02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Try : ");
        int st = sc.nextInt();
        System.out.print("Second Try : ");
        int nd = sc.nextInt();

        if ((!(st >= 1 && st <= 4)) || (!(nd >= 1 && nd <= 4))) {
            System.out.println("Try again");
        }

        if (st == 1 && nd == 2 || st == 2 && nd == 1) {
            System.out.println("Success!");
        }

        if (st == 1 && nd == 3 || st == 1 && nd == 4 || st == 2 && nd == 3 || st == 2 && nd == 4) {
            System.out.println("Extend for count down");
        }

        if (st == 3 && nd == 4 || st == 4 && nd == 3) {
            System.out.println("Failed!");
        }

        sc.close();
    }
}
