interface Car{
    public void moveForward();
    public void moveBackward();
    public void moveLeft();
    public void moveRight();
    public void applyBreak();
}

class Swift implements Car{
    public void moveForward(){
        System.out.println("Swift moved forward");
    }

    public void moveBackward(){
        System.out.println("Swift moved backward");
    }

    public void moveLeft(){
        System.out.println("Swift moved left");
    }

    public void moveRight(){
        System.out.println("Swift moved right");
    }

    public void applyBreak(){
        System.out.println("Swift applied break");
    }
}

class Thar implements Car{
    public void moveForward(){
        System.out.println("Thar moved forward");
    }

    public void moveBackward(){
        System.out.println("Thar moved backward");
    }

    public void moveLeft(){
        System.out.println("Thar moved left");
    }

    public void moveRight(){
        System.out.println("Thar moved right");
    }

    public void applyBreak(){
        System.out.println("Thar applied break");
    }
}

public class P1{
    public static void main(String []args){
        Swift s = new Swift();
        s.moveForward();
        s.moveBackward();
        s.moveLeft();
        s.moveRight();
        s.applyBreak();

        System.out.println();

        Thar t = new Thar();
        t.moveForward();
        t.moveBackward();
        t.moveLeft();
        t.moveRight();
        t.applyBreak();
    }   
}