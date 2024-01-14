package multithreadingprograms;

public class TestMultithreading {


    public static void main(String [] args){
        Employee emp=new Employee();
        Thread t1=new Thread(emp);

        Manager mng=new Manager();
        Thread m1=new Thread(mng);

        //System.out.println(Thread.activeCount());
        t1.start();
        m1.start();
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName()+"********************");
        //System.out.println(Thread.activeCount());

    }

}
class Employee extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+">>>>"+Thread.currentThread().getId());
        System.out.println("hello");
    }
}
class Manager extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+">>>>"+Thread.currentThread().getId());
        System.out.println("hi manager");
    }
}


