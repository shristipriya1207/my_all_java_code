public class priority extends Thread {
    public void run(){
        System.out.println("child thread");
        System.out.println(" old child priority "+ Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        System.out.println(" new child priority "+ Thread.currentThread().getPriority());

    }
    public static void main(String[] args) {
        System.out.println(" old main threadpriority "+ Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(" new main threadpriority "+ Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(MIN_PRIORITY);
        // Thread.currentThread().setPriority(MAX_PRIORITY);
        // Thread.currentThread().setPriority(NORM_PRIORITY);
        priority p = new priority();
        p.start();
    }
}
