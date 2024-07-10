import java.io.*;
import java.util.*;
public class copyFilesToRespectiveDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source directory path :");
        String srcdirpath = sc.next();
        File  srcdir = new File(srcdirpath);
        if(!srcdir.exists() || !srcdir.isDirectory()){

            System.out.println("source directory is in valid or doe0s not exit.");
            return ;
        }


        System.out.println("Enter the destination path :");
        String destdirpath = sc.next();
        File destdir = new File(destdirpath);
        if(!destdir.exists()){
            boolean created = destdir.mkdirs();
            if(!created){
                System.out.println("failed to create !!!");
            }

        }
        File docDir = new File(destdir,"documents");
        docDir.mkdir();
        File mediaDir = new File(destdir , "media");
        mediaDir.mkdir();
        File appDir = new File(destdir,"applications");
        appDir.mkdir();

        File [] files = srcdir.listFiles();
        if(files != null){
            for(File file :files){
                if(file.isFile()){
                    String filename = file.getName().toLowerCase();
                    File target =null;
                    if(filename.endsWith(".doc") || filename.endsWith(".txt")){
                        target = docDir;
                    }
                    else if(filename.endsWith(".png")|| filename.endsWith(".jpg")){
                        target = mediaDir;

                    }
                    else if(filename.endsWith(".exe")|| filename.endsWith(".bat")){
                        target = appDir;
                    }
                    if(target!=null){
                        File dest = new File(target,file.getName());
                        copyFile(file,dest);
                        System.out.println("Copied " + file.getName() + " to " + target.getPath());
                    }
                }
            }

        }


    }
    public static void copyFile(File src, File dest){
        try{
            FileInputStream in = new FileInputStream(src);
            FileOutputStream out = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            if((length = in.read(buffer))>0){
                out.write(buffer,0,length);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
