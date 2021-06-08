package programs;
import java.util.Scanner;

public class LetterTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name for replacement:");
        String name = sc.nextLine();
        String template = "Dear <|name|>! Thanks a lot!";

        System.out.println(template.replace("<|name|>", name));

        sc.close();
    }
}
