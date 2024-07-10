public class practice1<t extends Number,u> {
    t a ;
    u b;
    public practice1(t a , u b){
        this.a = a;
        this.b = b;
    }
    public t addition(){
        return (t)(Integer)(a.intValue()+a.intValue());
    }
    /*public int addition(){
        return (a.intValue()+a.intValue());
    }*/
    public u str(){
        return b;
    }
    public static void main(String args[]){
        practice1<Integer,String> a1 = new practice1<Integer,String>(23,"shristi");
        System.out.println(a1.addition());
        System.out.println(a1.str());

    }

}
