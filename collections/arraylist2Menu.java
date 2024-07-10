import java.util.*;
class employee{
    int no;
    String name;
    String desig;
    int age;
    int sal;
    public employee(){}
    public employee(int no, String name, String desig, int age, int sal) {
        this.no = no;
        this.name = name;
        this.desig = desig;
        this.age = age;
        this.sal = sal;
    }
    public String toString(){
        return "Employee{" +
        "no=" + no +
        ", name='" + name + '\'' +
        ", desig='" + desig + '\'' +
        ", age=" + age +
        ", sal=" + sal +
        '}';
    }
    
    
}
public class arraylist2Menu {
    public static void main(String[] args) {
        ArrayList<employee> a1 = new ArrayList<employee>();
        // employee[] emp = new employee[a1.size()];
        while(true){
            int a;
            Scanner sc = new Scanner (System.in);
            System.out.println("1.insert an object into the arraylist");
            System.out.println("2.delete an object from arryalist");
            System.out.println("3.display the contents of the arraylist");
            System.out.println("4.exit");
            System.out.println("Enter your choice");
            a= sc.nextInt();
            switch(a){
                case 1:
                System.out.println("enter the emp no :");
                int no = sc.nextInt();
                System.out.println("enter the name :");
                String name = sc.next();
                System.out.println("enter the designation :");
                String desig = sc.next();
                System.out.println("ente the age :");
                int age = sc.nextInt();
                System.out.println("enter the salary");
                int sal = sc.nextInt();
                a1.add(new employee(no,name,desig,age,sal));
                break;
                case 2:
                System.out.println("enter the emp no :");
                int b = sc.nextInt();
                for(int i =0;i<a1.size();i++){
                    if(a1.get(i).no == b){
                        a1.remove(i);

                    }
                }
                System.out.println("Deleted..!!");
                break;
                case 3:
                for(employee e1 : a1){
                    System.out.println(e1);
                }
                break;
                case 4:
                System.out.println("Exiting...");
                return ;
                
                

            }
            

        }
    }
    
}
