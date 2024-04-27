//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

public class Magazine 
{
	private String title;
	private int publicationDate;
	private int issueNumber;
	private Library library;
	public Magazine(String title, int publicationDate, int issueNumber, Library library) 
	{
		super();
		this.title = title;
		this.publicationDate = publicationDate;
		this.issueNumber = issueNumber;
		this.library = library;
	}
	
  	public void setLibrary(Library l) 
  	{		
  		library = l;
  	}
  	
}