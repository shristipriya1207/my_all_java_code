import java.io.*;
 class student implements Serializable {
    public String name;
    public int age;
    public int balance;


    public student(String name,int age,int balance){
        this.name=name;
        this.age=age;
        this.balance=balance;
    }
}
public class serializibility{
    public static void main(String[] args) throws Exception {
        student s1 = new student("shristi",23,100000);
        FileOutputStream f1 = new FileOutputStream("./student.txt");
        ObjectOutputStream ob1 = new ObjectOutputStream(f1);
        ob1.writeObject(s1);
        FileInputStream f2 = new FileInputStream("./student.txt");
ObjectInputStream ob2 = new ObjectInputStream(f2);
        student s2 = (student)ob2.readObject();
        System.out.println(s2.name);

    }
}
