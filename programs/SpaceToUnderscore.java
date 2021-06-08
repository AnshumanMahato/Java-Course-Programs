package programs;
import java.util.Scanner;

public class SpaceToUnderscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(input.replace(" ", "_"));

        sc.close();
    }
    
}
