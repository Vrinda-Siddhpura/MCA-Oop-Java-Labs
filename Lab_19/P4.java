class Member{
    public void display(){
        System.out.println("Members Details...");
    }
}

class StudentMember extends Member{
    public void display(){
        System.out.println("Student: 3 books");
    }
}

class FacultyMember extends Member{
    public void display(){
        System.out.println("Faculty: 5 books");
    }
}

class ResearchMember extends Member{
    public void display(){
        System.out.println("Research memeber: 10 Books");
    }
}

public class P4{
    public static void main(String []args){
        Member m;

        m = new Member();
        m.display();

        m = new StudentMember();
        m.display();

        m = new FacultyMember();
        m.display();

        m = new ResearchMember();
        m.display();

    }
}