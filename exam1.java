import java.util.*;
class student {
    private static int a=100;
    int b;
   private String name;
   double[]  marks = new double[3];
   double total;
   static double avg;

  public student(){
    a++;
    b=a;
}
public void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the name :");
    name=sc.next();
    System.out.println("enter the marks :");
    for(int i=0;i<3;i++){
        marks[i]= sc.nextDouble();
    }
}
   public  void calculate_avg_marks(){
    total =0;
        for(int i=0;i<3;i++){
            total+=marks[i];
        }
        System.out.println("total marks :"+ total);
        avg= total/3;
        System.out.println("avg marks :"+ avg);

    }

public void grade(){
    if(avg>=90){
        System.out.println("A");
    }
        else if(avg>=80){
            System.out.println("B");

        }
        else if(avg >=70){
            System.out.println("C");
        }
        else if(avg>=60){
            System.out.println("d");

        }
        else{
            System.out.println("F");

        }
    
}

public void showdata(){
    System.out.println("reg no :"+ b);

    System.out.println("name:"+name);
    for(int i=0;i<3;i++){
        System.out.println("subject "+ (i+1) +"= " +marks[i] );

    }
     calculate_avg_marks();
     grade();



}

 double getavg(){
    return avg;
}

boolean reg(int regno){
    if(regno==b){
        return true;
    }
    else{
        return false;
    }
}


}

public class exam1 {
    public static void main(String[] args) {
        System.out.println("enter the n user :");
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        
        student[] s = new student[n];
        for(int i=0;i<n;i++){
            s[i]= new student();
            // s[i].getdata();
            

        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(s[j].getavg() >s[j+1].getavg()){
                    student temp =  s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;

                }
            }
        }





        for(int i=0;i<n;i++){
        

            s[i].showdata();
          

        }

        System.out.println("seraching on the basis of registation:");
        int r = sc.nextInt();
        for(int i=0;i<n;i++){
            if(s[i].reg(r)){
                s[i].showdata();
            }
            else{
                System.out.println("not found");
            }
        }
        
        
    }
}
