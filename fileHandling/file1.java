import java.io.File;
import java.io.IOException;
class file1{
    public static void main(String[] args)  throws IOException{
        File f1 = new File("g:/My programs/java/fileHandling/file1.txt");
       /*  System.out.println("1"+f1.createNewFile());
        System.out.println("2"+f1.exists());
        System.out.println("3"+f1.getName());
        System.out.println("4"+f1.getParentFile());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.isAbsolute());
        System.out.println(f1.length());
        System.out.println(f1.canWrite());
        System.out.println(f1.canRead());
        System.out.println(f1.canExecute());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.setReadOnly());
        System.out.println(f1.canWrite());
        System.out.println(f1.setWritable(true));
        System.out.println(f1.canWrite());
        System.out.println(f1.canRead());
        System.out.println(f1.getFreeSpace());
        System.out.println(f1.getTotalSpace());
        System.out.println(f1.getUsableSpace());
        System.out.println(f1.lastModified());  */
        // System.out.println(f1.renameTo());
        // System.out.println(f1.mkdir());
        File f2 = new File("g:/one/two/three/five/six");
        System.out.println(f2.mkdirs());
         File f3 = new File("g:/one/two/three/four");
         System.out.println(f3.mkdir());
        

    }
}