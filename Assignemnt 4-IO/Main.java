//Jovanny Gonzalez
//CSC 123-01
import java.util.*;
import java.io.*;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		MyScanner keyboard= new MyScanner(System.in);
		MyScanner read= new MyScanner("C:\\Users\\Jovanny\\Desktop\\lines!.txt");
		
		System.out.println("Enter int Num:");
		int intNum=keyboard.nextInt();
		
		System.out.println("Enter Double Num:");
		double doubleNum=keyboard.nextDouble();
		
		System.out.println("Enter Long Num:");
		long longNum=keyboard.nextLong();
		
		System.out.println("Enter Float Num:");
		float floatNum=keyboard.nextFloat();
				
		System.out.println("Enter Short Num:");
		short shortNum=keyboard.nextShort();
		
		System.out.println("Enter Byte Num:");
		byte byteNum=keyboard.nextByte();
				
		
		System.out.println("Enter String:");
		String tempString=keyboard.next();
		
		System.out.println("You Entered(int): "+intNum);
		System.out.println("You Entered(double): "+doubleNum);
		System.out.println("You Entered(Long): "+longNum);
		System.out.println("You Entered(float): "+floatNum);
		System.out.println("You Entered(short): "+shortNum);
		System.out.println("You Entered(byte): "+byteNum);
		System.out.println("You Entered(String): "+tempString);

		
		System.out.println("FILE: ");
		//insert your own path below for testing
		File file= new File("C:\\Users\\Jovanny\\Desktop\\lines!.txt");
		MyScanner in= new MyScanner(file);
		
		while(in.hasNext())
		{
			System.out.print(in.next());
		}
		in.close();
		
	}

}