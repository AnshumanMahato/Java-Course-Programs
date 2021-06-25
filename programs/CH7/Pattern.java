package programs.CH7;

public class Pattern {
    public static void main(String[] args) {
        displayPattern(10);
    }

    static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}
