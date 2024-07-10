class mythread extends Thread{
    int num,val;
    int [] arr;
    mythread(int n,int v,int a[]){
        num=n;
        val=v;
        arr=a;
        System.out.println("name of thread : "+ num);
        start();
    }
    public void run(){
        //multiply();
        
        for(int i=0;i<arr.length;i++){
            arr[i] *=val;
        }
        System.out.println("Thread "+ num + " existing");
    }
    /*void multiply(){
        for(int i=0;i<arr.length;i++){
            arr[i] *=val;
        }
    }*/
}


public class thread_demo8 {
    public static void main(String[] args) throws InterruptedException {
        int arr1[]= {1,2,3,4,5,6};
        int arr2[]={7,8,9,11,12};
        mythread m1 = new mythread(1,2,arr1);
        m1.join();
        mythread m2 = new mythread(2,3,arr2);
       /* try{
            m1.join();
            m2.join();
        }
        catch(Exception e){
            System.out.println(e);
        }*/
        System.out.println("dispalying arr1 and arr2");
for(int i=0;i<arr1.length;i++){
    System.out.print( arr1[i]+" ");
}
System.out.println();
for(int i=0;i<arr2.length;i++){
    System.out.print( arr2[i]+" ");
}
System.out.println("main thread exiting");
    }
    
    
}
