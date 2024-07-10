import java.util.*;
public class vectorMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(3);  v1.add(5);  v1.add(7);  v1.add(9);  v1.add(11);
        int c;
        while(true){
            System.out.println("1.Insert an element at a specified position ");
            System.out.println("2.insert an element at the end");
            System.out.println("3.delete an element ");
            System.out.println("4.dispaly ");
            System.out.println("5.exit");
            System.out.println("enter you choice :");
            c= sc.nextInt();
            switch(c){
                case 1:
                System.out.println("enter the element :");
                int b = sc.nextInt();
                System.out.println("tell the position :");
                int a=sc.nextInt();
                if(a>=0 && a <= v1.size()){
                    v1.insertElementAt(b,a);
                }
                else{
                    System.out.println("invalid position ");
                }
                break;
                case 2:
                System.out.println("enter the element :");
                int d = sc.nextInt();
                v1.add(d);
                break;
                case 3:
                System.out.println("enter the elment to delete");
                int del = sc.nextInt();
                if(v1.contains(del)){
                   System.out.println(v1.remove(Integer.valueOf(del))); 
                }
                else{
                    System.out.println("elemnt npt found ");
                }
                break;
                case 4:
                System.out.println(v1);
                break;
                case 5:
                System.out.println("exiting...");
                return ;
            }
        }
    }
    
}
