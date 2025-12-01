import java.io.*;

public class AssertInMethod {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider 'b' must not be zero.");
        }
        return a / b;
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any two numbers:");
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        System.out.println(divide(a, b));
    }
        System.out.println(divide(a, b));
    }

}
