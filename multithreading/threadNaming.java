/*public class threadNaming{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
         Thread.currentThread().setName("shristi");
         System.out.println(Thread.currentThread().getName());
        System.out.println();
        System.out.println(10/0);
    }
}*/




public class threadNaming extends Thread{
    public void run(){
        System.out.println("thread task");
        System.out.println("thread task is executed by :"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
       threadNaming t1 = new threadNaming();
       t1.start();
       t1.setName("shristi");
       System.out.println("main thread is executing :"+Thread.currentThread().getName()); 
       /*threadNaming t2 = new threadNaming();
       t2.start();*/
       System.out.println(t1.isAlive());
       System.out.println(Thread.currentThread().isAlive());
    }
}