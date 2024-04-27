//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

public class DVD 
{
	//Title, Publication Date (month/year),Issue Number

	private String title;
	private int releaseDate;
	private int issueNumber;
	private Library library;

  //Constructor must be declared as follows

  public DVD(String xTitle, int issueNum, int releaseDate)
  {

	  title=xTitle;
	  issueNumber=issueNum;
	  releaseDate=this.releaseDate;

  }
	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
	
		this.title = title;
	}



	public int getReleaseDate() 
	{
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) 
	{
		this.releaseDate = releaseDate;
	}

	public int getIssueNumber() 
	{
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) 
	{
		this.issueNumber = issueNumber;
	}


	public void setLibrary(Library l) 
	{		
		library = l;
	}
	
	public Library getLibrary() 
	{
		return library;
	}

}