package programs;
import java.util.Scanner;

public class ToLowCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input.toLowerCase());
        sc.close();
    }
}
