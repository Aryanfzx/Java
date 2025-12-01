import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the times you want to print");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            System.out.println("Hello:" + i);
        }

        sc.close();
    }

}
