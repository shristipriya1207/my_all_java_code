class student{
    int roll;
    String name;
    int age;
    public student(int roll,String name,int age){
        this.roll=roll;
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return roll+" " +name +" "+age;
    }
}



public class tostring {
    public static void main(String[] args) {
        student s1 = new student(23,"shristi",21);
        System.out.println(s1);
        System.out.println("student info "+s1);

    }
}
