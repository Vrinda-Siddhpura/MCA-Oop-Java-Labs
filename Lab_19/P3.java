class Food{
    public void prepareOrder(){
        System.out.println("Preparing foods...");
    }
}

class FastFood extends Food{
    public void prepareOrder(){
        System.out.println("Peparing pizza and pasta");
    }
}

class SouthIndian extends Food{
    public void prepareOrder(){
        System.out.println("Preparing dosa and idli");
    }
}

class ChineseRestaurant extends Food{
    public void prepareOrder(){
        System.out.println("Preparing noodles");
    }
}

public class P3{
    public static void main(String []args){
        Food f;

        f = new Food();
        f.prepareOrder();

        f = new FastFood();
        f.prepareOrder();

        f = new SouthIndian();
        f.prepareOrder();

        f = new ChineseRestaurant();
        f.prepareOrder();
    }
}