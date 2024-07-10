
class test{
    private int a,b;
    test(int i, int j){
        a=i;
        b=j;
    }
    void meth(test o){
        o.a= o.a*2;
        o.b=o.b/2;

    }
    void show(){
        System.out.println(a+ " "+b);
    }

}


public class passingobjecttomethod {
    public static void main(String args[]){
        test ob1 = new test(10,20);
        test ob2 = new test(11,22);
        ob2.show();
        ob1.meth(ob1);
        ob1.meth(ob2);
        ob1.show();
        ob2.show();


    }
}
