import java .io.*;
class onlyExt implements FilenameFilter{
    String ext;
    public onlyExt(String ext){
        this.ext=ext;
    }
    public boolean accept(File dir , String name){
        return name.endsWith(ext);
    }


}
public class filenameFilter {
   public static void main(String[] args) {
    String dirname="g:/My programs/java/fileHandling";
    File f1 = new File(dirname);
    FilenameFilter only = new onlyExt("java");
    String s[]= f1.list(only);
    
    for(int i=0;i<s.length;i++){
        System.out.println(s[i]);
    }
    
   } 
}
