import java.util.Scanner;
class student{
    String name;
    int roll;
    static int counter =0;
    static String cllgname;

    student( String name){
        this.name = name;
        this.roll = set_roll();
    }
    static int set_roll(){
        counter++;
        return counter;
    }
    static void setcllgname(String name){
        cllgname= name;
    }
    void getStudentDetails(){
        System.out.println("name :"+ name);
        System.out.println("roll :"+ roll);
        System.out.println("college name :"+ cllgname);

    }


}
public class staticMember{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        student.setcllgname("Manipal institute of technology");
        System.out.println("ENTER the N number of students :");
        int n = sc.nextInt();
        student[] stud = new student[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter the " +(i+1) + " name of the student :");
            String name1= sc.next(); 
            stud[i]= new student(name1);
        }

        for(int i=0;i<n;i++){
            stud[i].getStudentDetails();
        }

    }
}
