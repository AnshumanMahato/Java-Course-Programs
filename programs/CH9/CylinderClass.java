package programs.CH9;

public class CylinderClass {
    public static void main(String[] args) {
        Cylinder Cyl =  new Cylinder();
        Cyl.setHeight(5);
        Cyl.setRadius(10);
        System.out.println(Cyl.getSurfaceArea());
        System.out.println(Cyl.getVolume());
    }
}

class Cylinder {
    private int radius,height;

    public Cylinder(){
        radius = 0;
        height = 0;
    }

    public Cylinder(int rad, int hei){
        radius = rad;
        height = hei;
    }

    public int getRadius(){return radius;}
    public void setRadius(int r){radius = r;}

    public int getHeight(){return height;}
    public void setHeight(int h){height = h;}

    public float getSurfaceArea(){
        return (2 * 3.14f * radius * (radius + height));
    }

    public float getVolume(){
        return 3.14f * radius * radius * height;
    }
}
