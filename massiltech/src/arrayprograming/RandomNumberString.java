package arrayprograming;

import java.util.Random;

public class RandomNumberString {
    public static void main(String[] args) {
        //approach 1 ----> using random class
        Random ran=new Random();
        int rand_num=ran.nextInt();
        System.out.println(rand_num);

//        double rand_num= ran.nextDouble(100);
//        System.out.println(rand_num);

        //approach 2 ------>using math class
        System.out.println(Math.random());






    }
}
