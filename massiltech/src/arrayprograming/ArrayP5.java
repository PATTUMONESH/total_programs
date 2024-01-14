package arrayprograming;

//Java Program to demonstrate the way of passing an anonymous array
//to method.

public class ArrayP5 {
    //creating a method which receives an array as a parameter
    static void printArray(int arr[]){
         for (int i=0;i< arr.length;i++)
             System.out.println(arr[i]);
     }

     public static void main(String[] args){
         printArray(new int[]{1,7,5,8});//passing anonymous array to method


     }



}
