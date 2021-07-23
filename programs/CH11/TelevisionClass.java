package programs.CH11;

public class TelevisionClass {
    public static void main(String[] args) {
        TV tv = new TV();
        TVRemote tvRemote = new TV();
        SmartTVRemote tvRemote2 = new TV();

        tv.changeChannel(12);
        tv.connectToMobile();
        tv.turnOn();
        tv.turnOff();
        tv.startNetflix();
        tv.playDVD();

        tvRemote.changeChannel(12);
        // tvRemote.connectToMobile(); error as function is not in interface TVRemote
        tvRemote.turnOn();
        tvRemote.turnOff();
        // tvRemote.startNetflix(); error as function is not in interface TVRemote
        // tvRemote.playDVD(); error as function is not in interface TVRemote

        tvRemote2.changeChannel(12);
        tvRemote2.connectToMobile();
        tvRemote2.turnOn();
        tvRemote2.turnOff();
        tvRemote2.startNetflix();
        // tvRemote2.playDVD();error as function is not in interface SmartTVRemote
    }
}

interface TVRemote {
    void changeChannel(int channelNo);
    void turnOn();
    void turnOff();
}

interface SmartTVRemote extends TVRemote {
    void connectToMobile();
    void startNetflix();
}

class TV implements SmartTVRemote {

    public void changeChannel(int channelNo){
        System.out.println("channel changed to " + channelNo);
    }

    public void turnOn(){
        System.out.println("Turned On!!!");
    }
    public void turnOff(){
        System.out.println("Turned Off!!!");
    }

    public void connectToMobile(){
        System.out.println("Connecting to mobile!!!");
    }
    public void startNetflix(){
        System.out.println("Netflix and chill!!!");
    }

    public void playDVD(){
        System.out.println("DVD running");
    }
}