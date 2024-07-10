import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class fileOutputStream {
    public static void main(String[] args)  throws IOException{
       
       File f1 = new File("g:/My programs/java/fileHandling/file2.txt");
    // System.out.println(f1.createNewFile());
    FileOutputStream fout = new FileOutputStream(f1,true); 
    String s ="tata";
    char ch[] = s.toCharArray();
    for(int i=0;i<s.length();i++){
        fout.write(ch[i]);

    }
    fout.close();

    }
}
