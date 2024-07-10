import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class fileTest{
    void readFile() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("F:/abc.txt");
        System.out.println("read file handled");
    }
    void saveFile() throws FileNotFoundException{
        FileOutputStream fos =new FileOutputStream("F:/abc.txt");
        System.out.println("save file handled");
    }
}


public class throwsKeyword {
    public static void main(String[] args)  // throws (we cannot write throws there because it will handles by defalult exception nd it will terminate abnormally.
      {

       fileTest t1 = new fileTest();
        try{
            t1.readFile();
        }
        catch(FileNotFoundException e){
System.out.println(e);
        }
        try{
            t1.saveFile();
        }
        catch(FileNotFoundException e){
System.out.println(e);
        }
        System.out.println("handled succesfully");
    }
    
     
}
