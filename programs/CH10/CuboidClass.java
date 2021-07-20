package programs.CH10;

public class CuboidClass {
    public static void main(String[] args) {
        Cuboid cub = new Cuboid();

        cub.setLength(10);
        cub.setBreadth(10);
        cub.setHeight(10);

        System.out.println("Bottom Area:" + cub.getArea());
        System.out.println("Volume:" + cub.getVolume());
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public int getLength() {
	    return this.length;
    }   
    public void setLength(int length) {
	    this.length = length;
    }


    public int getBreadth() {
    	return this.breadth;
    }
    public void setBreadth(int breadth) {
    	this.breadth = breadth;
    }

    public int getArea() {
        return this.length * this.breadth;
    }

    public Rectangle()
    {
        this.length = this.breadth = 0;
    }

}

class Cuboid extends Rectangle {
    private int height;

    public int getHeight() {
	    return this.height;
    }
    public void setHeight(int height) {
	    this.height = height;
    }

    public int getVolume() {
        return this.getArea() * this.height;
    }

    public Cuboid() {
        height = 0;
    }

}
