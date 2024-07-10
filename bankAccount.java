import java.util.*;
class bank{
    private static int Accno =100;
    int accno;
    String name;
    int phn ;
    int bal;
    int depo;
    int with;
public bank(){
    Accno++;
    accno=Accno;
}
Scanner sc = new Scanner(System.in);
void create_ac(){
    
    System.out.println("enter the customer name :");
    name= sc.next();
    System.out.println("enter the phone number :");
    phn= sc.nextInt();
    do{
        System.out.println("enter the balance (greater than 100) :");
        bal = sc.nextInt();

    }while(bal<100);


    
}
void showdata(){
    System.out.println("account number :"+accno);
       System.out.println("name :"+name);
       System.out.println("phone number :"+ phn);
       System.out.println("total balance :"+bal); 
}





void deposit(){
    System.out.println("enter the balance to deposit");
    depo=sc.nextInt();
    bal =bal+depo;
    System.out.println("updated");

}

void withdraw(){
    System.out.println("enter the amount to withdrwar :");
    with=sc.nextInt();
    if(with<bal){
        bal = bal-with;
        System.out.println("updated");

    } 
    else{
        System.out.println("insufficeint balance !!");
    }
}

int checkbal(){
    return bal;

}
public boolean ifexist(int no){
    if(accno==no){
        return true;
    }
    else{
        return false;
    }
}

}


public class bankAccount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of customer :");
        int n =sc.nextInt();
        bank[] b = new bank[n];
        for(int i=0;i<n;i++){
            b[i]= new bank();

        }
        int s =0;
while(true){
            System.out.println("1.Create Account");
			System.out.println("2.Display Account details ");
			System.out.println("3.Deposit ");
			System.out.println("4.Withdraw");
			System.out.println("5.check Balance");
		
			System.out.println("6.Exit");
			System.out.println("Please Enter Choice");
			int ch = sc.nextInt();

switch(ch){
    case 1:
    if(s<n){
        b[s].create_ac();
        s++;
    }
    else{
        System.out.println("size limited");
    }
    break;
    case 2:
    for(int i=0;i<n;i++){
        b[i].showdata();
    }
    break;
    case 3:
    System.out.println("enter the aacno :");
    int reg =sc.nextInt();
    int t=0;
    for(int i=0;i<n;i++){
        if(b[i].ifexist(reg)){
            b[i].deposit();
        }
    }
    if(t==0){
        System.out.println("not registeed");
    }
    break;
    case 4:
    System.out.println("enter the aacno :");
    int reg1 =sc.nextInt();
    int t1=0;
    for(int i=0;i<n;i++){
        if(b[i].ifexist(reg1)){
            b[i].withdraw();
        }
    }
    if(t1==0){
        System.out.println("not registeed");
    }
    break;
    case 5:
    System.out.println("enter the aacno :");
    int reg2 =sc.nextInt();
    int t2=0;
    for(int i=0;i<n;i++){
        if(b[i].ifexist(reg2)){
            System.out.println("your balance :"+ b[i].checkbal());
        }
    }
    if(t2==0){
        System.out.println("not registeed");
    }
    break;
    case 6:
   System.exit(0);




}


}
    }
    
}
