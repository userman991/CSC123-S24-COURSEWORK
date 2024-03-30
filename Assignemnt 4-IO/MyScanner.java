//Jovanny Gonzalez
//CSC 123-01

import java.io.*;
import java.util.*;
public class MyScanner 
{
    private InputStream inputStream;
    private InputStreamReader reader;
    private String delimiter="\n";
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
    public MyScanner(String source) 
    {
        this(new ByteArrayInputStream(source.getBytes()));
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
        	int temp=Integer.parseInt(next());
            return temp;
        }
        catch (NumberFormatException e) 
        {
            throw new InputMismatchException("Input is not a valid integer");
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
            throw new InputMismatchException("Input is not a valid byte");
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
            {
                if (delimiter.contains(Character.toString((char) character))) 
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
}