package programs.CH7;

public class MutltiplicationTables {
    public static void main(String[] args) {
        displayTables(7);
    }

    static void displayTables(int n) {
        System.out.println("Table of " + n + ":");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n*i);
        }
    }
}
