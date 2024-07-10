import java.io.*;
import java.util.*;
class bank implements Serializable{
    String name;
    int age;
    int acc_num;
    int bal;
    public bank(String name, int age, int acc_num, int bal) {
        this.name = name;
        this.age = age;
        this.acc_num = acc_num;
        this.bal = bal;
    }
    void display(){
        System.out.println("Customer name :"+name);
        System.out.println("Customer age :"+age);
        System.out.println("Accnount number :"+ acc_num);
        System.out.println("Balance :"+bal);
    }
}

public class customers {
    public static void main(String[] args) throws Exception {
        int n;
        System.out.println("How many customers you want ?");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        bank [] b1 = new bank[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter age");
            int age = sc.nextInt();
            System.out.println("Enter Account number");
            int acc_num = sc.nextInt();
            System.out.println("Enter balance");
            int bal = sc.nextInt();
            b1[i]= new bank(name,age,acc_num,bal);
        }
        FileOutputStream f1 = new FileOutputStream("./Bank.txt");
        ObjectOutputStream ob1 = new ObjectOutputStream(f1);
        ob1.writeObject(b1);
        

        FileInputStream f2 = new FileInputStream("./Bank.txt");
        ObjectInputStream ob2 = new ObjectInputStream(f2);
        bank[] b2 = (bank[])ob2.readObject();
        for(bank b :b2){
            b.display();
        }

    }
}
