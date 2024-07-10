public class varArgs {
    static int sum(int ...arr){
        int result=0 ;
        for(int i : arr){
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,4));
        System.out.println(sum());

    }
    
}
