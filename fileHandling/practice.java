/*import java.io.*;
public class practice {
    public static void main(String[] args)throws IOException {
        File f1 = new File("practice.txt");
         f1.createNewFile();
        System.out.println("isexits :"+f1.exists());
        System.out.println(f1.getName()); 
        FileOutputStream fout = new FileOutputStream(f1);
        String s = "tata bye bye";
        char ch[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            fout.write(ch[i]);
        }

fout.close();
FileInputStream fin = new FileInputStream(f1);
int i;
do{
    i = fin.read();
    if(i!=-1){
        System.out.print((char)i);
    }
}while(i!=-1);
fin.close();
    }
}*/ 




import java.io.*;
public class practice {
    public static void main(String[] args)throws IOException {
        BufferedWriter b1 = new BufferedWriter(new FileWriter("practice.txt",true));
        b1.write("hello , how are you !!!!");
        b1.close();
        BufferedReader r1 = new BufferedReader(new FileReader("practice.txt"));
       /*int s1=0;
       while((s1=r1.read())!=-1){
        
        System.out.print((char)s1);
       }*/
       String s1 ="";
       while((s1=r1.readLine())!=null){
        System.out.println(s1);
       }
    }
}