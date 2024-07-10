public class StringSearching {
  public static void main(String[] args) {
    String str=new String("Searches for the first occurrence of a character or substring");
    System.out.println(str.indexOf('S'));
    System.out.println(str.lastIndexOf('s'));
    System.out.println(str.indexOf('s',15));
    System.out.println(str.lastIndexOf('s',10));
    System.out.println(str.lastIndexOf("first"));
    System.out.println(str.lastIndexOf("for",20));
    System.out.println(str.indexOf("Sea"));
    System.out.println(str.contains("for"));
    System.out.println(str.contains("apple"));
    System.out.println(str.contains("appple"));
  }  
}
