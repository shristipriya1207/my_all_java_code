public class finallyBlock {
 public static void main(String[] args) {
    try{
    int a = 100;
    int b= 0;
    int c = a/b;
    System.out.println(c);
    try{

    }
    catch(Exception ei){

    }
    finally{
        System.out.println("i am try finally block");
    }
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    
    catch(Exception e){
        System.out.println("parent :"+e);
        try{

        }
        catch(Exception ei){

        }
        finally{
            System.out.println("i am catch finally block");
        }
    }
    
    finally{
        System.out.println("i am in finally block");
        try{

        }
        catch(Exception e){

        }
        finally{
            System.out.println("i am second finally block");
        }
    }
   // catch(Exception e){}
 }   
}
  