package arrayprograming;

public class Fruits {
    private  int mango;
    private int apple;

    public int getMango() {
        return mango;
    }

    public void setMango(int mango) {
        this.mango = mango;
    }

    public int getApple() {
        return apple;
    }

    public void setApple(int apple) {
        this.apple = apple;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "mango=" + mango +
                ", apple=" + apple +
                '}';
    }

    public static void main(String[] args){
         Fruits[] fruitList = new Fruits[5];
         Fruits same=new Fruits();
         same.setApple(5);
         same.setMango(1);
         fruitList[0]=same;
         Fruits same1=new Fruits();
         same1.setMango(2);
         same1.setApple(5);
         fruitList[1]=same1;

         System.out.println(fruitList);
      for(int i=0;i< fruitList.length;i++)
      {
          if(null!=fruitList[i]){
              System.out.println(fruitList[i].toString());
          }

      }


    }
}
