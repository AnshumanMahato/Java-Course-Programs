package programs.CH5;

import java.util.Scanner;

public class MultiplicationTableSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Table of " + n + ":");
        for (int i = 1; i <= 10 ; i++) {
            sum+= n*i;
        }

        System.out.println(sum);
        sc.close();
    }
}
