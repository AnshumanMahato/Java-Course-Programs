package programs.CH7;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getFibonacci(i));
        }
    }

    static int getFibonacci(int n) {
        if(n < 2)
            return n;
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}
