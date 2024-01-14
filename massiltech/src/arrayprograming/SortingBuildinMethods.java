package arrayprograming;

import java.util.Arrays;
import java.util.Collections;

public class SortingBuildinMethods {
    public static void main(String[] args) {
        //Approach -->1
//        int[] a={5,7,8,2,3};
//        System.out.println("Array before sorting:"+Arrays.toString(a));
//        Arrays.parallelSort(a);
//        System.out.println("Array sfter sorting:"+Arrays.toString(a));

        //Approach -->2
//        int[] a={5,8,4,6,1};
//        System.out.println("Array before sorting:"+Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println("Arrays after sorting:"+Arrays.toString(a));

        //Approach  -->3 reverse order using Collections.reverseOrder();

        Integer a[]={1,4,2,3,80};
        System.out.println("Array before sorting :"+Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Array after sorting:"+Arrays.toString(a));

    }

}
