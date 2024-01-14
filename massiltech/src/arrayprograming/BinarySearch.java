package arrayprograming;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//Approach 1    --->using logic
//        int a[]={1,2,3,4,5,6,7,8,9};
//        int key=50;
//        int low=0;
//        int high=a.length-1;
//        boolean flag=false;
//        while(low<=high){
//            int mid=(low+high)/2;
//            if(a[mid]==key){
//                System.out.println("element found");
//                flag=true;
//                break;
//            }
//            if(a[mid]<key){
//                low=mid+1;
//            }
//            if(a[mid]>key){
//                high=mid-1;
//            }
//        }
//        if(flag==false){
//            System.out.println("element not found");
//        }




        //approach 2   ----->using Arrays.binarySearch()

        int a[]={1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.binarySearch(a,5));



    }
}
