package arrayprograming;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={1,2,9,10,8};
        System.out.println("array before sorting:"+Arrays.toString(a));
        int n=a.length;
        for (int i=0;i<n-1;i++){       //number of passes
            for(int j=0;j<n-1;j++){   //verifying greater or not if greater swap the element
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("array after sorted:"+Arrays.toString(a));

    }
}
