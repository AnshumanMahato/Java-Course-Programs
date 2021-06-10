package programs.CH2;

import java.util.Scanner;

public class GradeEnc {
    public static void main(String[] args) {
        float marks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks:");
        marks = sc.nextFloat();
        marks += 8;

        System.out.println("Encrypted marks:" + marks);
        System.out.println("Actual marks:" + (marks-8));

        sc.close();

    }
}
