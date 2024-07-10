class book{
    int totalseat=10;
 /*synchronized   void bookseats(int s){
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getName());

        if(totalseat>=s){
            System.out.println(s+"    seats booked succesfully");
            // System.out.println("seats left :");
            totalseat=totalseat-s;
            System.out.println("left seat "+totalseat);
        }
        else{
            System.out.println("cannot booked");
            System.out.println( "left seat "+totalseat);

        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getName());


    }*/

    void bookseats(int s){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    synchronized(this){
            if(totalseat>=s){
                System.out.println(s+"    seats booked succesfully");
                // System.out.println("seats left :");
                totalseat=totalseat-s;
                System.out.println("left seat "+totalseat);
            }
            else{
                System.out.println("cannot booked");
                System.out.println( "left seat "+totalseat);
    
            }
        }
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
    
            System.out.println(Thread.currentThread().getName());
    
    
        }


}

public class BookSeat_Sync  extends Thread{
   static book b;
    int seat;
    public void run(){
        b.bookseats(seat);
    }
    public static void main(String[] args) {
        b = new book();
        BookSeat_Sync b1 = new  BookSeat_Sync();
        b1.seat=7;
        b1.start();
        BookSeat_Sync b2 = new  BookSeat_Sync();
        b2.seat=6;
        b2.start();


    }
    
}
