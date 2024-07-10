class MyException extends Exception{
    String msg;
    MyException(String s){
        msg=s;
    }
}

public class customExceptionDemo2 {
    static void compute (int a) throws MyException{
        System.out.println("caught compute "+ a);
        if(a>10){
            throw new MyException("a>10");
        }
        System.out.println("normal exit");
    }
    public static void main(String[] args) {
        try{
            compute(1);
            compute(11);
        }
        catch(MyException e){
            System.out.println("exception handled "+ e.msg);
        }
    }
}
