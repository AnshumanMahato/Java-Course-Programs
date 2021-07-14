package programs.CH8;

public class CellphoneClass {
    public static void main(String[] args) {
        
        Cellphone phone = new Cellphone();

        phone.ringing();
        phone.vibrating();

    }
}

class Cellphone {
    public void ringing() {
        System.out.println("Ringing");
    }

    public void vibrating() {
        System.out.println("Vibrating");
    }
}
