package multithreadingprograms;

public class UnanimousClass {
    public static void main(String [] args){
        Runnable r1=new Runnable() {

            public void run() {
                System.out.println("hello");
                System.out.println(Thread.currentThread().getName()+">>>>>"+Thread.currentThread().getId());
            }
        };

    Runnable r2=new Runnable() {
        public void run() {
            System.out.println("hello monesh");
            System.out.println(Thread.currentThread().getName()+">>>>>"+Thread.currentThread().getId());
        }
    };
    Thread t1=new Thread(r1,"hi");
    Thread t2=new Thread(r2,"urs");
    t1.start();
    t2.start();
    System.out.println(Thread.activeCount());


}}
