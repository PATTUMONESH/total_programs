package exceptionhandlingprograms;

import java.io.*;

public class ExceptionP1 {
    public static void main(String [] args)throws Throwable,IOException {


        System.out.println("program start");
        int firstNo=10;
        int lastNo=0;
        int result=0;


//        File file=new File("./sample.txt");
//        FileInputStream fli=new FileInputStream(file);
//        InputStreamReader isr=new InputStreamReader(fli);
//        BufferedReader br=new BufferedReader(isr);
//        String text=new String();
//        String line=new String();
//        System.out.println(fli);

//try {
    result = firstNo / lastNo;

//}
//catch (ArithmeticException ae){
//    System.out.println(ae.toString());  // write a logic to enter this message into logfiles.
//
//    throw ae;
//
//}

//finally {
//    System.out.println("finally block");
//}
        System.out.println(result);

        System.out.println("program end");



    }
}
