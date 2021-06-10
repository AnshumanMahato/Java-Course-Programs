package programs.CH4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax;

        if(income < 250000.00)
            tax = 0;
        else if(income < 500000.00)
            tax = 0.05f * income;
        else if(income < 1000000.00)
            tax = 0.2f * income;
        else 
            tax = 0.3f * income;

        System.out.println("Tax : " + tax);

        sc.close();
    }
}
