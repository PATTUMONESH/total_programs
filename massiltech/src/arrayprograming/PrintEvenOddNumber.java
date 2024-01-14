package arrayprograming;

public class PrintEvenOddNumber {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.println("even numbers are:");
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0)
                System.out.println(a[i]);
        }
        System.out.println("odd numbers are:");
        for(int i=0;i<a.length;i++){
            if (a[i]%2!=0)
                System.out.println(a[i]);
        }
        //foreach
        System.out.println("even numbers are:");
        for (int value:a) {
            if(value%2==0)
                System.out.println(value);
        }
        System.out.println("odd numbers are:");
        for (int value :a) {
            if (value%2!=0)
                System.out.println(value);

        }

    }


}
