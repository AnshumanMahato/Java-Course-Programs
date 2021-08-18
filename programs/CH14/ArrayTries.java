package programs.CH14;

import java.util.Scanner;

class MaxTriesExeception extends Exception {
    @Override
    public String toString() {
        return "Maximum no of tries exceeded. Please try within 5 tries.";
    }
    @Override
    public String getMessage() {
        return "Maximum no of tries exceeded. Please try within 5 tries.";
    }
}

public class ArrayTries {

    int tries = 0;
    int arr[] = {1,2,3,4,5,6,7,8,9,10};

    int trial(int index) throws MaxTriesExeception {

        if(tries >= 5)
            throw new MaxTriesExeception();

        tries++;
        try {   
            System.out.println(arr[index]);
            return 0;
        } catch (Exception e) {
            System.out.println(e);
            return 1;
        }
   
    }
    public static void main(String[] args) {

        ArrayTries arr = new ArrayTries();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int index = sc.nextInt();
            try {
                if(arr.trial(index) == 0)
                    break;
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
        }

        sc.close();

    }
    
}
