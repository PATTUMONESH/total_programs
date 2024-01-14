package arrayprograming;

public class ArrayP4 {

    static void max(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++)
        if(max<a[i])
            max=a[i];
        System.out.println(max);
    }
    public static void main(String [] args){
        int a[]={4,5,7,8};
        max(a);
    }


}
