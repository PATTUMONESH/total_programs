package jvmartitecture;

public class outOfMemoryHeapArea {
    public static void main(String[] args){
        int size=10;
        for(int i=0;i<Integer.MAX_VALUE;i++)
        {
            int [] arr=new int[size];
            size *=2;
        }

    }
    public void add(int i){
        System.out.println(i);
        i++;
        if (i<10000)
            add(i);
    }


}
