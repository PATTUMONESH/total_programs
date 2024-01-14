package arrayprograming;

public class ArrayP1 {

    public static void main(String[] args){
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        //for loop
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }


        System.out.println();

        //for each
        for (int i:arr) {
            System.out.println(i);

        }


    }


}
