package PracticePrograming;

public class SumOfDigits {

    public static void main(String [] args){
        int num=12345;
        int sum=0;
        while(num>0){
            sum=sum+num%10;     //5+4+3+2+1=15
            num=num/10;       //1234 123 12 1 0
        }
        System.out.println(sum);
    }
}
