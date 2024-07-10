
// package inheritance;
import java.util.*;
class box{
    int l;
    int w;
    int h;

    public box(){
        l=w=h=-1;
    }
    public box(int l,int w,int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    public box(box o){
        l=o.l;
        w=o.w;
        h=o.h;
    }
   public void display(){
        System.out.println("length"+l);
        System.out.println("width"+w);
        System.out.println("height"+h);
        // System.out.println("weight"+we);
    }
}
class boxweight extends box{
    int weight;
public boxweight(){
    weight=-1;
}

    public boxweight(int l,int w,int h,int weight){
        super(l,w,h);

        this.weight=weight;
    }
   public void display(){
        System.out.println("length"+l);
        System.out.println("width"+w);
        System.out.println("height"+h);
        System.out.println("weight"+weight);
    }
    public boxweight(boxweight ox){
        super(ox);
        this.weight=ox.weight;

    }
}
public class inheritance1 {
    public static void main(String[] args) {
        box obj = new boxweight(3,5,6,7);
    System.out.println(obj.l);
    // System.out.println(obj.weight);
obj.display();



// boxweight obj1 = new boxweight(1,2,3,4);
//     box obj3=obj1;
//     obj3.display();
















    }
    
    
}
/*there are many variables in both and child classes
 * you are given acces to variabkes that are in the ref type i.e. boxweight
 * hence, you should have acces to weight variables
 * this also means, that the ones you are trying to access should be intialised
 * but here, when the obj itself is of type parent class, how will you call the construtor of child class
 this is why why error
 */
