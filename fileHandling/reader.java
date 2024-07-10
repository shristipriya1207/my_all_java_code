import java.io.IOException;
import java.io.*;

public class reader {
    public static void main(String[] args) throws IOException{
    /*  InputStreamReader in = new InputStreamReader(System.in); 
     System.out.println("enter sone letters");
     int letters = in.read();
     while(in.ready()){
        System.out.println((char)letters);
        letters=in.read();

     } 
     in.close();*/



   /*  FileReader f1 = new FileReader("file2.txt");
     int i;
     while(f1.ready()){
        i=f1.read();
        if(i!=-1){
            System.out.print((char)i);
        }

     }
     f1.close(); */


BufferedReader br = new BufferedReader(new FileReader("file2.txt"));
String s;
while(br.ready()){
    s=br.readLine();
    System.out.println(s);

}



    }

    
}
