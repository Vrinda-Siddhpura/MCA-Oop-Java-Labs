import java.util.ArrayList;

public class P1{
    public static void main(String[] args){
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Vrinda");
        employees.add("Rahul");
        employees.add("Amit");
        employees.add("Priya");

        System.out.println("Employee Names:");
        for(String name : employees){
            System.out.println(name);
        }
    }
}
