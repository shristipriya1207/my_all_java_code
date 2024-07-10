import java.util.*;

public class ques3A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a1 = new ArrayList<String>(7);
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Day :"+ (i+1 )+" = ");
            String str = sc.next();
            a1.add(str);
        }
        for(int i=0;i<7;i++){
            String day = a1.get(i);
            a1.set(i,day.substring(0,3));
        }
        System.out.println("Forward direction  :");
ListIterator<String> list = a1.listIterator();
while(list.hasNext()){
    System.out.println(list.next());
}
System.out.println("Backward direction :");
while(list.hasPrevious()){
    System.out.println(list.previous());
}


    }
}
