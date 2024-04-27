
public class Membership 
{
	//The library requires First Name, Last Name, Date of Birth (MM/DD/YY), City, and Zip code
	//if age is under 18, child. They need a guardian.
	private String firstName;
	private String lastName;
	//private String birthDay;
	//maybe simpledateformat later.
	private String city;
	private int zipCode;
	
	public Membership(String fName, String lName, String mycity, int myZipCode)
	{
		firstName=fName;
		lastName=lName;
		city=mycity;
		zipCode=myZipCode;
	}
	
	
	
}
