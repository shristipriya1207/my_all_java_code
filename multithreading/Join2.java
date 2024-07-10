class first extends Thread{
    Thread firstThread;
    public void run(){
        try{
            System.out.println("first class before sleep");
        Thread.sleep(1000);
        System.out.println("first class after sleep");

        }
        catch(Exception e){
            System.out.println(e);
        }

        

    }
}
class second extends Thread{
    Thread secondThread;
    public void run(){
        try{
            System.out.println("second class before sleep");
        Thread.sleep(1000);
        System.out.println("second class after sleep");

        }
        catch(Exception e){
            System.out.println(e);
        }

        

    }
}  


public class Join2  {
    public static void main(String[] args)  throws InterruptedException{
        first f = new first();
        f.start();
        f.join();
        second s = new second();
        s.start();
        s.join();
        System.out.println("Completed ");
    }
    
}
