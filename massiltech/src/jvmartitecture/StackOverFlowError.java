package jvmartitecture;

public class StackOverFlowError {


    public static void main(String [] args){

        new StackOverFlowError().add(1);


    }

    public void add(int i){
        System.out.println(i);
        i++;
        add(i);




    }
}
