package programs.CH10;

public class CylinderClass {
    public static void main(String[] args) {
        Cylinder cub = new Cylinder();

        cub.setRadius(10);
        cub.setHeight(10);

        System.out.println("Bottom Area:" + cub.getArea());
        System.out.println("Volume:" + cub.getVolume());
    }
}

class Circle{
    private int radius;

    public int getRadius() {
	    return this.radius;
    }
    public void setRadius(int radius) {
	    this.radius = radius;
    }


    public float getArea() {
        return 3.14f * this.radius * this.radius;
    }

    public Circle()
    {
        this.radius = 0;
    }

}

class Cylinder extends Circle {
    private int height;

    public int getHeight() {
	    return this.height;
    }
    public void setHeight(int height) {
	    this.height = height;
    }

    public float getVolume() {
        return this.getArea() * this.height;
    }

    public Cylinder() {
        height = 0;
    }

}

