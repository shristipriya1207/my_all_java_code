public class practice2<t extends Number,u> {
    t a ;
    u b;
    public practice2(t a , u b){
        this.a = a;
        this.b = b;
    }
    public int addition(){
        return a.intValue()+a.intValue();
    }
    
    public u str(){
        return b;
    }
    public static void main(String args[]){
        practice2<Integer,String> a1 = new practice2<Integer,String>(23,"shristi");
        System.out.println(a1.addition());
        System.out.println(a1.str());

    }

}
