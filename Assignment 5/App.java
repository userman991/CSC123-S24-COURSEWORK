//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu
import java.util.*;
public class App {

	public static void main(String[] args) 
	{
		Library lib=new Library();
		Scanner keyboard=new Scanner(System.in);
		System.out.println("NOTE:Your input will be forced into an integer.");
		System.out.println("1 – New Membership");
		System.out.println("2 – Add Material");
		System.out.println("3 – Issue Item");
		System.out.println("4 – Return Item");
		System.out.println("5 – Report Inventory");
		System.out.println("6 – Report Loans");
		System.out.println("7 – Lookup Membership");
		System.out.println("8 – Exit");
		System.out.println("Please enter your choice:");
		
		float x;
		x=keyboard.nextFloat();
		int choice;
		choice=(int)x;
		
		
		while (x<0||x>8)
		{
			System.out.println("You selected: "+choice+", Invalid.");
			System.out.println("NOTE: Please ensure your choice is one of the presented options.");
			System.out.print("Please try again: ");
			x=keyboard.nextFloat();
			choice=(int)x;
		}
		
		
		switch(choice)
		{
		case 1:
			String fName;
			String lName;
			int age;
			String mycity;
			int zip;
			System.out.println("You selected: "+choice+", New Membership");
			
			System.out.println("First Name: ");
			fName=keyboard.next();
			
			System.out.println("Last Name: ");
			lName=keyboard.next();
			System.out.println("NOTE:Your input will be forced into an integer.");
			System.out.println("Age: ");
			float tempAge;
			tempAge=keyboard.nextFloat();
			age=(int)tempAge;
			System.out.println("City: ");
			mycity=keyboard.next();
			System.out.println("Zip: ");
			float tempZip;
			tempZip=keyboard.nextFloat();
			zip=(int)tempZip;			
			Membership test=new Membership(fName,lName,age, mycity,zip);
			test.setGuardian();
			String result=test.toString();
			System.out.print(result);
			//test.setLibrary(lib);
			//lib.addMembership(test);
			//lib.listMembers();
			
			break;
		case 2:
			System.out.println("You selected: "+choice+", Add Material");
			break;
		case 3:
			System.out.println("You selected: "+choice+", Issue Item");
			break;
		case 4:
			System.out.println("You selected: "+choice+", Return Item");
			break;
		case 5:
			System.out.println("You selected: "+choice+", Report Inventory");
			break;
		case 6:
			System.out.println("You selected: "+choice+", Report Loans");
			break;
		case 7:
			System.out.println("You selected: "+choice+", Lookup Membership");
			lib.listMembers();
			break;
		case 8:
			System.out.println("You selected: "+choice+", Exit");
			break;
		default:
			System.out.println("You selected: "+choice+", Invalid. Please try again.");
			break;
		}		
		
	}

}