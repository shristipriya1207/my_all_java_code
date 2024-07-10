import java.io.*;
public class fileInputStream {
   public static void main(String[] args) throws IOException {
    int i;
    File f1 = new File("g:/My programs/java/fileHandling/file2.txt");
    System.out.println(f1.createNewFile());
    FileInputStream fin = new FileInputStream(f1);
    int ch=0;
    while(ch!=-1){
        ch = fin.read();
        if(ch!=-1){
            System.out.print((char)ch);
        }

    }
    fin.close();
   } 
}
