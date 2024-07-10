

class youngAgeException extends RuntimeException{
youngAgeException(String msg){
    super(msg);
    System.out.println("hello");
}
}
public class throwKeyword {
    public static void main(String args[]){
/* 
int age = 17;
if(age<18){
    throw new youngAgeException("handled by default exception handler in the class youngerage");

}
else{
    System.out.println(age);
}
System.out.println("this will be not printed because program will be terminated abnormally (handledby by default exception handler)");
*/

        try{
            int age =17;
            if(age<18){
                throw new youngAgeException("you are below 18");
               // System.out.println("not displayed(unreachable code)");
            }
        }
            catch(youngAgeException e){
              //  throw new youngAgeException("you are below 18");

                System.out.println("Catch is handling the exception "+e);

            }
        System.out.println("handled");

    }
}
