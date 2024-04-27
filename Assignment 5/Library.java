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
	public void addMagazine(Magazine m) 
	{
		magazines.add(m);
		m.setLibrary(this);
	}
	public void addDvd(DVD d)
	{
		dvds.add(d);
		d.setLibrary(this);
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
	public void listMagazines() 
	{
		for (Magazine m : magazines) 
		{
			System.out.println(m);
		}
	}
	public void listDvd()
	{
		for (DVD d : dvds) 
		{
			System.out.println(d);
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

}