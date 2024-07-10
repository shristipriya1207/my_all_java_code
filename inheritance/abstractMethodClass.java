abstract class parent {
    parent() {
        System.out.println("this is parent class");
    }

    abstract void greet();
    abstract void greet2();
}

class child extends parent {
    child() {
    }

    void greet() {
        System.out.println("this is child classs");
    }
    void greet2(){

    }
}
abstract class child2 extends parent{
    child2(){}
    abstract void bless();
}

class child3 extends parent{
    child3(){}
    void bless(){
System.out.println("this is child3(bless)");
    }
    void greet(){
        System.out.println("this is child3(greet)");
    }
    void greet2(){}
}
public class abstractMethodClass {
public static void main(String[] args) {
    child ch = new child();
    child3 chh = new child3();
    ch.greet();
    chh.greet();
    chh.bless();
}
}
