package arrayprograming;

//Java Program to demonstrate the way of passing an array
//to method
public class ArrayP3 {
    //creating a method which receives an array as a parameter
    static void min(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (min > a[i])
            min = a[i];
            System.out.println(min);
        }

        public static void main (String[]args){
            int a[] = {10, 2, 3, 8};   //declaring and initializing an array
            min(a);    //passing array to method
        }
    }

