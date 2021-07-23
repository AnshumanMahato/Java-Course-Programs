package programs.CH11;

public class Pens {
    public static void main(String[] args) {
        Pen p1 = new FountainPen();
        FountainPen p2 = new FountainPen();

        p1.write();
        p1.refill();
        p2.changeNib();
    }
}

abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {
    void write(){
        System.out.println("Writing...");
    }

    void refill(){
        System.out.println("Refilling");
    }

    public void changeNib(){
        System.out.println("Changing nibs");
    }
}