import java.util.ArrayList;
import java.util.Scanner;
public class arrayList{
    public static void main(String[] args) {
        
        System.out.println("hello");
        ArrayList<Integer> list= new ArrayList<>();
      /*   list.add(100);
        list.add(200);
        list.add(300);
        list.add(700);
        System.out.println(list);
        list.set(1,800);
        System.out.println(list);
        System.out.println(list.contains(800));
        list.remove(2);
        System.out.println(list);*/
Scanner sc = new Scanner(System.in);
System.out.println("enter the element :");

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Final elements");

        // System.out.println(list);
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));

        }

//2d arraylist
ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
for(int i=0;i<3;i++){
list1.add(new ArrayList<>());
}
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        list1.get(i).add(sc.nextInt());
 }
}
System.out.println(list1);



    }
}