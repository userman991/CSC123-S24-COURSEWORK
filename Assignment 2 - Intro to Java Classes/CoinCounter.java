//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

public  class CoinCounter
{

      //declare instance fields as necessary
		private int quarters;
		private int dimes;
		private int nickles;
		private int pennies;
      //Constructor must be declared as follows

      public CoinCounter(int x, int y, int a, int b)
      {
    	  quarters=x;
    	  dimes=y;
    	  nickles=a;
    	  pennies=b;
      }

      public int getDollarAmount()
      {
    	  int total=0;
    	  total=(quarters*25)*(dimes*10)*(nickles*5)*(pennies);
    	  total/=100;//need to round off
    	  return total;
          //  return dollar amount;
      }

      public double getCentsAmount()
      {
    	  int total=0;
    	  total=(quarters*25)*(dimes*10)*(nickles*5)*(pennies);
    	  total%=100;
    	  return total;
          //return cent amount;
      }

}