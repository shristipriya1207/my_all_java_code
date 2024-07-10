
public class practice1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
       practice1 p1 = new practice1();
       p1.start();
    //    p1.start();
    practice1 p2 = new practice1();
    p2.start();
    }
}