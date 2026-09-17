import java.util.Scanner;
class Student{
    int id_No;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_Credit;
    String[] grade_obtained;
    double spi;

    public Student(int id_No,int no_of_subjects_registered,String[] subject_code,int[] subject_Credit,String[] grade_obtained){
        this.id_No=id_No;
        this.no_of_subjects_registered=no_of_subjects_registered;
        this.subject_code=subject_code;
        this.subject_Credit=subject_Credit;
        this.grade_obtained=grade_obtained;
    }

    public void calculate_Spi(){
        int credit=0;
        int grade_point=0;
        int[] points=new int[no_of_subjects_registered];
        int totalPoint=0;
        for(int i=0;i<no_of_subjects_registered;i++){
            credit+=subject_Credit[i];
            switch (grade_obtained[i]) {
                case "A+":
                    grade_point=10;
                    break;
                case "A":
                    grade_point=9;
                    break;
                case "B+":
                    grade_point=8;
                    break;
                case "B":
                    grade_point=7;
                    break;
                case "C+":
                    grade_point=6;
                    break;
                case "C":
                    grade_point=5;
                    break;
                case "D+":
                    grade_point=4;
                    break;
                case "D":
                    grade_point=3;
                    break;
                case "E+":
                    grade_point=2;
                    break;
                case "E":
                    grade_point=1;
                    break;
                case "F":
                    grade_point=0;
                    break;
            }
            points[i]=grade_point*subject_Credit[i];
            totalPoint+=points[i];
        }
        this.spi=((double)totalPoint/credit);
        System.out.println("SPI is ="+spi);
    }
}
public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Student");
        int a=sc.nextInt();

        Student[] s=new Student[a];

        for(int i=0;i<s.length;i++){
            System.out.println("Enter Student ID");
            int id_No=sc.nextInt();
            System.out.println("Enter Number of Subject");
            int no_of_subjects_registered=sc.nextInt();            
            String[] subject_code=new String[no_of_subjects_registered];
            int[] subject_Credit=new int[no_of_subjects_registered];
            String[] grade_obtained=new String[no_of_subjects_registered];
            
            for(int j=0;j<no_of_subjects_registered;j++){
                System.out.println("Enter Subject Code");
                subject_code[j]=sc.next();
                System.out.println("Enter Subject Credit");
                subject_Credit[j]=sc.nextInt();
                System.out.println("Enter Subject Grade");
                grade_obtained[j]=sc.next();
            }
            s[i]=new Student(id_No,no_of_subjects_registered,subject_code,subject_Credit,grade_obtained);
            s[i].calculate_Spi();
        }
    }

}
