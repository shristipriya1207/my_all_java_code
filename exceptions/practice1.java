import java.io.FileInputStream;
class practice1{
    public static void main(String[] args) {
      /*  try{
        FileInputStream fis = new FileInputStream("d:/abc.txt");
        }
        catch(Exception e){
             System.out.println("File not found "+e);
        } */


try{
    int a = 100;
int b=0;
int c = a/b;
System.out.println(c);
}
catch(ArithmeticException e){
    System.out.println("divide by zero ");
    System.out.println("divide by zero "+ e);

}
/*catch(Exception e){
        System.out.println(e);
     }*/

System.out.println("normal flow");
    }
}