public class Interrupted extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
                // interrupt();
            }
        }
        catch(Exception e){
            System.out.println("catched   "+e);
        }
    }
    public static void main(String[] args)throws Exception {
        Interrupted i = new Interrupted();
        i.start();
        // i.join();
        i.interrupt();

    }
}



/*public class Interrupted extends Thread{
    public void run(){
       // System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());

        try{
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
                //System.out.println(Thread.interrupted());

            }
        }
        catch(Exception e){
            System.out.println("catched   "+e);
        }
    }
    public static void main(String[] args) {
        Interrupted i = new Interrupted();
        
        System.out.println(Thread.currentThread().isInterrupted());


        i.start();
        i.interrupt();

    }
}*/