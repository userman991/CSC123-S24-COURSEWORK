//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu
import java.util.*;

	public class Main {
	
    public static void main(String[] args) {
        DMV dmv = new DMV("CA");
        Owner owner1 = new Owner("John", "Doe", "123 Main St", "town1", "1234");
        Owner owner2 = new Owner("Jorge", "Smith", "1092 Side St", "town2", "4718");

        Vehicle vehicle1 = new Vehicle("12345", new Date(), "Toyota", "Corolla", "Black", 4);
        Vehicle vehicle2 = new Vehicle("67891", new Date(), "Honda", "Civic", "Red", 4);

        dmv.registerVehicle(owner1, vehicle1);
        dmv.registerVehicle(owner2, vehicle2);

        Citation citation = new Citation(new Date(), 123, 100.0, "Pending", dmv.searchRegistrationByID(1));
        dmv.registerCitation(citation);

        System.out.println("Registrations:");
        dmv.listRegistrations();

        System.out.println("Citations:");
        dmv.listCitations();

        System.out.println("Registrations for owner John Doe:");
        for (Registration registration : dmv.searchRegistrationByOwner(owner1)) 
        {
            System.out.println(registration);
        }

        System.out.println("Citations for owner John Doe:");
        for (Citation cit : dmv.searchCitationByOwner(owner1)) 
        {
            System.out.println(cit);
        }
        System.out.println("Citation with ID 1:");
        System.out.println(dmv.searchCitationByID(1));
    }
}
