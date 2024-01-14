package multithreadingprograms;

public class ClassExtends1 {
    public static void main(String [] args) throws InterruptedException {
        Employees t1=new Employees("T1");
        Managers t2=new Managers("T2");
        t1.start();
        //t1.join();
      //  t1.sleep(10000);
        t2.start();
        //System.out.println(Thread.activeCount());
    }
}
class Employees extends Thread{
    public Employees(String tName){
       super(tName);
    }
    @Override
    public void run(){


        for (int i=0;i<10;i++){
       System.out.println(Thread.currentThread().getName()+">>>>>"+Thread.currentThread().getId());
        //System.out.println("hi employee");
    }}
};
class Managers extends Thread{

    public Managers(String tName){
        super(tName);
    }

    @Override
    public void run(){

        for (int i=0;i<10;i++){
        System.out.println(Thread.currentThread().getName()+">>>>"+Thread.currentThread().getId());
        //System.out.println("hi manager");

    }}

};
