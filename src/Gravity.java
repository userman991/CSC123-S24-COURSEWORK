//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu
import java.util.Scanner;
public class Gravity 
{
	public static void main(String[] args) 
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter the initial position (height) in meters from where the object was dropped: ");
		double h=keyboard.nextDouble();
		System.out.println("Enter the observation time in seconds: ");
		double t=keyboard.nextDouble();
		double xOfT;
		xOfT=0.5*(-9.81*(t*t))+(0*t)+h;
		System.out.println("The object was dropped from "+h+" meters and has fallen "+xOfT+" meters in "+t+" seconds");	
		System.out.println("having fallen "+xOfT+" meters the distance from the ground now is "+(h-xOfT));
	}

}
