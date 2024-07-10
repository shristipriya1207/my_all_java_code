class student{
    static int a=  1;
    String name;


    public student(String name){
        this.name=name;
        a++;
    }
}


public class staticConcept {
    public static void main(String[] args) {
        student s1 =new student("shristi");
        System.out.println(student.a + " "+s1.name );
        student s2 =new student("shristi1");
        System.out.println(student.a + " "+s1.name );
        System.out.println(student.a + " "+s2.name );
        student s3 =new student("shristi2");
        student s4 =new student("shristi2");
System.out.println(student.a + " "+s1.name );
System.out.println(student.a + " "+s2.name );
System.out.println(student.a + " "+s3.name );
System.out.println(student.a + " "+s4.name );
    }
}
