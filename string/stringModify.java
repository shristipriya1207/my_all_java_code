

public class stringModify {
    public static void main(String[] args) {
        String str = "java java";
        String result = str.concat(" guides");
        System.out.println(result);


        result=str.replace('a','o');
        System.out.println(result);



        result = str.substring(6);
        System.out.println(result);
       String result2 = str.substring(2,6);
        System.out.println(result2);



        String lower = str.toLowerCase();
        String upper = str.toUpperCase();
        System.out.println(lower);
        System.out.println(upper);



        String str1 = "    java java   ";
        String result3 = str1.trim();
        System.out.println(result3);



        String str3 = "hello,shristi";
        String [] result4 = str3.split(",");
        System.out.println(result4[1]);



        String result5 = String.join("-",str1,str3);
        System.out.println(result5);




 



        


    }
}
