package programs.CH13;

class GM extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(i<1000){
            System.out.println("Good Morning!!!");
            i++;
        }
    }
}

class Welcome implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int i = 1;
        while(i<1000){
            System.out.println("Welcome!!!");
            i++;
        }
    }
}

public class GMWelcome {
    public static void main(String[] args) {
        GM thr1 = new GM();
        Welcome wc = new Welcome();
        Thread thr2 = new Thread(wc);
        thr1.start();
        System.out.println(thr2.getState());
        thr2.start();
        System.out.println(thr1.getState());
    }
}
