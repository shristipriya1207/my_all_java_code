import java.io.*;
import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the directory name :");
        String dirName = sc.next();
        File f1 = new File(dirName);
        if(!f1.exists()){
            if(f1.mkdir()){
                System.out.println("directory created :"+dirName);
            }
            else{
                System.out.println("directory not created");
                return;
            }
            
        }
        System.out.println("enter the number of files :");
            int n = sc.nextInt(); 

            for(int i=0;i<n;i++){
                new Thread(new filecreator(dirName,i)).start();
            }

    }
    private static class filecreator implements Runnable{
        String dirname;
        int filenum;
        public filecreator(String dirname , int filenum){
            this.dirname=dirname;
            this.filenum=filenum;

        }
        public void run(){
            File file = new File(dirname,"file"+filenum+".txt");
            try{
                FileWriter f2 = new FileWriter(file);
                f2.write("this file is created :"+filenum);
                System.out.println("file is created ");
                f2.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
    
    }



}
