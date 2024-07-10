import java.io.*;
public class practice1 {
  public static void main(String[] args) throws IOException {
    FileReader f1 = new FileReader("practice1.txt");
    int c =0;
    while((c=f1.read())!=-1){
        System.out.print((char)c);
    }

  }  
}
