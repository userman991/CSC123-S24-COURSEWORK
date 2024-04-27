//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

import java.util.ArrayList;
public class Library 
{
	private String libraryName="Main Library";
	private Book owner;
	private ArrayList<Membership> members;
	private ArrayList<Book> books;
	private ArrayList<DVD> dvds;
	private ArrayList<Magazine> magazines;


    
	public String toString()
    {
		return ("Library Name: "+ libraryName);  	
    }
	
	public void addBook(Book b) 
	{
		books.add(b);
		b.setLibrary(this);
	}
	public void addMembership(Membership guest) 
	{
		members.add(guest);
		guest.setLibrary(this);
	}
	
	public void listMembers() 
	{
		for (Membership guest : members) 
		{
			System.out.println(guest);
		}
	}
	
	public void listBooks() 
	{
		for (Book b : books) 
		{
			System.out.println(b);
		}
	}
	
	public void setOwner(Book b) 
	{		
		owner = b;
	}
	
	public Book getOwner() 
	{
		return owner;
	}
	
	public void setLibraryName(String name) 
	{
		libraryName=name;
	}
}