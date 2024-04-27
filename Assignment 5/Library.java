//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

import java.util.ArrayList;
public class Library 
{
	private String libraryName;
	private String address;
	private Book owner;
	private ArrayList<Book> books;
	private ArrayList<DVD> dvds;
	private ArrayList<Magazine> magazines;

	
	public Library(String lName, String lAddress) 
	{
		libraryName = lName;
		address = lAddress;
		books=new ArrayList<Book>();
	}
    
	public String toString()
    {
		return ("Library Name:"+libraryName+"  , Address:"+address);  	
    }
	
	public void addBook(Book b) 
	{
		books.add(b);
		b.setLibrary(this);
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
	
	
	public void setAddress(String a) 
	{
		address=a;
	}
	
}