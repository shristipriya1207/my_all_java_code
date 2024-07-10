import java.util.Scanner;

public class UserInput {
    public static void main(String[] arg){
System.out.println("This is user input programming");
Scanner scc = new Scanner(System.in);
System.out.println("enter first number");
int a= scc.nextInt();
System.out.println("enter second number");
int b= scc.nextInt();
int c= a+b;
// scc.close();
System.out.println("result");
System.out.println(c);
System.out.println("enter first float value ");
float b1=scc.nextFloat();
System.out.println("first number \n" + b1);
System.out.println("enter first string value ");
String b2=scc.next();
System.out.println("first string\n" + b2);

// System.out.println("enter first line value ");
// String b3=scc.nextLine();
// System.out.println("first number" + b3);
scc.close();

    }
}
