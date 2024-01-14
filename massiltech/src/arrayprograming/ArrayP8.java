package arrayprograming;
//Java Program to illustrate the use of multidimensional array
public class ArrayP8 {
    public static void main(String [] args) {
        //declaring and initializing 2D array
        int[][] arr = {{1, 2, 3}, {3, 2, 1}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {

            //printing 2D array 
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();


        }
    }
}
