package arrayprograming;

public class MissingElementINArray {
    public static void main(String[] args) {

        //array should not have duplicates
        //array no need to be sorted order
        //values should be in range
        int a1[]={1,2,3,4,5,7};
        int sum1=0;
        for (int i=0;i<a1.length;i++){
            sum1=sum1+a1[i];
        }
        System.out.println(sum1);

        int sum2=0;
        for (int i = 1; i <=7 ; i++) {

            sum2=sum2+i;
        }
        System.out.println(sum2);
        System.out.println("missing element in an array:"+(sum2-sum1));

    }
}
