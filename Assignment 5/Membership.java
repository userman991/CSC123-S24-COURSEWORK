//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu
import java.util.Scanner;

public class Membership extends Library
{
	Scanner keyboard=new Scanner(System.in);
	//The library requires First Name, Last Name, Date of Birth (MM/DD/YY), City, and Zip code
	//if age is under 18, child. They need a guardian.
	
	private String firstName;
	private String lastName;
	private int age;
	private String city;
	private int zipCode;
	private boolean child;
	private String guardian;
	private Library library;

	
	public Membership(String fName, String lName, int tempAge, String mycity, int myZipCode)
	{
		firstName=fName;
		lastName=lName;
		city=mycity;
		zipCode=myZipCode;
		age=tempAge;
		
	}
	

	
	public void setGuardian()
	{	
		if(age>=18)
		{
		child=false;
		System.out.println("User does not require a Guardian.");
		}
		else
		{
		child=true;
		System.out.println("Enter Guardian: ");
		guardian=keyboard.next();
		}
	}

	public String toString() {
		return "Membership [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", city=" + city
				+ ", zipCode=" + zipCode + ", child=" + child + ", guardian=" + guardian + "]";
	}
	
  	public void setLibrary(Library l) 
  	{		
  		library = l;
  	}
	
}