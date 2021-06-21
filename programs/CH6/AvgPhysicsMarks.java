package programs.CH6;

public class AvgPhysicsMarks {
    public static void main(String[] args) {
        float phyMarks[] = {35f,100f,33f,66f,78f,91f,67f,88f,56f,83f};
        float total = 0f;
        for (float marks: phyMarks) {
            total+= marks;
        }
        System.out.println("Avg marks:" + (total/phyMarks.length));
    }
}
