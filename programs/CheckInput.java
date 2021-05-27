package programs;

import java.util.Scanner;

public class CheckInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        boolean isInteger = sc.hasNextInt();
        System.out.println("Is the input an integer?");
        System.out.println(isInteger);
        sc.close();
    }
    
}
