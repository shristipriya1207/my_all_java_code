public class hashcode{
int a;
String name;
public hashcode(int n,String name){
    this.a=n;
    this.name=name;
}
/*public  int hashCode(){
    return super.hashCode();
}*/
public  int hashCode(){
    return a;
}

public boolean equals(Object obj){
return this.a ==((hashcode)obj).a;
}
    public static void main(String[] args) {
       hashcode obj = new hashcode(13,"shistu");
       hashcode obj1 = new hashcode(13,"efh");
       System.out.println(obj.hashCode());
       System.out.println(obj1.hashCode());

       if(obj1 == obj){
        System.out.println("yes");

       }
       if(obj.equals(obj1)){
        System.out.println("yes");
       }

       System.out.println(obj1 instanceof Object);
       System.out.println(obj1.getClass().getName());
    }
}