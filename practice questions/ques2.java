import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.*;
class countWord implements Runnable{
    File f1;
    public countWord(File f1){
        this.f1 = f1;
    }
    public void run(){
        try{
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            int count=0;
            String line="";
            while((line=br.readLine())!=null){
                String[] words = line.split("\\W+");
                count+=words.length;
            }
            br.close();
            System.out.println("count of words :" + count);
        }
        catch(IOException e){
            System.out.println("an error occured :"+ e);
        }
    }

}
class longestWord implements Runnable{
    File f1 ;
    public longestWord(File  f1){
        this.f1 = f1;
    }
    public void run(){
        try{
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        int count=0;
        String longword="";
        String line="";
        while((line = br.readLine())!=null){
            String [] words = line.split("\\W+");
            for(String word : words){
                if(word.length() > longword.length()){
longword=word;
                }
               
            }

        }
        br.close();
        System.out.println("longesword"+longword);
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}

public class ques2{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the directory :");
        String dir = sc.nextLine();
        File filedir = new File(dir);
        if(!filedir.exists() || !filedir.isDirectory()){
filedir.mkdirs();
System.out.println("directory is created");
        }
        else{
            System.out.println("directory alreday exosts");
        }
        System.out.println("enter the file name :");
        String filename = sc.nextLine();
        File file = new File(filedir,filename);
if(!file.exists()){
    file.createNewFile();
        System.out.println("file created");

}
else{
    System.out.println("file already exists");
}
FileWriter f1 = new FileWriter(file,true);
System.out.println("write content to thw file");
String cont = sc.nextLine();
f1.write(cont);
  f1.close(); 
  
  Thread t1 = new Thread(new countWord(file));
t1.start();
Thread t2 = new Thread(new longestWord(file));
t2.start();

    }
}
