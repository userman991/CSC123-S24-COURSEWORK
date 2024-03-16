//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

import java.util.*;
public class DMV 
{
    private String state;
    private List<Registration> registrations;
    private List<Citation> citations;
    Scanner keyboard = new Scanner(System.in);

    public DMV(String state) 
    {
        this.state = state;
        this.registrations = new ArrayList<>();
        this.citations = new ArrayList<>();
    }

    public void registerVehicle(Owner owner, Vehicle vehicle) 
    {
        try 
        {
            System.out.println("Making Registration...");
            Registration registration = new Registration(generateUniqueID(), new Date(), null, new Owner[]{owner}, vehicle, "Plate");
            registrations.add(registration);
            System.out.println("Vehicle registered for owner: "  + owner.getFirstName() + " " + owner.getLastName());
        } 
        catch (Exception e) 
        {
            System.out.println("Error registering vehicle: " + e.getMessage());
        }
    }

    public void registerCitation(Citation citation) 
    {
        try 
        {
        	
            System.out.println("Making Citation");
            citations.add(citation);
        } 
        
        catch (Exception e) 
        {
            System.out.println("Error registering citation: " + e.getMessage());
        }
    }

    public void listRegistrations()
    {
    	//enhanced for loop since we are using array list
        for (Registration registration : registrations) 
        {
            System.out.println(registration);
        }
    }

    public void listCitations() 
    {
    	
        for (Citation citation : citations)
        {
            System.out.println(citation);
        }
        
    }

    public Registration searchRegistrationByPlate(String plate) 
    {
        for (Registration registration : registrations) 
        {
            if (registration.getPlate()==plate) 
            {
                return registration;
            }
        }
        
        return null;
    }

    public Registration searchRegistrationByID(int uniqueID) 
    {
    	
        for (Registration registration : registrations) 
        {
            if (registration.getUniqueID() == uniqueID) 
            {
                return registration;
            }
        }
        return null;
    }

    public List<Registration> searchRegistrationByOwner(Owner owner) 
    {
        List<Registration> result = new ArrayList<>();
        
        for (Registration registration : registrations) 
        {
            for (Owner regOwner : registration.getOwners()) 
            {
                if (regOwner.equals(owner)) 
                {
                    result.add(registration);
                }
            }
        }
        return result;
    }

    public List<Citation> searchCitationByRegistration(Registration registration) 
    {
        List<Citation> result = new ArrayList<>();
        
        for (Citation citation : citations) 
        {
            if (citation.getRegistration().equals(registration)) 
            {
                result.add(citation);
            }
        }
        return result;
    }

    public List<Citation> searchCitationByOwner(Owner owner) 
    {
        List<Citation> result = new ArrayList<>();
        for (Citation citation : citations) 
        {
            for (Owner citOwner : citation.getRegistration().getOwners()) 
            {
                if (citOwner.equals(owner)) 
                {
                    result.add(citation);
                }
            }
        }
        return result;
    }

    public Citation searchCitationByID(int id) 
    {
        for (Citation citation : citations) 
        {
            if (citation.getId() == id) 
            {
                return citation;
            }
        }
        return null;
    }

    private int generateUniqueID() 
    {
        return registrations.size()+1;
    }
}
