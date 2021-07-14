package programs.CH9;

import java.util.Random;
import java.util.Scanner;

public class GuessNoChallenge {
    public static void main(String[] args) {
        SelectedNo gameNum = new SelectedNo();
        gameNum.guessNo();
        
    }
}

class SelectedNo {
    private int num;
    private int guessCount;

    private boolean isCorrect(int n) {
        return n == num;
    }

    public SelectedNo() {
        Random rand = new Random();
        num = rand.nextInt(100) + 1;
        guessCount = 0;
    }

    public void guessNo(){

        Scanner sc = new Scanner(System.in);
        int n;

        while(true) {
            System.out.print("Enter Number:");
            n = sc.nextInt();
            guessCount++;
            if(this.isCorrect(n)) {
                System.out.println("Congratulation!!! you guessed it correct. You made " + guessCount + " guesses.");
                break;
            }
            else if(n > num){
                System.out.println("You're wrong. Guessed no. is greater than the actual no. Try Again!!!");
            }
            else{
                System.out.println("You're wrong. Guessed no. is smaller than the actual no. Try Again!!!");
            }
        }

        sc.close();
            
    }
}
