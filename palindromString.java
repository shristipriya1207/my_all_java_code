public class palindromString {
    static boolean palindrome(String s){
        s = s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            char start= s.charAt(i);
            char end= s.charAt(s.length() - 1 -i);
            if(start!=end){
                return false;
            }
        
        }
        return true;
    }
    public static void main(String args[]){
        String str ="abcdcba";
        System.out.println(palindrome(str));
    }
}
// static boolean palindrome(String s){
//     s = s.toLowerCase();
//     for(int i=0;i<s.length()/2;i++){
//         char start= s.charAt(i);
//         char end= s.charAt(s.length() - 1 -i);
//         if(start!=end){
//             return false;
//         }
//         return true;
//     }



    

