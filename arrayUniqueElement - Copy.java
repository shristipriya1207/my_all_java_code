public class arrayUniqueElement {
    static void sort(int arr1[],int a){
        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-1-i;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] arr1=new int[9];
        int[] arr2=new int[9];
        int [][] arr={{10,20,20},
                      {10,0,30},
                      {30,14,20}};
            int t=0;          
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[t]=arr[i][j];
                t++;
            }
        }
        sort(arr1,9);
        for(int i=0;i<9;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int t1=0;
        for(int i=0;i<9;i++){
            if(i==0){
                arr2[t1]=arr1[i];
                t1++;
                continue;
            }
            else if(arr1[i-1]!=arr1[i]){
                arr2[t1]=arr1[i];
                t1++;
                
            }
           
        }
         for(int i=t1;i<9;i++){
               arr2[i]=-1; 
               t1++;
            }
        
        for(int i=0;i<9;i++){
            if(arr2[i]!= -1){
                System.out.print(arr2[i]+" ");
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
