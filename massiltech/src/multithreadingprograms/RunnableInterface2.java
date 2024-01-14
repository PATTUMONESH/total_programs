package multithreadingprograms;

public class RunnableInterface2 {
    public static void main(String[] args){
        Mone m1=new Mone();
        Thread t1=new Thread(m1,"thr");
        t1.start();

        Vijay v1=new Vijay();
        Thread t2=new Thread(v1,"HI");
        t2.start();
        System.out.println(Thread.activeCount());
    }
}

 class Mone implements Runnable{


    @Override
    public void run(){

        System.out.println(Thread.currentThread().getName()+">>>>>>"+Thread.currentThread().getId());

    }
}
class Vijay implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+">>>>>>>>>>>>"+Thread.currentThread().getId());
    }
}
