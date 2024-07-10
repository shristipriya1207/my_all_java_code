public class Sleep extends Thread {
    public void run(){
        for(int i = 0;i<5;i++){
            try{
                // System.out.println(i);
                Thread.sleep(1000);
                System.out.println(i+" : "+ Thread.currentThread().getName());
            
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Sleep s1 = new Sleep();
        Sleep s2 = new Sleep();
        s1.start();
        s2.start();
    }

    
}



/*public class Sleep extends Thread {
   
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            try{
                // System.out.println(i);
                Thread.sleep(1000);
                System.out.println(i);
            
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    
}*/
