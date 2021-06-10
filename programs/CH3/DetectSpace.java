package programs.CH3;

import java.util.Scanner;

public class DetectSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("is there any occurence of double or triple space:" + 
                            (input.indexOf("  ") != -1 || input.indexOf("   ") != -1));
        sc.close();
    }
}