import java.util.*;
public class Membership 
{
	//The library requires First Name, Last Name, Date of Birth (MM/DD/YY), City, and Zip code
	//if age is under 18, child. They need a guardian.
	private String firstName;
	private String lastName;
	private int age=0;
	private String city;
	private int zipCode;
	private boolean child;
	private String guardian;

	
	public Membership(String fName, String lName,int age, String mycity, int myZipCode)
	{
		firstName=fName;
		lastName=lName;
		city=mycity;
		zipCode=myZipCode;
		age=this.age;
		
		if(age<18)
		{
			child=true;
		}
		
	}
	
	public void setGuardian(String guardian)
	{
		if(child=true)
		{
		System.out.println("Enter Guardian: ");
		guardian=this.guardian;
		}
		else
		System.out.println("User does not require a Guardian.");
	}
	
	
	
	

	
}
