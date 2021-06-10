package programs;

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int marks[] = new int [3];
        System.out.println("Enter marks for 3 subjects:");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int total = marks[0]+marks[1]+marks[2];

        if(marks[0] < 33 || marks[1] < 33 || marks[2] < 33 || (total/3) < 40)
            System.out.println("Fail");
        else
            System.out.println("pass");
        sc.close();
    }
}
