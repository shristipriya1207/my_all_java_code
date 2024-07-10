import java.util.Scanner;

public class ques2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a password :");
            String pass = sc.next();
            if ((pass.length()) < 7) {
                System.out.println("password must contain more than 7 character ");
                continue;

            }
            boolean status = false;
            for (int i = 0; i < pass.length(); i++) {
                char ch = pass.charAt(i);
                
                if (ch >= 65 && ch <= 91) {
                    status = true;
                    break;

                } else {
                    status = false;
                }
                

            }if (!status) {
                System.out.println("password must contain at least 1 capital letter");
                continue;
            }
            for (int i = 0; i < pass.length(); i++) {
                char ch = pass.charAt(i);
                if(ch == '@' || ch == '#'|| ch == '$'){
                    status = true;
                    break;
                }
                else{
                    status=false;
                
                }
                

            }
            if(!status){
                System.out.println("password must contain special charchter");
                continue;                }
        System.out.println("your password is correct");
        break;

        } while (true);

    }
}
