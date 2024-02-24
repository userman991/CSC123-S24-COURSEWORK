//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

public  class ChangeMaker
{

	private int bills;
	private int coins;

      public ChangeMaker(int dollars, int cents)
      {
    	  bills=dollars;
    	  coins=cents;
      }

      public int getQuarters(){
    	  int total;
          int quarters;
    	  quarters=bills*100;
    	  quarters=quarters/25;
          total=coins/25;
          total=quarters+total;
          return total;
      }

      public int getDimes()
      {
       	  int total;
          int dimes;
    	  dimes=bills*100;
    	  dimes=dimes/10;
          total=coins/10;
          total=dimes+total;
          return total;
      }

      public int getNickles(){

       	  int total;
          int nickles;
    	  nickles=bills*100;
    	  nickles=nickles/5;
          total=coins/5;
          total=nickles+total;
          return total;
      }

      public int getPennies(){

       	  int total;
          int pennies;
    	  pennies=bills*100;
    	  pennies=pennies/1;
          total=coins/1;
          total=pennies+total;
          return total;
      }

}