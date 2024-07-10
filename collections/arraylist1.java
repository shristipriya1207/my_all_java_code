import java.util.ArrayList;
import java.util.*;
public class arraylist1{
    public static void main(String[] args) {
      ArrayList<Integer> a1 = new ArrayList<Integer> ();
      ArrayList<Integer> a2 = new ArrayList<Integer> ();
      a1.add(2);
      a1.add(3);
      a1.add(4);
      System.out.print("1.printing :"+a1+" ");
      Object o1[] = a1.toArray();  
      for(Object o2 : o1){
System.out.print(o2 + " ");
      }
      int sum =0;
for(Object o2 :o1){
    sum+=(int)o2;
}
System.out.println("sum :"+ sum);

a2.add(5);
a2.add(6);
a2.add(7);
//a2.addAll(a1);

System.out.println();
System.out.print("2.printing :"+a2+" ");

a2.addAll(1,a1);
System.out.println();
System.out.print("3.printing :"+a2+" ");

a1.remove(1);
System.out.println();
System.out.print("4.printing :"+a1+" ");
System.out.println();

ArrayList<Integer> a3 = new ArrayList<Integer> ();
a3.add(11); a3.add(12);
a3.add(13);
a3.add(14);
a3.add(15);
a3.addAll(a2);
System.out.println("5.printing :"+a3+" ");
a2.clear();
a1.contains(a3);
System.out.println("6.printing :"+a3+" ");
System.out.println("7.printing :"+a1+" ");
System.out.println(a3.contains(a1));
System.out.println("8.printing :"+a3.get(4)+" ");
System.out.println("9.printing :"+a3.set(4,25)+" ");
a3.add(1,100);
System.out.println("10.printing :"+a3+" ");


    }
}