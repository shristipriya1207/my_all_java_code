import java.util.Scanner;
class newthread extends Thread{
    String str[];
    String ext;
public newthread(String s[],String ext){
str=s;
this.ext=ext;
start();
}
public void run(){
    for(int i=0;i<str.length;i++){
        if(str[i].endsWith(ext)){
    System.out.println(str[i] + "this email ends with "+ ext);
        }

    }
}
}
public class ques3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of email :");
        int n = sc.nextInt();
        String [] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]= sc.next();

        }
        newthread t1 = new newthread(str,"manipal.edu");
        newthread t2 = new newthread(str,"gmail.com");

        
        try{
            System.out.println("waiting to thread finish");
            t1.join();
            t2.join();

        }
        catch(InterruptedException e){
            System.out.println(e);
        }

    }
}
