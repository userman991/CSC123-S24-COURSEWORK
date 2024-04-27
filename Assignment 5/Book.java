//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

public class Book
{
      //declare instance fields as necessary
		private String title;
		private String isbn;
		private int pages;
		private String author;
		private Library library;

      //Constructor must be declared as follows

      public Book(String aName, String xIsbn, String xTitle, int nPages)
      {
    	  author=aName;
    	  isbn=xIsbn;
    	  title=xTitle;
    	  pages=nPages;

      }

      public String getAuthor()
      {
    	return author;  
      }
      public String getISBN()
      {
    	return isbn;  
      }
      public int getNumberOfPages()
      {
    	return pages;  
      }
      public String getTitle()
      {
    	return title;  
      }
      
      
      public boolean equals(Book x) 
      {
    	  return x.getAuthor()==getAuthor()&& x.getISBN()==getISBN()
    			  && x.getNumberOfPages()==getNumberOfPages() && x.getTitle()==getTitle();
      }

  	
  	public void setLibrary(Library l) 
  	{		
  		library = l;
  	}
  	
  	public Library getLibrary() 
  	{
  		return library;
  	}
  	
  	public String toString() 
  	{
  		return "Title: " + title + ", Author: " + author + ", Pages: " + pages + " , ISBN:"+isbn;
  	}

}
