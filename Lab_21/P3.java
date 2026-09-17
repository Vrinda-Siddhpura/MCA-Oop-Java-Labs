interface Device{
    public void powerOn();
}

interface SmartDevice extends Device{
    public void connectInternet();
}

class SmartPhone implements SmartDevice{
    public void powerOn(){
        System.out.println("SmartPhone powered on");
    }

    public void connectInternet(){
        System.out.println("SmartPhone connected to internet");
    }
}

public class P3{
    public static void main(String []args){
        Device d = new SmartPhone();
        d.powerOn();

        System.out.println();

        SmartDevice s = new SmartPhone();
        s.powerOn();
        s.connectInternet();
    }
}