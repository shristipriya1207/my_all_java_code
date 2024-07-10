public class stringCharacterExtraction{
    
public static char charat(String str,int index){
    return str.charAt(index);
}
public static char tochararray(String str,int index){
    return str.toCharArray()[index];
}
public static char codepointat(String str,int index){
    return (char)str.codePointAt(index);
}
public static char getchar(String str,int index){
    char [] buf = new char[4];
    str.getChars(index,index+1,buf,0);
    System.out.println(buf);
    return buf[0];
}

public static void main(String[] args) {
    String str = "this is string character extraction";
    int index= 5;
    char ch =charat(str,index);
    System.out.println("character :"+ ch);
    ch = tochararray(str,index);
    System.out.println("character :"+ ch);
    ch = codepointat(str,index);
    System.out.println("character :"+ ch);
    ch=getchar(str,index);
    System.out.println("character :"+ ch);


}
}