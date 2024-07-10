public class practice2 implements Runnable {
    public void run(){
        System.out.println("Task");
    }


    public static void main(String[] args) {
        practice2 p1 = new practice2();
        Thread t1 = new Thread(p1);
        t1.start();
        // t1.start();

    }
}
