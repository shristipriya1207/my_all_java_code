import java.io.*;
import java.util.*;

public class DuplicateFileFinder {
    public static void main(String[] args)throws Exception {
       String directoryPath = "G:\\My programs\\java\\fileHandling";
       
       List<File> files = listFiles(directoryPath);
       boolean duplicateFiles = findDuplicateFiles(files);
    }


    public static List<File> listFiles(String directoryPath){
        List<File> files = new ArrayList<>();
        File directory = new File(directoryPath);
        if(directory.exists() && directory.isDirectory()){
            File[] fileList = directory.listFiles();
            for(File f : fileList){
                files.add(f);
                }
        }

return files;

    }

public static boolean findDuplicateFiles(List<File> files) throws IOException{
boolean duplicatefiles = false;
for(int i=0;i<files.size();i++){
    for(int j=i+1;j<files.size();j++){
        if(files.get(i).length()== files.get(j).length() && arefindduplicate(files.get(i),files.get(j))){
            System.out.println("duplicate files :");
            System.out.println(files.get(i).getPath());
            System.out.println(files.get(j).getPath());
            duplicatefiles=true;
        }
    }
}
return duplicatefiles;
}

public static boolean arefindduplicate(File f1 ,File f2)throws IOException{
FileInputStream fin1 = new FileInputStream(f1);
FileInputStream fin2 = new FileInputStream(f2);
int file1 ,file2;
while(((file1=fin1.read())!=-1) && ((file2 = fin2.read()))!=-1){
    if(file1!=file2){
        return false;
    }
    

}
return true;
}

    
}
