interface  interface1 {
    void firstMethod();
    // Void secondMethod(int a);
    private void  privateMethod(){
        System.out.println("this is private .... we cannot call directly but we can pass into the default function :::");

    }
    default void byDefault(){
        privateMethod();
        System.out.println("we can impletement here using default !!");
    }


}

interface interface2{
    void thirdMethod();
    String [] fourthMethod();

}

class welcome{
  private void greeting(){
    System.out.println("this is greeting");

   } 
   void blessing(){
    greeting();
    System.out.println("this is blessing");
   }
}


class today extends welcome implements interface1,interface2{
    int b;
    public void firstMethod(){
        System.out.println("this is first method");
    }
    // public void secondMethod(int c){
    //     b=c;
    //     System.out.println("this is second method");
    //     // return null;
    // }
    public void thirdMethod(){
        System.out.println("this is third method");
    }
    public String[] fourthMethod(){
        System.out.println("this is fourth method");
        String[] one = {"hi","hello","bye"};
        return one;
    }
    public void byDefault(){
        System.out.println("this will call if again implement in the class");
    }
    public void personal(){
        System.out.println("personal");
    }

}

public class interfacess {
   public static void main(String[] args) {
    interface1 f1 = new today();
    today t1 = new today();
     t1.firstMethod();
    //  t1.secondMethod(23);
    t1.thirdMethod();
    String[] s1 = t1.fourthMethod();
for(String s :s1){
    System.out.print(s + " ");
}
t1.byDefault();
// t1.privateMethod();
t1.blessing();
f1.firstMethod();
// f1.thirdMethod();
f1.personal();

   }


}
