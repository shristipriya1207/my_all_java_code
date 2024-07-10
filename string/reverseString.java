import java.util.*;
public class reverseString {
    public static String reverse(String str){
        int i =0;
        int j = str.length()-1;
        char [] temp=new char[j+1];
        for(i=0;i<str.length();i++){
            temp[i]=str.charAt(j);
            j--;
        }
        return new String(temp);
        

    }
    public static void  palindrome(String str1,String str2){
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("yes it is palindrome");

        }
        else{
            System.out.println("no its not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
       String str2= reverse(str);
       palindrome(str,str2);
        
    }
    
}
