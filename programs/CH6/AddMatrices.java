package programs.CH6;

public class AddMatrices {
    public static void main(String[] args) {
        int matrx1[][] = {
            {1,2,5},
            {3,4,7}
        };

        int matrx2[][] = {
            {2,4,8},
            {5,6,9}
        };

        for(int i=0;i<2;i++)
        {
            for(int j = 0; j < 3;j++)
            {
                matrx1[i][j] += matrx2[i][j];
            }
        }

        for (int[] is : matrx1) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.print('\n');
        }
    }
}
