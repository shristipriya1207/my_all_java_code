import java.util.Arrays;

public class arraySwapping {
    public static void main(String args[]){
        int [] arr={2,3,4,5,6,};
        swap(arr,3,4);
        System.out.println("After swaping the element of array");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("After the reversing the element");

        System.out.println(Arrays.toString(arr));



        
    }
    static void reverse(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
static void swap(int [] arr,int a,int b){
    int temp;
    temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;

}
}
