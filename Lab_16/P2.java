class Employee{
    public void work(){
        System.out.println("Employee are working.");
    }

    public void getSalary(){
        System.out.println("Salary: 35000");
    }
}

class HRManager extends Employee{
    public void work(){
        System.out.println("HR managing working employees.");
    }

    public void addEmployee(){
        System.out.println("Employee added successfull.");  
    }
}

public class P2{
    public static void main(String []args){
        HRManager h = new HRManager();
        h.work();
        h.getSalary();
        h.addEmployee();
    }
}