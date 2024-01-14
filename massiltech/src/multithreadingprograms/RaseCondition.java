package multithreadingprograms;

public class RaseCondition {
    public static void main(String[] args) throws InterruptedException {

        BrickDairy bc=new BrickDairy();
        Runnable r1= ()->{
            for (int i=0;i<5000;i+=50){
                bc.incrementCount();
            }
        };

        Runnable r2=()->{
            for (int i=0;i<2000;i+=50){
                bc.incrementCount();
            }
        };

        Runnable r3=()->{
            for (int i=0;i<3000;i+=50){
                bc.incrementCount();
            }

        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();


System.out.println(bc.brickCount);
        System.out.println(bc.brickCount1);

    }
}


class BrickDairy{
    int brickCount=0;
    int brickCount1=0;
    public void incrementCount(){
  synchronized (this){
      brickCount+=50;
  }
       // brickCount+=50;
        brickCount1+=50;
    }


}
