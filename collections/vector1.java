import java.util.*;
public class vector1 {
    public static void main(String[] args) {
       Vector<Integer> v1 = new Vector<Integer>();
       v1.addElement(1);
       v1.addElement(2);
       v1.addElement(3);
       ArrayList<Integer> a1 = new ArrayList<Integer>();
       a1.add(10); a1.add(20); a1.add(30); a1.add(40);
       Vector<Integer> v2 = new Vector<Integer>(a1);
       v2.addElement(55); v2.addAll(v1);
       ListIterator<Integer> itr = v2.listIterator();
       while(itr.hasNext()){
        int ele = itr.next();
        // System.out.println(ele+5);
        itr.set(ele+5);
       }
       while(itr.hasPrevious()){
        System.out.println(itr.previous());
       }


    }
}
