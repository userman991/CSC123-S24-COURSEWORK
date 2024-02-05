//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu
import java.util.Scanner;

public class ChangeMaker 
{
	public static void main(String[] args) 
	{
		Scanner keyboard=new Scanner(System.in);
		int uDollar=0;
		int uCents=0;

		int dollars=100;
		int quarters=25;
		int dimes=10;
		int pennies=1;
		System.out.println("enter the number of dollars: "); 
		uDollar=keyboard.nextInt();
		System.out.println("enter the number of cents: "); 
		uCents=keyboard.nextInt();
		
		System.out.println("Dollars: "+uDollar+" Cents: "+uCents);
		
		int finQ=0,finD=0,finP=0;
		uDollar*=dollars;
		finQ=uDollar/quarters;
		finD=uCents/dimes;
		uCents-=finD*dimes;
		finP=uCents/pennies;
		
		
		System.out.println("Quarters: "+finQ+" Dimes: "+finD+  " Pennies: "+finP);

	}

}
