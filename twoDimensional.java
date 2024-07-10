import java.util.*;
public class twoDimensional {
    public static void main(String args[]){
    int r=0;
    int c=0;

    // int[][] arr=new int[r][];
    System.out.println("Enter the size of row");
    Scanner scc =new Scanner(System.in);
    r=scc.nextInt();

    System.out.println("Enter the size of column");
    c=scc.nextInt();
    int[][] arr=new int[r][c];
System.out.println("enter the elements of matrix: ");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
arr[i][j]=scc.nextInt();
        }
    }


for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
System.out.print(arr[i][j] + " ");
        }
        System.out.println("");
    }

    for(int i=0;i<arr.length;i++){
        
        System.out.println(Arrays.toString(arr[i]));
    }
for(int [] a : arr){
    System.out.println(Arrays.toString(a));
}



int [][] arr1 = {{1,2,3,4},
{5,6},
{7,8,9}};

for(int [] b : arr1){
    System.out.println(Arrays.toString(b));
}
    }
}


