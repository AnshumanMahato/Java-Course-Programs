package programs.CH5;

import java.util.Scanner;

public class MultiplicationTableSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Table of " + n + ":");
        int i = 1;
        do {
            sum+= n*i;
            i++;
        }while(i<=10);

        System.out.println(sum);
        sc.close();
    }
}
