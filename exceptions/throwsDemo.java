public class throwsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("inside throwone");
        // throw new IllegalAccessException();
        throw new IllegalAccessException("demo");

    }
    public static void main(String[] args) {
        try{
            throwOne();
        }
        catch(IllegalAccessException e){
            System.out.println("caught "+ e);
        }
    }
}
