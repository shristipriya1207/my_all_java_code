class student{
    public int roll;
    public String name;
    student(int roll, String name){
        this.roll = roll;
        this.name = name;

    }
    
}


public class arrayofobject {
    public static void main(String[] args) {
        student [] arr;
        arr = new student[5];
        arr[0]=new student(1,"aman1");
        arr[1]=new student(2,"aman2");
        arr[2]=new student(3,"aman3");
        arr[3]=new student(4,"aman4");
        arr[4]=new student(5,"aman5");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].roll + " "+ arr[i].name);
        }
        

    }
    
}
