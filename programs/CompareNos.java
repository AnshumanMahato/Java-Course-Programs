package programs;
import java.util.Scanner;

public class CompareNos {
    public static void main(String[] args) {
        int num, setValue = 8;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.:");
        num = sc.nextInt();

        if(num < setValue) {
            System.out.println("Entered no. is less than set value.");
        }
        else if(num > setValue) {
            System.out.println("Entered no. is greater than set value.");
        }
        else {
            System.out.println("Entered no. is equal to set value.");
        }

        sc.close();
    }
}
