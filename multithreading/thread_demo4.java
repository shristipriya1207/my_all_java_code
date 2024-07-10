class mythread extends  Thread{
int num;
mythread(int n){
    num=n;
    start();
}
public void run(){
    for(int i=0;i<5;i++){
        System.out.println("thread-"+num+" = "+i);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
    }
}
}
public class thread_demo4 {
   public static void main(String[] args) {
    mythread m1 = new mythread(1);
    mythread m2 = new mythread(2);
    mythread m3 = new mythread(3);
    try{
        m1.join();
        m2.join();
        m3.join();
    }catch(Exception e){}
    for(int i=0;i<5;i++){
        System.out.println("main thread");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
    }
    System.out.println("m1= "+ m1.isAlive());
    System.out.println(Thread.currentThread().isAlive());

   } 
}
