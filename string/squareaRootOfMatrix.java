import java.util.*;
public class squareaRootOfMatrix {
    public static double squareroot(int arr3[]){
        int square = 0;
        for(int i=0;i<6;i++){
            
             square = square + arr3[i]*arr3[i];
            }
            System.out.println("total sqaure"+ square);
            double root = Math.sqrt(square);
            return root;
    }
    public static double[][] finalArray(double sq , int arr[][]){
        double arr5[][] = new double[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr5[i][j] = arr[i][j]/sq;
            }
        }
        return arr5;
    }
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the elements of matrix :");
    int arr[][]= new int[2][3];
    int arr3[] = new int[6];
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
           

            arr[i][j]= sc.nextInt();
           
        }
    }
    int t1 =0;

    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            // System.out.println("erroe");
          arr3[t1]=arr[i][j];
            t1++;
        }
    }
    // int arr1[][]=new int[2][3];
        double sq = squareroot(arr3);
    System.out.println(sq);
    double arr4[][]= finalArray(sq,arr);
for(int i=0;i<2;i++){
    for(int j=0;j<3;j++){
        System.out.print(arr4[i][j] + "    ");
    }
    System.out.println();
}

   }
}
