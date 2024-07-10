/*public class Join extends Thread {
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("child "+ i);
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Join j = new Join();
        j.start();
       // j.join();
        try{
            for(int i=0;i<5;i++){
                j.join();
                System.out.println("main "+ i);
                Thread.sleep(1000);
               // j.join();
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}*/





public class Join extends Thread {
    static Thread mainthread;   // instance variable
    public void run(){
        try{
            mainthread.join();    // this will stop , it will allow to execute first main thread then child will be execute.

            for(int i=0;i<5;i++){
                   // this will stop , it will allow to execute first main thread then child will be execute.
                System.out.println("child "+ i);
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        mainthread = Thread.currentThread();   // reference of main thread
        Join j = new Join();
        j.start();
       
        try{
            for(int i=0;i<5;i++){
            
                System.out.println("main "+ i);
                Thread.sleep(1000);
               
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
