package programs.CH8;

public class SquareClass {
    public static void main(String[] args) {
        Square s1 = new Square();

        s1.setSide(10);
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
    }
}

class Square {
    private int side;
    public void setSide(int s){
        side = s;
    }
    public int perimeter() {
        return side * 4;
    }
    public int area() {
        return side*side;
    }
}
