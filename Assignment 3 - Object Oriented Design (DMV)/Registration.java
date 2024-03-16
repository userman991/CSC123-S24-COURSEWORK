//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu
import java.util.*;

public class Registration 
{
    private int uniqueID;
    private Date startDate;
    private Date endDate;
    private Owner[] owners;
    private Vehicle vehicle;
    private String plate;

    public Registration(int uniqueID, Date startDate, Date endDate, Owner[] owners, Vehicle vehicle, String plate) 
    {
    	this.uniqueID = uniqueID;
    	this.startDate = startDate;
    	this.endDate = endDate;
    	this.owners = owners;
    	this.vehicle = vehicle;
    	this.plate = plate;
	
    }

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Owner[] getOwners() {
		return owners;
	}

	public void setOwners(Owner[] owners) {
		this.owners = owners;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

}