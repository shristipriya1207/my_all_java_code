/*import java.io.*;
public class practice3 {
   public static void main(String[] args) throws IOException {
    File f1 = new File("G:\\My programs\\java");
    File[] files = f1.listFiles();
    for(File file : files){
        System.out.println(file);
    }
   }
}*/
import java.io.*;
class OnlyExt implements FilenameFilter{
    String ext;
    public OnlyExt(String ext){
        this.ext = ext;
    }
    public boolean accept(File dir,String name){
        return name.endsWith(ext);
    }
}
public class practice3{
    public static void main(String args[]){
        File f1 = new File("G:\\My programs\\java");
        FilenameFilter filter = new OnlyExt("java");
        String[] s1 = f1.list(filter);
        for(String s :s1){
            System.out.println(s);
        }
    }
}
