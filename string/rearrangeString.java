import java.util.*;
public class rearrangeString {
   /*  public static void withoutCase(String str){
        


    } */
    public static void withCase(String str){
        char [] s = str.toCharArray();
        char ch;
        for(int i=0;i<str.length()-1;i++){
            for(int j=0;j<str.length()-i-1;j++){
                if(s[j]<s[j+1]){
                     ch = s[j];
                    s[j]=s[j+1];
                    s[j+1]=ch;
                }
            }

        }
        String str1 = new String(s);
        System.out.println("sorted string with case:"+str1);

    }

   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = sc.next();
    //withoutCase(str);
    withCase(str);
   } 
}
