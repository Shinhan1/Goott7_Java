package d20191223_Arr;

public class Test20191223 {
   
   public static void main(String[] args) {
      int money = 2680;
      int[] coin = {500, 100, 50, 10};
      
      System.out.println("투입된 돈 : " + money);
      
      for(int i = 0; i < coin.length; i++)  {
    	  System.out.println("거스름돈 : " + coin[i] + " 원권  : " + money/coin[i]);
    	  money %=coin[i];
      }
      
   }
   

}