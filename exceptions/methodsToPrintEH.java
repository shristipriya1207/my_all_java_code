public class methodsToPrintEH {
    public static void main(String[] args) {
        try{
            int a =100;int b=0;int c;
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("case 1");
            e.printStackTrace(); //this will print exception name , description and stack trace.
            System.out.println("case 2");
            System.out.println(e.getMessage());//this will print only description
            System.out.println("case 3");
            System.out.println(e.toString()); // this will print exception name and description
            System.out.println(e); //this will print exception name and description
        }
    }
}
