public class throwDemo {
   static void demoMethod(){
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("caught inside demo method"+e);
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            demoMethod();

        }
        catch(NullPointerException e){
            System.out.println("recaught :"+ e);
        }
    }
}
