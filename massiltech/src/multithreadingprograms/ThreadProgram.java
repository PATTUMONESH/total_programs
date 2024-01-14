package multithreadingprograms;

public class ThreadProgram {
    public static void main(String [] args){
        System.out.println("hello world");
        System.out.println(Thread.currentThread().getName());  //thread name
        System.out.println(Thread.currentThread().getId());    //thread id
        System.out.println(Thread.activeCount());        //no of active thread
        System.out.println(Thread.currentThread().getPriority());   //priority range from 1 to 10
    }
}
