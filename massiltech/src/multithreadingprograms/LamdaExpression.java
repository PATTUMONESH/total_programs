package multithreadingprograms;

public class LamdaExpression {
    public static void main(String [] args) throws InterruptedException {
        Runnable r1 = () -> {
            for (int i=0;i<10;i++) {
                //System.out.println(Thread.currentThread().getName() + ">>>>>" + Thread.currentThread().getId());
            }
        };
        Runnable r2 = () ->{
            for (int i=0;i<20;i++) {
                //System.out.println(Thread.currentThread().getName() + ">>>>>" + Thread.currentThread().getId());
            }
        };
        Thread t1 = new Thread(r1,"mo");
        System.out.println(t1.getState());
        Thread t2 = new Thread(r2,"ji");
        t1.start();
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
        //t1.sleep(10000);
        //System.out.println(t1.getState());
        t2.start();
        //t1.start();   -----> we can't run the thread again once it is dead
        //System.out.println(Thread.activeCount());
        //System.out.println(t1.getState());

    }
}
