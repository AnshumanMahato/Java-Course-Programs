package programs.CH1;
import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in kilometeres");
        float km = sc.nextFloat();
        System.out.println("Distance in Miles: " + (km*0.621371) + " miles");
        sc.close();
    }
}
