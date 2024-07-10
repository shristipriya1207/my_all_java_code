import java.util.regex.*;
import java.util.Scanner;
public class practice1{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a+b*");
        Matcher M = p.matcher("a");
        boolean b = M.matches();
        System.out.println("result :"+b);
    }
}

