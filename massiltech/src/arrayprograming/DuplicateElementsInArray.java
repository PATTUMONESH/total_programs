package arrayprograming;

import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
//        String arr[]={"monesh","kala","uma","vijay"};
//
//        boolean flag=false;
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]==arr[j]) {
//                    System.out.println("duplicate element found:" + arr[i]);
//                    flag = true;
//                }
//            }
//        }
//
//        if (flag == false) {
//            System.out.println("duplicate element not found");
//
//        }


        HashSet <String>hash=new HashSet<>();
        String arr[]={"java","python","java","c++"};

        boolean flag=false;
        for (String variable:arr) {
            if(hash.add(variable)==false){
                System.out.println("found duplicate element:"+variable);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("not found duplicate element");
        }

    }
}
