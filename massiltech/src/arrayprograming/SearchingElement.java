package arrayprograming;

public class SearchingElement {
    public static void main(String[] args) {
        boolean flag=false;
        int a[]={1,2,3,4,5};
        int search_element=5;
        for (int i = 0; i <a.length ; i++) {
            if(search_element==a[i]){
                System.out.println("element found at:"+i);
                flag=true;
            }
        }
        if(flag==false){


            System.out.println("element not found");
        }
    }
}
