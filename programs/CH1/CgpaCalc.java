package programs.CH1;
import java.util.Scanner;

public class CgpaCalc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float tot = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks of subject"+(i+1)+":");
            tot += sc.nextInt();
        }

        System.out.println("Percentage:" + (tot/5));
        System.out.println("CGPA:" + Math.floor((tot/5)/9.5f));

        sc.close();
    }
}