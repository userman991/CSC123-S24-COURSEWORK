//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

import java.util.*;

public class Owner
{
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zip;

    public Owner(String firstName, String lastName, String address, String city, String zip) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
