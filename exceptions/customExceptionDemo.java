class MyException extends Exception{
    String msg;
    MyException(String s){
        msg=s;
    }
}



public class customExceptionDemo {
    public static void main(String[] args) {
        int a[] = {6,9,5,15,7,10,20};
        for(int p :a){
            try{
                if(p>=10){
                    throw new MyException("ele >= 10");
                }
                System.out.println("ele < 10");
            }
            catch(MyException e){
                System.out.println("caught "+e.msg);
            }
        }
    }
}
