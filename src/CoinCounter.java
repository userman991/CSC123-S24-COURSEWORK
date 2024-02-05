//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

import java.util.Scanner;
public class CoinCounter 
{
	public static void main(String[] args) 
	{
		double total=0;
		int dollars=0;
		double cents=0;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("enter the number of pennies: "); 
		int pennies=keyboard.nextInt();
		total+=pennies*0.01;
		System.out.println("enter the number of nickles: "); 
		int nickles=keyboard.nextInt();
		total+=nickles*0.05;
		System.out.println("enter the number of dimes: "); 
		int dimes=keyboard.nextInt();
		total+=dimes*0.10;
		System.out.println("enter the number of quarters: "); 
		int quarters=keyboard.nextInt();
		total+=quarters*0.25;
		System.out.println("Total:"+total);
		dollars=(int)total;
		cents=total-dollars;
		System.out.println("Dollars:"+dollars+" Cents:"+cents);


	}

}
