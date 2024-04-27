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
			System.out.println("Enter 1 for book, 2 for dvd, 3 for magazine");
			float y;
			y=keyboard.nextFloat();
			int choiceY;
			choiceY=(int)y;
			
			while(choiceY<1||choiceY>3)
			{
				System.out.println("You selected: "+choice+", Invalid.");
				System.out.println("NOTE: Please ensure your choice is one of the presented options.");
				System.out.print("Please try again: ");
				y=keyboard.nextFloat();
				choiceY=(int)y;
			}
			
			if(choiceY==1)
			{
			String bookName;
			String Isbn;
			String title;
			float floatPages;
			int pages;
			System.out.println("You selected: "+choiceY+", Book");
			System.out.println("Enter Book Author: ");
			bookName=keyboard.next();
			System.out.println("Enter Book ISBN: ");
			Isbn=keyboard.next();
			System.out.println("Enter Book Title: ");
			title=keyboard.next();
			System.out.println("Enter Book Pages: ");
			floatPages=keyboard.nextFloat();
			pages=(int)floatPages;
			Book newBook=new Book(bookName,Isbn,title,pages);
			System.out.println(newBook.toString());	
			}
			
			if(choiceY==2)
			{
				String dvdName;
				int issueNum;
				float floatReleaseDate;
				int releaseDate;
				//String xTitle, int issueNum, int releaseDate
				System.out.println("You selected: "+choiceY+", DVD");
				System.out.println("Enter DVD NAME: ");
				dvdName=keyboard.next();
				System.out.println("Enter issue number: ");
				issueNum=keyboard.nextInt();
				System.out.println("Enter DVD Release Date: ");
				floatReleaseDate=keyboard.nextFloat();
				releaseDate=(int)floatReleaseDate;
				DVD newDVD =new DVD(dvdName,issueNum,releaseDate);
				System.out.println(newDVD.toString());
			}
			
			if(choiceY==3)
			{
				//String title, int publicationDate, int issueNumber, Library library
				String magazineName;
				int publicationDate;
				int issueNumber;
				float floatPublicationDate;
				float floatIssueNumber;
				System.out.println("You selected: "+choiceY+", Magazine");
				System.out.println("Enter Magazine Name: ");
				magazineName=keyboard.next();
				System.out.println("Enter Publication Date: ");
				floatPublicationDate=keyboard.nextFloat();
				publicationDate=(int)floatPublicationDate;
				System.out.println("Enter IssueNumber: ");
				floatIssueNumber=keyboard.nextFloat();
				issueNumber=(int) floatIssueNumber;
				Magazine newMagazine=new Magazine(magazineName, publicationDate, issueNumber, lib);
				System.out.println(newMagazine.toString());
			}

			//dvd String xTitle, int issueNum, int releaseDate
			//magazine String title, int publicationDate, int issueNumber, Library library
			break;
		case 3:
			System.out.println("You selected: "+choice+", Issue Item");
			break;
		case 4:
			System.out.println("You selected: "+choice+", Return Item");
			break;
		case 5:
			System.out.println("You selected: "+choice+", Report Inventory");
			//lib.listBooks();
			//lib.listDvd();
			//lib.listMagazines();
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