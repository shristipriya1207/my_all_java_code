public class daemonThread extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("this is daemon thread");
        }
        else{
            System.out.println("child thread");
        }
    

    }
    public static void main(String[] args) {
       System.out.println("main thread");
        daemonThread d1 = new daemonThread();
      //  d1.setDaemon(true);
        d1.start();
       // d1.setDaemon(true);
    }
}
