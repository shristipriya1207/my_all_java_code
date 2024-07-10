import java.util.*;
import java.io.*;
class invalidIPAddException extends Exception{
public invalidIPAddException(String msg){
    super(msg);
}
}
public class ipValidation {
  public static void main(String[] args)throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
    String line;
    while((line = reader.readLine())!=null){
        String[] ip =line.split("\\.");
        Boolean valid=true;
        String clss = "";
        if(Integer.parseInt(ip[0])<126 && Integer.parseInt(ip[0])>0){
            clss ="A";
        }
        else if(Integer.parseInt(ip[0])>128 && Integer.parseInt(ip[0])<=192){
            clss="B";
        }
        else if(Integer.parseInt(ip[0])>192 && Integer.parseInt(ip[0])<=224){
            clss="C";
        }
        else if(Integer.parseInt(ip[0])>224 && Integer.parseInt(ip[0])<=240){
          
            clss="D";
        }
        else{
            clss="E";
        }
        try{
            for(String sd : ip){
                int num = Integer.parseInt(sd);
                if(num<0 || num >255){
                    valid= false;
                    throw new invalidIPAddException(ip + "is not valid ip");
                }
                if(valid){
                    writer.write(ip+"is a valid ip and class is "+clss+"\n");
                }
            }
        }catch(invalidIPAddException e){
            System.out.println(e);
        }



    }
reader.close();
writer.close();


  }  
}
