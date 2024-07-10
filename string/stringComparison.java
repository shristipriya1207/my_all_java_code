import java.util.*;
public class stringComparison {

    public static void compareto(String str1,String str2){
        if(str1.compareTo(str2)!=0){
            System.out.println("Ni hua Equal chl bhag ");
        }
        else{
            System.out.println("ARE hm dono apne bhai bhai");
        }

    }
    public static void comparetoignorecase(String str1,String str2){
        if(str1.compareToIgnoreCase(str2)!=0){
            System.out.println("Ni hua Equal chl bhag ");
        }
        else{
            System.out.println("ARE hm dono apne bhai bhai");
        }

    }
    public static void main(String[] args) {
      String str1 = new String("GeeksforGeeks");
      String str2= new String("Pratcice");
      String str3=new String("Geeks");
      String str4= new String ("Geeks");
      String str5=new String("geeks");
      String str6=null;
      String str7=null;


      System.out.println(str1.equals(str2));
      System.out.println(str3.equals(str4));
      System.out.println(str5.equalsIgnoreCase(str4));  
      //System.out.println(str6.equals(str7));
    System.out.println(Objects.equals(str6,str7));
    System.out.println(Objects.equals(str6,str1));


    compareto(str1,str2);
    compareto(str3,str4);
    comparetoignorecase(str3,str4);
    comparetoignorecase(str3,str5);
    compareto(str3,str5);
System.out.println("=================");

    System.out.println(str1.startsWith("Geeks"));
    System.out.println(str1.startsWith("geeks"));
    System.out.println(str1.startsWith("Geeks",0));
    System.out.println(str1.startsWith("Geeks",5));


    System.out.println(str1.endsWith("Geeks"));
    System.out.println(str1.endsWith("s"));
    boolean n ="hello".endsWith("lo");


    String s1 = new String("Welcome to Geeksforgeeks.com");
    String s2 = new String ("Geeksforgeeks");
    String s3 = new String("GEEKSFORGEEKS");
System.out.println("=================================================");
    System.out.println(s1.regionMatches(11,s2,0,13));
    System.out.println(s1.regionMatches(11,s3,0,13));
    System.out.println(s2.regionMatches(0,s3,0,13));


   System.out.println(s1.regionMatches(11,s2,0,13));
    System.out.println(s1.regionMatches(false,11,s3,0,13));
    System.out.println(s2.regionMatches(true,0,s3,0,13));



String s5 = new String("Welcome to Tutorialspoint.com");
System.out.println(s5.matches("(.*)Tutorials(.*)"));
System.out.println(s5.matches("tutorials"));
System.out.println(s5.matches("(.*).com"));


}
    
}
