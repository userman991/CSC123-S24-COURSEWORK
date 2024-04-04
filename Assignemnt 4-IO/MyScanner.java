//Jovanny Gonzalez
//CSC 123-01
import java.io.*;
import java.util.*;
public class MyScanner 
{
    private InputStream inputStream;
    private InputStreamReader reader;
    private String delimiter="\s";
    private int index;
	private String tokens[];

    
    /*Files to read and take the input stream*/
    /*Constructor takes an input stream and it reads it if one is provided.*/
	
    public MyScanner(InputStream source) 
    {
        this.inputStream = source;
        this.reader = new InputStreamReader(inputStream);
    }
    
    /*Constructor taking File as source*/
    
    public MyScanner(File source) throws FileNotFoundException 
    {
        this(new FileInputStream(source));
    }
    
    
    /*Constructor taking String as source*/
    
    public MyScanner(String string) 
    {

    	if (string != null && !string.equals("")) 
    	{

    		tokens = string.trim().split("\\s+");

    	}

    	else 
    	{


    		tokens = new String[0];

    	}

    	index = 0;

    }
	

    /*Method to read and return all remaining characters on the current line as a String*/
    public String nextLine() throws NoSuchElementException 
    {
        String line="";
        int character;
        try
        {
        	while((character=reader.read())!=1)
        	{
        		if(character=='\n') 
        		{
        			break;
        		}
        		line+=(char) character;
        	}
        }
        catch(IOException e) 
        {
        	e.getCause();
        }
        if(line.isEmpty())
        {
        	throw new NoSuchElementException("No more tokens avaliable");
        }
        return line;
    }
    /*This method reads the next token and converts it to an Int*/
    public int nextInt() throws InputMismatchException 
    {
        try 
        {
            return Integer.parseInt(next());
        }
        catch (NumberFormatException e) 
        {
            throw new InputMismatchException("Input is not a valid Int");
        }
        
    }
    /*This method reads the next token and converts it to a Double*/
    public double nextDouble() throws InputMismatchException 
    {
        try 
        {
            return Double.parseDouble(next());
        }
        catch (NumberFormatException e) 
        {
            throw new InputMismatchException("Input is not a valid double");
        }
    }
    /*This method reads the next token and converts it to a Long*/
    public long nextLong() throws InputMismatchException 
    {
        try 
        {
            return Long.parseLong(next());
        }
        catch (NumberFormatException e) 
        {
            throw new InputMismatchException("Input is not a valid long");
        }
    }
    /*This method reads the next token and converts it to a Float*/
    public float nextFloat() throws InputMismatchException 
    {
        try 
        {
            return Float.parseFloat(next());
        } 
        catch (NumberFormatException e) 
        {
            throw new InputMismatchException("Input is not a valid float");
        }
    }
    /*This method reads the next token and converts it to a Short*/
    public short nextShort() throws InputMismatchException 
    {
        try 
        {
            return Short.parseShort(next());
        } 
        catch (NumberFormatException e) 
        {
            throw new InputMismatchException("Input is not a valid short");
        }
    }
    /*This method reads the next token and converts it to a Byte or tries to maintain it as one*/
    public byte nextByte() throws InputMismatchException 
    {
        try 
        {
            return Byte.parseByte(next());
        } 
        catch (NumberFormatException e) 
        {
            throw new InputMismatchException("Input is not a valid Byte");
        }
    }
    /*This method reads the next token and converts it to a Boolean*/
    public boolean nextBoolean() throws InputMismatchException 
    {
        String token = next();
        if (token.equals("true")) 
        {
            return true;
        } 
        else if (token.equals("false")) 
        {
            return false;
        }
        else 
        {
            throw new InputMismatchException("Input is not a valid boolean");
        }
    }
    /*This method is used to set the delimiter*/
    public void useDelimiter(String format) 
    {
        this.delimiter = format;
    }
    /*This method reads the next token and returns it as a String*/
    public String next() throws NoSuchElementException 
    {
        String token = "";
        int character;
        try 
        {
            while ((character = reader.read()) != -1) 
            // "\r" is basically enter from my understanding. Int wouldn't work without it so I included it here.
            {																			
                if (delimiter.contains(Character.toString((char) character))|| character=='\n' || character=='\r') 
                {
                    if (!token.isEmpty()) 
                    {
                        break;
                    }
                } 
                else 
                {
                    token += (char) character;
                }
            }
        } 
        catch (IOException e) 
        {
            e.getCause();
        }
        if (token.isEmpty()) 
        {
            throw new NoSuchElementException("No more tokens available");
        }
        return token;
    }
    
    /*This method is used to close the input string and the file reader.*/
    public void close() throws IOException 
    {
        reader.close();
        inputStream.close();
    }
    
    
    
    /*hasNext() and so on*/
    /*This method is used to see if the next token can be read*/
    
    public boolean hasNext() 
    {
        try 
        {
            next();
            return true;
        }
        catch (NoSuchElementException e) 
        {
            e.getCause();
            return false;
        }
    }
    /*This method is used to see if the next token can be parsed as an int*/
    public boolean hasNextInt() 
    {
        if(!hasNext()) 
        {
        	return false;
        }
        try 
        {
        int n=Integer.parseInt(tokens[index]);
        	return true;
        }
        catch (Exception e)
        {
        	e.getCause();
            return false;
        }
    }
    /*This method is used to see if the next token can be parsed as a double*/
    public boolean hasNextDouble() 
    {
        try 
        {
            nextDouble();
            return true;
        } 
        catch (NoSuchElementException e) 
        {
            return false;
        }
    }
    /*This method is used to see if the next token can be parsed as a long*/
    public boolean hasNextLong() 
    {
        try {
            nextLong();
            return true;
        }
        catch (NoSuchElementException e) 
        {
            return false;
        }
    }
    /*This method is used to see if the next token can be parsed as a float*/
    public boolean hasNextFloat() 
    {
        try
        {
            nextFloat();
            return true;
        } 
        catch (NoSuchElementException e)
        {
            return false;
        }
    }
    /*This method is used to check if the next token can be parsed as a short*/
    public boolean hasNextShort() 
    {
        try 
        {
            nextShort();
            return true;
        }
        catch (NoSuchElementException e) 
        {
            return false;
        }
    }
    /*This method is used to check if the next token can be used as a byte*/
    public boolean hasNextByte() 
    {
        try 
        {
            nextByte();
            return true;
        } 
        catch (NoSuchElementException e) 
        {
            return false;
        }
    }
}