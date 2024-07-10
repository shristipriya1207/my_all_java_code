import java.util.*;
public class iteratorArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<String> a1 = new ArrayList<String>();
        System.out.println("enter five strings :");
        for(int i=0;i<5;i++){
            String a = sc.next();
            a1.add(a);

        }

        for(int i=0;i<5-1;i++){
            for(int j=0;j<5-1-i;j++){
                if(a1.get(j).charAt(0) >a1.get(j+1).charAt(0) ){
                    String temp = a1.get(j);
                    a1.set(j,a1.get(j+1));
                    a1.set(j+1,temp);


                }

            }
        }
        Iterator itr = a1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
        System.out.println();
        ListIterator it = a1.listIterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
        System.out.println();
        while(it.hasPrevious()){
            System.out.print(it.previous()+ " ");
        }
        
    }
}
