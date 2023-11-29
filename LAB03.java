import java.util.Scanner;

public class LAB03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lab score : ");
        int Lab = sc.nextInt();

        if (Lab >= 0 && Lab <= 30) {
            System.out.print("Midterm score : ");
            int Midterm = sc.nextInt();

            if (Midterm >= 0 && Midterm <= 30) {
                System.out.print("Final score : ");
                int Final = sc.nextInt();

                if (Final >= 0 && Final <= 40) {
                    int score = Lab + Midterm + Final;
                    System.out.print("Your Finish score is : " + score + " ");

                    if (score >= 90 && score <= 100) {
                        System.out.println("Grade A");
                    } else if (score >= 85 && score <= 89) {
                        System.out.println("Grade B+");
                    } else if (score >= 80 && score <= 84) {
                        System.out.println("Grade B");
                    } else if (score >= 70 && score <= 79) {
                        System.out.println("Grade C+");
                    } else if (score >= 60 && score <= 69) {
                        System.out.println("Grade C");
                    } else if (score >= 55 && score <= 59) {
                        System.out.println("Grade D+");
                    } else if (score >= 50 && score <= 54) {
                        System.out.println("Grade D");
                    } else if (score >= 0 && score <= 49) {
                        System.out.println("Grade F");
                    }

                    sc.close();

                } else {
                    System.out.println("Error score");
                }

            } else {
                System.out.println("Error score");
            }

        } else {
            System.out.println("Error score");
        }

    }
}