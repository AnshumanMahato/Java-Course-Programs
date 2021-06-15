package programs.CH5;

import java.util.Scanner;

public class MultiplicationTableRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Table of " + n + ":");
        int i = 10;
        while(i > 0) {
            System.out.println(n*i);
            i--;
        }
        sc.close();
    }
}
