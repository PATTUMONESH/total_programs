package jvmartitecture;

public class MemoryManagement {

    //instance variables
    int orgId=45554;
    int noOfDepts=2;
    //string literals
    String orgName="massil";
    String ceo="monesh";
    //static variables
    static  double netWorth=500.00;
    public static void main(String [] args) throws InterruptedException {
        //local variables
        int eid=101;
        String empName="jhon";
        double salary=500.00;
        MemoryManagement m1=new MemoryManagement();
        m1.getOrgId();
        System.out.println(MemoryManagement.getNetWorth() );
        MemoryManagement m2=new MemoryManagement();
        m2.deleteMemoryManagement(101);
        Thread.sleep(5000);

    }
    public int getOrgId(){
        return orgId;
    }

    public static double getNetWorth(){
        return netWorth;
    }

    public void deleteMemoryManagement(int empid){
     //code
    }
}
