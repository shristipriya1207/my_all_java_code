public class arraySubByItsMean {
    public static void main(String args[]){
        int [][] arr = {{10,23,43},
                        {87,56,34},
                        {34,67,89}};
                        int [][] arr2=new int[3][3];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum +=arr[i][j];
            }
        }
        double mean = (double)sum / (9);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               arr2[i][j] =(int)mean - arr[i][j] ;
               
            }
        }
        for(int x[] : arr2){
            for(int y :x){
                System.out.print(y+ " ");
            }
            System.out.println();
        }
    }
}
