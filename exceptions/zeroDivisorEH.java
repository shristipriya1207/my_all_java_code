public class zeroDivisorEH {
    public static void main(String args[]) {
        int[] num = { 4, 8, 16, 32, 64, 128 };
        int[] den = { 2, 0, 4, 4, 0, 8 };
        /*  for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] / den[i]);

            } 
            catch (ArithmeticException e) {
                System.out.println("can't divide by zero");
            }
        }  */




       /*  try{
            for(int i=0;i<num.length;i++){
                System.out.println(num[i] / den[i]);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("can't divide by zero");
        } */



        int[] num1 = { 4, 8, 16, 32, 64, 128 ,256,512};
        int[] den1 = { 2, 0, 4, 4, 0, 8 };


     /*    for (int i = 0; i < num1.length; i++) {
            try {
                System.out.println(num1[i] / den1[i]);

            } 
            catch (ArithmeticException e) {
                System.out.println("can't divide by zero");
            }
            catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("NO matching element");
            }
            
        } */



      /*   int [] temp = null;
        for(int i=0;i<num1.length;i++){
            try{
                if(i==0){
                    System.out.println(temp.length);
                }
                System.out.println(num1[i]/den1[i]);
            }
            catch(Exception e){
                System.out.println(e);
            }
            catch(Throwable a){
                System.out.println(a);
            }
        }
*/



int [] num2 ={4,8,16,32,64,128,256,512};
int [] den2 ={2,0,4,4,0,8};
int [] temp = null;

try{
    for(int i=0;i<num2.length;i++){
        try{
           /*  if(i==0){
                System.out.println(temp.length);
            } */
            System.out.println(num2[i]/den2[i]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
    }
    
}
catch(ArithmeticException e){
System.out.println(e);
}
catch(NullPointerException n){
    System.out.println(n);
}








    }

}
