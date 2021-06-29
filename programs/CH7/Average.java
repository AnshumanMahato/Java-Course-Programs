package programs.CH7;

public class Average {
    public static void main(String[] args) {
        System.out.println(avg(0,1,1,2,3,5));
    }

    static float avg(int ... nums) {
        float avg = 0;
        for (int i : nums) {
            avg = avg + (float)i/(float)nums.length;
        }
        return avg;
    }
}
