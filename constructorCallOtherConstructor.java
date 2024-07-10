class student{
    int rno;
    String name;
    int age;
    student(){
        this(13,"shristi",21);
    }
    student(int rno,String name,int age){
        this.rno=rno;
        this.name=name;
        this.age=age;
    }
    void display(){
        // cout<<rno<<" "<<name<<" "<<age;
        System.out.println(this.rno);
    }
}
class constructorCallOtherConstructor{
    public static void main(String args[]){
        student s1 = new student();
        s1.display();
        System.out.println(s1.name);
    }
}