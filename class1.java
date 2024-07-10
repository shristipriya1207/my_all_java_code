class a{
    public int x;
    a(){
        System.out.println("this is default base constructor");
    }
    a(int x){
        System.out.println("this is parameterized constructor of base class "+x);
    }
    public void setA(int x){
        this.x=x;
        
    }
    public int getA(){
        return x;
    }
}

class b extends a{
    public int x;
    b(){
        System.out.println("this is default derived constructor");
    }
    b(int x,int y){
        super(x);
        System.out.println("this is parameterized constructor of derived class "+y);
    }
    public void setB(int x){
        this.x=x;
        
    }
    public int getB(){
        return x;
    }
}
class c extends b{
    public int x;
    c(){
        System.out.println("this is default sub derived constructor");
    }
    c(int x,int y,int z){
        super(x,y);
        System.out.println("this is parameterized constructor of sub derived class "+z);
    }
    public void setC(int x){
        this.x=x;
        
    }
    public int getC(){
        return x;
    }
}


public class class1 {
    public static void main(String args[]){
        c obj1 = new c(4,6,8);
        b ob2= new b(3,4);
        c obj = new c();

    }
    
}
