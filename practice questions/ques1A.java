import java.util.*;
class Bank{
    private String name;
    private int age;
    private int accno;
    private int bal;
    public Bank (String name,int age,int accno,int bal){
        this.name = name;
        this.age=age;
        this.accno=accno;
        this.bal=bal;

    }

}
public class ques1A{
    public static Bank getCustomerData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = sc.next();
        System.out.println("enter the age :");
        int age = sc.nextInt();
        System.out.println("enter the account number :");
        int accno = sc.nextInt();
        System.out.println("enter the balance :");
        int bal = sc.nextInt();
        return new Bank(name,age,accno,bal);
    }
    public static void main(String[] args) {
        Bank b1 = getCustomerData();
    }
}