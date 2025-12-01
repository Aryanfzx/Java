import java.util.Scanner;

public class Oddeven1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to check:");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {

            System.out.print("Enter the number you want to check if odd or even:");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(n + " is an even number.");

            } else {
                System.out.println(n + "is a odd number.");
            }
        }
        sc.close();
    }
}
