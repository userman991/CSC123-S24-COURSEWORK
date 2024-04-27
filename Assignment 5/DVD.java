
public class DVD 
{
	//Title, Publication Date (month/year),Issue Number

	private String title;
	private int publicationDate;
	private int issueNumber;
	private Library library;

  //Constructor must be declared as follows

  public DVD(String xTitle, int issueNum, int pubDate)
  {

	  title=xTitle;
	  issueNumber=issueNum;
	  publicationDate=pubDate;

  }

  public String getTitle()
  {
	return title;  
  }

  
  /*
  public boolean equals(Book x) 
  {
	  return x.getAuthor()==getAuthor()&& x.getISBN()==getISBN()
			  && x.getNumberOfPages()==getNumberOfPages() && x.getTitle()==getTitle();
  }
*/
	
	public void setLibrary(Library l) 
	{		
		library = l;
	}
	
	public Library getLibrary() 
	{
		return library;
	}
	/*
	public String toString() 
	{
		return "Title: " + title + ", Author: " + author + ", Pages: " + pages + " , ISBN:"+isbn;
	}

	*/
}

  

