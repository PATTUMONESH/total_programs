package arrayprograming;

public class MaximumMinimumElements {
    public static void main(String[] args) {

        //maximum element in an array
//        int a[]={1,2,3,7,5,6};
//        int max=a[0];
//        for (int i = 0; i < a.length; i++) {
//
//            if (a[i]>max) {
//                max=a[i];
//            }
//        }
//        System.out.println("maximum number:"+max);

//minimum element in an array
        int a[]={4,5,1,3,8,1};
        int min=a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("minimum number:"+min);

    }
}
