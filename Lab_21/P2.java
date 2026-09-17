interface Playable{
    public void play();
}

class Football implements Playable{
    public void play(){
        System.out.println("Playing Football");
    }
}

class Volleyball implements Playable{
    public void play(){
        System.out.println("Playing Vollyball");
    }
}

class Basketball implements Playable{
    public void play(){
        System.out.println("Playing Basketball");
    }
}

public class P2{
    public static void main(String []args){
        Playable p;

        p = new Football();
        p.play();

        p = new Volleyball();
        p.play();

        p = new Basketball();
        p.play();
    }
}