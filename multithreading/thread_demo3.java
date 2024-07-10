

class Mythread extends Thread{
    String name ;
    Mythread(String n){
        name = n;
        this.start();
    }
    public void run(){
        System.out.println(name+" Starting");
        for(int i =0;i<5;i++){
            System.out.println(name + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
        
        System.out.println(name+" terminating");
    }


}


public class thread_demo3 {
    public static void main(String[] args) {
        Mythread m = new Mythread("child");
        for(int i =0;i<5;i++){
            System.out.println("main "+ i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
        
        System.out.println("main terminating");

    }
    
}
